package com.repository.impl.memory;

import com.domain.Administrator;
import com.list.AdminList;
import com.repository.AdministratorRepository;

public class AdministratorRepositoryMemoryImplementation implements AdministratorRepository {

    private AdminList adminList = new AdminList();

    private static AdministratorRepositoryMemoryImplementation instance;

    public static AdministratorRepositoryMemoryImplementation getinstance(){
        if (instance == null){
            instance = new AdministratorRepositoryMemoryImplementation();
        }
        return instance;
    }

    @Override
    public void addAdministrator(Administrator administrator) {
        adminList.addAdministrator(administrator);
    }

    @Override
    public void removeAdministrator(Administrator administrator) {
        adminList.removeAdministrator(administrator);
    }

    @Override
    public AdminList getAllAdministrators() {
        return adminList;
    }

}
