package org.example;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class ReadJsonArray {
    public static void main(String[] args) {
        Gson gson = new Gson();

        User[] users = null;

        try {
            FileReader fr = new FileReader("src/main/user.json");
            users = gson.fromJson(fr, User[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("User data:");
        for (User user : users) {
            System.out.println("Id: " + user.getId() + " Name: " + user.getName());
        }
    }










}
