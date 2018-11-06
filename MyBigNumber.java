package mybignumber;

import java.util.Scanner;

/**
 *
 * @author 51600063
 * @reference String (Java Platform SE 8) - Oracle
 * @reference myworkspace.vn
 * Thanks Mr.Thach was touch me how to calcule char to number (number = char - '0')
 * @version 1.0.0
 */
public class MyBigNumber {

    /** 
     * class add two big number
     * @param number1 first number  
     * @param number2 second number
     * @return string have to result big number was added
     */
    
    public static String sum(String number1, String number2) {
        /**
         * Method calculate to sum two number
         * @param number1 string of first number
         * @param number2 string of second number
         * @return string have to result
         */
        
       int length1 = number1.length();            //length of number
       int length2 = number2.length();            //length of number
       int maxlength = maxLen(length1, length2);  //max of length two number
       int index1;                                //index of first number
       int index2;                                //index of second number
       char char1;                                //char of first number
       char char2 = 0;                                //char of second number
       int num1;                                  
       int num2;                                  
       int sumtemp;                               //sum 
       int memory = 0;                            //memory number
       String result = "";                        //result
       
       for (int position = 0; position < maxlength; position++) {
           index1 = length1 - position - 1;
           index2 = length2 - position - 1;
           
           //Returns the char value at the specified index
           char1 = number1.charAt(index1);
           num1 = char1 - '0';
           
           if (position < length2) {
                char2 = number2.charAt(index2);
                num2 = char2 - '0';
           } 
           else {
               num2 = 0;
           }
           
           sumtemp = num1 + num2;
           
           result = unitPosition(result, sumtemp);
           
           memory = sumtemp / 10; //div
       }
    
       if (memory > 0) 
        result = memory + result;
       
       return result;
    }
    
    public static int maxLen(int len1, int len2) {
       /**
        * Method compare two length of number
        * @param len1 length of first number 
        * @param len2 length of send number
        * return integer max length
        */  
       if (len1 < len2) 
           return len2;
       else 
           return len1;
    }
    
    public static String unitPosition(String result, int temp) {
        /**
         * Method add number unit position before main number
         * @param result number want to add unit position
         * @param temp number unit position
         * return String number 
         */
        result = (temp % 10) + result;
        return result;
    }
    
    public static void main(String[] args) {
        String number1 = "";
        String number2 = "";
        String result = "";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------Welcome to my BigNumber-------");
        System.out.println("Input first number:  ");
        number1 = sc.nextLine();
        
        System.out.println("Input second number:  ");
        number2 = sc.nextLine();
                
        result = sum(number1, number2);
        System.out.println("Your answer is:  "+ result);
        
        System.out.println("---------HAVE A NICE DAY-------");

    }
    
}
