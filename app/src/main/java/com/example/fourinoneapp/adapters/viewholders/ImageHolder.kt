package com.example.fourinoneapp.adapters.viewholders

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.image_browser_pager.view.*

class ImageHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var picture: ImageView

    
    init {
        picture = itemView.image
    }
}
