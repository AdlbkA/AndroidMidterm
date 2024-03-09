package com.example.aviatickets.model.network

import com.example.aviatickets.model.entity.Flight

data class OfferAPI(
    val id: String,
    val price: Int,
    val flight: Flight
)
