package br.com.queshua.condoconnect.response

import java.util.Date

data class ScheduleResponse(
    val id: Int,
    val data: Date?,
    val event: String?,
    val hour: String?,
    val description: String?,
)
