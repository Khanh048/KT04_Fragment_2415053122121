package vn.udn.ute.week08.kt04_fragment_2415053122121

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class NhapVeFragment : Fragment(R.layout.fragment_nhap_ve) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnXemVe).setOnClickListener {
            xemVe_2121()
        }
    }

    fun xemVe_2121() = Unit
}
