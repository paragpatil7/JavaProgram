package stringProgramms;

import java.util.HashMap;
import java.util.Map;

public class numberOfOccurancesOFGivenWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sc="My name name is harshal is My My";
		
		String[] words=sc.split(" ");
		
		Map<String ,Integer> WordCount=new HashMap<String,Integer>();
		
		for(String word:words)
		{
			if(WordCount.containsKey(word) )
			{
				WordCount.put(word,WordCount.get(word)+1);
			}
			else
			{
				WordCount.put(word, 1);
			}
		
		}
		
		System.out.println(WordCount);
		
		
		
		
		
		

	}

}
