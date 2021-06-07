package com.jensen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
Book b;
    @BeforeEach
    void setUp() {
        b = new Book("Maths",100,"Raman");
        System.out.println("Book Test");
    }

    @Test
    void getTitle() {
        Book b = new Book("Science", 50, "Raman");
        assertEquals("Science", b.getTitle());
        assertNotEquals("Maths", b.getTitle());
    }

    @Test
    void setTitle() {
        b.setTitle("Maths");
        assertEquals("Maths",b.getTitle());
        assertNotEquals("science",b.getTitle());
        assertNotNull(b.getTitle());
    }
    @Test
    @DisplayName("Test that title is not null")
    void testIfTitleThrowsException(){
        Book bok = new Book("Chemistry",100,"Nicole");
        assertThrows(IllegalArgumentException.class,
                ()->b.setTitle(""));
        bok.setTitle(null);
        assertNotEquals(b.getTitle(),bok.getTitle());
        assertNotNull(bok.getTitle());
    }
    @Test
    @DisplayName("Test that pages is not less than zero")
    void testIfPagesNotLessThanZero(){
        Book bok = new Book("English",10,"Shakespeare");
        bok.setPages(10);
        assertNotEquals(b.getPages(),bok.getPages());
        assertThrows(IllegalArgumentException.class,
                ()->bok.setPages(-1)
        );
        assertEquals(10,bok.getPages());


    }

    @Test
    void getPages() {
        assertEquals(100,b.getPages());
    }

    @Test
    void setPages() {

        b.setPages(150);
        assertEquals(150,b.getPages());
        assertNotEquals(200,b.getPages());
        assertNotNull(b.getPages());
    }

    @Test
    void getAuthor() {
        assertEquals("Raman",b.getAuthor());
        assertNotEquals("C.v.Raman",b.getAuthor());
    }

    @Test
    void setAuthor() {
        b.setAuthor("C.V.Raman");
        assertEquals("C.V.Raman",b.getAuthor());
        assertNotEquals("Shakespeare",b.getAuthor());
        assertNotNull(b.getAuthor());
    }
}