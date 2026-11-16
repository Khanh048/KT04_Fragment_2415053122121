package vn.udn.ute.week08.kt04_fragment_2415053122121

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.text.NumberFormat
import java.util.Locale

class XacNhanVeFragment : Fragment(R.layout.fragment_xac_nhan_ve) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val maVe = requireArguments().getString("maVe").orEmpty()
        val hoTen = requireArguments().getString("hoTen").orEmpty()
        val soLuong = requireArguments().getInt("soLuong")
        val tienGoc = soLuong * 50_000
        val dinhDangTien = NumberFormat.getNumberInstance(Locale.forLanguageTag("vi-VN"))

        view.findViewById<TextView>(R.id.txtMaVe).text = "Mã vé: $maVe"
        view.findViewById<TextView>(R.id.txtHoTen).text = "Họ tên: $hoTen"
        view.findViewById<TextView>(R.id.txtSoLuong).text = "Số lượng: $soLuong vé"
        view.findViewById<TextView>(R.id.txtTienGoc).text =
            "Tiền gốc: ${dinhDangTien.format(tienGoc)}đ"

        view.findViewById<Button>(R.id.btnQuayLai).setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}
