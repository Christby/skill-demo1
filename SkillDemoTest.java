import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void minusTest() {
        assertEquals(5, SkillDemo.minus(15,10));
    }
}