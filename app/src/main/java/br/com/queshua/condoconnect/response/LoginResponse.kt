package br.com.queshua.condoconnect.response

data class LoginResponse(
    val userId: Int,
    val userName: String,
    val userEmail: String,
    val userPassword: String,
    val userCpf: String
)
