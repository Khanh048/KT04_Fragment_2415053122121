package vn.udn.ute.week08.kt04_fragment_2415053122121

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class NhapVeFragment : Fragment(R.layout.fragment_nhap_ve) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnXemVe).setOnClickListener {
            xemVe_2121()
        }
    }

    fun xemVe_2121() {
        val edtHoTen = requireView().findViewById<EditText>(R.id.edtHoTen)
        val edtSoLuong = requireView().findViewById<EditText>(R.id.edtSoLuong)
        edtHoTen.error = null
        edtSoLuong.error = null

        if (edtHoTen.text.toString().isBlank()) {
            edtHoTen.error = "Vui lòng nhập họ tên"
            edtHoTen.requestFocus()
            return
        }

        if (edtSoLuong.text.toString().trim().toIntOrNull() == null) {
            edtSoLuong.error = "Số lượng phải là số nguyên"
            edtSoLuong.requestFocus()
        }
    }
}
