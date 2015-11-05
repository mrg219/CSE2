public class arraysort {
    public static void main(String[] args) {
      int[] array1 = new int[20];
      int[] array2 = new int[10];
      int[] array3 = new int[30];
      for(int i = 0; i < array1.length; i++) {
          array1[i] = (int)(Math.random()*100);
          array3[i]=array1[i];
      }
      for(int i = 0; i < array2.length; i++) {
          array2[i] = (int)(Math.random()*100);
          array3[i+20]=array2[i];
      }
      sort(array1);
      System.out.println("");
      sort(array2);
      System.out.println("");
      sort(array3);
      System.out.println("");
    }
      public static void sort(int[] array1) {
          int x;
          for(int j = 0; j < array1.length; j++) {
              for(int k =0; k <array1.length; k++) {
                  if(array1[j] < array1[k]) {
                      x = array1[k];
                      array1[k] = array1[j];
                      array1[j] = x;
                  }
              }
          }
          for (int l =0; l<array1.length; l++) {
                          System.out.print(array1[l]+" ");
                      }
      }
}