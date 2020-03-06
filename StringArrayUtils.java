/**
* Created by Yang on 1/23/20.
*/
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }
    
    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }
    
    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int i = array.length - 1 ;
        return array[i];
    }
    
    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        
       
        return array[array.length-2];
    }
    
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {    
        for(int i = 0; i<array.length;i++){
            if (array[i].contains(value))
                return true;
        }
        return false;
    }
    
    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String [] reverseArr = new String [array.length];
        for (int i = array.length-1, j = 0; i>=0 ; i--,j++){
            reverseArr[j]=array[i];
        }
        return reverseArr;
    }
    
    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int middle = array.length /2;
    
        for (int i = 0, j=array.length -1; i<=middle; i++,j--){
            if(!array[i].equals(array[j]))
                return false;
        }
        return true;
    }
    
    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        char []letters = new char [26];
        char c;
    
        for (int i = 0; i < array.length;i++){
            for (int j = 0; j<array[i].length();j++){
                c = Character.toUpperCase(array[i].charAt(j));
                if (c - 'A' >=0 && c - 'Z' <= 26){
                    for (int k = 0; k<letters.length;k++){
                        if (c==letters[k]){
                            
                            break;
                        }
                        else if (letters[k] == 0){
                            letters[k] = c;
                            break;
                        }
    
                    }
                }
            }
        }
        for (int k = 0; k<letters.length; k++){
            if(letters[k] ==0)
                return false ;
            
        }
        return true;
        
    }
    
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int number = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i].equals(value)){
                number++;
            }
        }
        return number;
    }
    
    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int numberToRemove = 0;
        for (int i = 0; i<array.length;i++){
            if (array[i].equals(valueToRemove)){
                array[i]=null;
                numberToRemove++;
            }
        }
        
    
        String [] strs = new String[array.length - numberToRemove];
        
        int j =0;
        for (int i =0;i<array.length;i++ ){
            if (array[i] == null)
                continue;
            strs[j] = array[i];
            j++;
        }
        
        return strs;
    }
    
    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int numberToRemove = 0;
        String temp = "";
        for (int i = 0; i<array.length;i++){
            
            if (array[i].equals(temp)){
                array[i] = null;
                numberToRemove ++;
            }
            else 
                temp = array[i];
        }
        String [] strs = new String[array.length - numberToRemove];
        
        int j =0;
        for (int i =0;i<array.length;i++ ){
            if (array[i] == null)
                continue;
            strs[j] = array[i];
            j++;
        }
        
        
        return strs;
    }
    
    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            while (i < array.length - 1 && array[i] == array[i + 1]) {
                sb.append(array[i]);
                i++;
            }
            sb.append(array[i]);
            array[j++] = sb.toString();
            sb.delete(0, sb.length());
        } 
        String[] res = new String[j];
        for (int i = 0 ; i < j; i++) {
            res[i] = array[i];
        }
        return res;
    }
    


}
