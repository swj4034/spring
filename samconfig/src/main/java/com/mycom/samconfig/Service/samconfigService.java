package com.mycom.samconfig.Service;

import com.mycom.samconfig.Domain.samconfigVO;

//control에게 제공한 정보
//DAO의 내용ㅇ르 복사
public interface samconfigService {
	public void create(samconfigVO samVo) throws Exception;
	public samconfigVO allList() throws Exception;
	public samconfigVO whereList(String name) throws Exception;
	public samconfigVO ascList() throws Exception;
	public samconfigVO descList() throws Exception;
	public samconfigVO update(samconfigVO samVo) throws Exception;
	public samconfigVO update(String name) throws Exception;
	public samconfigVO delete(samconfigVO samVo) throws Exception;
	public samconfigVO delete(String name) throws Exception;
}
