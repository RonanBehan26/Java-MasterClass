import java.util.ArrayList;
import java.util.List;

public interface ISaveable {

    //just list, as now we can use any type of list
    List<String> write();
    void read(List<String> savedValues);
}
