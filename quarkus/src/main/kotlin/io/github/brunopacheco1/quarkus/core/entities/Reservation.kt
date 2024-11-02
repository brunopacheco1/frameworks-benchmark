package io.github.brunopacheco1.quarkus.core.entities

import java.time.LocalDate

data class Reservation(
    var id: String?,
    var room: Int,
    var checkin: LocalDate,
    var checkout: LocalDate,
    var totalPrice: Double
)
