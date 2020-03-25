package com.rl.service;

import com.rl.entity.UserInfo;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserInfoService {
    UserInfo save(UserInfo userInfo);
    void delete(Integer id);
    UserInfo findUserById(Integer id);
    List<UserInfo> findUserByName(String name);
    Page<UserInfo> findAll(int page, int pageSize);

}
