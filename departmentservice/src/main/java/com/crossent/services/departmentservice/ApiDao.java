package com.crossent.services.departmentservice;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.Map;

@Repository
public class ApiDao {
	protected static final String NAMESPACE = "com.crossent.services.departmentservice.api.";

	@Autowired
	private SqlSession sqlSession;

	public String selectName(){
		return sqlSession.selectOne(NAMESPACE + "selectName");
	}
	public String selectNameWhere(Map<String,String> requstMap){
		return sqlSession.selectOne(NAMESPACE + "selectNameWhere", requstMap);
	}
	public int insertName(Map<String,String> requstMap){
		return sqlSession.insert(NAMESPACE + "insertName", requstMap);
	}
}