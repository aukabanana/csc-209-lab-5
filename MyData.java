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
    
    int add(int newValue){
        data[size] = newValue;
        size++;

        return size;
    }

    void printAll() {
        String s = "";
        for(int i=0; i<size; i++){
            s += data[i] + " ";
        }
        System.out.println(s);
    }
}