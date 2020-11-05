package net.aksingh.owmjapis.model

import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName
import net.aksingh.owmjapis.model.param.*
import java.util.*

data class OneCallWeather(
  @field:SerializedName("lat")
  val lat: Double? = null,

  @field:SerializedName("lon")
  val lon: Double? = null,

  @field:SerializedName("timezone")
  val timezone: String? = null,

  @field:SerializedName("timezone_offset")
  val timezoneOffset: Int? = null,

  @field:SerializedName("daily")
  val dailyData: List<Daily>? = null,

  @field:SerializedName("current")
  val currentData: Current? = null,

  @field:SerializedName("hourly")
  val hourlyData: List<Hourly>? = null,

  @field:SerializedName("minutely")
  val minutelyData: List<Minutely>? = null,

  @field:SerializedName("alerts")
  val alertsData: List<Alert>? = null

) {

  fun hasLat(): Boolean = lat != null
  fun hasLon(): Boolean = lon != null
  fun hasTimezone(): Boolean = timezone != null
  fun hasTimezoneOffset(): Boolean = timezoneOffset != null
  fun hasDailyData(): Boolean = dailyData != null
  fun hasСurrentData(): Boolean = currentData != null
  fun hasHourlyData(): Boolean = hourlyData != null
  fun hasMinutelyData(): Boolean = minutelyData != null
  fun hasAlertsData(): Boolean = alertsData != null

  companion object Static {
    @JvmStatic
    fun fromJson(json: String): OneCallWeather {
      return GsonBuilder().create().fromJson(json, OneCallWeather::class.java)
    }

    @JvmStatic
    fun toJson(pojo: OneCallWeather): String {
      return GsonBuilder().create().toJson(pojo)
    }

    @JvmStatic
    fun toJsonPretty(pojo: OneCallWeather): String {
      return GsonBuilder().setPrettyPrinting().create().toJson(pojo)
    }
  }
}
