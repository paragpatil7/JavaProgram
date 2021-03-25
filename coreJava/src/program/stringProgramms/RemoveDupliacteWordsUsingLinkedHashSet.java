package stringProgramms;

import java.util.LinkedHashSet;

public class RemoveDupliacteWordsUsingLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sc="My name name is harshal is My ";
		
		String[] words=sc.split(" ");
		
		LinkedHashSet<String> st=new LinkedHashSet<String>();
		
		for(String w:words)
		{
			st.add(w);
		}
		
		System.out.println(st);
		
		Object[] strr=st.toArray();
		
		for(Object s:strr)
		{
			System.out.println(s);
		}
		

		

	}

}
