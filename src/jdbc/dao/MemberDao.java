package jdbc.dao;

import java.awt.*;
import java.util.List;

public interface MemberDao {
    // 회원과 관련된 DB 연산 정의
    // 회원정보를 가지고 있는 MemberDto 를 넘겨받아서
    // DB 테이블에 추가, 조회, 수정 ,삭제등을 진행


    // CRUD
    void insert(MemberDto member); // C 데이터 생성
    MemberDto getMemberById(String id); // R 아이디(식별자)로 조회
    void update(MemberDto member);   // U 데이터 수정
    void  delete(String id);  // D 식별자로 삭제
    List<MemberDto> getAllMembers();  // 회원 목록

}
