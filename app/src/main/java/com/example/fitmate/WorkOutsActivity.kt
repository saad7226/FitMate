package com.example.fitmate

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WorkOutsActivity : AppCompatActivity() {

    lateinit var rcv: RecyclerView
    lateinit var adapter: ExcercisesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_workouts)

        val WorkOuts: ArrayList<Excercises> = ArrayList()
        WorkOuts.add(Excercises(R.drawable.chestworkout))
        WorkOuts.add(Excercises(R.drawable.backworkout))
        WorkOuts.add(Excercises(R.drawable.shoulderworkout))
        WorkOuts.add(Excercises(R.drawable.bicepsworkout))
        WorkOuts.add(Excercises(R.drawable.tricepsworkout))
        WorkOuts.add(Excercises(R.drawable.absworkout))
        WorkOuts.add(Excercises(R.drawable.legsworkout))

        rcv = findViewById(R.id.recycleview1)
        rcv.layoutManager = LinearLayoutManager(this)


        val onItemClickList = ArrayList<(Excercises) -> Unit>()
        onItemClickList.add { navigateToChestWorkoutActivity() }
        onItemClickList.add { navigateToBackWorkoutActivity() }
        onItemClickList.add { navigateToShoulderWorkoutActivity() }
        onItemClickList.add { navigateToBicepsWorkoutActivity() }
        onItemClickList.add { navigateToTricepsWorkoutActivity() }
        onItemClickList.add { navigateToAbsWorkoutActivity() }
        onItemClickList.add { navigateToLegsWorkoutActivity() }


        adapter = ExcercisesAdapter(this, WorkOuts, onItemClickList)
        rcv.adapter = adapter
    }

    private fun navigateToChestWorkoutActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToBackWorkoutActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToShoulderWorkoutActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToBicepsWorkoutActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTricepsWorkoutActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToAbsWorkoutActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToLegsWorkoutActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
