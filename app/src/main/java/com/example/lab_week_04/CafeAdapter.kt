package com.example.lab_week_04

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class CafeAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private val context: Context
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    companion object {
        // Title tab
        val TABS_FIXED = listOf(
            R.string.starbucks_title,
            R.string.janjijiwa_title,
            R.string.kopikenangan_title,
        )

        // Content tab
        private val TAB_CONTENTS = listOf(
            R.string.starbucks_desc,
            R.string.janjijiwa_desc,
            R.string.kopikenangan_desc,
        )
    }

    override fun getItemCount(): Int = TABS_FIXED.size

    override fun createFragment(position: Int): Fragment {
        val content = context.getString(TAB_CONTENTS[position])
        return CafeDetailFragment.newInstance(content)
    }
}
