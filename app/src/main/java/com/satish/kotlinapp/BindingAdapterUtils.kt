package com.satish.kotlinapp

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

class BindingAdapterUtils {
    @BindingAdapter
    fun loadImage(imageview: ImageView, url:String){
        Glide.with(imageview)
            .load(url).into(imageview)
    }
}