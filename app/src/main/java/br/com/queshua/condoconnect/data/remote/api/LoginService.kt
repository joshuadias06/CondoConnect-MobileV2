package br.com.queshua.condoconnect.data.remote.api

import br.com.queshua.condoconnect.data.dto.LoginResponse
import retrofit2.Call
import retrofit2.http.Query

interface LoginService {
    fun login(
        @Query("user") user: String,
        @Query("password") password: String
    ) : Call<List<LoginResponse>>
}