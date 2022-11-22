package com.greatlearning.main;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBracket{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bracket String");
        String bracketExpression = sc.next();

        isBalanced(bracketExpression);

        sc.close();
        if(isBalanced(bracketExpression)){

            System.out.println("Balanced brackets");
        }else{

            System.out.println("Unbalanced brackets");
        }
    }

    public static boolean isBalanced(String bracketcharacter){

        Stack<Character> stack = new Stack<Character>();

        for(int i=0 ; i< bracketcharacter.length(); i++){

            char character = bracketcharacter.charAt(i);

            if(character == '(' || character == '[' || character == '{'){

                stack.push(character);

                continue;

            }
            if(stack.isEmpty()){

                return false;

            }
            char c;

            switch(character){

                case '}':

                    c=stack.pop();
                    if(c=='(' || c=='[')
                        return false;
                    break;

                case ')':

                    c=stack.pop();
                    if(c=='{' || c=='[')
                        return false;
                    break;

                case ']':

                    c=stack.pop();
                    if(c=='(' || c=='{')
                        return false;
                    break;

            }
        }
        return stack.isEmpty();
    }
}