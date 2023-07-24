package org.example;

import com.example.pojo.Trials;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrialMain {

    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) throws IOException {
        LOGGER.log(Level.INFO, "Starting with trials");

        //read json file data to String
        byte[] jsonData = Files.readAllBytes(Paths.get("src/main/resources/data.txt"));

        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        Map<String, Map<String, Integer>> mpMaps = new HashMap<>();

        //convert json string to object
        Trials trials = objectMapper.readValue(jsonData, Trials.class);
        trials.getTrials().forEach(
                (temp -> {
                    mpMaps.put(temp.getTrialName(), temp.getVariants());
                })
        );

        LOGGER.log(Level.INFO, "Completed with trials");
    }
}
