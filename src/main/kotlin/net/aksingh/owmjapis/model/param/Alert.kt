package net.aksingh.owmjapis.model.param

import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName

data class Alert(
  @field:SerializedName("sender_name")
  val senderName: String? = null,

  @field:SerializedName("start")
  val start: Int? = null,

  @field:SerializedName("end")
  val end: Int? = null,

  @field:SerializedName("description")
  val description: String? = null,

  @field:SerializedName("event")
  val event: String? = null

) {

  fun hasSenderName(): Boolean = senderName != null
  fun hasStart(): Boolean = start != null
  fun hasEnd(): Boolean = end != null
  fun hasDescription(): Boolean = description != null
  fun hasEvent(): Boolean = event != null

  companion object Static {
    @JvmStatic
    fun fromJson(json: String): Alert {
      return GsonBuilder().create().fromJson(json, Alert::class.java)
    }

    @JvmStatic
    fun toJson(pojo: Alert): String {
      return GsonBuilder().create().toJson(pojo)
    }

    @JvmStatic
    fun toJsonPretty(pojo: Alert): String {
      return GsonBuilder().setPrettyPrinting().create().toJson(pojo)
    }
  }
}
