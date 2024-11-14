package training11;

public class Student {
   
    private int id;
    private String name;
    private int age;

//default constructor to initialize the parametric
	 public Student(int id, String name, int age) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	 }
	    
	        // constructor to initialize the parametric
	        public Student() {
		        this.id = 7;
		        this.name = "Nadeem";
		        this.age = 18;
	        
	        }
	        
	public static void main(String args[]) {
		// creating an object of
        // Student
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.age);
       
	}
	 }
        
		
		
	        
	 
