package com.example.aviatickets.model.entity

data class Offer(
    val id: String,
    val price: Int,
    val flight: Flight
){
    companion object {
        fun toOffer(offerApi: Offer) = Offer(
            id = offerApi.id,
            price = offerApi.price,
            flight = offerApi.flight
        )
    }
}