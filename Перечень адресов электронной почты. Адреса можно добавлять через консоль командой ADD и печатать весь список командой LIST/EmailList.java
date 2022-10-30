package practice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    TreeSet<String> treeSet = new TreeSet<>();
    private static final String EMAIL_REGEX = "[a-z0-9#$%&]"          // don't lead with dot
            +   "[a-z0-9#$%&'\\-_]*"     // more stuff dots OK
            +   "@[^\\s@]"               // no dots or space or another @ sign next to @ sign
            +   "[a-z0-9_\\-]*"         // may or may  not have more character
            +   "\\.[a-z]{2,4}";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public void add(String email) {
        if (emailValidator(email)) {
            treeSet.add(email.toLowerCase());
        }
    }

    public List<String> getSortedEmails() {
        for (String c : treeSet) {
            System.out.println(c);
        }
        return new ArrayList<>(treeSet);
    }

    public static boolean emailValidator(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }

}
