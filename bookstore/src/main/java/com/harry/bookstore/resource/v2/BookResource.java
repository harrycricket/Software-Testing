/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harry.bookstore.resource.v2;

import com.harry.bookstore.dto.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Harry
 */
@Path("v2/books")
public class BookResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks() {
        ArrayList<Book> list = new ArrayList();
        list.add(new Book("B1", "Tuổi trẻ đáng giá bao nhiêu", "Vietnam", 2, 2020));
        list.add(new Book("B2", "Tony buổi sáng", "Vietnam", 2, 2020));
        return list;
    }
    
}
