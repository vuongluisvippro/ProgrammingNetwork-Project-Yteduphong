package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Vacxin;

@SuppressWarnings("all")
public class VacxinDAO {
	
	private MyConnectDB mConnect;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	private Connection conn;
	
	private String TABLE_NAME = "vacxin";
	
	public VacxinDAO(){
		mConnect = new MyConnectDB();
	}
	public int addVacxin(Vacxin vacxin){
		int kq = 0;
		String sql = "INSERT INTO "+TABLE_NAME+"(MaVacxin,TenVacxin,SoMui,MoTa,GiaVacxin,TenHang) VALUES(?,?,?,?,?,?)";
		conn = mConnect.getConnectMySQL();
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, vacxin.getMaVacxin());
			pst.setString(2, vacxin.getTenVacxin());
			pst.setInt(3,vacxin.getSoMui());
			pst.setString(4,vacxin.getMoTa());
			pst.setInt(5,vacxin.getGiaVacxin());
			pst.setString(6, vacxin.getTenHang());
			kq = pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return kq;
	}
	public ArrayList<Vacxin> getListVX() {
		ArrayList<Vacxin> listVX = new ArrayList<Vacxin>();
		String sql = "SELECT * FROM "+TABLE_NAME;
		conn = mConnect.getConnectMySQL();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				listVX.add(new Vacxin(rs.getString("MaVacxin"), rs.getString("TenVacxin"), rs.getInt("SoMui"), rs.getString("MoTa"),rs.getInt("GiaVacxin"),rs.getString("TenHang")));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return listVX;
	}
	public Vacxin getVacxin(String maVacxin){
		Vacxin vacxin = null;
		String sql = "SELECT * FROM "+TABLE_NAME+" WHERE maVacxin = ?";
		conn = mConnect.getConnectMySQL();
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, maVacxin);
			rs = pst.executeQuery();
			if(rs.next()){
				vacxin = new Vacxin(rs.getString("MaVacxin"), rs.getString("TenVacxin"), rs.getInt("SoMui"), rs.getString("MoTa"),rs.getInt("GiaVacxin"),rs.getString("TenHang"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return vacxin;
	}
	public int editVacxin(Vacxin vacxin) {
		int kq = 0;
		String sql = "UPDATE "+TABLE_NAME+" SET TenVacxin = ?,SoMui = ?,MoTa = ?,GiaVacxin = ?,TenHang = ? WHERE MaVacxin = ?";
		conn = mConnect.getConnectMySQL();
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, vacxin.getTenVacxin());
			pst.setInt(2, vacxin.getSoMui());
			pst.setString(3, vacxin.getMoTa());
			pst.setInt(4, vacxin.getGiaVacxin());
			pst.setString(5, vacxin.getTenHang());
			pst.setString(6, vacxin.getMaVacxin());
			kq = pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return kq;
	}
}
