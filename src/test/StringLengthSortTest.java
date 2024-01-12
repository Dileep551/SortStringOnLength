/*

https://www.youtube.com/watch?v=ZA2oNhtNk3w

Sort elements based on the length of the String in given List

*/



import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringLengthSortTest {

    @Test
    void getSortedString() {

        //Given
        List<String> listStrings = new ArrayList<>(List.of("Dileep", "Sandeep", "Ram", "David", "John"));
        List<String> expectedStrings = new ArrayList<>(List.of("Ram", "John", "David", "Dileep", "Sandeep"));

        //When
        StringLengthSort sls = new StringLengthSort();
        List<String> list = sls.getSortedString(listStrings);

        //Then
        assertIterableEquals(expectedStrings, list);

    }
}