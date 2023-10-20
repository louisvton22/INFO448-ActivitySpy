package edu.ischool.lton2.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG: String = "Activity Spy"
    val msg: (String) -> String = {it ->
        "on${it} event was fired."
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, msg("Create"))// + savedInstanceState?.toString() )
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, msg("Start"))
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, msg("Stop"))
    }
    override fun onPause() {
        super.onPause()
        Log.i(TAG, msg("Pause"))
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, msg("Resume"))
    }
    override fun onDestroy() {
        super.onDestroy()
        throw Exception()
        Log.i(TAG, msg("Destroy"))
        Log.e(TAG, "We're going down, Captain!")
    }
}