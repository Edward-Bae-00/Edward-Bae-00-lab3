import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {
    public int processText(StringBuffer text, String stopword){
        Pattern regex = Pattern.compile("your regular expression here");
        Matcher regexMatcher = regex.matcher(text);
        while (regexMatcher.find()) {
            System.out.println("I just found the word: " + regexMatcher.group());
        } 
        return 0;
    }

    public StringBuffer processFile(String path){
        StringBuffer ans = new StringBuffer();
        return ans;
    }

    public void main(){
        
    }
}
