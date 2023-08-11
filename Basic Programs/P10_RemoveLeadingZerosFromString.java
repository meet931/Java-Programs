// Remove Leading Zeros From String in Java
// To remove leading zeros from a string in Java, you can use various approaches. One simple way is to use regular expressions

public class P10_RemoveLeadingZerosFromString {
    public static void main(String[] args)
    {
        String inputString = "00012345";
        String result = removeZeros(inputString);
        System.out.println(result);
    }

    static String removeZeros(String input)
    {
        // Use regular expression to remove leading zeros
        return input.replaceFirst("^0+(?!$)", "");
    }
}