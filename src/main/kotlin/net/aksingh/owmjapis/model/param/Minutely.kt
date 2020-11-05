package net.aksingh.owmjapis.model.param

import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName

data class Minutely(
  @field:SerializedName("dt")
  val dt: Int? = null,

  @field:SerializedName("precipitation")
  val precipitation: Double? = null

) {

  fun hasDt(): Boolean = dt != null
  fun hasPrecipitation(): Boolean = precipitation != null

  companion object Static {
    @JvmStatic
    fun fromJson(json: String): Minutely {
      return GsonBuilder().create().fromJson(json, Minutely::class.java)
    }

    @JvmStatic
    fun toJson(pojo: Minutely): String {
      return GsonBuilder().create().toJson(pojo)
    }

    @JvmStatic
    fun toJsonPretty(pojo: Minutely): String {
      return GsonBuilder().setPrettyPrinting().create().toJson(pojo)
    }
  }
}
