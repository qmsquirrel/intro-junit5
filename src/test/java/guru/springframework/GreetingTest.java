package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - I am only called once");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In before each ..");

        greeting = new Greeting();
    }


    @AfterEach
    void tearDown() {
        System.out.println("After each ...");
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("Ralph"));
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After ! - I am called once");
    }
}