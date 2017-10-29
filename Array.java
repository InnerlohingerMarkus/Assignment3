
public class Array<T> extends Stack<T> {
	private T[]stack=null;
	private int pointer=0;
	
	
	@SuppressWarnings("unchecked")
	Array(){
			stack=(T[])new Object[10];
	}
	
	
	public boolean isEmpty(){
		return pointer==0;
	}
	
	
	public void push(T input){
		if(pointer<stack.length){
			stack[pointer]=input;
		pointer++;
		}
		else
			System.err.println("ERROR:Array is full!");
	}
	
	
	public T pop(){
		T output;
		
		if(isEmpty())
			return null;
		
		else{
			output=stack[pointer-1];
			stack[pointer-1]=null;
			pointer--;
		}
		return output;
	}
	
	

}
