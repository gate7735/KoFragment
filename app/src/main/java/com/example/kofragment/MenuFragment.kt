package com.example.kofragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_menu.view.*

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = layoutInflater.inflate(R.layout.fragment_menu, container, false)
        rootView.btn_go_to_main.setOnClickListener {
            val activity = activity as MainActivity?
            // onFragmentChange() 메서드는 메인 액티비티에 새로 추가할 메서드로 프래그먼트 매니저를 이용해 프래그먼트를 전환하는 메서드
            // 하나의 프래그먼트에서 다른 프래그먼트로 직접 띄우는 것이 아니라 액티비티를 통해 띄워야 함
            // 프래그먼트에서는 getActivity() 메서드를 호출하면 프래그먼트가 올라가 있는 액티비티가 어떤 것인지 확인 가능
            activity!!.onFragmentChanged(1)
        }
        return rootView
    }
}