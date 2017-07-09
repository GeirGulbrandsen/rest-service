package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GreetingControllerTest {

    private static final String WORLD = "World";
    private static final String NAME = "Geir";
    private static final long FIRST_ID = 1L;

    private void assertGreetedName(Greeting greeting, String name) {
        assertThat(greeting.getContent(), is(String.format("Hello, %s!", name)));
    }

    @Test
    public void shouldReturnGreetingForTheWorld() throws Exception {
        GreetingController controller = new GreetingController();
        Greeting greeting = controller.greeting(WORLD);
        assertThat(String.format("Id of first greeting should be %d", FIRST_ID), greeting.getId(), is(FIRST_ID));
        assertGreetedName(greeting, WORLD);

        Greeting secondGreeting = controller.greeting(NAME);
        assertThat("Id of second greeting should be one more than id of the first", secondGreeting.getId(), is(greeting.getId() + 1));
        assertGreetedName(secondGreeting, NAME);
    }

}