package com.example.modul8_retrofit_getapi

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("datamahasiswa/")
    fun getdatamahasiswa(): Call<ApiResponse>
}
