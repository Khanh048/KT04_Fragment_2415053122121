package vn.udn.ute.week08.kt04_fragment_2415053122121

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.setFragmentResultListener("ve_tao", this) { _, ketQua ->
            val manHinhXacNhan = XacNhanVeFragment().apply {
                arguments = ketQua
            }
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentHost, manHinhXacNhan)
                .addToBackStack(null)
                .commit()
        }

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentHost, NhapVeFragment())
                .commit()
        }
    }
}
