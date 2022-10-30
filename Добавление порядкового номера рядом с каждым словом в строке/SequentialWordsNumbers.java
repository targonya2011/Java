package practice.string;


public class SequentialWordsNumbers {

    public static String sequentialWordsNumbers(String text) {

                String word = "";
                String result = "";
                int number = 0;
                String lastWord = text.substring(text.lastIndexOf(' ') + 1);

        for (int i = 0; i <= text.length(); i++) {

                int space = text.indexOf(' ', i);

                if (space > 0) {
                    number++;
                    word = text.substring(i, space);
                    i = i + word.length();
                    result = result + "(" + number  + ")" + " " + word + " ";
                }
            }
            if (text.length() > 0) {
                result = result + "(" + (number + 1)  + ")" + " " + lastWord;
            }

            return result;
        }


}
