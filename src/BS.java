import java.util.ArrayList;
import java.util.List;

public class BS {

    public static void main (String args[]){
        ArrayList<Integer> list = new ArrayList();

        list.add(0);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(21);
        list.add(23);
        list.add(24);
        list.add(34);
        list.add(39);
        list.add(45);

        for (int i: list){
            System.out.println(binarySearch(list, i));
        }


    }

    public static int binarySearch(List<Integer> x, Integer goal) {
        int start = 0;
        int end = x.size()-1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (x.get(middle) == goal) {
                return middle;
            } else if (x.get(middle) < goal) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}

