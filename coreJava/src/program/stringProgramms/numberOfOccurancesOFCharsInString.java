package stringProgramms;

import java.util.HashMap;
import java.util.Map;

public class numberOfOccurancesOFCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sc="fsdfdfscfsdf sdaf sdfdsfsd fdsfsad dsfsdf g df sd";
		
		String[] chars=sc.split("");
		
		Map<String,Integer> charCount =new HashMap<String,Integer>();
		
		for(String c:chars)
		{
			if(charCount.containsKey(c))
			{
				charCount.put(c, charCount.get(c)+1);
			}else{
				charCount.put(c, 1);
			}
		}
		
		System.out.println(charCount);

	}

}
