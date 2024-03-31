public class calc extends ext_calculator {
    public static void main(String[] args) {
        calc cal = new calc();
        float n1 = 10, n2 = 20, result;
        String op = "+";

        switch (op) {
            case "+":
                result = n1 + n2;
                System.out.println(n1 + " " + op + " " + n2 + " = " + result);
                break;
            case "-":
                result = n1 - n2;
                System.out.println(n1 + " " + op + " " + n2 + " = " + result);
                break;
            case "*":
                result = n1 * n2;
                System.out.println(n1 + " " + op + " " + n2 + " = " + result);
                break;
            case "/":
                result = n1 / n2;
                System.out.println(n1 + " " + op + " " + n2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator");
        }

        float s = cal.square(n1);
        System.out.println("Square of " + n1 + " = " + s);
        float c = cal.cube(n1);
        System.out.println("Cube of " + n1 + " = " + c);
    }
}
