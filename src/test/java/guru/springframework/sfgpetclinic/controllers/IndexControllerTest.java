package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    IndexController indexController;

    @BeforeEach
    void setUp() {
        indexController = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", indexController.index());
        assertEquals("index", indexController.index(), "Make me only if you have to");
    }

    @Test
    void oupsHandler() {
        //exception handler
        assertTrue("notimplemented".equals(indexController.oupsHandler()), () -> "This is some expansive, message to build, for my test");
    }
}