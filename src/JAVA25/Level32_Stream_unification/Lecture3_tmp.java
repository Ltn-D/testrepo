package JAVA25.Level32_Stream_unification;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lecture3_tmp {
    static void main(String[] args) {
        Set<String> robotics = Set.of("Аня", "Борис", "Вика");
        Set<String> programming = Set.of("Вика", "Глеб", "Даша");
        Set<String> unionSet = Stream.concat(
                        robotics.stream(),
                        programming.stream())
                .collect(Collectors.toSet());
        System.out.println(unionSet);
        Set<String> math = Set.of("Женя", "Вика", "Борис");
        Set<String> allSet = Stream.of(robotics,programming,math)
                .flatMap(Set::stream)
                .collect(Collectors.toSet());
        System.out.println(allSet);
        Set<String> both = robotics.stream()
                .filter(programming::contains)
                .collect(Collectors.toSet());
        System.out.println(both);
    }


}
