package com.satish.kotlinapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.satish.kotlinapp.databinding.NewsItemviewBinding
import com.satish.kotlinapp.models.Article

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.ViewHolderclass>() {
    private var articles = ArrayList<Article>()
    fun setArticles(articleData: ArrayList<Article>) {
        this.articles = articleData;
    }

    class ViewHolderclass(val binding: NewsItemviewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(article: Article) {
            binding.article = article
            binding.executePendingBindings()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderclass {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = NewsItemviewBinding.inflate(layoutInflater)
        return ViewHolderclass(binding)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: ViewHolderclass, position: Int) {
        holder.bind(articles[position])
    }
}