package stack;

public class Stack {
	
	private int arr[];
	
	private int top;
	
	private int capacity;
	
	Stack(int size)
	{
		arr=new int[size];
		capacity=size;
		top=-1;
	}
	
	public void push(int x)
	{
		if(isFull()) {
			System.out.println("Stack overflow !");
			
			System.exit(1);
		}
		
		System.out.println("Inserting"+x);
		arr[++top]=x;
		
	}
	
	public boolean isFull() 
	{
		return top==capacity-1;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Empty");
			System.exit(1);
		}
		
		return arr[top--];
	}
	
	public boolean isEmpty() 
	{
		return top==-1;
	}
	
	public void  printStack()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
	public int peek()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
			System.exit(1);
		}
		return arr[top];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st=new Stack(5);
		st.push(1);
		st.push(2);
		st.push(3);
		
		System.out.println("Stack: ");
		st.printStack();
		
		st.pop();
		System.out.println("\nAfter popping out");
		st.printStack();
		
		System.out.println("Top element is "+st.peek());
		
		
		 	
		

	}

}
