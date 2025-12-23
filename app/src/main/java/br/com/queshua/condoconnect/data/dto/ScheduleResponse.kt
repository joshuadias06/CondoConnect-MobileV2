package br.com.queshua.condoconnect.data.dto

import java.util.Date

data class ScheduleResponse(
    val id: Int,
    val data: Date?,
    val event: String?,
    val hour: String?,
    val description: String?,
)
