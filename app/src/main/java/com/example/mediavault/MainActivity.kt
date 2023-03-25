package com.example.mediavault

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.bumptech.glide.Glide
import com.example.mediavault.databinding.ActivityMainBinding

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        binding.bottomMenu.setupWithNavController(navController)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.bottom_menu, menu)

        val youTube = menu!!.findItem(R.id.btn1)
        val tikTok = menu.findItem(R.id.btn2)
        val instagram = menu.findItem(R.id.btn3)
        // Первая кнопка(ЮТЮБ)
        Glide.with(this).asGif()
            .load(R.drawable.youtube)
            .into(youTube.actionView!!.findViewById(R.id.btn1))
        // Вторая кнопка(Тик ток)
        Glide.with(this).asGif()
            .load(R.drawable.tiktok)
            .into(tikTok.actionView!!.findViewById(R.id.btn2))
        // Третья кнопка(Инстаграм)
        Glide.with(this).asGif()
            .load(R.drawable.instagram)
            .into(instagram.actionView!!.findViewById(R.id.btn3))
        return true

    }
}