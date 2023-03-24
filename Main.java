import java.util.ArrayList;

class Main {
	public static void main(String[]args){
		ArrayList<Integer> number= new ArrayList<Integer>();
		//int,double,float boolean
		//Integer is a wrapper class for Int.Same for Double,Float Boolean etc...
		//When using ArrayList we must use the Wrapper type.
		number.add(1);//0
		number.add(2);//1
		number.add(3);//2
		number.add(4);//3
		number.add(5);//4

		//We may also remove numbers by index 5 removed
		number.remove(4);
		//or remove by value"Remove integer 4."
		number.remove(Integer.valueOf(4));
		//or remove everything from our ArrayList
		//numbers.clear(); which will make our List empty. 
		
		//Print name of ArrayList first, then the method ".toString());"
		System.out.println(number.toString());
		//We also have a get method. Prints whatever index we choose. 
		System.out.println(number.get(1));
	
	}
}	