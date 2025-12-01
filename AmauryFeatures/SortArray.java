package AmauryFeatures;

import java.util.Arrays;

class SortArray {

  static void sortArray(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < (array.length - i) - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    System.out.println("The sorted array is: " + Arrays.toString(array));
  }

  public static void main(String[] args) {

    int[] arrayToSort = { 6, 3, 7, 8, 2 };

    sortArray(arrayToSort);

  }

}