package io.github.brunopacheco1.quarkus.core.entities

data class Reservation {
    id?: String;
    room: number;
    checkin: Date;
    checkout: Date;
    totalPrice: number;
}
