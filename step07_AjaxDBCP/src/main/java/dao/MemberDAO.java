package dao;

import java.util.List;

import dto.Member;

public interface MemberDAO {
   /**
    * 회원 전체검색
    * */
	List<Member> selectAll();
}
