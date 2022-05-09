package stack;

class Node{
	int data;
	Node next;
}

class MyStack{
	private Node top;
	private int nodesCount;
	
	public MyStack()
	{
		this.top=null;
		this.nodesCount=0;
	}
	
	public void push(int x)
	{
		Node node=new Node();
		
		System.out.println("Inserting "+x);
		node.data=x;
		node.next=top;
		top=node;
		this.nodesCount+=1;
		
	}
	
	 public boolean isEmpty()
	 {
	        return top == null;
	 }
	
	public int peek() 
	{
		if(isEmpty())
		{
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        return top.data;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("The stack underflow");
			System.exit(-1);
		}
		
		int top=peek();
		System.out.println("removing "+top);
		this.nodesCount-=1;
		this.top=(this.top).next;
		
		return top;
		
	}
	
	public int size() {
		return this.nodesCount;
	}
}

public class LLStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack=new MyStack();
		stack.push(3);
		stack.push(31);
		stack.push(13);
		System.out.println("Top element is: "+stack.peek());
		stack.pop();
		System.out.println("after pop , Top element is: "+stack.peek());
//		System.out.println(stack.size());
		
		 if (stack.isEmpty())
		 {
	            System.out.println("The stack is empty");
	     }
	        else 
	        {
	            System.out.println("The stack is not empty");
	        }
		

	}

}
