package net.aksingh.owmjapis.api

import net.aksingh.owmjapis.model.OneCallWeather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface OneCallAPI {
  @GET("onecall")
  fun getOneCall(
    @Query("lat") lat: Double,
    @Query("lon") lon: Double,
    @Query("exclude") exclude: String
  ): Call<OneCallWeather>

}
