import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 1 to Sort Integer OR 2 to Sort String");
        int n = sc.nextInt();
        if(n == 1)
        sortInt();
        else if(n == 2)
        sortString();

        }

    //Sort Array Integer   
    static void sortInt(){


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
