package com.satish.kotlinapp

import com.satish.kotlinapp.network.ApiService
import com.satish.kotlinapp.network.RetrofitClient
import retrofit2.Retrofit

class NewsRepository {
    private val retrofit= RetrofitClient.getInstance().create(ApiService::class.java)

     fun getAllNews(country :String,apiKey :String) = retrofit.getNews(country,apiKey);
}