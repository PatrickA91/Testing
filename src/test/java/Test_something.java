import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class Test_something {
    @ParameterizedTest
    @ValueSource(ints = {4, 8, 12, 16, 44, 104, 108, 112,
            116, 120, 124, 128, 132, 136, 140, 144, 148,
            152, 156, 160, 164, 168, 172, 176, 180, 184,
            188, 192, 196})
    public void must_return_true_when_can_be_divided_by_4_not_100(int arg){
        var Main = new Main();
        assertTrue(Main.isLeapYear(arg));
    }
    @ParameterizedTest
    @ValueSource(ints = {400, 800, 1600, 2000, 2800 })
    public void must_return_true_when_can_be_divided_by_400(int arg){
        var Main = new Main();
        assertTrue(Main.isLeapYear(arg));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5, 162, 163, 165, 166, 167, 169,
            170, 171, 173, 174, 175, 177, 178, 179, 181, 182, 183,
            185, 186, 187, 189, 190, 191, 193, 194, 195, 197, 198 })
    public void must_return_false_when_cannot_be_divided_by_4(int arg) {
        var Main = new Main();
        assertFalse(Main.isLeapYear(arg));
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 200, 300, 500, 2100})
    public void must_return_false_when_can_be_divided_by_100_not_400(int arg){
        var Main = new Main();
        assertFalse(Main.isLeapYear(arg));

    }



}
