package classes;

public class ShellSort {
	public static void shellSort(int[] array) {
        int n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int j = gap; j < n; j++) {
                int currentIndex = j;
                int value = array[j];

                while (currentIndex >= gap && array[currentIndex - gap] > value) {
                    swap(array, currentIndex - gap, currentIndex);
                    currentIndex -= gap;
                }
            }
        }
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }

}
