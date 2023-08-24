public class LinkedIn {
	
	
	public static void main(String[] args) {
		
		String str = "hello the world";
		String re =  reverse( str);
		System.out.println(re);
		
	}
	
	public static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		else {
			return reverse(str.substring(1))+str.charAt(0);
		}
	}

}
