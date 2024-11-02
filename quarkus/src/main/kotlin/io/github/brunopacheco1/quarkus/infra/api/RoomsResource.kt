package io.github.brunopacheco1.quarkus.infra.api

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import io.github.brunopacheco1.quarkus.core.usecases.SearchRoom
import io.github.brunopacheco1.quarkus.core.usecases.CreateRoom
import io.github.brunopacheco1.quarkus.core.usecases.ReserveRoom
import jakarta.ws.rs.POST
import jakarta.ws.rs.Consumes

@Path("/api/v1/rooms")
class RoomsResource constructor(
    private val createRoom: CreateRoom,
    private val searchRoom: SearchRoom,
    private val reserveRoom: ReserveRoom
) {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    fun createRoom() = createRoom.execute()

    @POST
    @Path("/search")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun searchRooms() = searchRoom.execute()

    @POST
    @Path("/reserve")
    @Consumes(MediaType.APPLICATION_JSON)
    fun reserveRoom() = reserveRoom.execute()
}
