package io.github.brunopacheco1.quarkus.core.entities

data class Room {
    number: number;
    type: RoomType;
    price: number;
    reservations: Reservation[];
}

enum RoomType {
    SINGLE; 
    DOUBLE;
    DELUXE;
}
