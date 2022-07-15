package com.bur.exampleweek2

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.bur.exampleweek2.databinding.ActivityFirstBinding

class firsActivity : AppCompatActivity() {
    lateinit var binding: ActivityFirstBinding
    val name = "First Activity"
    val TAG = "LoggerApp"

    lateinit var logListView: ListView
    var myLogsList: ArrayList<String> = ArrayList()
    lateinit var arrayAdapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i(TAG, "onCreate() $name");

        binding.ButtonFirstActivity.setOnClickListener {
            val intent = Intent(this, secondaryActivity::class.java)
            startActivity(intent)
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