import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.pop();
        System.out.println(stack.peek());
        Queue<Character> queue = new LinkedList<>();
        queue.add('a');
        queue.add('b');
        queue.add('c');
        queue.add('d');
        System.out.println(queue.toString());
        queue.poll();
        System.out.println(queue.toString());


    }
    @Test

    public void test1() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);
        System.out.println(queue);
        while (queue.isEmpty() == false) {
            System.out.printf("%d", queue.remove());
        }




    }
}
