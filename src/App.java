import Algorithms.Sorting.BubbleSort;
import Algorithms.Sorting.InsertionSort;
import Algorithms.Sorting.MergeSort;
import Algorithms.Sorting.QuickSort;
import Algorithms.Sorting.SelectionSort;
import DataStructures.Linear.Queue;
import Utils.Helper;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // Stack stack = new Stack(5);
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // stack.push(5);
        // stack.display();
        // System.out.println(stack.pop());
        // stack.display();

        // int[] arr = {3, -2, 4, 45, 0};
        // BubbleSort sort = new BubbleSort();
        // SelectionSort sort = new SelectionSort();
        // InsertionSort sort = new InsertionSort();
        // MergeSort sort = new MergeSort();
        // QuickSort sort = new QuickSort();
        // sort.sort(arr);
        // Helper.printArray(arr);

        Queue queue = new Queue(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);

        queue.display();

        System.out.println("Dequeued: " + queue.deQueue());
        queue.display();

        System.out.println("Front Element: " + queue.peek());

        queue.enQueue(50);
        queue.display();

        System.out.println("Dequeued: " + queue.deQueue());
        System.out.println("Dequeued: " + queue.deQueue());
        queue.display();

        queue.enQueue(60);
        queue.display();
    }
}
