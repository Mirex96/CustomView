package com.example.customview16042022

import android.content.Context
import android.util.AttributeSet
import android.widget.*

class ImageEditTextButtonLayout(context: Context, attributeSet: AttributeSet) :
    LinearLayout(context, attributeSet) {

    init {
        inflate(context, R.layout.image_edit_text_button_layout, this)


        val imageView = findViewById<ImageView>(R.id.image)
        val textView = findViewById<TextView>(R.id.text)


        val set =
            context.obtainStyledAttributes(attributeSet, R.styleable.ImageEditTextButtonLayout)

        val image = set.getDrawable(R.styleable.ImageEditTextButtonLayout_image)
        val text = set.getString(R.styleable.ImageEditTextButtonLayout_text)


        imageView.setImageDrawable(image)
        textView.text = text


    }
}