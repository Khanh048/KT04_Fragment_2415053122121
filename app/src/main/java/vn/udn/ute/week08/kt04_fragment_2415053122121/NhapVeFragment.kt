package vn.udn.ute.week08.kt04_fragment_2415053122121

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class NhapVeFragment : Fragment(R.layout.fragment_nhap_ve) {

    private var soThuTuTiepTheo_2121 = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        soThuTuTiepTheo_2121 =
            savedInstanceState?.getInt("soThuTuTiepTheo_2121", 1) ?: 1
    }

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

        val hoTen = edtHoTen.text.toString().chuanHoaTen_2121()
        if (hoTen.length !in 2..40) {
            edtHoTen.error = "Họ tên phải dài từ 2 đến 40 ký tự"
            edtHoTen.requestFocus()
            return
        }

        val chuoiSoLuong = edtSoLuong.text.toString().trim()
        val soLuong = chuoiSoLuong.toIntOrNull()
        if (soLuong == null) {
            edtSoLuong.error = "Số lượng phải là số nguyên"
            edtSoLuong.requestFocus()
            return
        }
        if (soLuong !in 1..9) {
            edtSoLuong.error = "Số lượng phải từ 1 đến 9"
            edtSoLuong.requestFocus()
            return
        }

        val phieuVe = PhieuVe(
            maVe_2121 = QuyTacPhieu_2121.taoMaPhieu_2121(soThuTuTiepTheo_2121),
            hoTen_2121 = hoTen,
            soLuong_2121 = soLuong
        )
        soThuTuTiepTheo_2121++

        val ketQua = Bundle().apply {
            putString("maVe", phieuVe.maVe_2121)
            putString("hoTen", phieuVe.hoTen_2121)
            putInt("soLuong", phieuVe.soLuong_2121)
        }
        parentFragmentManager.setFragmentResult("ve_tao", ketQua)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("soThuTuTiepTheo_2121", soThuTuTiepTheo_2121)
        super.onSaveInstanceState(outState)
    }
}
