package net.aksingh.owmjapis.model.param

import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName

data class Hourly(
  @field:SerializedName("dt")
  val dt: Int? = null,

  @field:SerializedName("temp")
  val temp: Double? = null,

  @field:SerializedName("feels_like")
  val feelsLike: Double? = null,

  @field:SerializedName("pressure")
  val pressure: Double? = null,

  @field:SerializedName("humidity")
  val humidity: Double? = null,

  @field:SerializedName("dew_point")
  val dewPoint: Double? = null,

  @field:SerializedName("visibility")
  val visibility: Double? = null,

  @field:SerializedName("wind_speed")
  val windSpeed: Double? = null,

  @field:SerializedName("wind_deg")
  val windDeg: Double? = null,

  @field:SerializedName("weather")
  val weather: List<Weather>? = null,

  @field:SerializedName("clouds")
  val clouds: Double? = null,

  @field:SerializedName("pop")
  val pop: Double? = null

) {

  fun hasDt(): Boolean = dt != null
  fun hasTemp(): Boolean = temp != null
  fun hasFeelsLike(): Boolean = feelsLike != null
  fun hasPressure(): Boolean = pressure != null
  fun hasHumidity(): Boolean = humidity != null
  fun hasDewPoint(): Boolean = dewPoint != null
  fun hasWindSpeed(): Boolean = windSpeed != null
  fun hasWindDeg(): Boolean = windDeg != null
  fun hasWeather(): Boolean = weather != null
  fun hasClouds(): Boolean = clouds != null
  fun hasPop(): Boolean = pop != null

  companion object Static {
    @JvmStatic
    fun fromJson(json: String): Hourly {
      return GsonBuilder().create().fromJson(json, Hourly::class.java)
    }

    @JvmStatic
    fun toJson(pojo: Hourly): String {
      return GsonBuilder().create().toJson(pojo)
    }

    @JvmStatic
    fun toJsonPretty(pojo: Hourly): String {
      return GsonBuilder().setPrettyPrinting().create().toJson(pojo)
    }
  }
}
