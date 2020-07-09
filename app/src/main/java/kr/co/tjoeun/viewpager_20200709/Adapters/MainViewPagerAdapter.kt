package kr.co.tjoeun.viewpager_20200709.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.viewpager_20200709.flagments.FirstFragment
import kr.co.tjoeun.viewpager_20200709.flagments.SecondFragment

class MainViewPagerAdapter(fm : FragmentManager)  : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence?{
        return when (position) {
            0->"첫번째 Frag"
            else->"두번째 Frag"
        }


    }

    override fun getItem(position: Int): Fragment {
//        when + return 결합형태
        return  when (position) {
            0-> FirstFragment()
            else -> SecondFragment()
        }


//        when (position) {
//            0 -> {return FirstFragment() }
//            1 -> {return SecondFragment() }
//        }


//        if (position ==0) {
//            return FirstFragment()
//        }
//        else {
//            return SecondFragment()
//        }
    }

    override fun getCount(): Int {
        return 2

    }


}