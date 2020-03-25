package com.rl.service.impl;

import com.rl.dao.UserInfoDao;
import com.rl.entity.UserInfo;
import com.rl.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo save(UserInfo userInfo) {
        return  userInfoDao.save(userInfo);
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public UserInfo findUserById(Integer id) {
        return null;
    }

    @Override
    public List<UserInfo> findUserByName(String name) {
        return userInfoDao.findUserInfoByName(name);
    }

    @Override
    public Page<UserInfo> findAll(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page,pageSize);
        return userInfoDao.findAll(pageable);
    }
}
