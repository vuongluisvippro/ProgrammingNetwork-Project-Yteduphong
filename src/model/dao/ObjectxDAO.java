package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Objectx;

@SuppressWarnings("all")
public class ObjectxDAO {

	private MyConnectDB mConnect;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	private Connection conn;
	
	public ObjectxDAO() {
		mConnect = new MyConnectDB();
	}
	
	public ArrayList<Objectx> getItems(String maKH) {
		ArrayList<Objectx> listObjx = new ArrayList<Objectx>();
		String sql = "SELECT khachhang.MaKH,khachhang.HoTenKH,benh.TenBenh,vacxin.MaVacxin,vacxin.TenVacxin,lichsutiemphong.STTMui,vacxin.SoMui"
				+" FROM khachhang"
				+" INNER JOIN lichsutiemphong"
				+" ON khachhang.MaKH = lichsutiemphong.MaKH"
				+" INNER JOIN vacxin"
				+" ON lichsutiemphong.MaVacxin = vacxin.MaVacxin"
				+" INNER JOIN phongbenh"
				+" ON phongbenh.MaVacxin = vacxin.MaVacxin"
				+" INNER JOIN benh"
				+" ON phongbenh.MaBenh = benh.MaBenh WHERE khachhang.MaKH = ?";
		conn = mConnect.getConnectMySQL();
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, maKH);
			rs = pst.executeQuery();
			while(rs.next()){
				listObjx.add(new Objectx(rs.getString("MaKH"), rs.getString("HoTenKH"), rs.getString("TenBenh"), rs.getString("MaVacxin"), rs.getString("TenVacxin"), rs.getInt("STTMui"), rs.getInt("SoMui")));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return listObjx;
	}
}
