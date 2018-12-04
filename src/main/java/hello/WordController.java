package hello;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.wordClass;



@RestController

@RequestMapping(value="/words")
public class WordController 
{
    @GetMapping(path = "words/{word}")
    public wordClass getProduct(@PathVariable(name = "word") String word) 
	{
    		boolean palindrome=isPalindrome(word);
			boolean anagram=AnagramPalindrome(word);
			
			wordClass wResult=new wordClass();
			wResult.setWord(word);
			wResult.setPalindrome(palindrome);
			wResult.setAnagramPalindrome(anagram);
			
			 return wResult;
			
	}
   
    //This method will provide us result of Palindrome String
	public boolean isPalindrome(String word) 
	{
		String rev=null;

  		int length = word.length();

  		for ( int i = length - 1; i >= 0; i-- )
     	rev = rev + word.charAt(i);

	     	if (word.equals(rev))
	     	{
	     		System.out.println(word+" is a palindrome");
	      		return true;
	     	}
  	   	
	     	else
	     	{
	     		System.out.println(word+" is not a palindrome");
		     	return false;
	     	}
    	
	}
	
	//This method will provide us result of AnagramPalindrome String
	public boolean AnagramPalindrome(String word) {
		
		int oddOccur = 0;
		int[] count = new int[256];
		
		for(int i=0; i<word.length(); i++)
		{
			char ch = word.charAt(i);
			count[ch]++;
		}
		
		for(int cnt : count)
		{
			if(oddOccur > 1)
			{
				return false;
			}
			if(cnt%2 == 1)
			{
				oddOccur++;
			}
		}
		return true;
	}
}
