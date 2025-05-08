package examPractise;
public class SwitchCase {
    public static void main(String[] args) {
        int day = 10;
        String fruit = "apple";
        switch (day) {
            case 10:
                switch (fruit) {
                    case "apple":
                        System.out.println("veto");
                
                    default:
                    System.out.println("vatena ra ni aaye");
                        break;
                }
            case 12:
            case 6:
                System.out.println("sadhhh");
            case 1:
                System.out.println("hello");
                break;
            case 4:
                System.out.println("Hi");   //yo case print garxa ani case 5 pani ani brak hunxa
            case 5:
                System.out.println("No");
                break;
            // default:
            //     System.out.println("no sedh!");
        }
    }
}
