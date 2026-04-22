
import java.time.YearMonth;

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
                    swap(j, j + 1);
                }
            }
        }
    }

    public void quickSort(int first, int last) {
        // ? Anchor is when there is only one item
        if (first >= last) {
            return;
        }

        int pivotIndex = first;
        int left = first + 1;
        int right = last;

        while (left <= right) {
            // ? Left search for a number that is bigger than pivot
            while (left <= last && data[left] < data[pivotIndex]) {
                left++;
            }
            // ? Right search for a number that is lower than pivot
            while (right >= first && data[right] > data[pivotIndex]) {
                right--;
            }

            if (left < right) {
                swap(left, right);
                left++;
                right--;
            }
        }
        swap(pivotIndex, right);
        quickSort(first, right - 1);
        quickSort(right + 1, last);
    }

    public void mergeSort(int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(first, mid);
            mergeSort(mid + 1, last);
            merge(first, last);
        }
    }

    public void merge(int first, int last) {
        int[] result = new int[last - first + 1];
        int mid = (first + last) / 2;
        int iResult = 0;
        int left = first;
        int right = mid + 1;

        while (left <= mid && right <= last) {
            if (data[left] < data[right]) {
                result[iResult] = data[left];
                iResult++;
                left++;
            } else {
                result[iResult] = data[right];
                iResult++;
                right++;
            }
        }

        while (left <= mid) {
            result[iResult] = data[left];
            iResult++;
            left++;
        }

        while (right <= last) {
            result[iResult] = data[right];
            iResult++;
            right++;
        }

        for (iResult = 0; iResult < last - first + 1; iResult++) {
            data[first + iResult] = result[iResult];
        }
    }

    public void radixSort() {
        int radix = 10;
        int digits = 5;

        ourQueue[] q = new ourQueue[10];

        for (int i = 0; i < radix; i++) {
            q[i] = new ourQueue(30);
        }
        int factor = 1;
        for (int pass = 1; pass <= digits; factor *= radix, pass++) {
            for (int datai = 0; datai < size; datai++) {
                q[(data[datai] / factor) % radix].enqueue(data[datai]);
            }

            int datai = 0;
            for (int i = 0; i < radix; i++) {
                while (!q[i].isEmpty()) {
                    data[datai++] = q[i].dequeue();
                }
            }
        }
    }

}