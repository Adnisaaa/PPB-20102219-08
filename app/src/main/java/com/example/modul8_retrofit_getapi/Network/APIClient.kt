package com.example.modul8_retrofit_getapi.Network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIClient {
    private const val BASE_URL = "https://apitani.burunghantu.id/sub/restapi-slim/public/"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val APIService: APIService by lazy {
        retrofit.create(APIService::class.java)
    }
}