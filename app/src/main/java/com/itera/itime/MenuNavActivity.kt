package com.itera.itime

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.itera.itime.maps.DirectionActivity
import kotlinx.android.synthetic.main.activity_menu_nav.*
import kotlinx.android.synthetic.main.app_bar_menu_nav.*

class MenuNavActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_nav)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_nav, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_lihatjadwal_layout -> {
                startActivity(Intent(this,z0lihatjadwal::class.java))
            }
            R.id.nav_catatan_layout -> {
                startActivity(Intent(this,z1catatan::class.java))
            }
            R.id.nav_jadwal_layout -> {
                startActivity(Intent(this,z2jadwal::class.java))
            }
            R.id.nav_datamatakuliah_layout -> {
                startActivity(Intent(this,z3datamatakuliah::class.java))
            }
            R.id.nav_datadosen_layout -> {
                startActivity(Intent(this,z4datadosen::class.java))
            }
            R.id.nav_dataruangan_layout -> {
                startActivity(Intent(this,z5dataruangan::class.java))
            }
            R.id.nav_rateus_layout -> {
                startActivity(Intent(this,z6rateus::class.java))
            }
            R.id.nav_share_layout -> {
                startActivity(Intent(this,z7share::class.java))
            }
            R.id.nav_setting_layout -> {
                startActivity(Intent(this,z8setting::class.java))
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
