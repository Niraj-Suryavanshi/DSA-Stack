package stack;
import java.util.Stack;

public class PostfixEvaluation {
	
	
	static void evaluatePostfix(String exp)
	{
		Stack<Integer>postfix=new Stack<>();
		int n=exp.length();
		
		for(int i=0;i<n;i++)
		{
			if(isOperator(exp.charAt(i)))
			{
				int op1=postfix.pop();
				int op2=postfix.pop();
				
				switch(exp.charAt(i))
				{
				case '+':postfix.push(op2+op1);
							break;	
							
				case '-':postfix.push(op2-op1);
							break;	
				
				case '*':postfix.push(op2*op1);
							break;	
				
				case '/':postfix.push(op2+op1);
							break;	
				}
				
			}
			else
			{
				int operand=exp.charAt(i)-'0';
				postfix.push(operand);
			}
		}
		
		System.out.println(postfix.pop());
		
	}
	
	static boolean isOperator(char ch)
	{
		if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
			return true;
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "823*+7/1-";
		System.out.println("The postfix evalution of the Given Expression "+exp+"is:");
		evaluatePostfix(exp);

	}

}
