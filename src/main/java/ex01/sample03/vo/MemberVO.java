package ex01.sample03.vo;

import java.sql.Date;

import lombok.Data;

@Data

//데이터 보관용
public class MemberVO {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;
}
