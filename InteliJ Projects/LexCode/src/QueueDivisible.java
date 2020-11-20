
class Tester23 {

    public static void main(String[] args) {

        Queue queue = new Queue(7);
        queue.enqueue(13983);
        queue.enqueue(10080);
        queue.enqueue(7113);
        queue.enqueue(2520);
        queue.enqueue(2500);

        Queue outputQueue = findEvenlyDivisibleNumbers(queue);

        System.out.println("Evenly divisible numbers");
        outputQueue.display();

    }

    public static Queue findEvenlyDivisibleNumbers(Queue queue) {
        //Implement your code here and change the return value accordingly

        Queue newQueue = new Queue(queue.getMaxSize());

        while(!queue.isEmpty()){
            int temp = queue.dequeue();
            boolean divis = true;
            for(int i=1; i<=10; i++){
                if(temp % i != 0){
                    divis = false;
                }
            }
            if (divis){
                newQueue.enqueue(temp);
            }
        }


        return newQueue;
    }
}
