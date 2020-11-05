package net.aksingh.owmjapis.model.param

import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName

data class Current(
  @field:SerializedName("dt")
  val dt: Int? = null,

  @field:SerializedName("sunrise")
  val sunrise: Int? = null,

  @field:SerializedName("sunset")
  val sunset: Int? = null,

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

  @field:SerializedName("wind_speed")
  val windSpeed: Double? = null,

  @field:SerializedName("wind_deg")
  val windDeg: Double? = null,

  @field:SerializedName("weather")
  val weather: List<Weather>? = null,

  @field:SerializedName("clouds")
  val clouds: Double? = null,

  @field:SerializedName("pop")
  val pop: Double? = null,

  @field:SerializedName("rain")
  val rain: Double? = null,

  @field:SerializedName("uvi")
  val uvi: Double? = null

) {

  fun hasDt(): Boolean = dt != null
  fun hasSunrise(): Boolean = sunrise != null
  fun hasSunset(): Boolean = sunset != null
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
  fun hasRain(): Boolean = rain != null
  fun hasUvi(): Boolean = uvi != null

  companion object Static {
    @JvmStatic
    fun fromJson(json: String): Current {
      return GsonBuilder().create().fromJson(json, Current::class.java)
    }

    @JvmStatic
    fun toJson(pojo: Current): String {
      return GsonBuilder().create().toJson(pojo)
    }

    @JvmStatic
    fun toJsonPretty(pojo: Current): String {
      return GsonBuilder().setPrettyPrinting().create().toJson(pojo)
    }
  }
}
