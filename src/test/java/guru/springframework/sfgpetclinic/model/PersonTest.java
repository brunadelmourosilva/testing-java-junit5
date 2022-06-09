package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(1L, "Bruna", "Delmouro");

        //then
        assertAll("Test props set",
                () -> assertEquals(person.getFirstName(), "Bruna"),
                () -> assertEquals(person.getLastName(), "Delmouro"));
    }

    @Test
    void groupedAssertionMsgs() {
        //given
        Person person = new Person(1L, "Bruna", "Delmouro");

        //then
        assertAll("Test props set",
                () -> assertEquals(person.getFirstName(), "Bruna", "First name failed"),
                () -> assertEquals(person.getLastName(), "Delmouro", "Last name failed"));
    }
}