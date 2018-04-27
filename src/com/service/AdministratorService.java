package com.service;

import com.domain.Administrator;
import com.list.AdminList;
import com.repository.AdministratorRepository;
import com.repository.impl.memory.AdministratorRepositoryMemoryImplementation;

import java.util.Arrays;

public class AdministratorService {

    private AdministratorRepository administratorRepository;

    public AdministratorService() {
        administratorRepository = AdministratorRepositoryMemoryImplementation.getinstance();
    }

    public void addAdministrator(Administrator administrator) {
        administratorRepository.addAdministrator(administrator);
    }

    public void removeAdministrator(Administrator administrator) {
        administratorRepository.removeAdministrator(administrator);
    }

    public AdminList getAllAdministrators() {
        return administratorRepository.getAllAdministrators();
    }

    public void sortAdminByTypingSpeed(AdminList adminList) {
        Administrator[] result = adminList.getAdministrators();
        Arrays.sort(result);
        adminList.setAdministrators(result);
    }

    public void printAdministrators(AdminList adminList) {
        for (Administrator administrator : adminList.getAdministrators()) {
            System.out.println(administrator);
        }
    }

}
