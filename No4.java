public class No4 {

    public static void main(String[] args) {
        char[][] data = {{'a','c','b','e','d'},{'g','e','f'}};
        char[][] data2 = {{'g','h','i','j'},{'a','c','b','e','d'}, {'g','e','f'}};
        
        sort2DArray(data); 
        print2DArray(data);
        
        sort2DArray(data2); 
        print2DArray(data2);
    }
    
    public static void sort2DArray(char[][] data){
        for(int i = 0; i < data.length; i++){
            char[] temp;           
                        
            for(int j = i + 1; j < data.length; j++){
                if(data[i].length > data[j].length){
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }                    
            }
            
            sortArray(data[i]);
        }
    }
    
    public static void sortArray(char[] data){
        for(int i = 0; i < data.length; i++){            
            char temp;
            
            for(int j = i + 1; j < data.length; j++){
                if(data[i] > data[j]){
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }                    
            }                       
        }
    }
    
    public static void print2DArray(char[][] data){
        System.out.println("[");
        
        for(int i = 0 ; i < data.length; i++)
        {
            printArray(data[i]);            
        }
        
        System.out.println("]");
    }
    
    public static void printArray(char[] data){
        System.out.print("\t[");
       
        for(int i = 0 ; i < data.length; i++)
        {
            if(i != data.length - 1)
                System.out.print("'" + data[i] + "', ");
            else
                System.out.print("'" + data[i] + "'");
        }
        
        System.out.print("]");
        
        System.out.println();
    }
}
