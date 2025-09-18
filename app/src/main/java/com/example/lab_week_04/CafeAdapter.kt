package com.example.lab_week_04

import androidx.fragment.app.Fragment // For Fragment
import androidx.fragment.app.FragmentManager // For FragmentManager
import androidx.lifecycle.Lifecycle // For Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter // For FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)

class CafeAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return TABS_FIXED.size
    }
    override fun createFragment(position: Int): Fragment
    {
        return CafeDetailFragment()
    }
}


        