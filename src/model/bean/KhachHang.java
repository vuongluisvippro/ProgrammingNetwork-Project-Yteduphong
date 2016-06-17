package model.bean;

@SuppressWarnings("all")
public class KhachHang {
	
	private String maKH;
	private String hoTenKH;
	private int soDienThoai;
	private String diaChiKH;
	private String ngaySinh;
	private String gioiTinh;
	
	public KhachHang() {
		super();
	}

	public KhachHang(String maKH, String hoTenKH, int soDienThoai, String diaChiKH, String ngaySinh, String gioiTinh) {
		super();
		this.maKH = maKH;
		this.hoTenKH = hoTenKH;
		this.soDienThoai = soDienThoai;
		this.diaChiKH = diaChiKH;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getHoTenKH() {
		return hoTenKH;
	}

	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
	}

	public int getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChiKH() {
		return diaChiKH;
	}

	public void setDiaChiKH(String diaChiKH) {
		this.diaChiKH = diaChiKH;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
}
