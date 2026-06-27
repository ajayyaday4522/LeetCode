import java.util.ArrayList;

class StockSpanner {
    ArrayList<Integer> arrList = new ArrayList<>();

    public StockSpanner() {
    }

    public int next(int price) {
        arrList.add(price);

        int count = 1;

        for (int i = arrList.size() - 2; i >= 0; i--) {
            if (arrList.get(i) <= price) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}