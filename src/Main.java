import java.util.Arrays;

/*
String Handling 01
Exercise: String handling 1

define a string called string1 that has assigned the value "Hello"
define a string called string2 that has assigned the value "How are you?"
take the first 2 characters string1 and the last 2 characters of string2 and combine the 4 chars (Heu?) into a
dedicated array called charArray print charArray
 */
public class Main {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";

        char[] charArray =
                string1
                        .substring(0, 2)
                .concat(
                        string2
                                .substring(string2.length() - 2)
                )
                .toCharArray();
        
        System.out.println(Arrays.toString(charArray));

    }
}
