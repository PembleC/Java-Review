import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Tester15 {

//    public static List<String> sortSales(Map<String, Integer> sales) {
//        //Implement your logic here and change the return statement accordingly
//        List<String> employees = new ArrayList<String>();
//        Integer max = 0;
//        String name = "";
//
////        while(sales.size() > 1) {
////            for (Map.Entry<String, Integer> sale : sales.entrySet()) {
////                System.out.println(sale.getKey() + ", " + sale.getValue());
////                if (sale.getValue() > max) {
////                    max = sale.getValue();
////                    name = sale.getKey();
////                }
////            }
////            employees.add(name);
////            sales.remove(name);
////        }
//
//        return null;
//    }

    public static List<String> sortSales(Map<String, Integer> sales) {
        //Implement your logic here and change the return statement accordingly
        Map<String, Integer> salesNew = new HashMap<String, Integer>();
        List<String> employees = new ArrayList<String>();

        int saleSize = sales.size();

        for(int i=0;i<saleSize; i++) {
            int max = 0;
            String name = "";

            for (Map.Entry<String, Integer> sale : sales.entrySet()) {
                //System.out.println(sale.getKey() + ", " + sale.getValue());
                if (sale.getValue() > max) {
                    max = sale.getValue();
                    name = sale.getKey();
                }
            }
            employees.add(name);
            //System.out.println(employees);
            sales.remove(name);
            //System.out.println(sales);
            //System.out.println("max is: " + max + ", name is: " + name);
        }
        return employees;
    }



    public static void main(String args[]) {
        Map<String, Integer> sales = new HashMap<String, Integer>();
        sales.put("Mathew", 50);
        sales.put("Lisa", 76);
        sales.put("Courtney", 45);
        sales.put("David", 49);
        sales.put("Paul", 49);

        List<String> employees = sortSales(sales);

        System.out.println("Employees in the decreasing order of their sales\n=====================================");
        for (String employeeName : employees) {
            System.out.println(employeeName);
        }
    }

}