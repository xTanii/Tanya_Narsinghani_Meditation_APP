package com.example.tanya_narsinghani_meditation_app.ui.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tanya_narsinghani_meditation_app.R
import com.google.firebase.firestore.FirebaseFirestore

class HomeActivity : AppCompatActivity() {
    lateinit var db: FirebaseFirestore
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        db = FirebaseFirestore.getInstance()
        writeInsideDatabase()

    }

    fun writeInsideDatabase() {
//Was not able to figure out how to write the data in firestore
        db.collection("Meditation").document("focus").set({
            "name" to "Focus"
            "doing_right_now" to 324
        })

    }


}
