package com.example.emptyviewstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.ImageView

import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtenir une référence aux différents items
        val mainLayout = findViewById<ConstraintLayout>(R.id.main_layout)
        val searchButton = findViewById<Button>(R.id.search_button)

        // Définir l'action sur clic bouton, en l'occurence, afficher l'image magic_logo
        searchButton.setOnClickListener{
            val imageView = ImageView(this)
            imageView.layoutParams = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT

            )
            imageView.setImageResource(R.drawable.magic_logo)
            mainLayout.addView(imageView)

        }

    }
}