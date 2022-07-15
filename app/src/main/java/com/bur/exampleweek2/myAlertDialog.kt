package com.bur.exampleweek2

import android.app.AlertDialog
import android.app.Dialog
import android.content.ContentValues
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class myAlertDialog : DialogFragment() {
    val name = "AlertDialog"
    val TAG = "LoggerApp"
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle("Важное сообщение!")
                .setMessage("Покормите кота!")
                .setPositiveButton("ОК, иду на кухню") { dialog, id ->
                    dialog.cancel()
                }
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }

    override fun onAttach(context: Context) {
        Log.i(TAG, "onAttach() $name");
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate() $name");
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i(TAG, "onViewCreated() $name");
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.i(TAG, "onActivityCreated() $name");
        super.onActivityCreated(savedInstanceState)
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

    override fun onStop() {
        Log.i(TAG, "onStop() $name");
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i(TAG, "onDestroyView() $name");
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy() $name");
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i(TAG, "onDetach() $name");
        super.onDetach()
    }
}