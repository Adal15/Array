import java.util.*;
public class linears136 {
   public static int LinearSearch(int numbers[],int key){
      for(int i=0;i<numbers.length;i++){
         if(numbers[i]==key){
            return i;
         }  
      }
      return -1;
   }
   public static void main(String[] args) {
    int numbers[]={2,4,6,10,12,16,45};
    int key=10;

    int index= LinearSearch(numbers, key);
    if(index ==-1){
      System.out.println("not  found");
    }else{
      System.out.println("key is at index :"+ index);
    }
   }
}
