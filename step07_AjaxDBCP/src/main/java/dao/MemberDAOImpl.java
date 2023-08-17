package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DBManager;
import dto.Member;

public class MemberDAOImpl implements MemberDAO {

	@Override
	public List<Member> selectAll() {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs =null;
		List<Member> list = new ArrayList<>();
		String sql="select * from member";
		
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			//?가 있다면 set 설정
			
			rs = ps.executeQuery();
			while(rs.next()) {
				Member member = new Member(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4));
				list.add(member);
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		
		return list;
	}

}
