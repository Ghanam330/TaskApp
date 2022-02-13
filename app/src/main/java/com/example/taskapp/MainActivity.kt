package com.example.taskapp

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import androidx.core.view.isVisible
import com.example.taskapp.classes_views.DrawingView
import com.example.taskapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    private lateinit var draw: DrawingView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        initialize()
        addListenerOnView()

    }

    private fun initialize() {
        draw = findViewById(R.id.main_VW_layout)
    }

    private fun addListenerOnView() {
        binding!!.btnBrush.setOnClickListener {
            binding?.btnBrush?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.back_ground_btn))
            binding?.btnNorthEast?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.btnCrop?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.btnCircleDrawer?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.btnIcColorLens?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
                   binding?.mainSPSelectColor?.isVisible=false
            //  binding?.linearColor?.isVisible = false
            sendNumAction(1)
        }
        binding!!.btnNorthEast.setOnClickListener {

            binding?.btnBrush?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.btnNorthEast?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.back_ground_btn))
            binding?.btnCrop?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.btnCircleDrawer?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.btnIcColorLens?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
                      binding?.mainSPSelectColor?.isVisible=false
            //  binding?.linearColor?.isVisible = false
            sendNumAction(2)
        }
        binding!!.btnCrop.setOnClickListener {
            binding?.btnBrush?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.btnNorthEast?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.btnCrop?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.back_ground_btn))
            binding?.btnCircleDrawer?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.btnIcColorLens?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
                       binding?.mainSPSelectColor?.isVisible=false
            // binding?.linearColor?.isVisible = false
            sendNumAction(3)
        }
        binding!!.btnCircleDrawer.setOnClickListener {
            binding?.btnBrush?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.btnNorthEast?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.btnCrop?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.btnCircleDrawer?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.back_ground_btn))
            binding?.btnIcColorLens?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.mainSPSelectColor?.isVisible=false
            //  binding?.linearColor?.isVisible = false
            sendNumAction(4)
        }
        binding!!.btnIcColorLens.setOnClickListener {
            binding?.btnBrush?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.btnNorthEast?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.btnCrop?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.btnCircleDrawer?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            binding?.btnIcColorLens?.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.back_ground_btn))
           binding?.mainSPSelectColor?.isVisible=false
            //          binding?.linearColor?.isVisible = false
            dialogSelectAColor()
        }
        binding!!.mainVWLayout.setOnClickListener {
            binding?.mainSPSelectColor?.isVisible=false
       //     binding?.linearColor?.isVisible = false
        }

    }

    private fun sendNumAction(num: Int) {
        draw.num(num)
    }

    private fun dialogSelectAColor() {
        //listener for color select
        Log.d("coloSP", "SpectrumPalette")
        binding?.mainSPSelectColor?.isVisible = true
        binding!!.mainSPSelectColor.setOnColorSelectedListener { col ->
            binding?.mainSPSelectColor?.isVisible = false
           binding?.mainVWLayout?.setColor(col)
        //   binding?.btnIcColorLens?.backgroundTintList = ColorStateList.valueOf(col)
        }

    }
}