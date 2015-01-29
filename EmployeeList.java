import java.util.Comparator;
import org.apache.commons.lang.builder.CompareToBuilder;
public class EmployeeList implements Comparable<EmployeeList> {
	
	private long id;
	private String name;
	private String position;
	private double salary;
	
	public EmployeeList() {
		
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
	public int compareTo(EmployeeList o) {
		return this.salary < o.getSalary() ? -1 :
			this.salary > o.getSalary() ? 1 : 0;
	}
	
	public static Comparator<EmployeeList> CompareByName = new Comparator<EmployeeList>() {
		@Override
		public int compare(EmployeeList empl, EmployeeList empl2) {
		return new CompareToBuilder()
		.append(empl.getName(), empl2.getName())
		.append(empl.getId(), empl2.getId())
		.append(empl.getPosition(), empl2.getPosition())
		.append(empl.getSalary(), empl2.getSalary())
		.toComparison();
		}
		};
		
		public static Comparator<EmployeeList> CompareBySalary = new Comparator<EmployeeList>() {
			@Override
			public int compare(EmployeeList empl, EmployeeList empl2) {
			return new CompareToBuilder()
			.append(empl.getSalary(), empl2.getSalary())
			.append(empl.getName(), empl2.getName())
			.append(empl.getId(), empl2.getId())
			.append(empl.getPosition(), empl2.getPosition())
			
			.toComparison();
			}
			};
			public static Comparator<EmployeeList> CompareByPosition = new Comparator<EmployeeList>() {
				@Override
				public int compare(EmployeeList empl, EmployeeList empl2) {
				return new CompareToBuilder()
				.append(empl.getPosition(), empl2.getPosition())
				.append(empl.getName(), empl2.getName())
				.append(empl.getId(), empl2.getId())
				.append(empl.getSalary(), empl2.getSalary())
				.toComparison();
				}
				};
				public static Comparator<EmployeeList> CompareById = new Comparator<EmployeeList>() {
					@Override
					public int compare(EmployeeList empl, EmployeeList empl2) {
					return new CompareToBuilder()
					.append(empl.getId(), empl2.getId())
					.append(empl.getName(), empl2.getName())
					.append(empl.getPosition(), empl2.getPosition())
					.append(empl.getSalary(), empl2.getSalary())
					.toComparison();
					}
					};
			

}