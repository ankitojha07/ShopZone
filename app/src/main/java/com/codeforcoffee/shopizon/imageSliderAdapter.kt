package com.codeforcoffee.shopizon

import android.content.Context
import android.view.View
import com.bumptech.glide.Glide
import com.smarteist.autoimageslider.SliderViewAdapter

class ImageSliderAdapter(private val contetx: Context) :
        SliderViewAdapter<ImageSliderAdapter.ImageSliderVH>(){



            class ImageSliderVH(view: View): SliderViewAdapter.ViewHolder(view){

                private val imageView =view.findViewById(R.id.image_slider_iv)

                fun bind(context: Context,sliderItem: String){
                    Glide.with(imageView.context)
                            .load(sliderItem)
                            .centerCrop()
                            .into(imageView)
                }
            }
        }