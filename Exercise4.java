package LMS;

public class Exercise4 {
	public static void main(String[] args) {
		String[] value=args[0].split(",");
		String name=value[0];
		int roll=Integer.parseInt(value[1]);
		boolean isPresent=Boolean.parseBoolean(value[2]);
		String mail=value[3];
		long cell=Long.parseLong(value[4]);
		System.out.println("Name="+name);
		System.out.println("Roll No="+roll);
		System.out.println("IsPresent="+isPresent);
		System.out.println("mail ID="+mail);
		System.out.println("mobile no="+cell);
		
		
		
		
		
		
	}

}
