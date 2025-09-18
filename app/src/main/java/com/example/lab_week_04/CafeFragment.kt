package com.example.lab_week_04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2 // <--- Add this
import com.google.android.material.tabs.TabLayout // <--- Add this
import com.google.android.material.tabs.TabLayoutMediator // <--- Add this

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CafeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CafeFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cafe, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Ensure your layout file (R.layout.fragment_cafe) contains
        // a ViewPager2 with the id "view_pager" and a TabLayout with the id "tab_layout"
        val viewPager = view.findViewById<ViewPager2>(R.id.view_pager)
        val tabLayout = view.findViewById<TabLayout>(R.id.tab_layout)

        // Make sure CafeAdapter is correctly defined and imported if it's in a different package
        val adapter = CafeAdapter(childFragmentManager, lifecycle)
        viewPager.adapter = adapter // 'adapter' is a property of ViewPager2

        // The types for 'tab' and 'position' will now be inferred correctly
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            // Make sure TABS_FIXED is accessible here (e.g., defined in this file or imported)
            // and that it contains valid string resource IDs
            tab.text = resources.getString(TABS_FIXED[position]) // 'text' is a property of TabLayout.Tab
        }.attach()
    }
}
