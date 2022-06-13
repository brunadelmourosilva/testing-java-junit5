package guru.springframework.sfgpetclinic.model;

import guru.springframework.ModelTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("model")
class PersonTest implements ModelTest {

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