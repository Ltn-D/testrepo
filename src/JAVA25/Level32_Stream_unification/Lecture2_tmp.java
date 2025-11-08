package JAVA25.Level32_Stream_unification;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lecture2_tmp {
    static void main(String[] args) {
        List<String> groupA = List.of("Аня", "Борис");
        List<String> groupB = List.of("Вика");
        List<String> groupC = List.of("Гриша", "Даша");

        List<String> allUsers = Stream.of(groupA,groupB,groupC)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
