package com.stdev.user_input_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var editText : TextInputEditText
    private lateinit var button : MaterialButton
    private lateinit var result : TextView
    private lateinit var image : ImageView
    private lateinit var link : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        editText = findViewById(R.id.edit_text)
        button = findViewById(R.id.button)
        result = findViewById(R.id.result)
        image = findViewById(R.id.image)
        link = findViewById(R.id.link)


        button.setOnClickListener{

            val name = editText.editableText.toString()

            if(name.isNotEmpty()){

                result.text = "Your name is $name. Thank you!"

            }else{
                result.text = "Please enter your name"
            }

        }
    }
}