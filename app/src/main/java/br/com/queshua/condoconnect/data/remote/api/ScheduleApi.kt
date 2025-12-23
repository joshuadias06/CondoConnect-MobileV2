package br.com.queshua.condoconnect.data.remote.api

import br.com.queshua.condoconnect.domain.model.Schedule
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface ScheduleApi {

    @GET("api/schedules")
    fun getSchedules(): Call<List<Schedule>>

    @FormUrlEncoded
    @POST("api/schedules/create")
    fun createSchedule(
        @Field("event") event: String,
        @Field("date") date: String,
        @Field("hour") hour: String,
        @Field("description") description: String?
    ): Call<Void>

    @FormUrlEncoded
    @PUT("api/schedules/update")
    fun updateSchedule(
        @Field("id") id: Int,
        @Field("event") event: String,
        @Field("date") date: String,
        @Field("hour") hour: String,
        @Field("description") description: String?
    ): Call<Void>

    @FormUrlEncoded
    @DELETE("api/schedules/delete")
    fun removeSchedule(
        @Field("id") id: Int
    ): Call<Void>
}