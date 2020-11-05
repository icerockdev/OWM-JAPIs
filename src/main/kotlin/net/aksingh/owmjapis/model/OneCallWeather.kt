/**************************************************************************************************
 * Copyright (c) 2013-2019 Ashutosh Kumar Singh <ashutosh@aksingh.net>                            *
 *                                                                                                *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this           *
 * software and associated documentation files (the "Software"), to deal in the Software without  *
 * restriction, including without limitation the rights to use, copy, modify, merge, publish,     *
 * distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the  *
 * Software is furnished to do so, subject to the following conditions:                           *
 *                                                                                                *
 * The above copyright notice and this permission notice shall be included in all copies or       *
 * substantial portions of the Software.                                                          *
 *                                                                                                *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING  *
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND     *
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,   *
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, *
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.        *
 **************************************************************************************************/

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
