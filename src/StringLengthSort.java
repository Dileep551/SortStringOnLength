import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringLengthSort {

    Comparator<String> comp = (o1, o2) -> {
        if(o1.length() > o2.length())
            return 1;
        else
            return -1;
    };


    public List<String> getSortedString(List<String> values){

        List<String> listString = new ArrayList<>(values);

        Collections.sort(listString, comp);

        return listString;

    }

}
