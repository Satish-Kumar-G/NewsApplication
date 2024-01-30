package com.satish.kotlinapp.models

import com.google.gson.annotations.SerializedName

data class NewsResponse(
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val articleCount: Int,
    @SerializedName("articles")
    val newsArticles: List<Article>)

data class Source(val id: String, val name: String)

data class Article(
    val source: Source,
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: String,
    val content: String,
)
