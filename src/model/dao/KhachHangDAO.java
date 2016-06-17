package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import model.bean.KhachHang;
import model.bean.Vacxin;

@SuppressWarnings("all")
public class KhachHangDAO {

	private MyConnectDB mConnect;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	private Connection conn;
	
	private String TABLE_NAME = "khachhang";
	
	public KhachHangDAO(){
		mConnect = new MyConnectDB();
	}
	
	public ArrayList<KhachHang> getListKH() {
		ArrayList<KhachHang> listKH = new ArrayList<KhachHang>();
		String sql = "SELECT * FROM "+TABLE_NAME;
		conn = mConnect.getConnectMySQL();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				String ngaySinh = new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate("NgaySinh"));
				listKH.add(new KhachHang(rs.getString("MaKH"), rs.getString("HoTenKH"), rs.getInt("SoDienThoai"), rs.getString("DiaChiKH"), ngaySinh, rs.getString("GioiTinh")));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return listKH;
	}
}
