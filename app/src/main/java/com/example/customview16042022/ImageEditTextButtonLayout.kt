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
        val editText = findViewById<EditText>(R.id.edit_query)
        val editText2 = findViewById<EditText>(R.id.edit_query2)


        val set =
            context.obtainStyledAttributes(attributeSet, R.styleable.ImageEditTextButtonLayout)

        val image = set.getDrawable(R.styleable.ImageEditTextButtonLayout_image)
        val text = set.getString(R.styleable.ImageEditTextButtonLayout_text)
        val edit = set.getString(R.styleable.ImageEditTextButtonLayout_edit)
        val edit2 = set.getString(R.styleable.ImageEditTextButtonLayout_edit2)


        imageView.setImageDrawable(image)
        textView.text = text
        editText.setText(edit)
        editText2.setText(edit2)


    }
}