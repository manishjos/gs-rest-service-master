package model;

public class wordClass {

	private String word;
	private boolean palindrome;
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public boolean isPalindrome() {
		return palindrome;
	}
	public void setPalindrome(boolean palindrome) {
		this.palindrome = palindrome;
	}
	public boolean isAnagramPalindrome() {
		return anagramPalindrome;
	}
	public void setAnagramPalindrome(boolean anagramPalindrome) {
		this.anagramPalindrome = anagramPalindrome;
	}
	private boolean anagramPalindrome;
}
