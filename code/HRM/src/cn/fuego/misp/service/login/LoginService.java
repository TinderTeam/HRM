package cn.fuego.misp.service.login;

import cn.fuego.misp.web.model.user.UserModel;

public interface LoginService
{
	public UserModel userLogin(UserModel user);
}
