package com.oddinstitute.viewpager

import android.content.Context
import android.graphics.ColorSpace
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity()
{

    val myViews : Array<Int> = arrayOf(R.layout.layout_one,
                                       R.layout.layout_two,
                                       R.layout.layout_three)

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myViewPager.adapter = MyAdapter(myViews, this@MainActivity)
    }
}


class MyAdapter (private val theViews: Array<Int>,
                 private val theContext: Context) : PagerAdapter()
{
    //
    override fun isViewFromObject(view: View,
                                  `object`: Any): Boolean
    {
        return view === `object`
    }

    // default method
    override fun getCount(): Int
    {
        return theViews.size
    }

    //
    override fun instantiateItem(container: ViewGroup,
                                 position: Int): Any
    {
        val thisView = theViews[position]
        val inflater = LayoutInflater.from(theContext)

        val layout = inflater.inflate(thisView, container,
                                      false) as ViewGroup

        container.addView(layout)
        return layout
    }

    //
    override fun destroyItem(container: ViewGroup,
                             position: Int,
                             view: Any)
    {
        container.removeView(view as View)
    }
}