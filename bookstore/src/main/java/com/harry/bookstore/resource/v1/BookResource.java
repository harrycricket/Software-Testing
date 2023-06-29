package com.harry.bookstore.resource.v1;

import com.harry.bookstore.dto.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author Harry
 */
@Path("/v1/books")
public class BookResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Book getABook() {
        return new Book("B1", "Đời ngắn đừng ngủ dài", "Japan", 2, 2020);
    }
}
