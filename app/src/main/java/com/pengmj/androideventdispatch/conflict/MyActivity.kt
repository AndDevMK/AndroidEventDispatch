package com.pengmj.androideventdispatch.conflict

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pengmj.androideventdispatch.R
import com.pengmj.androideventdispatch.databinding.ActivityMyBinding

/**
 * @author MinKin
 * @date 2023/5/18
 * @desc
 */
class MyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
                DataBindingUtil.setContentView<ActivityMyBinding>(this, R.layout.activity_my)
    }
}