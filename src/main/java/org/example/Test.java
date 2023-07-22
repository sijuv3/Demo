package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "Starting with trials");

        Map<String, Integer> mp1 = new HashMap<>();
        mp1.put("variant1", 20);
        mp1.put("variant2", 20);
        mp1.put("variant3", 60);

        Map<String, Integer> mp2 = new HashMap<>();
        mp2.put("variant1", 20);
        mp2.put("variant2", 20);
        mp2.put("variant3", 20);
        mp2.put("variant4", 20);
        mp2.put("variant5", 20);

        Map<String, Object> mpMaps = new HashMap<>();
        mpMaps.put("trial1", mp1);
        mpMaps.put("trial2", mp2);

        LOGGER.log(Level.INFO, "Using for-each loop for iteration over Map.entrySet()");
        for (Map.Entry<String, Object> entry : mpMaps.entrySet()) {
            LOGGER.log(Level.INFO,"Key: {0}", entry.getKey());
            LOGGER.log(Level.INFO, "Value: {0}", entry.getValue());

            LOGGER.log(Level.INFO, "logging: {0} {1}",
                    new Object[] { entry.getKey(), entry.getValue() });
        }

        LOGGER.log(Level.INFO, "Using forEach(action) method to iterate map");
        mpMaps.forEach((k, v) -> LOGGER.log(Level.INFO, "Key: {0}, Value: {1}",
                new Object[] { k, v }));

        LOGGER.log(Level.WARNING, "some warning message");
        LOGGER.log(Level.SEVERE, "some severe message");
    }
}
