package model.bean;

@SuppressWarnings("all")
public class Objectx{
	
	private String maKH;
	private String tenKhachHang;
	private String tenBenh;
	private String maVacxin;
	private String tenVacxin;
	private int sttMui;
	private int tongSoMui;
	public Objectx() {
		super();
	}
	public Objectx(String maKH, String tenKhachHang, String tenBenh, String maVacxin, String tenVacxin, int sttMui,
			int tongSoMui) {
		super();
		this.maKH = maKH;
		this.tenKhachHang = tenKhachHang;
		this.tenBenh = tenBenh;
		this.maVacxin = maVacxin;
		this.tenVacxin = tenVacxin;
		this.sttMui = sttMui;
		this.tongSoMui = tongSoMui;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getTenBenh() {
		return tenBenh;
	}
	public void setTenBenh(String tenBenh) {
		this.tenBenh = tenBenh;
	}
	public String getMaVacxin() {
		return maVacxin;
	}
	public void setMaVacxin(String maVacxin) {
		this.maVacxin = maVacxin;
	}
	public String getTenVacxin() {
		return tenVacxin;
	}
	public void setTenVacxin(String tenVacxin) {
		this.tenVacxin = tenVacxin;
	}
	public int getSttMui() {
		return sttMui;
	}
	public void setSttMui(int sttMui) {
		this.sttMui = sttMui;
	}
	public int getTongSoMui() {
		return tongSoMui;
	}
	public void setTongSoMui(int tongSoMui) {
		this.tongSoMui = tongSoMui;
	}
}
