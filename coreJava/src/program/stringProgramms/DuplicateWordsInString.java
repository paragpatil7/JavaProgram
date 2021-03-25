package stringProgramms;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sc="My name is Harshal Harshal My";
		String[] words=sc.split(" ");
		
		for(int i=0;i<=words.length-1;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equalsIgnoreCase(words[j]) && i!=j)
				{
					System.out.println(words[j]);
					
				}
			}
		}
		

	}

}
