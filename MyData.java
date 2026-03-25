public class MyData {
    int[] data;
    int size;

    MyData(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    MyData() {
        this(100);
    }

    int add(int newValue) {
        data[size] = newValue;
        size++;

        return size;
    }

    void printAll() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += data[i] + " ";
        }
        System.out.println(s);
    }

    public void clone (MyData d) {
        for (int i = 0; i < size; i++) {
            d.add(data[i]);
        }
    }

    public void swap(int indexI, int indexJ) {
        int temp = data[indexI];
        data[indexI] = data[indexJ];
        data[indexJ] = temp;
    }

    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < size; j++) {
                if(data[j] < data[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            swap(i, smallestIndex);
        }
    }
}