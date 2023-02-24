package com.mycom.samconfig.DAO;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;//mybatis를 써서 sql 사용
//DAO는 repository 어노테이션을 선언해야 함
import org.springframework.stereotype.Repository;

import com.mycom.samconfig.Domain.samconfigVO;

public class samconfigDAOImpl implements samconfigDAO {
	//root-context의 빈을 사용하려면 inject어노테를 선언
	@Inject
	private SqlSession sqlsession;
	
	//사용할 맵퍼 지정
	private static final String NAMESPACE = "";
	
	//인터페이스에서 선언한 메소드명들을 복사하고 중괄호와 그 안의 내용 추가
	@Override
	public void create(samconfigVO samVo) throws Exception {
		//mybatis의 질의어를 이용
		//sqlSession(DB) + NAMESPACE(질의어)
		//sqlSession.질의어(batis+"질의어id", 전달값)
	};
	
	@Override
	public samconfigVO allList() throws Exception {
		
	};
	
	@Override
	public samconfigVO whereList(String name) throws Exception {
		
	};
	
	@Override
	public samconfigVO ascList() throws Exception {
		
	};
	
	@Override
	public samconfigVO descList() throws Exception {
		
	};
	
	@Override
	public samconfigVO update(samconfigVO samVo) throws Exception {
		
	};
	
	@Override
	public samconfigVO update(String name) throws Exception {
		
	};
	
}
