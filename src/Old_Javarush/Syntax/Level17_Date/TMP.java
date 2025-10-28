package Old_Javarush.Syntax.Level17_Date;

import java.time.LocalDate;
import java.util.*;

public class TMP {
    private static final long MIN_DAY = LocalDate.of(1990, 1, 1).toEpochDay();
    private static final long MAX_DAY = LocalDate.of(2020, 12, 31).toEpochDay();

    private static long maxNano = 86399999999999L;

    static void main(String[] args) {
        System.out.println(MAX_DAY);
        System.out.println(MIN_DAY);
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 6, 7));
        List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 6, 7, 8));
        List<Integer> list4 = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7, 8, 9));
        List<List> listList1 = new ArrayList<List>(Arrays.asList(list1, list2));
        List<List> listList2 = new ArrayList<List>(Arrays.asList(list3, list4));
        Map<Integer, List> map = new HashMap<>();
        map.put(1, listList1);
        map.put(2, listList2);
        printCollection(map.entrySet());
        ;
    }

        static void printCollection(Collection<?> collection) {
            System.out.println("-----------------------------------------------------");
            collection.forEach(System.out::println);
    }

    static Set<Object> convert(Map<Integer, List> sourceMap) {

        return null;
    }

}
