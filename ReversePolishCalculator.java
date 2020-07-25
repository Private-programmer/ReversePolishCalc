import java.util.Arrays;
import java.util.Scanner;

class ReversePolishCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("expression: ");
        String expression = scan.nextLine();

        String[] numbers = expression.replaceAll("[^0-9]+", " ").trim().split(" ");
        String[] operater = expression.replaceAll("[0-9]+", " ").trim().split(" ");
        
        Stack stack = new Stack(3);
        // System.out.println(Arrays.asList(numbers));
        // System.out.println(Arrays.asList(operater));

        for(int i = 0; i < numbers.length; i++){
            stack.push(numbers[i]);
        }
        for(int i=0; i<operater.length; i++){
            int top1 = Integer.parseInt(stack.pop());
            int top2 = Integer.parseInt(stack.pop());
            // int sum;

            if(operater[i].equals("+")){
                int sum = top1 + top2;
                String newTop = String.valueOf(sum);
                stack.push(newTop);
            }

            if(operater[i].equals("-")){
                int minus = top2 - top1;
                String newTop = String.valueOf(minus);
                stack.push(newTop);
            }

            if(operater[i].equals("*")){
                int multiply = top2 * top1;
                String newTop = String.valueOf(multiply);
                stack.push(newTop);
            }

            if(operater[i].equals("/")){
                int divide = top2/top1;
                String newTop = String.valueOf(divide);
                stack.push(newTop);
            }
        }
        String answer = stack.pop();
        System.out.println(answer);
    }
}