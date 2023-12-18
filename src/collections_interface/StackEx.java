package collections_interface;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(56);
		st.push(23);
		st.push(44);
		//st.clear();
		System.out.println("My Stack element: "+st);
		st.pop();
		System.out.println("After pop of element: "+st);
		System.out.println("My top element: "+st.peek());
		System.out.println(st.isEmpty());
		System.out.println("My Stack element: "+st.search(56));
		System.out.println("My Stack element: "+st.empty());
		System.out.println("My Stack element: "+st.size());
	}

}
