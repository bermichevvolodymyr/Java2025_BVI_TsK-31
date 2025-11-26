public class Zavd2_2 {
    public int sumElementGreaterThan3(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
           if(array[i]>3){
               sum += array[i];
           }

        }
        return sum;
    }
    public static void main(String[] args) {
        Zavd2_2 obj = new Zavd2_2();
        int[] array = {1,2,3,4};
        System.out.println(obj.sumElementGreaterThan3(array));
    }
}
