import java.util.*;

public class Test {

    static ArrayList<String> keyWords = new ArrayList<String>(Arrays.asList("int", "double", "String" , "float", "boolean", "char", "long"));
    static ArrayList<String> operators = new ArrayList<String>(Arrays.asList("=","+", "-", "/", "*", "%", "^"));
    static ArrayList<String> symbols = new ArrayList<String>(Arrays.asList(";", ",", "(", ")", "{", "}","[","]","!"));


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int keyWrd = 0;
        int identifier = 0;
        int constant = 0;
        int symbol = 0;
        int operator = 0;

        System.out.println("Enter a statement : ");
        String input = in.nextLine();

        String[] array = input.split(" ");

        for (int i = 0; i < array.length; i++) {
            if (keyWords.contains(array[i])){
                keyWrd++;
            } else if (operators.contains(array[i])) {
                operator++;
            } else if (symbols.contains(array[i])) {
                symbol++;
            } else if (isNumeric(array[i])) {
                constant++;
            } else {
                identifier++;
            }
        }

        System.out.println("keywords = " + keyWrd);
        System.out.println("identifiers =  " + identifier);
        System.out.println("symbols = " + symbol);
        System.out.println("operators =  " + operator);
        System.out.println("constant = " + constant);

    }

    public static boolean isNumeric(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }
}
