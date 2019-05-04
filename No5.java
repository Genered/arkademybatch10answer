import java.util.Random;

public class No5 {

    public static void main(String[] args) {
        printRandom(3);
        printRandom(5);                
    }   
    
    public static void printRandom(int n){        
        String alphanumeric = "abcdefghijklmnopqrstuvwxyz0123456789";        
        String[] randomStringArray = new String[n];
        
        // Initilaize array to empty string
        for(int i = 0; i < randomStringArray.length; i++){
            randomStringArray[i] = "";
        }
        
        for(int i = 0; i < n; i++)
        {
            String randomStr = "";
            Random rand = new Random();
            
            // Generate the random value based on alphanumeric string
            for(int j = 0; j < 32; j++){
                randomStr += alphanumeric.charAt(rand.nextInt(alphanumeric.length()));                
            }            
            
            // Add it to the array
            randomStringArray[i] = randomStr;
            
            // Check for duplicate string
            if(randomStringArray.length > 1 && isDuplicate(randomStringArray, randomStr, i))
                i--;  
            else
                System.out.println(randomStr);
            
            
        }
    }
    
    public static boolean isDuplicate(String[] arr, String str, int pos){               
        for(int i = 0; i < pos; i++){
            System.out.println("Comparing " + arr[i] + " and " + str);
            if(arr[i].equals(str))
                return true;
        }
       
        return false;
    }
}
