package com.mhl.myapplication.ui.shop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.mhl.myapplication.R

class ShopFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val root = inflater.inflate(R.layout.fragment_shop, container, false)
    val text : TextView = root.findViewById(R.id.text_shop)
    text.text = "Раздел находится в разработке"
    return root
  }
}