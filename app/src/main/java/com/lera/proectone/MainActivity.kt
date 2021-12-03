package com.lera.proectone

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

const val TAG="MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Ладушки Ладушки")


        }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Где были - у бабушки")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Что ели - кашку")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Что пили - бражку")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Кашка сладенька бражка молоденька")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "А бабушка добренька.")
    }



}