/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.bookstore.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Harry
 */

@ApplicationPath("/api")
public class BookApplication extends ResourceConfig{

    public BookApplication() {
        packages("com.harry.bookstore.resource");
    }


}
