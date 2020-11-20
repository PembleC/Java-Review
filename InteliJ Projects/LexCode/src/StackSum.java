
class Tester22 {

    public static void main(String args[]) {

        Stack stack = new Stack(10);
        stack.push(15);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        calculateSum(stack);

        System.out.println("Updated stack");
        stack.display();
    }

    public static void calculateSum(Stack stack) {
        //Implement your code here
        int array[] = new int[50];
        int sum = 0;
        int count = 0;

        while(!stack.isEmpty()){
            array[count] = stack.peek();
            sum += stack.pop();
            count++;
        }

        stack.push(sum);

        for(int i=count-1; i>=0; i--){
            stack.push(array[i]);
        }
    }
}




