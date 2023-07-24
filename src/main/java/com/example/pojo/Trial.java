package com.example.pojo;

import java.util.Map;

public class Trial {
    private String trialName;
    private Map<String, Integer> variants;

    public String getTrialName() {
        return trialName;
    }

    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    public Map<String, Integer> getVariants() {
        return variants;
    }

    public void setVariants(Map<String, Integer> variants) {
        this.variants = variants;
    }
}
