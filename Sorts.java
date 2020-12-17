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
 /**Bubble sort of an int array.
 *@postcondition The array will be modified such that the elements will be in increasing order.
 *@param data  the elements to be sorted.
 */
 // public static void bubbleSort(int arr[]) {
 //   int n = arr.length;
 //   for (int i = 0; i < n-1; i++){
 //     for (int j = 0; j < n-i-1; j++){
 //       if (arr[j] > arr[j+1]){
 //         int temp = arr[j];
 //         arr[j] = arr[j+1];
 //         arr[j+1] = temp;
 //       }
 //     }
 //   }
 // }

 // public static void bubbleSort(int[] data){
 //     for (int i=0; i<data.length; i++){
 //         for (int j=0; j<data.length-1-i; j++){
 //             if (data[j]>data[j+1]){
 //                 int temp=data[j];
 //                 data[j]=data[j+1];
 //                 data[j+1]=temp;
 //               }
 //           }
 //       }
 // }

}
