import java.util.*;

public class StoreEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 7, 23, 9, 45, 2, 8, 19, 30);

      
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        int n = evenNumbers.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (evenNumbers.get(j) < evenNumbers.get(minIndex)) {
                    minIndex = j;
                }
            }
         
            int temp = evenNumbers.get(minIndex);
            evenNumbers.set(minIndex, evenNumbers.get(i));
            evenNumbers.set(i, temp);
        }

        System.out.println("Sorted Even Numbers (Selection Sort): " + evenNumbers);
    }
}
