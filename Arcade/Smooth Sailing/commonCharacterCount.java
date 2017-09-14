/** CodeFights - Common Character Counter
 *  Copyright(c) 2017 Alex Seeds, Inc.  All Rights Reserved.
 *  @Project:   CodeFights
 *  @File   :   CommonCharacterCount.java
 *  @author :   Alex Seeds
 *	@Length	:	Compressed 10 Lines, Uncompressed 82 (with comments)
 *  @version:   1.0 (14-Sep-2017)
 *  @created:   14-Sep-2017, 2:45:08 AM
 *  @since  :   1.0
 *  
 *  @description: The purpose of this is to compare two strings and count
 *      the number of common characters. Duplicates are treated as individual 
 *      instances based on test data. Code below includes the ability to only 
 *      count unique characters.
 * 
 */
    /** Main Class to perform the calculation of common characters.
     *  s1  -   Stands for String 1, holds the first string to be compared
     *  s2  -   Stands for String 2, holds the second string to be compared
     *  return  -   Integer value that represents common characters between
     *              s1, and s2.
     */
    int commonCharacterCount(String s1, String s2) 
    {
        /*  *
        *   For Unique characters, uncomment the following lines and replace
        *   s1,s2 with NoDupeS1,NoDupeS2. This will ensure only unique 
        *   characters are counted.
        */
        //String NoDupeS1 = removeDuplicates(s1); 
        //String NoDupeS2 = removeDuplicates(s2);
        return CountDuplicates(s1,s2);
    }
    /** Removes all duplicates from a string
     *  This utilizes char values as the primary means of searching. This can be
     *  replaced with substring management. 
     *  -- Demo of Primitives being utilized -- 
     */
    String removeDuplicates(String charCollection)
    {
        // Builds a new string to return with only uniques
        String letters = "";
        for (Integer x = 0; x < charCollection.length() ; x++)
        {
            // Checks if the character is already in our list.
            if (letters.indexOf(charCollection.charAt(x)) == -1)
                letters += charCollection.charAt(x);    // Adds to string
        }
        return letters; //Returns the new string
    }
    /** Counts the duplicates between 2 strings. 
     *  @param Group1 - Contains the first string of Characters
     *  @param Group2 - Contains the Second string of Characters
     *  @return Integer - Contains a count of all shared characters
     */
    Integer CountDuplicates(String Group1, String Group2)
    {
        String CurrLetter = ""; // Used for Debuging and displays output. 
        Integer Counter = 0;    // Used to return total count
        for (Integer x = 0; x < Group1.length() ; x++)  // Searches Group1
        {
            CurrLetter = Group1.substring(x,x+1);       // Grabs the current letter
            System.out.println("Looking for : " + CurrLetter );
            // Finds the current letter, if it exists.
            if (Group2.indexOf(CurrLetter) > -1)
            {
                Counter ++; //  Increments the counter
                System.out.println(CurrLetter + " has been found in: " + Group2);
                /**  Grabs all the letters UP TO the found letter, 
                    Grabs all letters AFTER the found letter
                    Removes ONLY the first INSTANCE of the letter within the 
                    String  
                */
                Group2 =    Group2.substring(0,Group2.indexOf(CurrLetter)) + 
                            Group2.substring(Group2.indexOf(CurrLetter) +1, 
                                                Group2.length());
                System.out.println("New Search String after deletion: " + Group2);
            }
        }
        // Returns the total count.
        return Counter;
    }	
	/******		COMPRESSED SOLUTION		*****
	    Integer commonCharacterCount(String Group1, String Group2)	{ 	
        Integer Counter = 0; 
        for (Integer x = 0; x < Group1.length() ; x++)	{
            if (Group2.indexOf(Group1.substring(x,x+1)) > -1)	{
                Counter ++;
                Group2 =    Group2.substring(0,Group2.indexOf(Group1.substring(x,x+1))) + Group2.substring(Group2.indexOf(Group1.substring(x,x+1)) +1, Group2.length());	
			}	
		}
        return Counter;
    }
	*/