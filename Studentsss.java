
public class Studentsss {
	private String name;
    private int age;
    private String grade;

    // Constructor with no parameters
    public Studentsss() {
        this("Unknown"); // Calls the constructor with 1 parameter
        System.out.println("No-arg constructor called");
    }

    // Constructor with 1 parameter
    public Studentsss(String name) {
        this(name, 18); // Calls the constructor with 2 parameters
        System.out.println("Single-arg constructor called");
    }

    // Constructor with 2 parameters
    public Studentsss(String name, int age) {
        this(name, age, "Not assigned"); // Calls the constructor with 3 parameters
        System.out.println("Two-arg constructor called");
    }

    // Constructor with 3 parameters
    public Studentsss(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("Three-arg constructor called");
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Studentsss s1 = new Studentsss();
	        s1.display();

	        System.out.println();

	        Studentsss s2 = new Studentsss("Alice");
	        s2.display();

	        System.out.println();

	        Studentsss s3 = new Studentsss("Bob", 20);
	        s3.display();

	        System.out.println();

	        Studentsss s4 = new Studentsss("Charlie", 22, "A");
	        s4.display();
	    }
	
	}


