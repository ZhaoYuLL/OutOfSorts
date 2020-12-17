public class Sorts{

 public static void bubbleSort(int[] data){
   boolean sorted = false;
   int length = data.length-1;
   while(!sorted){
     sorted = true;
     for(int i = 0; i < length; i ++){
       if(data[i] > data[i+1]){
         int temp = data[i];
         data[i] = data[i+1];
         data[i+1] = temp;
         sorted = false;
       }
     }
     length--;
   }
 }

}
