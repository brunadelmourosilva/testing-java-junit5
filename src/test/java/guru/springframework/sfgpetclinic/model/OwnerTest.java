package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("model")
class OwnerTest {


    @Test
    public void DependentAssertions(){

        Owner owner = new Owner(1L, "Bruna", "Delmouro");
        owner.setCity("Itajubá");
        owner.setTelephone("9990");

        assertAll("Prop Test",
                () -> assertAll("Person details",
                        () -> assertEquals("Bruna", owner.getFirstName()),
                        () -> assertEquals("Delmouro", owner.getLastName()),

                () -> assertAll("Owner details",
                        () -> assertEquals("Itajubá", owner.getCity(), "City did not match")),
                        () -> assertEquals("9990", owner.getTelephone())
                ));
    }

}