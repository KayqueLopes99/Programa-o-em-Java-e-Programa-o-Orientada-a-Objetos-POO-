package Udemy.Aula_16_Classes_Métodos_Genericos_Object.CalculationServices;

import java.util.List;

public class CalculationService {

    // tipo extendido da subtipo da classe comparable segundo o tipo dela.
    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
