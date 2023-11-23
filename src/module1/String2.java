package module1;
//charAt method is used to find character at particular position
public class String2 {
	public static void main(String[] args) {
		String name="rachel";
		System.out.println(name.charAt(0));//r
		System.out.println(name.charAt(1));//a
		System.out.println(name.charAt(4));//e
		//to know the length of string
		//length()
		System.out.println(name.length());//5
		//replace()
        System.out.println(name.replace('r', 'a'));//aachel
        System.out.println(name);//strings are immutable in java
        String name2="rachel and monica";
        //substring()
        System.out.println(name2.substring(0,6));
        System.out.println(name2.substring(11,17));
        
	}

}
