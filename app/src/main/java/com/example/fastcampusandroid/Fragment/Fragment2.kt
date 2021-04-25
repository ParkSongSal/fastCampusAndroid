package com.example.fastcampusandroid.Fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fastcampusandroid.R
import kotlinx.android.synthetic.main.fragment_one.*

class Fragment2 : Fragment(){



    // 뷰를 그리는 부분
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflater -> 뷰를 그려주는 역할
        // container -> 부모뷰
        // 프래그먼트가 인터페이스를 처음으로 그릴 때 호출된다.
        Log.d("Life_Cycle", "F onCreateView!!!!!!!!")

        return inflater.inflate(R.layout.fragment_one, container, false)

    }

}