    /** isLucky CodeFights
    *  Copyright(c) 2017 Alex Seeds, Inc.  All Rights Reserved.
    *  @Project:   Puzzles
    *  @File   :   isLucky.Java
    *  @author :   Alex Seeds
    *  @version:   1.0 (15-Sep-2017)
    *  @created:   15-Sep-2017, 3:58:09 PM
    *  @since  :   1.0
    *  @Challenge: Ticket numbers usually consist of an even number of digits. 
    *       A ticket number is considered lucky if the sum of the first half 
    *       of the digits is equal to the sum of the second half. Given a ticket
    *       number n, determine if it's lucky or not.
    *   @description:   The idea is to grab the two sections of the string,
    *       The first half, and the second half. Then add each numeric character
    *       to create a sum/total.
    *       Return the Boolean comparison between the two values.
    */
    boolean isLucky(int n) 
    {
        String Splitter = String.valueOf(n);    //Converts the number to a string
        Integer FirstHalf = SumAString(Splitter.substring(0, Splitter.length()/2));
        Integer SecondHalf = SumAString(Splitter.substring(Splitter.length()/2, Splitter.length()));
        return (FirstHalf == SecondHalf);
    }
    Integer SumAString(String myString)
    {
        Integer Sum = 0;        //  Stores the sum/total
        for (int Len = 0; Len < myString.length();Len++)    // Iterates to each number
        {
            Sum += Integer.valueOf(myString.substring(Len,Len+1));  // Grabs the letter, and adds it
        }
        return Sum; //  Returns the total
    }