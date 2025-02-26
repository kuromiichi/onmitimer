package dev.kuromiichi.omnitimer.utils

import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun getTimeStringFromMillis(millis: Long): String {
    val hours = millis / (1000 * 60 * 60)
    val minutes = (millis / (1000 * 60)) % 60
    val seconds = (millis / 1000) % 60
    val hundredths = (millis / 10) % 100

    return if (hours > 0) {
        "${hours}:${minutes.toString().padStart(2, '0')}:${
            seconds.toString().padStart(2, '0')
        }.${hundredths.toString().padStart(2, '0')}"
    } else if (minutes > 0) {
        "${minutes}:${seconds.toString().padStart(2, '0')}.${
            hundredths.toString().padStart(2, '0')
        }"
    } else {
        "${seconds}.${hundredths.toString().padStart(2, '0')}"
    }
}

fun LocalDateTime.Companion.now() =
    Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault())
