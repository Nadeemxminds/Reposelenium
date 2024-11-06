package training07;

public class StringBuilderExample{
	public static void main(String[]args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.append("");
        sb.append("simple");
        System.out.println(sb.toString()); //Output: "Java Simple"
        
        sb.insert(5," is ");
        System.out.println(sb.toString()); //Output: "Java is Simple"
        
        sb.reverse();
        System.out.println(sb.toString()); //Output: "elpmiS si avaJ"
	}
}
