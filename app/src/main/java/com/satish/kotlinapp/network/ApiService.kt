package com.satish.kotlinapp.network

import com.satish.kotlinapp.models.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    fun getNews(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String,
    ): NewsResponse
}