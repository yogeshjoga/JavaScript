public class  ex {


    public static int rev(String str){

        int o= 0,x= 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'o'){
                o=i+1;
            }else if(str.charAt(i) == 'x'){
                x=i+1;
            }
        }

        System.out.println(x+" " + o);

        return 0;
    }

   public static void bubbleSort(int[] arr){

       for(int i=0; i<arr.length-1; i++){
          for(int j=0; j<arr.length -i -1; j++){
                if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
          }
            
       }
       for(int i : arr){
        System.out.println(i);
       }
   }

   public static void selectionSort(int[] arr){
         
         
          for(int i=0; i<arr.length-1; i++){
             int small =i;
              for(int j=i+1; j<arr.length; j++){
                       if(arr[small] > arr[j]){
                        small = j;
                       }
              }

              int temp = arr[small];
              arr[small] =  arr[i];
               arr[i] = temp;
          }
          for(int i: arr){
            System.out.println(i);
          }
   }


    public static void main(String[] args) {

        // String str = "x...o.x...o";
        // rev(str);
        int[] arr ={12,2,1,3,4,5,6};
       // bubbleSort(arr);
        selectionSort(arr);
    }
    
}
