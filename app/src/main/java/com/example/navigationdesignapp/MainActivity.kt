package com.example.navigationdesignapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {
    lateinit var myDrawer:DrawerLayout
    lateinit var drawertoggle:ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myDrawer = findViewById(R.id.myDrawer)
        drawertoggle= ActionBarDrawerToggle(this,myDrawer,R.string.open,R.string.close)

        myDrawer.addDrawerListener(drawertoggle)
        drawertoggle.syncState()
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (drawertoggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}