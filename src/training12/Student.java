package training12;


public class Student{
	private Integer age;
	private String name;
	private Integer  id;
	
	//Constructor to initialize the parametric
	public Student() {
		this.age = 18;
		this.name = "Nadeem";
		this.id = 7;
		
	
	}
	public Integer getId() {
		return id;
		
	}
	public void setId(Integer id) {
		this.id = id;
		
	}
	public String getname() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public Integer getAge() {
		return age;
		
	}
	public void setAge(Integer age) {
		this.age = age;
		
	}
	public static void main(String args[]) {
		 // Creating an object of Student
        Student s1 = new Student();

        // Accessing and printing instance variables
        System.out.println(s1.getId());    
        System.out.println(s1.getname()); 
        System.out.println(s1.getAge());   


	}
}

