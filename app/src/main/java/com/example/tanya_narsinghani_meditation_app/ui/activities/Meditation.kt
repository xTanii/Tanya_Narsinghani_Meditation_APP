package com.example.tanya_narsinghani_meditation_app.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.tanya_narsinghani_meditation_app.R
import com.google.firebase.firestore.FirebaseFirestore



class MeditationActivity : AppCompatActivity() {

    lateinit var db: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        db = FirebaseFirestore.getInstance()

    }
}