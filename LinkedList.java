
public class LinkedList<T> extends Stack<T> {
	private Nodes<T> p;
	private Nodes<T> head;
	
	LinkedList(){
		head=new Nodes<T>();
		
	}
	
	public boolean isEmpty(){
		return head.next==null;
	}
	
	public void push(T input){
		p=new Nodes<T>(input);
		p.next=head;
		head=p;
	}
	
	public T pop(){
		T output;
		
		if(isEmpty())
			return null;
		
		else{
			output=head.getValue();
			head=p.next;	
			p=head;
		}
		return output;	
	}
	
	
	// intern class nodes
	public class Nodes <E>{
		private E data;
		public Nodes<E> next;
		
		public Nodes(){
			next=null;
		}
		
		public Nodes(E item){
			data=item;
			next=null;
		}
		
		public E getValue(){
			return data;
			
		}
		
	}

}

