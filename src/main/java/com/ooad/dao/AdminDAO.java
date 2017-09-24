package com.ooad.dao;

import com.ooad.model.Admin;

import java.util.List;

public interface AdminDAO {

    Admin findById(int id);

    Admin save(Admin admin);

    void delete(int id);

    List<Admin> findAllAdmins();

}