package model.bo;

import java.util.ArrayList;

import model.bean.KhachHang;
import model.dao.KhachHangDAO;

@SuppressWarnings("all")
public class KhachHangBO {

	public ArrayList<KhachHang> getListKH() {
		return new KhachHangDAO().getListKH();
	}

}
