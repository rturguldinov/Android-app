package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View

//import com.hathy.kotlinsample.newWindow

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
//
//        fun clickbutton (view: View) {
//            val changePage = Intent(this, newWindow::class.java)
//            startActivity(changePage)
//        }

        button3.setOnClickListener{ v: View? ->
            val x = Intent(this, newWindow::class.java)
            startActivity(x)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        return when (item.itemId) {
//            R.id.action_newWindow -> true
//            else -> super.onOptionsItemSelected(item)
//        }
        when (item.itemId){
            R.id.action_newWindow -> {
                val k = Intent(this, newWindow::class.java)
                startActivity(k)
                return true
            }
            R.id.action_logout -> onDestroy()
        }
        return super.onOptionsItemSelected(item)
    }
}
