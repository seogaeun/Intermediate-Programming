public class ArrayEx {
    public static void main(String[] args) {
        int[] x = new int[15];
        int[] y = new int[15];

        for (int i=0; i<x.length; i++){
            x[i]=i;
            y[i]=x.length - i -1;
        }

        for (int element:x){
            System.out.println(element);
        }

        for(int i=0; i<x.length; i++){
            y[i] = x[i];
        }
    }
}
