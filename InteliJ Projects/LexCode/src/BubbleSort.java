class Tester37 {

    public static void sortArray(int arr[]) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }

    public static int findMaxSum(int arr[], int m) {
        // Implement your logic here and change the return statement accordingly
        if(arr.length < m){return 0;}
        int sum = 0;
        for(int i=arr.length-m; i<=arr.length-1; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int findMinSum(int arr[], int m) {
        // Implement your logic here and change the return statement accordingly
        if(arr.length < m){return 0;}
        int sum = 0;
        for(int i=0; i<m; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        sortArray(arr);
        System.out.println("Maximum Sum for m=4: " + findMaxSum(arr, 4));
        System.out.println("Minimum Sum for m=3: " + findMinSum(arr, 3));
    }

}

