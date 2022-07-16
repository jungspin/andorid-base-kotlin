package com.pinslog.baseproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.pinslog.baseproject.base.BaseActivity
import com.pinslog.baseproject.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getBinding(inflater: LayoutInflater): ActivityMainBinding {
        binding = ActivityMainBinding.inflate(inflater)
        return binding
    }

}