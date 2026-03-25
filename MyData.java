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

    public void clone(MyData d) {
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
                if (data[j] < data[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            swap(i, smallestIndex);
        }
    }

    public void insertionSort() {
        for (int i = 1; i < size; i++) {
            int insertedData = data[i];
            int j;
            for (j = i - 1; j >= 0 && data[j] > insertedData; j--) {
                data[j + 1] = data[j];
            }
            data[j + 1] = insertedData;
        }
    }

    public void bubbleSortLowToHigh() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (data[j] < data[j - 1]) {
                    swap(j, j - 1);
                }
            }
        }
    }

    public void bubbleSortHighToLow() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (data[j] > data[j + 1]) {
                    swap(j , j + 1);
                }
            }
        }
    }

}