package case_study_first;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1, "Sales", "Ajay", 80000.0, "Manager", 5.0));
		list.add(new Employee(2, "Development", "Vijay", 180000.0, "Developer", 4.0));
		list.add(new Employee(3, "Sales", "Sanjay", 60000.0, "Manager", 8.0));
		list.add(new Employee(4, "Development", "Tom", 100000.0, "Manager", 6.0));
		list.add(new Employee(5, "Sales", "Harry", 200000.0, "Salesman", 2.0));


		
		OptionalDouble avgSal = list.stream()
								.mapToDouble(Employee::getSalary)
								.average();
		
		OptionalDouble maxExp = list.stream()
								.mapToDouble(Employee::getSalary)
								.max();
		
		List<String>   names = 	list.stream()
						   		.filter(emp -> emp.getSalary() > 80000.0)
						   		.map(Employee::getName)
						   		.collect(Collectors.toList());
		
		list.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
		.forEach((dept, name) -> System.out.println(dept + " " + name));
		
		if(avgSal.isPresent()) {
			System.out.println("Average Sal: " + avgSal.getAsDouble());
		}
		
		if(maxExp.isPresent()) {
			System.out.println("Max Sal: " + maxExp.getAsDouble());
		}
		
		System.out.println(names);
	}
}
