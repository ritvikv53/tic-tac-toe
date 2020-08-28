package com.example.projectone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ncorti.slidetoact.SlideToActView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val slides: SlideToActView = findViewById<SlideToActView>(R.id.slider)

        slides.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {

            override fun onSlideComplete(view: SlideToActView) {


                var intent = Intent(this@MainActivity, Secondact::class.java)

                startActivity(intent)


            }


        }


    }
}