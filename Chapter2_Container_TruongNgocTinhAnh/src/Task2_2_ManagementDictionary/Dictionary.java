package Task2_2_ManagementDictionary;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 07- 09 -2016
 * @Version: 01
 * @Class for management dictionary
 */
public class Dictionary {
	public String englishWord;
	public String vietnamWord;
	public Dictionary() {
		super();
	}
	public Dictionary(String englishWord, String vietnamWord) {
		super();
		this.englishWord = englishWord;
		this.vietnamWord = vietnamWord;
	}
	public String getEnglishWord() {
		return englishWord;
	}
	public void setEnglishWord(String englishWord) {
		this.englishWord = englishWord;
	}
	public String getVietnamWord() {
		return vietnamWord;
	}
	public void setVietnamWord(String vietnamWord) {
		this.vietnamWord = vietnamWord;
	}
	
	/**
	 * @Function for display information of word
	 * @Input: none
	 * @Output: information of word
	 */
	public String displayInfoWord(){
        return this.englishWord + " : " + this.vietnamWord;
    }
	
}
