import java.util.ArrayList;

public class No1 {

    public static void main(String[] args) {
        System.out.println(getBiodata());
    }   
    
    public static String getBiodata(){
        // Initialize the data
        String name = "Imam Satria";
        String address = "Jalan Way Hitam Grandhill 7 Residences Palembang";
        String[] hobbies = {"Baca buku", "Nonton film"};
        boolean is_married = false;
        
        String highSchool = "SMAN 2 Banyuasin III"; 
        String[] university = {"Universitas Sriwijaya", "Universiti Teknologi Malaysia"};
        
        String[][] skills = {{"NodeJS", "JavaScript"}, {"Android", "Kotlin"}};
            
        // Build the json format
        String JSON = "{";
        JSON += "\"name\":\"" + name +"\",";
        JSON += "\"address\":\"" + address +"\",";      
        JSON += "\"hobbies\":" + convertArrayToJSON(hobbies) + ",";
        JSON += "\"is_married\":\"" + is_married + "\",";
        JSON += "\"school\":{";
        JSON += "\"highSchool\":\"" + highSchool + "\",";
        JSON += "\"university\":" + convertArrayToJSON(university) + "},";
        JSON += "\"skills\":" + convertArrayToJSON(skills);
           
        // Add it to arraylist
        ArrayList<String> json = new ArrayList();
        json.add(JSON);

        // Return it as json string
        return json.toString();
    }
    
    public static String convertArrayToJSON(String[] data){
        String temp = "[";
        
        for(int i = 0; i < data.length; i++){
            if(i != data.length - 1)
                temp += "\"" + data[i] + "\",";
            else
                temp += "\"" + data[i] + "\"]";
        }     
        
        return temp;
    }
    
    public static String convertArrayToJSON(String[][] data){
        String header[] = {"Web", "Mobile"};
        String temp = "[";
        
        for(int i = 0; i < data.length; i++){
            temp += "{";
            temp += "\"" + header[i] + "\":";
            
            if(i != data.length - 1)                              
                temp += convertArrayToJSON(data[i]) + "},";           
            else             
                temp += convertArrayToJSON(data[i]) + "}]}";                           
        }                     
        return temp;
    }
}