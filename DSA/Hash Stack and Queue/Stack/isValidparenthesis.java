package Stack;

import java.util.Scanner;
import java.util.Stack;

public class isValidparenthesis {
    public static boolean isValid(String str){
        char[] chars = str.toCharArray();
        Stack<Character> stack1 = new Stack<>();
        for(char ele:chars){
            // 1. if the element contains open bracket push it to the stack 
            if(ele=='('||ele=='['||ele=='{'){
                stack1.push(ele);
                continue;
            }
            else if (stack1.empty()){
                return false;
            }
            char top = stack1.pop();
            if(top=='(' && ele!=')'){
                return false;
            }
            else if(top=='[' && ele!=']'){
                return false;
            }
            else if(top=='{' && ele!='}'){
                return false;
            }
          
        }
        // is the statc is empty or not
        return (stack1.empty()==true);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Is the given string is valid?"+isValidparenthesis.isValid(str));
    }
}
