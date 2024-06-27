package ex01.sample03.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import ex01.sample03.vo.MemberVO;


//DB처리
public class MemberDAOImpl implements MemberDAO {
	
//	create table t_member (
//		    id           VARCHAR2(10) primary key,
//		    pwd         VARCHAR2(10),
//		    name      VARCHAR2(50),
//		    email       VARCHAR(50),
//		    joinDate    date default sysdate
//		    
//		);
	
	//생성자
//	private static final String url = "jdbc:mariadb:thin:@localhost:3306/webdb(DB이름)";
	
//	context.xml에서 연결
//	private static final String url = "jdbc:oracle:thin:@localhost:1521/xe";
//	private static final String user = "system";
//	private static final String pwd = "1234";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//컨넥션 풀
	private DataSource dataSource;
	
	public MemberDAOImpl() {
		//메서드 호출
		connDB();
		
		//컨넥션 풀 사용
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:comp/env");

			dataSource = (DataSource) envContext.lookup("jdbc/oracle");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//회원 목록 조회
	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			//컨넥션 풀에 적용된 dataSource 사용
			conn = dataSource.getConnection();
			
			//가장 먼저 작성해야함
			String sql = "select * from t_member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id 		= rs.getString("id");
				String pwd 		= rs.getString("pwd");
				String name 	= rs.getString("name");
				String email 	= rs.getString("email");
				Date joinDate	= rs.getDate("joinDate");
				
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				
				list.add(vo);
				
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {System.out.println(e.getMessage());}
		
		return list;
	}
	
	//회원 등록
	public int registerMember (MemberVO memberVO) {
		int result = 0;
		
		String sql = "";
		try {
			conn = dataSource.getConnection();
			sql = "insert into t_member (id, name, pwd, email) values(?, ?, ?, ?)";
			//date 부분은 해당 날짜로
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberVO.getId());
			pstmt.setString(2, memberVO.getName());
			pstmt.setString(3, memberVO.getPwd());
			pstmt.setString(4, memberVO.getEmail());
			
			result = pstmt.executeUpdate();
			pstmt.close();
			
		} catch (Exception e) {}
		
		return result;
	}
	
	//회원 수정
	public int modMember(MemberVO memberVO) {
		int result = 0;
		return result;
	}
	
	//회원 조회
	public MemberVO viewMember (String id) {
		MemberVO vo = new MemberVO();
		return vo;
	}
	
	//회원 삭제
	public int removeMember(MemberVO memberVO) {
		int result = 0;
		return result;
	}
	
	
	//db 연결
	public void connDB() {
		
//		컨넥션 풀에서 적용되어 미사용되어진다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("OracleDriver 로딩 성공");

//			conn = DriverManager.
//					getConnection(url,user,pwd);
			System.out.println("Connection 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("OracleDriver 로딩 실패: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Connection 실패: " + e.getMessage());
		}
	}
}
