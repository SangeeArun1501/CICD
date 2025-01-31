package com.example;

import static spark.Spark.*;

public class SimpleWebApp {
    public static void main(String[] args) {
        // Set the port for the web server
        port(80);

        // Define a route for the root URL
        get("/", (req, res) -> "Welcome to Devops 101");

        // Define a route for a specific path
        get("/hello", (req, res) -> "Hello there!");

        // Define a route that takes a query parameter
        get("/greet", (req, res) -> {
            String name = req.queryParams("name");
            return "Hello, " + (name != null ? name : "Anonymous") + "!";
        });
    }
} 

