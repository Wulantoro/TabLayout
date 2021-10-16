package com.example.mytablayout

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3

        //Fungsi getItemCount digunakan untuk menentukan jumlah tab yang ingin ditampilkan

    }

    override fun createFragment(position: Int): Fragment {

        //tampil beberapa tampilang debgan 1 fragment
        //Mengapa ada +1? hal ini karena position dimulai dari 0, sedangkan Anda ingin menampilkan urutan tab yang dimulai dari 1   
        return HomeFragment.newInstance(position + 1)


        // 1 fragment intuk 1 tampilan
//        var fragment : Fragment? = null
//        when (position) {
//            0 -> fragment = HomeFragment()
//            1 -> fragment = ProfilFragment()
//        }
//        return fragment as Fragment

    }
}