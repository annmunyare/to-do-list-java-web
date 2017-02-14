import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {
//spec for creating instance
  @Test
  public void Task_instantiatesCorrectly_true() {
    Task myTask = new Task("Mow the lawn");
    assertEquals(true, myTask instanceof Task);
  }
  // spec for creating a task instance with description
  @Test
  public void Task_instantiatesWithDescription_String() {
    Task myTask = new Task("Mow the lawn");
    assertEquals("Mow the lawn", myTask.getDescription());
}

}
