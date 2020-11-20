import java.util.LinkedList;
import java.util.List;

class Testerasdf {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        //Implement your logic here and change the return statement accordingly
        List<Integer> newList = new LinkedList<Integer>();

        for(Integer index : list){
            if(!newList.contains(index)){
                newList.add(index);
            } else { continue;}
        }

        return newList;
    }

    public static void main(String args[]) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(15);
        list.add(21);
        list.add(15);
        list.add(10);

        List<Integer> updatedList = removeDuplicates(list);

        System.out.println("Linked list without duplicates");
        for (Integer value : updatedList) {
            System.out.print(value+" ");
        }
    }

}