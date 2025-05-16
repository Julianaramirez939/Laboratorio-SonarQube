package com.example.app;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UserService {

    private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());

    public void processUser(String name) {
        if (name == null) {
            LOGGER.warning("User name is null");
            return;
        }
        LOGGER.log(Level.INFO, "User: {0}", name.toUpperCase());
    }

    public void longMethod() {
        int total = 0;
        for (int repeat = 0; repeat < 4; repeat++) {
            for (int i = 0; i < 10; i++) {
                total += i;
            }
        }
        LOGGER.log(Level.INFO, "Total: {0}", total);
    }
}
