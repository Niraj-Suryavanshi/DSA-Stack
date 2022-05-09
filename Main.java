package stack;
import java.util.Stack;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>animals=new Stack<>();
		
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Elephant");
		
		System.out.println("Stack:"+animals);
		
		animals.pop();
		System.out.println("Stack after pop:"+animals);
		
		

	}

}
