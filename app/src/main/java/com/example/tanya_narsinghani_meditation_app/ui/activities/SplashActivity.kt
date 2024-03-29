package com.example.tanya_narsinghani_meditation_app.ui.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.example.tanya_narsinghani_meditation_app.R

class SplashActivity : AppCompatActivity() {
        private var mDelayHandler: Handler? = null
        private val SPLASH_DELAY: Long = 3000

        internal val mRunnable: Runnable = Runnable {
            if (!isFinishing) {

                val intent = Intent(applicationContext, HomeActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.splash_activity_layout)


            mDelayHandler = Handler()


            mDelayHandler!!.postDelayed(mRunnable, SPLASH_DELAY)

        }

        public override fun onDestroy() {

            if (mDelayHandler != null) {
                mDelayHandler!!.removeCallbacks(mRunnable)
            }

            super.onDestroy()
        }


}