package com.sea.aspectlog;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "aspectlog")
public class AspectLogProperties {
    private boolean enable;
    private String name;

    public boolean isEnable() {
        return enable;
    }


    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}