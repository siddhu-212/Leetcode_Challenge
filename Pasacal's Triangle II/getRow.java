import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        long value = 1;

        row.add(1);

        for (int i = 0; i < rowIndex; i++) {

            value = value * (rowIndex - i) / (i + 1);

            row.add((int) value);
        }

        return row;
    }
}