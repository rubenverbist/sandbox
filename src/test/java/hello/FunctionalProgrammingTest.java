package hello;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class FunctionalProgrammingTest {
    FunctionalProgramming functionalProgramming = new FunctionalProgramming();

    @Test
    public void giveAllRedApples() {
        List<Apple> apples = functionalProgramming.giveAllRedApples();
        Assertions.assertThat(apples).extracting("color").contains("red", "red");
    }

    @Test
    public void giveRedAndHeavyApples() throws Exception {
        List<Apple> apples = functionalProgramming.giveAllRedAndHeavyApples();
        Assertions.assertThat(apples).usingFieldByFieldElementComparator().containsOnly(new Apple("red", 150));
    }

}