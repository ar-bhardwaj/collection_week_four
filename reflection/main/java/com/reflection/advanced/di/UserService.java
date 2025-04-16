package com.reflection.advanced.di;

public class UserService {
    @Inject
    private DatabaseService databaseService;

    public void performAction() {
        databaseService.connect();
        System.out.println("Performing user service action...");
    }
    
    public DatabaseService getDatabaseService() {
        return databaseService;
    }
}

