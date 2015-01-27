import java.util.Comparator;


public class Employee {
	private EmployeeId id;
    private EmployeeName name;
    private EmployeeSalary salary;
    private EmployeePosition position;

    public Employee() {
    }

    public EmployeeId getId() {
        return id;
    }

    public void setId(EmployeeId id) {
        this.id = id;
    }

    public EmployeeName getName() {
        return name;
    }

    public void setName(EmployeeName name) {
        this.name = name;
    }

    public EmployeeSalary getSalary() {
        return salary;
    }

    public void setSalary(EmployeeSalary salary) {
        this.salary = salary;
    }

	public EmployeePosition getPosition() {
		return position;
	}

	public void setPosition(EmployeePosition position) {
		this.position = position;
	}
	
	}





