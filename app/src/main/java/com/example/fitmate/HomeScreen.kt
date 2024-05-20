package com.example.fitmate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_screen)
        Bmi_frag()

        val home_text:TextView=findViewById(R.id.textView14)
        val home_img:ImageView=findViewById(R.id.imageView9)

        home_img.setOnClickListener{
            Bmi_frag()
        }
        home_text.setOnClickListener{
            Bmi_frag()
        }


        val workOut_text:TextView=findViewById(R.id.textView17)
        val workOut_img:ImageView=findViewById(R.id.imageView12)


        workOut_img.setOnClickListener {
            workoutFrag()
        }
        workOut_text.setOnClickListener {
            workoutFrag()
        }







       
    }


    private fun Bmi_frag(){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer,BmiFragment())
        fragmentTransaction.commit()

    }


    private fun workoutFrag(){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer,WorkOutFrag())
        fragmentTransaction.commit()

    }
}