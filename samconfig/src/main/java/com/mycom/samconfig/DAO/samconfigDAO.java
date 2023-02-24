package com.mycom.samconfig.DAO;

import com.mycom.samconfig.Domain.samconfigVO;

//DAO에서 작업할 메소드 선언
//DB에서 접근할 작업 영역(에소드)
public interface samconfigDAO {
	//삽입, 수정, 삭제, 조회에 관련된 메소드(맵퍼에서 만든 sql 개수만큼 메소드 생성)
	//이름도 맵퍼에서의 id와 동일하게 작업
	public void create(samconfigVO samVo) throws Exception;
	public samconfigVO allList() throws Exception;
	public samconfigVO whereList(String name) throws Exception;
	public samconfigVO ascList() throws Exception;
	public samconfigVO descList() throws Exception;
	public samconfigVO update(samconfigVO samVo) throws Exception;
	public samconfigVO update(String name) throws Exception;
	//인터페이스에선 메소드명을 공통으로 사용하고 내용은 필요에 따라 변경
}