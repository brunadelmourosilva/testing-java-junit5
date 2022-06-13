package guru.springframework;

import org.junit.jupiter.api.*;

@Tag("models")
public interface ModelTest {

    @BeforeAll
    default void beforeEachConsoleOutput(TestInfo testInfo, RepetitionInfo repetitionInfo){
        System.out.println("Running Test -" + testInfo.getDisplayName() + " - " + repetitionInfo.getCurrentRepetition() +
                            " | " + repetitionInfo.getTotalRepetitions());
    }
}
