import java.util.Comparator;

public class SortByIntegerDesc implements Comparator<Integer> {

    @Override
    public int compare(Integer s1, Integer s2) {
        return s2.compareTo(s1) > 0 ? 1 : -1;
    }
    

}
