console.log("hello");import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void testGreet() {
        HelloWorld app = new HelloWorld();
        assertEquals("Hello, Jenkins!", app.greet());
    }
}