import java.util.Comparator;
import org.apache.commons.lang.builder.CompareToBuilder;
public class Employee implements Comparable<Employee> {
	
	private long id;
	private String name;
	private String position;
	private double salary;
// bbbbbbbbb	
	public Employee() {
		
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee o) {
		return this.salary < o.getSalary() ? -1 :
			this.salary > o.getSalary() ? 1 : 0;
	}
	
	public static Comparator<Employee> CompareByName = new Comparator<Employee>() {
		@Override
		public int compare(Employee empl, Employee empl2) {
		return new CompareToBuilder()
		.append(empl.getName(), empl2.getName())
		.append(empl.getId(), empl2.getId())
		.append(empl.getPosition(), empl2.getPosition())
		.append(empl.getSalary(), empl2.getSalary())
		.toComparison();
		}
		};
		
		public static Comparator<Employee> CompareBySalary = new Comparator<Employee>() {
			@Override
			public int compare(Employee empl, Employee empl2) {
			return new CompareToBuilder()
			.append(empl.getSalary(), empl2.getSalary())
			.append(empl.getName(), empl2.getName())
			.append(empl.getId(), empl2.getId())
			.append(empl.getPosition(), empl2.getPosition())
			
			.toComparison();
			}
			};
			public static Comparator<Employee> CompareByPosition = new Comparator<Employee>() {
				@Override
				public int compare(Employee empl, Employee empl2) {
				return new CompareToBuilder()
				.append(empl.getPosition(), empl2.getPosition())
				.append(empl.getName(), empl2.getName())
				.append(empl.getId(), empl2.getId())
				.append(empl.getSalary(), empl2.getSalary())
				.toComparison();
				}
				};
				public static Comparator<Employee> CompareById = new Comparator<Employee>() {
					@Override
					public int compare(Employee empl, Employee empl2) {
					return new CompareToBuilder()
					.append(empl.getId(), empl2.getId())
					.append(empl.getName(), empl2.getName())
					.append(empl.getPosition(), empl2.getPosition())
					.append(empl.getSalary(), empl2.getSalary())
					.toComparison();
					}
					};
			

}
