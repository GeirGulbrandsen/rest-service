package hello;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GreetingTest {

    private Greeting greeting;

    @Before
    public void setupTest() {
        greeting = new Greeting(1L, "World");
    }

    @Test
    public void shouldBeAbleToReturnGreetingContent() {
        String content = greeting.getContent();
        assertThat(content, is("World"));
    }

    @Test
    public void shouldBeAbleToReturnGreetingId() {
        long greetingId = greeting.getId();
        assertThat(greetingId, is(1L));
    }
}