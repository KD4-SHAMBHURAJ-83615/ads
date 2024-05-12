
public class Employee {
	
	    String name;
	    double salary;

	    public Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }
	


	    public static void insertionSort(Employee[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            Employee key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j].getSalary() > key.getSalary()) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	        }


	    public static void main(String[] args) {
	        Employee[] employees = {
	            new Employee("Alice", 50000),
	            new Employee("Bob", 60000),
	            new Employee("Charlie", 45000),
	            new Employee("David", 70000),
	            new Employee("Eve", 55000)
	        };

	        System.out.println("Before sorting:");
	        for (Employee employee : employees) {
	            System.out.println(employee.getName() + ": " + employee.getSalary());
	        }

	        insertionSort(employees);

	        System.out.println("\nAfter sorting:");
	        for (Employee employee : employees) {
	            System.out.println(employee.getName() + ": " + employee.getSalary());
	        }
	    }
	    }

