public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        double sum=0,harmonicAverage;

        for(int i=0; i<array.length; i++){
            sum += (double) 1 /array[i];
        }

        harmonicAverage = array.length/sum;

        System.out.println(harmonicAverage);
    }
}
