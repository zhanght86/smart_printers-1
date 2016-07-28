package com.qg.smpt.web.service;

import java.util.List;

import com.qg.smpt.web.model.User;

public interface UserService {
	/**
	 * 根据用户id获取用户
	 * @param userId
	 * @return 存在则返回对应用户,不存在则返回空
	 */
	public User queryById(int userId);
	
	/**
	 * 查询所有用户
	 * @return 返回对应的用户集合
	 */
	public List<User> queryAllUser();
}
