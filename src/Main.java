import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static double operand(int [] part, String s){
        double result = 0;
        switch (s) {
            case "-":
                result = part[0] - part [1];
                break;
            case "/":
                result = (double) part[0] / part[1];
                break;
            case "\\+":
                result = part[0] + part[1];
                break;
            case "\\*":
                result = part[0] * part [1];
                break;
        }
        return result;
    }

    public static ArrayList splitter(String old) {
        ArrayList<String> element = new ArrayList<String>();
        String[] operand = {"/", "-", "\\*", "\\+"};
        for (int i = 0; i < 4; i++) {
            element.clear();
            element.addAll(Arrays.asList(old.split(operand[i])));
            if (element.size() == 2) {
                element.add(operand[i]);
                return element;
            }
        }
        System.out.println("Error");
        System.exit(0);
        return null;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();
        inputLine = inputLine.replaceAll("\\s", "");

        ArrayList<String> elements = splitter(inputLine);


        Detected result0 = new Detected();
        result0.newNumb = elements.get(0);
        result0.detect();

        Detected result1 = new Detected();
        result1.newNumb = elements.get(1);
        result1.detect();

        int [] resultMas = {result0.value, result1.value};

        if (result0.arabNumb == result1.arabNumb) {
            double result = operand(resultMas, elements.get(2));
            if (result0.arabNumb == true){
                System.out.println(result);
            }else{
                Rome abc = new Rome();
                System.out.println(abc.romechange(result));
            }
        }

    }
}

