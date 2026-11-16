package vn.udn.ute.week08.kt04_fragment_2415053122121

import org.junit.Assert.assertEquals
import org.junit.Test

class QuyTacPhieuTest {

    @Test
    fun chuanHoaTen_2121_catKhoangTrangHaiDau() {
        assertEquals("Võ Quốc Khánh", "  Võ Quốc Khánh  ".chuanHoaTen_2121())
    }

    @Test
    fun taoMaPhieu_2121_dungSoThuTu() {
        assertEquals("VE1", QuyTacPhieu_2121.taoMaPhieu_2121(1))
        assertEquals("VE9", QuyTacPhieu_2121.taoMaPhieu_2121(9))
    }

    @Test
    fun phieuVe_luuDungDuLieu_2121() {
        val phieuVe = PhieuVe("VE2", "Lan", 2)

        assertEquals("VE2", phieuVe.maVe_2121)
        assertEquals("Lan", phieuVe.hoTen_2121)
        assertEquals(2, phieuVe.soLuong_2121)
    }
}
