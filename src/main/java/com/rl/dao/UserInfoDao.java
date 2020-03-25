package com.rl.dao;

import com.rl.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserInfoDao extends JpaRepository <UserInfo,String> {

    @Override
    List<UserInfo> findAll();

    @Query(name = "findStuByName",nativeQuery = true,value = "select * from test_student where fullname=:name")
    List<UserInfo> findUserInfoByName(@Param("name") String name);

}
