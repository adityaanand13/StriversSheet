import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public static void main(String[] args) {
    int[][] matrix = {{1, 3}, {2, 6}, {8, 9}, {9, 11}, {8, 10}, {2, 4}, {15, 18}, {16, 20}, {16, 17}};

    Arrays.sort(matrix, Comparator.comparingInt(a -> a[0]));

    System.out.println(Arrays.deepToString(matrix));

    List<List<Integer>> ans = new ArrayList<>();
    for (int i = 0; i < matrix.length - 1; i++) {
        //either list is empty in beginning
        //or last element in the list is smaller than the first one
        if (ans.isEmpty() || matrix[i][0] > ans.get(ans.size() - 1).get(1)) {
            ans.add(Arrays.asList(matrix[i][0], matrix[i][1]));
        } else {
            List<Integer> subInterval = ans.get(ans.size() - 1);
            subInterval.set(1, Math.max(matrix[i][1], subInterval.get(1)));
            ans.set(ans.size() - 1, subInterval);
        }
    }

    System.out.println("ans = " + ans);
}