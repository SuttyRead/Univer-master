package com.controller;

import com.domain.Administrator;
import com.service.AdministratorService;

import java.util.Scanner;

public class MainController {

    private AdministratorService administratorService = new AdministratorService();

    public void doWork() {
        showHelloMessage();
        while (true){

            showMenu();
            makeChoice();

        }

    }

    private void showMenu() {

        System.out.println("Make your choice: ");
        System.out.println("1. Show list of Administrators.");
        System.out.println("2. Add new administrators.");
        System.out.println("3. Remove administrator.");
        System.out.println("\n0. Exit");



    }

    private void makeChoice(){



        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1: {
                showAdministratorsList();
                break;
            }
            case 2: {
                addNewAdministrator();
                break;
            }
            case 3: {
                break;
            }
            case 0: {
                System.out.println("Goodbye!!!");
                System.exit(1);
            }
            default: {
                System.out.println("Wrong choice");
                makeChoice();
            }
        }
    }

    private void showAdministratorsList(){
        administratorService.printAdministrators(administratorService.getAllAdministrators());
    }

    private void addNewAdministrator(){

        Administrator administrator = new Administrator();
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter administrator data:");

        System.out.println("Enter firstname: ");
        String firstname = s.nextLine();
        System.out.println("Enter lastname: ");
        String lastname = s.nextLine();
        System.out.println("Enter middlename: ");
        String middlename = s.nextLine();
        System.out.println("Enter typingSpeed: ");
        int typingSpeed = s.nextInt();

        administrator.setFirstName(firstname);
        administrator.setLastName(lastname);
        administrator.setMiddleName(middlename);
        administrator.setTypingSpeed(typingSpeed);

        administratorService.addAdministrator(administrator);

    }

    private void showHelloMessage() {

        System.out.println("*******************");
        System.out.println("University DataBase");
        System.out.println("*******************");
        System.out.println();

    }

}
