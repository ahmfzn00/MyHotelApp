package com.dicoding.core.data.source.remote.network

import com.dicoding.core.data.source.remote.response.ListTourismResponse
import retrofit2.http.GET

interface ApiService {
    @GET("9b363e6b5bbca8e9d405")
    suspend fun getList(): ListTourismResponse
}