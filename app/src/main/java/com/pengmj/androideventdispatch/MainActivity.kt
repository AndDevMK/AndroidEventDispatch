package com.pengmj.androideventdispatch

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pengmj.androideventdispatch.conflict.MyPresenter
import com.pengmj.androideventdispatch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
                DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.presenter = MyPresenter()
    }

    private val TAG = MainActivity::class.java.simpleName

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        when (ev?.action) {
            MotionEvent.ACTION_DOWN   -> {
                if (LOG_ACTION_DOWN) Log.e(TAG, "dispatchTouchEvent -> ACTION_DOWN")
            }
            MotionEvent.ACTION_MOVE   -> {
                if (LOG_ACTION_MOVE) Log.e(TAG, "dispatchTouchEvent -> ACTION_MOVE")
            }
            MotionEvent.ACTION_UP     -> {
                if (LOG_ACTION_UP) Log.e(TAG, "dispatchTouchEvent -> ACTION_UP")
            }
            MotionEvent.ACTION_CANCEL -> {
                if (LOG_ACTION_CANCEL) Log.e(TAG, "dispatchTouchEvent -> ACTION_CANCEL")
            }
        }
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN   -> {
                if (LOG_ACTION_DOWN) Log.e(TAG, "onTouchEvent -> ACTION_DOWN")
            }
            MotionEvent.ACTION_MOVE   -> {
                if (LOG_ACTION_MOVE) Log.e(TAG, "onTouchEvent -> ACTION_MOVE")
            }
            MotionEvent.ACTION_UP     -> {
                if (LOG_ACTION_UP) Log.e(TAG, "onTouchEvent -> ACTION_UP")
            }
            MotionEvent.ACTION_CANCEL -> {
                if (LOG_ACTION_CANCEL) Log.e(TAG, "onTouchEvent -> ACTION_CANCEL")
            }
        }
        return super.onTouchEvent(event)
    }
}