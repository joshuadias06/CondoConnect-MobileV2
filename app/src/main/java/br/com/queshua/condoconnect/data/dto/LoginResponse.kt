package br.com.queshua.condoconnect.data.dto

data class LoginResponse(
    val userId: Int,
    val userName: String,
    val userEmail: String,
    val userPassword: String,
    val userCpf: String
)
