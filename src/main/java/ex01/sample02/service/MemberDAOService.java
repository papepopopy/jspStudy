package ex01.sample02.service;

import java.util.List;

import ex01.sample03.vo.MemberVO;

public interface MemberDAOService {


	public List<MemberVO> listMembers();
	public int registerMember();
	int registerMember(MemberVO memberVO);
	
	
}
