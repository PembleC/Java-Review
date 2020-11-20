import java.util.ArrayDeque;
import java.util.*;

class Tester35 {

    public static Deque<Character> updateStack(Deque<Character> inputStack) {
        //Implement your logic here and change the return statement accordingly
        Deque<Character> updatedStack = new ArrayDeque<Character>();
        int size = inputStack.size();
        System.out.println(size);
        for(int i=0; i<size-3; i++){
            System.out.println(i);
            updatedStack.addLast(inputStack.poll());
        }
        Iterator <Character> it = inputStack.descendingIterator();
        while(it.hasNext()){
            updatedStack.addFirst(it.next());
        }

        return updatedStack;
    }

    public static void main(String[] args) {

        Deque<Character> inputStack = new ArrayDeque<Character>();
        inputStack.push('E');
        inputStack.push('D');
        inputStack.push('C');
        inputStack.push('B');
        inputStack.push('A');

        Deque<Character> resultStack = updateStack(inputStack);

        System.out.println("The alphabets in updated stack are:");
        for(Character alphabet: resultStack)
            System.out.println(alphabet);
    }
}