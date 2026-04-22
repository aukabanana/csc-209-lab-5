public class ourQueue {
    int[] element;
    int first;
    int last;
    int size;

    public ourQueue(int capacity) {
        element = new int[capacity];
        first = last = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int value) {
        if ((first == 0 && last == element.length - 1) || (first - 1 == last)) {
            System.out.println("Queue Is FULL");
            return;
        }
        element[last++] = value;

        if (last == element.length) {
            last = 0;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Is Empty");
            return -1;
        }

        int dataOut = element[first++];
        if (first == element.length) {
            first = 0;
        }

        size--;
        return dataOut;
    }
}