package stella;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ParserTest {
    @Test
    public void identifyCommand_unknownInstruction_exceptionThrown() {
        try {
            new Parser(new TaskList(new ArrayList<>())).identifyCommand("hi");
            fail();
        }
        catch (UnknownInstructionException e) {
            assertEquals("hi",e.getMessage());
        } catch (IncompleteInstructionException e) {
            fail(); // wrong exception thrown
        }

    }

    @Test
    public void identifyCommand_incompleteInstruction_exceptionThrown() {
        try {
            new Parser(new TaskList(new ArrayList<>())).identifyCommand("mark");
            fail();
        }
        catch (IncompleteInstructionException e) {
            assertEquals("mark",e.getMessage());
        } catch (UnknownInstructionException e) {
            fail(); // wrong exception thrown
        }
    }
}
