package ex01;

public class HW01 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      int[][] arr = new int[5][5];
      int count = 1;
      int row = 0;
      int col = -1;
      
      int size = 5;
      while (size > 0) {
         
         for (int i=0;i<size;i++) {
            col++;
         arr[row][col] = count++;
      }
      size--;
      if (size==0) break;
      
      for (int i=0;i<size;i++) {
         row++;
         arr[row][col] = count++;
      }
      for (int i=0;i<size;i++) {
         col--;
         arr[row][col] = count++;
      }
      size--;
      if (size==0) break;
      
      for (int i=0;i<size;i++) {
         row--;
         arr[row][col] = count++;
      }
      }
      for (int i=0;i<arr.length;i++) {
         for (int j=0;j<arr[i].length;j++) {
            System.out.printf(arr[i][j]+"\t");
         }
         System.out.println();
      }
      }
      }