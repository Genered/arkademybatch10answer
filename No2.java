public class No2 {

    public static void main(String[] args) {
        System.out.println(isUsernameValid("imamsat"));
        System.out.println(isUsernameValid("imamsatr"));
        System.out.println(isUsernameValid("imamsatri"));
        System.out.println(isUsernameValid("ImamSatria"));                        
        
        System.out.println(isPasswordValid("opwefjs"));
        System.out.println(isPasswordValid("opwefjsd"));
        System.out.println(isPasswordValid("opwefjsdA2#"));
        System.out.println(isPasswordValid("opwefjsdddd223@"));
    }   
    
    public static boolean isUsernameValid(String username){    
        // Check if lenght is correct
        if((username.length() < 8) || (username.length() > 8))
            return false;
               
        // Check for lowercase
        for(int i = 0; i < username.length(); i++){            
            if(!Character.isLowerCase(username.charAt(i)))                
                return false;
        }
        
        return true;
    }
    
    public static boolean isPasswordValid(String password){      
        // Initialize to false for each category
        boolean lower = false;
        boolean upper = false;
        boolean number = false;
        boolean special = false;
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        
        // Check for length
        if(password.length() < 8)
            return false;
                
        // Check and set the category to true if satisfy the condition
        for(int i = 0; i < password.length(); i++){            
            if(Character.isLowerCase(password.charAt(i)))
                lower = true;            
            else if(Character.isUpperCase(password.charAt(i)))
                upper = true;
            else if(Character.isDigit(password.charAt(i)))
                number = true;
            else if(specialChars.contains(String.valueOf(password.charAt(i))))
                special = true;
        }
        
        // Return the boolean value using AND operator
        return lower && upper && number && special;
    }        
}
