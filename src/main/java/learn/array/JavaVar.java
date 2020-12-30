package learn.array;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaVar {
    public static void main(String[] args) throws IOException {
        List<Employee> employees = Arrays.asList(new Employee(1, "Ashish", 28, 10000)
                , new Employee(2, "Ajay", 29, 1000)
                , new Employee(3, "Abhishek", 29, 10000));
        Map<Integer, String> map = employees.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
        Map<Long, List<Employee>> listMap = employees.stream().collect(Collectors.groupingBy(Employee::getSalary));

        var employees1 = Arrays.asList(new Employee(1, "Ashish", 28, 10000)
                , new Employee(2, "Ajay", 29, 1000)
                , new Employee(3, "Abhishek", 29, 10000));
        var map1 = employees.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
        var listMap1 = employees.stream().collect(Collectors.groupingBy(Employee::getSalary));
        var str = new String("Hello");
        var list = new ArrayList<String>();
        var integerList = List.of(1, 2, 3, 4);
        for (var data : integerList) {
            System.out.println(data);
        }
        for (var i = 1; i <= integerList.size(); i++) {
            System.out.println(i);
        }
        var path = Paths.get("/src/main/resources/app.log");
        try(var file = Files.lines(path)){

        }
    }
}
