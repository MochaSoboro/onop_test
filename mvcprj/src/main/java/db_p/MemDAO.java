package db_p;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.DriverManager;

public class MemDAO {

	String url = "jdbc:mysql://localhost:3306/onop_db?characterEncoding=utf-8";
	String user = "onop";
	String pw = "123456";
	
	Connection con = null;
	PreparedStatement ptmt = null;
	ResultSet rs = null;
	
	public MemDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<MemDTO> list() {
		ArrayList<MemDTO> res = new ArrayList<MemDTO>();
		
		String sql = "SELECT * from mvcmember";
		
		try {
			
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				MemDTO dto = new MemDTO();
				dto.setMemid(rs.getString("memid"));
				dto.setTel(rs.getInt("tel"));
				dto.setMname(rs.getString("mname"));
				dto.setEmail(rs.getString("email"));
				dto.setAddr(rs.getString("addr"));
				dto.setImg(rs.getString("img"));
				dto.setRegdate(rs.getTimestamp("regdate"));
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				dto.setBirth(sdf.format(rs.getDate("birth")));
				
				
				res.add(dto);
			}
			
		} catch (Exception e) {
		} finally {
			close();
		}
		
		return res;
	}
	
	public void insert(MemDTO dto) {
		System.out.println("DAO insert");
		String sql = "INSERT INTO mvcmember (memid, mname, email, tel, addr, img, regdate, birth) VALUES (?, ?, ?, ?, ?, ?, now(), ?)";
		
		try {
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, dto.getMemid());
			ptmt.setString(2, dto.getMname());
			ptmt.setString(3, dto.getEmail());
			ptmt.setInt(4, dto.getTel());
			ptmt.setString(5, dto.getAddr());
			ptmt.setString(6, dto.getImg());
			ptmt.setString(7, dto.getBirth());
			
			ptmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
	
	public MemDTO detail(String id) {
		MemDTO dto = null;
		String sql = "SELECT * FROM mvcmember WHERE memid = ?";
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			rs = ptmt.executeQuery();
			
			if (rs.next()) {
				dto = new MemDTO();
				dto.setMemid(rs.getString("memid"));
				dto.setTel(rs.getInt("tel"));
				dto.setMname(rs.getString("mname"));
				dto.setEmail(rs.getString("email"));
				dto.setAddr(rs.getString("addr"));
				dto.setImg(rs.getString("img"));
				dto.setRegdate(rs.getTimestamp("regdate"));
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				dto.setBirth(sdf.format(rs.getDate("birth")));
				
				
			}
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		return dto;
	}
	
	public void modify(MemDTO dto) {
		System.out.println("DAO modify");
		String sql = "UPDATE mvcmember SET mname = ?, email = ?, tel = ?, addr = ?, birth = ? WHERE memid = ?";
		
		try {
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, dto.getMname());
			ptmt.setString(2, dto.getEmail());
			ptmt.setInt(3, dto.getTel());
			ptmt.setString(4, dto.getAddr());
			ptmt.setString(5, dto.getBirth());
			ptmt.setString(6, dto.getMemid());
			
			ptmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
	
	public void delete(MemDTO dto) {
		System.out.println("DAO modify");
		String sql = "DELETE FROM mvcmember WHERE memid = ?";
		
		try {
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, dto.getMemid());
			
			ptmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
	
	public void close() {
		if (rs != null) { try { rs.close(); } catch (Exception e) {} }
		if (ptmt != null) { try { ptmt.close(); } catch (Exception e) {} }
		if (con != null) { try { con.close(); } catch (Exception e) {} }
	}
	
}
