package com.example.fitmate

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout

class WorkOutsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_workouts)

        val workouts: ArrayList<Excercises> = ArrayList()
        workouts.add(Excercises(R.drawable.chestworkout))
        workouts.add(Excercises(R.drawable.backworkout))
        workouts.add(Excercises(R.drawable.shoulderworkout))
        workouts.add(Excercises(R.drawable.bicepsworkout))
        workouts.add(Excercises(R.drawable.tricepsworkout))
        workouts.add(Excercises(R.drawable.absworkout))
        workouts.add(Excercises(R.drawable.legsworkout))

        val linearLayoutContainer: LinearLayout = findViewById(R.id.linearLayoutContainer)

        for (exercise in workouts) {
            val itemView = LayoutInflater.from(this)
                .inflate(R.layout.excercises_list, linearLayoutContainer, false)
            val imageButton: ImageButton = itemView.findViewById(R.id.imageButton)
            imageButton.setImageResource(exercise.image)

        }

        val chest:ImageView=findViewById(R.id.imageView70)
        val back:ImageView=findViewById(R.id.imageView71)
        val shoulder:ImageView=findViewById(R.id.imageView72)
        val bicep:ImageView=findViewById(R.id.imageView73)
        val tricep:ImageView=findViewById(R.id.imageView74)
        val abs:ImageView=findViewById(R.id.imageView75)
        val leg:ImageView=findViewById(R.id.imageView76)

        chest.setOnClickListener{
                startActivity(Intent(this,MainActivity::class.java))
        }

        back.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
        shoulder.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
        bicep.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
        tricep.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
        abs.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
        leg.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }

}

