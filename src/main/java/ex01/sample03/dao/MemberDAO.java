package ex01.sample03.dao;

import java.util.List;

import ex01.sample03.vo.MemberVO;

public interface MemberDAO {
	public List<MemberVO> listMembers();
}