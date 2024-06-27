package ex01.sample03.service;

import java.util.List;

import ex01.sample03.dao.MemberDAOImpl;
import ex01.sample03.vo.MemberVO;

public class MemberDAOServiceImpl implements MemberDAOService {
	private MemberDAOImpl dao;
	
	public MemberDAOServiceImpl() {
		dao = new MemberDAOImpl();
	}

	@Override
	public List<MemberVO> listMembers() {
		List<MemberVO> list = dao.listMembers();
		return list;
	}

	@Override
	public int registerMember(MemberVO memberVO) {
		
		int result =  result = dao.registerMember(memberVO);
	 
		return result;
	}

}