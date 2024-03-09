package com.example.aviatickets.model.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private const val BASE_URL = "https://my-json-server.typicode.com/estharossa/fake-api-demo/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    /**
     * think about performing network request
     */

    val instance = retrofit.create(FlightService::class.java)
}