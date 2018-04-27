package com.repository.impl.db.mysql;

public class DBMysqlConnection {

    private static DBMysqlConnection instance;

    private DBMysqlConnection() {

    }

    public static DBMysqlConnection getInstance(){
        if (instance == null){
            instance = new DBMysqlConnection();
        }
        return instance;
    }

    public void createQuery(String query){

    }
}
