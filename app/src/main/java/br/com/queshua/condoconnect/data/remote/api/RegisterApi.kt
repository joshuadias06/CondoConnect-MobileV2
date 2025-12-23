package br.com.queshua.condoconnect.data.remote.api

import br.com.queshua.condoconnect.data.dto.RegisterResponse
import br.com.queshua.condoconnect.domain.model.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RegisterApi{
    @POST("auth/register")
    fun registerUser(@Body usuario: User): Call<RegisterResponse>
}