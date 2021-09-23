import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 1 to Sort Integer OR 2 to Sort String");
        int n = sc.nextInt();
        if(n == 1){
            System.out.println("SORT INTEGER");
            sortInt();
        }
        else if(n == 2){
            System.out.println("SORT STRING");
            sortString();
        }

        }

    //Sort Array Integer   
    static void sortInt(){
        Scanner sc = new Scanner(System.in);
        int tempValue;

        
        System.out.println("Enter number of array elements : ");
        int size = sc.nextInt();

       
        int[] numArray = new int[size];

        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element (Press ENTER after each element) : ");
            numArray[i] = sc.nextInt();
        }

        
        System.out.println("You have entered : ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(numArray[i] + ",");
        }
        System.out.println(numArray[numArray.length - 1]);

        
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {

            
            if (numArray[i] > numArray[j]) {
                    tempValue = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = tempValue;
                }
            }
        }

        
        System.out.println("Final array after the sorting : ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(numArray[i] + ",");
        }
        System.out.println(numArray[numArray.length - 1]);

    }


    
    //Sort Array String
    static void sortString(){
        int temp, size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value: ");
        String str = sc.nextLine();
        char charArray[] = str.toCharArray();
        size = charArray.length;
        for(int i = 0; i < size; i++ ) {
           for(int j = i+1; j < size; j++) {
              if(charArray[i]>charArray[j]) {
                 temp = charArray[i];
                 charArray[i] = charArray[j];
                 charArray[j] = (char) temp;
              }
           }
        }
        System.out.println("Third largest element is: "+Arrays.toString(charArray));
     }


    
}
