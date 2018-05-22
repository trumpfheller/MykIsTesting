package Arrays;

public class Myclass {
	int i = 2; 
	String str = "x";
	void change (int i, String str) {
		this.i += i;
		//i += i means i++
		//this. assigns the value of the parameter a to the field of the same name
		this.str += str;
	}
	
	public static void main(String[] args) {
		Myclass mc = new Myclass ();
		mc.change(5, "y");
		System.out.println(mc.i+mc.str);

	}

}
