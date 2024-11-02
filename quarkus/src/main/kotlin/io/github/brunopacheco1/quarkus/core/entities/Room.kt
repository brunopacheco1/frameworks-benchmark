package io.github.brunopacheco1.quarkus.core.entities

data class Room (
    var id: String?,
    var roomNumber: Double,
    var type: RoomType,
    var price: Double,
    var reservations: List<Reservation>
)

enum class RoomType {
    SINGLE, 
    DOUBLE,
    DELUXE;
}
