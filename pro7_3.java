import java.security.Permission;
import java.util.Date;

class Person
{
    protected String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress =emailAddress;
    }
    public Person()
    {

    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getAddress()
    {
        return address;
    }
    public void setPhone(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public String getPhone()
    {
        return phoneNumber;
    }
    public void setEmail(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }
    public String getEmail()
    {
        return emailAddress;
    }
    public String toString()
    {
        return name + address + phoneNumber + emailAddress;
    }
}
class Student extends Person
{
    private int status;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 3;
	public final static int JUNIOR = 2;
	public final static int SENIOR = 4;

	public Student(String name, String address,  
		String phone, String email, int status) {
		super(name, address, phone, email);
		this.status = status;
	}

	public void setStatus(int status) {
		this.status = status; 
	}

	public String getStatus() {
		switch (status) {
			case 1 : return "freshman"; 
			case 2 : return "sophomore"; 
			case 3 : return "junior"; 
			case 4 : return "senior";
			default : return "Unknown"; 
		}
	}

	public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}
}
class Employee extends Person
    {
        private String office;
        private String salary;
        private Date dateHired;
        public Employee()
        {

        }
        public Employee(String office,String salary)
        {
            this.office = office;
            this.salary = salary;
            this.dateHired = dateHired;
        }
        public Date getMydate()
        {
            return dateHired;
        }
        public void setMydate(Date dateHired)
        {
            this.dateHired = dateHired;
        }
        public String getOffice()
        {
            return office;
        }
        public void setOffice(String office)
        {
            this.office = office;
        }
        public String getSalary()
        {
            return salary;
        }
        public void setSalary(String salary)
        {
            this.salary = salary;
        }
        public String toString() {
            return super.toString() + "\nOffice: " + office + 
                     "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
        }
    }
class Faculty extends Employee
    {
        private String officeHours;
        private String rank;

        public Faculty(String officeHours,String rank)
        {
            this.officeHours = officeHours;
            this.rank = rank;
        }
        public void setOffice(String officeHours)
        {
            this.officeHours = officeHours;
        }
        public String getOffice()
        {
            return officeHours;
        }
        public void setRank(String rank)
        {
            this.rank = rank;
        }
        public String getRank()
        {
            return rank;
        }
    }
class Staff extends Employee
    {
        private String title;

        public Staff(String title)
        {
            this.setTitle(title);
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
        
    }

public class pro7_3 
{
    public static void main(String[] args)
    {
        Person person = new Person("John", "12 Bell street", 
        "3473339999", "john12@aol.com");

        Student student = new Student("Mary", "100 Town Ave", "5149993333", 
            "mary100@aol.com", Student.FRESHMAN);

        Employee employee = new Employee("Mike", "34 West street", "6189999999",
            "mike80@aol.com", 910, 60000);

        Faculty faculty = new Faculty("Sue", "28 Well street", "4133333333",
            "sue28@aol.com", 101, 50000, "4pm to 6pm", "Professor");

        Staff staff = new Staff("Tom", "90 Country road", "2030000000",
            "tomcat@aol.com", 12, 65000, "Executive Assistant");

    // Invoke toString of Person, Student, Employee, Faculty and Staff
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
            
        
    }
    
}