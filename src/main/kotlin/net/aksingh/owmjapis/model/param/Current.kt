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
