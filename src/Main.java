public class Main {
    public static void main(String[] args) {
        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";

        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        bartender(name);
        sum(input1, input2);


    }


    public static void hello() {
        System.out.println("Hello World");
    }

    public static void positiveOrNegative(int number) {

        if (number > 0) {
            System.out.println("This number is positive");
        } else if (number < 0) {
            System.out.println("This number is negative");
        }

    }

    public static void positiveOrZeroOrNegative(int number) {

        if (number > 0) {
            System.out.println("This number is positive");
        } else if (number < 0) {
            System.out.println("This number is negative");
        } else {
            System.out.println("This number is zero");
        }
    }

    public static void bartender(String name){

        switch (name) {
            case "Henk":
                System.out.println(name + " wants a Bacardi cola");
                break;
            case "Jan":
                System.out.println(name + " wants a Mojito");
                break;
            case "Piet":
                System.out.println(name + " wants a Gin Tonic");
                break;
            default:
                System.out.println(name + " wants a water");
                break;
        }
    }

    public static void sum (int input1, int input2){
        int result = input1 + input2;
        System.out.println(input1 + " summed by " + input2 + " = " + result);
    }




}
