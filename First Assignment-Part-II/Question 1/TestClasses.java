import java.time.LocalDate;

class MyDate {
    private int year, month, day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
    }
}

class Person {
    private String name, address, phoneNumber, emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + name;
    }
}

class Student extends Person {
    enum Status {
        FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
    }

    private Status status;

    public Student(String name, String address, String phoneNumber, String emailAddress, Status status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + ", Status: " + status;
    }
}

class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + ", Office: " + office + ", Salary: " + salary + ", Date Hired: " + dateHired;
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + ", Office Hours: " + officeHours + ", Rank: " + rank;
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + ", Title: " + title;
    }
}

class FullTime extends Staff {
    public FullTime(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired, title);
    }

    public double getEarnings() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Earnings: " + getEarnings();
    }
}

class PartTime extends Staff {
    private int hoursWorked;
    private double hourlyRate;

    public PartTime(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title, int hoursWorked, double hourlyRate) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired, title);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getEarnings() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Hours Worked: " + hoursWorked + ", Hourly Rate: " + hourlyRate + ", Earnings: " + getEarnings();
    }
}

public class TestClasses {
    public static void main(String[] args) {
        MyDate dateHired = new MyDate(2020, 5, 21);
        Person person = new Person("John Doe", "123 Main St", "555-1234", "john@example.com");
        Student student = new Student("Jane Smith", "456 College Ave", "555-5678", "jane@example.com", Student.Status.SOPHOMORE);
        Employee employee = new Employee("Bob Brown", "789 Work Rd", "555-8765", "bob@example.com", "Room 101", 50000, dateHired);
        Faculty faculty = new Faculty("Dr. Alice Green", "321 Faculty Ln", "555-4321", "alice@example.com", "Room 102", 75000, dateHired, "MWF 10-12", "Professor");
        Staff staff = new Staff("Charlie Black", "654 Staff St", "555-1111", "charlie@example.com", "Room 103", 40000, dateHired, "Admin");
        FullTime fullTime = new FullTime("Dave White", "987 Fulltime Blvd", "555-2222", "dave@example.com", "Room 104", 60000, dateHired, "Manager");
        PartTime partTime = new PartTime("Eve Red", "321 Parttime St", "555-3333", "eve@example.com", "Room 105", 0, dateHired, "Assistant", 20, 25);

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
        System.out.println(fullTime);
        System.out.println(partTime);
    }
}
