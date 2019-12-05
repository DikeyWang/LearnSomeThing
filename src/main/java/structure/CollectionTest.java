package structure;

import javafx.print.Collation;
import model.HungrySingleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
    List<Integer> collection = Collections.synchronizedList(new ArrayList<Integer>());


    String mm = "tttt";

    HungrySingleton hungrySingleton = HungrySingleton.getSingleton();

}
