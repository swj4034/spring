package com.mycom.samconfig.Service;

import javax.inject.Inject;

import com.mycom.samconfig.DAO.samconfigDAO;
import com.mycom.samconfig.Domain.samconfigVO;

public class samconfigServiceImpl implements samconfigService {
	@Inject
	private samconfigDAO dao;
	
	@Override
	public void create(samconfigVO samVo) throws Exception{
		
	};
	
	@Override
	public samconfigVO allList() throws Exception{
		
	};
	
	@Override
	public samconfigVO whereList(String name) throws Exception{
		
	};
	
	@Override
	public samconfigVO ascList() throws Exception{
		
	};
	
	@Override
	public samconfigVO descList() throws Exception{
		
	};
	
	@Override
	public samconfigVO update(samconfigVO samVo) throws Exception{
		
	};
	
	@Override
	public samconfigVO update(String name) throws Exception{
		
	};

	@Override
	public samconfigVO delete(samconfigVO samVo) throws Exception {
		
	};
	
	@Override
	public samconfigVO delete(String name) throws Exception {
		
	};
}
