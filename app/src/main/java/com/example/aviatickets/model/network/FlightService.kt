package com.example.aviatickets.model.network

import com.example.aviatickets.model.entity.Offer
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface FlightService {
    @GET("offer_list")
    fun fetchOfferList(): Call<List<Offer>>
}