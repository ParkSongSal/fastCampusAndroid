package com.example.fastcampusandroid.Fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fastcampusandroid.R

class FragmentOne : Fragment(){

    override fun onAttach(context: Context) {
        Log.d("Life_Cycle", "F onAttach!!!!!!!!")

        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Life_Cycle", "F onCreate!!!!!!!!")

        super.onCreate(savedInstanceState)
    }

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("Life_Cycle", "F onViewCreated!!!!!!!!")

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("Life_Cycle", "F onActivityCreated!!!!!!!!")

        val data = arguments?.getString("hello")
        Log.d("Life_Cycle", "F onActivityCreated!!!!!!!! $data")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("Life_Cycle", "F onStart!!!!!!!!")

        super.onStart()
    }

    override fun onResume() {
        Log.d("Life_Cycle", "F onResume!!!!!!!!")

        super.onResume()
    }

    override fun onPause() {
        Log.d("Life_Cycle", "F onPause!!!!!!!!")

        super.onPause()
    }

    override fun onStop() {
        Log.d("Life_Cycle", "F onStop!!!!!!!!")

        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("Life_Cycle", "F onDestroyView!!!!!!!!")

        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("Life_Cycle", "F onDetach!!!!!!!!")

        super.onDetach()
    }
}