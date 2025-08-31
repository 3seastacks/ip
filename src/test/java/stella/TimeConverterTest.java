package stella;
import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.time.DateTimeException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TimeConverterTest {
    @Test
    public void convertDate_expectedInput_success() throws Exception {
        assertEquals("12 March 2013", TimeConverter.convertDate("12-03-2013"));

    }

    @Test
    public void convertDate_nonExistentDate_exceptionThrown() {
        try {
            assertEquals("Unknown Timing", TimeConverter.convertDate("32-21-2013"));

        } catch (DateTimeException e) {
            assertEquals("Invalid value for MonthOfYear (valid values 1 - 12): 20", e.getMessage());

        }
    }

    @Test
    public void convertDateWithTime_expectedInput_success() throws Exception {
        assertEquals("12:30, 12 March 2013", TimeConverter.convertDatewithTime("12-03-2013-1230"));

    }

    @Test
    public void convertDate_nonStandardTiming_exceptionThrown() {

            assertEquals("before Mon", TimeConverter.convertDate("before Mon"));

    }
    public void convertDateWithTime_nonExistentDate_exceptionThrown() {
        try {
            assertEquals("Unknown Timing", TimeConverter.convertDatewithTime("11-12-2013-2500"));

        } catch (DateTimeException e) {
            assertEquals("Invalid value for HourOfDay (valid values 0 - 23): 25", e.getMessage());

        }
    }


}
