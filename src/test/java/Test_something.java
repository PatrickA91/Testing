import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Test_something {

    @Test
    public void can_be_devided_by_4_not_100(){
        assertEquals(true, Main.isLeapYear(4));
        assertEquals(true, Main.isLeapYear(8));
        assertEquals(true, Main.isLeapYear(12));
        assertEquals(false, Main.isLeapYear(100));
        assertEquals(false, Main.isLeapYear(200));
        assertEquals(false, Main.isLeapYear(300));
    }

    @Test
    public void can_be_devided_by_400(){
        assertEquals(true, Main.isLeapYear(400));
        assertEquals(true, Main.isLeapYear(800));
        assertEquals(true, Main.isLeapYear(1200));
        assertEquals(true, Main.isLeapYear(1600));
    }

    @Test
    public void can_be_devided_by_4(){
        assertEquals(false, Main.isLeapYear(1));
        assertEquals(false, Main.isLeapYear(2));
        assertEquals(false, Main.isLeapYear(3));
        assertEquals(true, Main.isLeapYear(4));
        assertEquals(true, Main.isLeapYear(12));
    }
    @Test
    public void can_be_devided_by_100_not_400(){
        assertEquals(false, Main.isLeapYear(200));
        assertEquals(false, Main.isLeapYear(300));
        assertEquals(true, Main.isLeapYear(400));
        assertEquals(false, Main.isLeapYear(500));
        assertEquals(true, Main.isLeapYear(800));
    }
}
