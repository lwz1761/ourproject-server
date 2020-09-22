package com.example.config;

import java.util.UUID;

public class Uuid {
    public static String getUuid(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
