package SoalPASNo1;

//public class ArrayFunction {
//
//    public static void main(String[] args) {
//
//
//        int nilai[] = {81, 41, 73, 61, 40};
//
//        System.out.println(averageValue(nilai));
//        System.out.println(minValue(nilai));
//
//    }
//
//    static double averageValue(int[] nilai) {
//
//        double total = 0;
//        double average = 0;
//        double newAverage;
//
//        for (int i = 0; i < nilai.length; i++) {
//            total += nilai[i];
//        }
//
//        average = total / nilai.length;
//        System.out.println(total);
//        newAverage = Double.parseDouble((String.format("%.2f", average)));
//        return newAverage;
//    }
//
//    static int minValue(int[] nilai) {
//
//        int lowValue = nilai[0];
//
//        for (int i = 0; i < nilai.length; i++) {
//
//            if (lowValue > nilai[i]) {
//                lowValue = nilai[i];
//            }
//
//        }
//        return lowValue;
//    }
//
//}


public class ArrayFunction {
    public static void main(String[] args) {
        int[] array = {10,9,10,10};
        System.out.println("Nilai Terkecilnya yaitu  : " + minValue(array));
        System.out.println("Nilai rata ratanya yaitu : " + averageValue(array));
    }
    static double averageValue(int[] nilai){
        double total = 0;
        double average;


        for(int i = 0;i < nilai.length;i++){
            total = total + nilai[i];
        }
        average = total / nilai.length;
        double result = Double.parseDouble(String.format("%.2f", average));
        return result;
    }
    static int minValue(int[] nilai){
//        int total = 0;
        int minvalue = nilai[0];

        for(int i = 0;i < nilai.length;i++){
            if (minvalue > nilai[i]){              //minvalue(0) > nilai indeks ke 0
                minvalue = nilai[i];
            }
        }
        return minvalue;
    }

}
