package practice.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitText {

  public static String splitTextIntoWords(String text) {
    String result = "";

    Pattern pattern = Pattern.compile("[,.;!0-9]");
    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
        result = matcher.replaceAll("");
        result = result.replaceAll("\\s+", "\n");
    }

    return result;
  }

}