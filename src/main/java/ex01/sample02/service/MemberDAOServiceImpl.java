package ex01.sample02.service;

import java.util.List;

import ex01.sample03.dao.MemberDAO;
import ex01.sample03.vo.MemberVO;

public class MemberDAOServiceImpl implements MemberDAOService {
	private MemberDAO dao;
	
	public MemberDAOServiceImpl() {
		dao = new MemberDAO();
	}
	
	@Override
	public List<MemberVO> listMembers() {
		List<MemberVO> list = dao.listMembers();
		return list;
	}

	@Override
	public int registerMember(MemberVO memberVO) {
		
		int result = result = dao.registerMember(memberVO);
		
		return 0;
	}
}
