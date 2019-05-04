public class No3 {

    public static void main(String[] args) {
        drawPattern(5);
        drawPattern(7);
        drawPattern(9);
    }
    
    public static void drawPattern(int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(j == 0 || j == size - 1)
                    System.out.print("*");
                else if(i == size / 2)
                    System.out.print("*");
                else 
                    System.out.print("=");
            }
            System.out.println();
        }
    }
}
