package cn.fuego.misp.dao;

import java.util.List;

import cn.fuego.misp.domain.view.UserFunctionView;

public interface UserFunctionViewDao
{
	public List<UserFunctionView>  getFunctionByUserID(String userID);
}
