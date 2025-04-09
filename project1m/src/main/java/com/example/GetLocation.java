package com.example;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class GetLocation {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://ipinfo.io/json");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        Scanner scanner = new Scanner(conn.getInputStream());
        String response = scanner.useDelimiter("\\A").next();
        scanner.close();

        JSONObject json = new JSONObject(response);
        System.out.println("City: " + json.getString("city") + ", Country: " + json.getString("country"));
    }
}
