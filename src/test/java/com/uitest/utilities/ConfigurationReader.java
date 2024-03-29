package com.uitest.utilities;

import java.io.FileInputStream;
import java.util.Properties;


public class ConfigurationReader {

    private static Properties properties;

    static {
        try{
            // what file to read
            String path = "configuration.properties";
            // read the file into java, find the file using String path
            FileInputStream input = new FileInputStream(path);
            // properties-->class that stores properties in key/value format
            properties = new Properties();
            // the values from the file input is loaded/ fed into the properties object
            properties.load(input);

            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String get(String keyName){
        return properties.getProperty(keyName);
    }

}
