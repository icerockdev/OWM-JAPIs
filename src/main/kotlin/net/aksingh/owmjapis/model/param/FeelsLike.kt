package net.aksingh.owmjapis.model.param

import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName

data class FeelsLike(
  @field:SerializedName("day")
  val tempDay: Double? = null,

  @field:SerializedName("night")
  val tempNight: Double? = null,

  @field:SerializedName("eve")
  val tempEvening: Double? = null,

  @field:SerializedName("morn")
  val tempMorning: Double? = null
) {

  fun hasTempDay(): Boolean = tempDay != null

  fun hasTempNight(): Boolean = tempNight != null

  fun hasTempEvening(): Boolean = tempEvening != null

  fun hasTempMorning(): Boolean = tempMorning != null

  companion object Static {
    @JvmStatic
    fun fromJson(json: String): FeelsLike {
      return GsonBuilder().create().fromJson(json, FeelsLike::class.java)
    }

    @JvmStatic
    fun toJson(pojo: FeelsLike): String {
      return GsonBuilder().create().toJson(pojo)
    }

    @JvmStatic
    fun toJsonPretty(pojo: FeelsLike): String {
      return GsonBuilder().setPrettyPrinting().create().toJson(pojo)
    }
  }
}
