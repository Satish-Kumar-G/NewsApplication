package com.satish.kotlinapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.satish.kotlinapp.models.Article

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.ViewHolderclass>() {
    private var articles =ArrayList<Article>()
    fun setArticles(articleData: ArrayList<Article>){
        this.articles=articleData;
    }
    class ViewHolderclass(itemView :View)  :RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderclass {
        val layoutInflater =LayoutInflater.from(parent.context)
        /*val  binding =BindinU
        return binding.root*/
        return null
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolderclass, position: Int) {
        TODO("Not yet implemented")
    }
}