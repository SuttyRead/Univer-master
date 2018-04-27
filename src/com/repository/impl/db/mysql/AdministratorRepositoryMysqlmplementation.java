package com.repository.impl.db.mysql;

import com.domain.Administrator;
import com.list.AdminList;
import com.repository.AdministratorRepository;

public class AdministratorRepositoryMysqlmplementation implements AdministratorRepository {

    private DBMysqlConnection dbMysqlConnection;

    public AdministratorRepositoryMysqlmplementation() {
        dbMysqlConnection = DBMysqlConnection.getInstance();
    }

    @Override
    public void addAdministrator(Administrator administrator) {

    }

    @Override
    public void removeAdministrator(Administrator administrator) {

    }

    @Override
    public AdminList getAllAdministrators() {
        return null;
    }

}
