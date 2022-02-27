import java.util.Date;
class Person 
{
	private String name;
	private String address;
	private String phone;
	private String email;

	public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	} 

	public String getName() 
    {
		return name;
	}
	public String getAddress() 
    {
		return address;
	}
	public String getPhone() 
    {
		return phone;
	}
	public String getEmail() 
    {
		return email;
	}
	public void setName(String name) 
    {
		this.name = name;
	}
	public void setAddress(String address) 
    {
		this.address = address;
	}
	public void setPhone(String phone) 
    {
		this.phone = phone;
	}
	public void setEmail(String email) 
    {
		this.email = email;
	}
	public String toString() {
		return "\nName: " + name + "\nAddress: " + address + "\nPhone number: " + phone + "\nEmail address: " + email;
	}
}
class Student extends Person {
	private int status;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 3;
	public final static int JUNIOR = 2;
	public final static int SENIOR = 4;

	public Student(String name, String address,String phone, String email, int status) 
    {
		super(name, address, phone, email);
		this.status = status;
	}
	public void setStatus(int status) 
    {
		this.status = status; 
	}
	public String getStatus() 
    {
		switch (status) {
			case 1 : return "freshman"; 
			case 2 : return "sophomore"; 
			case 3 : return "junior"; 
			case 4 : return "senior";
			default : return "Unknown"; 
		}
	}
	public String toString() 
    {
		return super.toString() + "\nStudent{Status: " + getStatus()+"}";
	}
}
class Employee extends Person {
	private int office;
	private double salary;
	private Date dateHired;
	public Employee(String name, String address, String phone,String email, int office, double salary) {
		super(name, address, phone, email); //ดึงข้อมูลจาก superclass
		this.office = office;
		this.salary = salary;
		this.dateHired = new Date();
	}
	public int getOffice() 
    {
		return office;
	}

	public String getSalary() 
    {
		return String.format("%.2f", salary);
	}

	public Date getDateHired() 
    {
		return dateHired;
	}

	public void setOffice(int office)
    {
		this.office = office;
	}

	public void setSalary(double salary) 
    {
		this.salary = salary;
	}

	public void setDateHired() 
    {
		dateHired = new Date();
	}
	@Override
	public String toString() 
    {
		return super.toString() + "\nEmployee{Office: " + office + " Salary: $" +getSalary() + " Date hired: " +getDateHired()+"}";
	}
}
class Faculty extends Employee {
	private String officeHours;
	private String rank;
	public Faculty(String name, String address, String phone, String email, int office, double salary, String officeHours, String rank)
    {
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return super.toString() + "\nFaculty{Office hours: " + officeHours + " Rank: " +rank + "}";
	}
}
class Staff extends Employee {
	private String title;

	public Staff(String name, String address, String phone, String email, int office, double salary, String title) 
    {
		super(name, address, phone, email, office, salary);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return super.toString() + "\nStaff{Title: " + title + "}";
	}
}

public class pro7_3new {
    public static void main(String[] args) {
		Person person = new Person("memee", "near leapkongsong","025556555", "memeee1234@hotmail.com");

		Student student = new Student("Mimi", "191 showDC", "024556777","mimi1062@yahoo.com", Student.FRESHMAN);

		Employee employee = new Employee("pimolnut", "68 siam", "0999999999","siam.com", 112, 100000);

		Faculty faculty = new Faculty("pimoln", "75 mbk", "0555555555","pimolnmbk@hotmail.com", 101, 50000, "4pm to 6pm", "Professor");

		Staff staff = new Staff("booboo", "123/456 laddawan", "023456789","booboo@gmail.com", 12, 65000, "Executive Producer");

		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}
