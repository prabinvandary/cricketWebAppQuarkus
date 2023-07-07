package com.example.util.message;

import org.eclipse.microprofile.config.inject.ConfigProperties;

@ConfigProperties(prefix = "message")
public class MessageProperties {

    public String create;
    public String error;

}