public class SortingLab {
    public static void main(String[] args) {
        MyData d1 = new MyData(60);
        d1.add(60);
        d1.add(400);
        d1.add(93);
        d1.add(200);
        d1.add(20);
        d1.add(40);
        d1.add(32);
        d1.add(21);
        d1.add(33);
        d1.add(500);
        d1.add(903);
        d1.add(2);
        d1.add(66);
        d1.add(70);
        d1.add(333);
        d1.add(111);
        d1.printAll();

        System.out.print("Selection Sort: ");
        d1.selectionSort();
        d1.printAll();
    }
}
