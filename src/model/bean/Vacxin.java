package model.bean;

@SuppressWarnings("all")
public class Vacxin {
	
	private String maVacxin;
	private String tenVacxin;
	private int soMui;
	private String moTa; 
	private int giaVacxin;
	private String tenHang;
	
	public Vacxin() {
		super();
	}
	
	public Vacxin(String tenVacxin, int soMui, String moTa, int giaVacxin, String tenHang) {
		super();
		this.tenVacxin = tenVacxin;
		this.soMui = soMui;
		this.moTa = moTa;
		this.giaVacxin = giaVacxin;
		this.tenHang = tenHang;
	}
	
	public Vacxin(String maVacxin, String tenVacxin, int soMui, String moTa, int giaVacxin, String tenHang) {
		super();
		this.maVacxin = maVacxin;
		this.tenVacxin = tenVacxin;
		this.soMui = soMui;
		this.moTa = moTa;
		this.giaVacxin = giaVacxin;
		this.tenHang = tenHang;
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
	public int getSoMui() {
		return soMui;
	}
	public void setSoMui(int soMui) {
		this.soMui = soMui;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public int getGiaVacxin() {
		return giaVacxin;
	}
	public void setGiaVacxin(int giaVacxin) {
		this.giaVacxin = giaVacxin;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
}
