package com.itera.itime

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_menu_nav.*
import kotlinx.android.synthetic.main.app_bar_menu_nav.*

class MenuNavActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_nav)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

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
                loadLihatJadwal(frag1 = alihatjadwal())
            }
            R.id.nav_catatan_layout -> {
                loadCatatan(frag2 = bcatatan())
            }
            R.id.nav_jadwal_layout -> {
                loadJadwal(frag3 = cjadwal())
            }
            R.id.nav_datamatakuliah_layout -> {
                loadDataMataKuliah(frag4 = ddatamatakuliah())
            }
            R.id.nav_datadosen_layout -> {
                loadDataDosen(frag5 = edatadosen())
            }
            R.id.nav_dataruangan_layout -> {
                loadDataRuangan(frag6 = fdataruangan())
            }
            R.id.nav_rateus_layout -> {
                loadRateUs(frag7 = grateus())
            }
            R.id.nav_share_layout -> {
                loadShare(frag8 = hShare())
            }
            R.id.nav_setting_layout -> {
                loadSetting(frag9 = iSetting())
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
    private fun loadLihatJadwal(frag1: alihatjadwal){
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.framelayout, frag1)
        fm.commit()
    }

    private fun loadCatatan(frag2: bcatatan){
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.framelayout, frag2)
        fm.commit()
    }

    private fun loadJadwal(frag3: cjadwal){
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.framelayout, frag3)
        fm.commit()
    }

    private fun loadDataMataKuliah(frag4: ddatamatakuliah){
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.framelayout, frag4)
        fm.commit()
    }

    private fun loadDataDosen(frag5: edatadosen){
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.framelayout, frag5)
        fm.commit()
    }

    private fun loadDataRuangan(frag6: fdataruangan){
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.framelayout, frag6)
        fm.commit()
    }

    private fun loadRateUs(frag7: grateus){
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.framelayout, frag7)
        fm.commit()
    }

    private fun loadShare(frag8: hShare){
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.framelayout, frag8)
        fm.commit()
    }

    private fun loadSetting(frag9: iSetting){
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.framelayout, frag9)
        fm.commit()
    }
}
