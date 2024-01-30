package com.satish.kotlinapp.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    //2cdfd594d76448cf9bf78bde7d5e79eb
    companion object {
        private const val baseUrl="https://newsapi.org/"
        private var retrofit :Retrofit ?=null

         fun getInstance(): Retrofit{
            if (retrofit==null){
                retrofit=Retrofit.Builder().baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit as Retrofit
        }
    }
}