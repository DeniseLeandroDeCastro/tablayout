package br.com.poctabs.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.poctabs.R
import br.com.poctabs.databinding.ActivityMainBinding
import br.com.poctabs.ui.adapter.ViewPagerAdapter
import br.com.poctabs.ui.fragments.TabOneFragment
import br.com.poctabs.ui.fragments.TabThreeFragment
import br.com.poctabs.ui.fragments.TabTwoFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter=ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(TabOneFragment(), "Tab 1")
        adapter.addFragment(TabTwoFragment(), "Tab 2")
        adapter.addFragment(TabThreeFragment(), "Tab 3")

        binding.viewPager.adapter=adapter
        binding.tbLayout.setupWithViewPager(binding.viewPager)
    }
}