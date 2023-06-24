public class butterfly {
    public static void main(String[] args) {
    
       int a =5;
//BUTTERFLY PATTERN USING LOOPS  
        //Outer loop
        for (int i=1;i<=a;i++){

            //inner loop
            int space=2*(a-i);
            for(byte j=1;j<=i;j++){
            System.out.print("*");
            }
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
            for(byte j=1;j<=i;j++){
            System.out.print("*");
            }
         System.out.println();
    }
    //lower half
            for (int i=a;i>=1;i--){

            //inner loop
            int space=2*(a-i);
            for(byte j=1;j<=i;j++){
            System.out.print("*");
            }
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
            for(byte j=1;j<=i;j++){
            System.out.print("*");
            }
         System.out.println();        
    }


    }
}
