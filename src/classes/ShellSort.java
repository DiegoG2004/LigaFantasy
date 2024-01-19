package classes;


public class ShellSort {
	public static void shellSort(Equipo[] array) {
	    int n = array.length;

	    for (int gap = n / 2; gap > 0; gap /= 2) {
	        for (int j = gap; j < n; j++) {
	            int currentIndex = j;
	            Equipo value = array[j];

	            while (currentIndex >= gap && (
	                    array[currentIndex - gap].puntos < value.puntos ||
	                    (array[currentIndex - gap].puntos == value.puntos &&
	                     array[currentIndex - gap].getDiferenciaGoles() < value.getDiferenciaGoles()) ||
	                    (array[currentIndex - gap].puntos == value.puntos &&
	                     array[currentIndex - gap].getDiferenciaGoles() == value.getDiferenciaGoles() &&
	                     array[currentIndex - gap].golesFavor < value.golesFavor))) {
	                swap(array, currentIndex - gap, currentIndex);
	                currentIndex -= gap;
	            }
	        }
	    }
	}

    private static void swap(Equipo[] array, int left, int right) {
        Equipo temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }
}