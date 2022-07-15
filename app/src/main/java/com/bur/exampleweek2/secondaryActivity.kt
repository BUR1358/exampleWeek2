package com.bur.exampleweek2

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.bur.exampleweek2.databinding.ActivityFirstBinding
import com.bur.exampleweek2.databinding.ActivitySecondaryBinding

class secondaryActivity : AppCompatActivity() {
    lateinit var binding_from_firtsActivity: ActivityFirstBinding
    lateinit var binding: ActivitySecondaryBinding
    var firsActivity: firsActivity = firsActivity()


    var myLogsList = firsActivity.myLogsList

    val name = "Second Activity"
    val TAG = "LoggerApp"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding_from_firtsActivity = ActivityFirstBinding.inflate(layoutInflater)
        binding = ActivitySecondaryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i(TAG, "onCreate() $name");

        binding.ButtonSecondActivity.setOnClickListener {
            val myDialogFragment = myAlertDialog()
            val manager = supportFragmentManager
            myDialogFragment.show(manager, "myDialog")
        }
    }

    override fun onStart() {
        Log.i(TAG, "onStart() $name");
        super.onStart()
    }

    override fun onResume() {
        Log.i(TAG, "onResume() $name");
        super.onResume()
    }

    override fun onPause() {
        Log.i(TAG, "onPause() $name");
        super.onPause()
    }

    override fun onRestart() {
        Log.i(TAG, "onRestart() $name");
        super.onRestart()
    }

    override fun onStop() {
        Log.i(TAG, "onStop() $name");
        super.onStop()
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy() $name");
        super.onDestroy()
    }
}