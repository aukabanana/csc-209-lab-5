public class SortingLab {
    public static void main(String[] args) {
        MyData d1 = new MyData(60);
        d1.add(60); d1.add(400); d1.add(93);
        d1.add(200); d1.add(20); d1.add(40);
        d1.add(32); d1.add(21); d1.add(33);
        d1.add(500); d1.add(903); d1.add(2);
        d1.add(66); d1.add(70); d1.add(333);
        d1.add(111);
        
        System.out.print("Original:           ");
        d1.printAll();

        MyData d2 = new MyData(60);
        d1.clone(d2);
        System.out.print("Selection Sort:     ");
        d2.selectionSort();
        d2.printAll();

        MyData d3 = new MyData(60);
        d1.clone(d3);
        System.out.print("Insertion Sort:     ");
        d3.insertionSort();
        d3.printAll();

        MyData d4 = new MyData(60);
        d1.clone(d4);
        System.out.print("Bubble Sort (L-H):  ");
        d4.bubbleSortLowToHigh();
        d4.printAll();

        MyData d5 = new MyData(60);
        d1.clone(d5);
        System.out.print("Bubble Sort (H-L):  ");
        d5.bubbleSortHighToLow();
        d5.printAll();

        MyData d6 = new MyData(60);
        d1.clone(d6);
        System.out.print("Quick Sort:         ");
        d6.quickSort(0, d6.size-1);
        d6.printAll();

    }
}