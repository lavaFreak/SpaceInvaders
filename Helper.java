public class Helper {
    public static int[] getPolyPoints(char var,int n,int radius){
        int[] temp = new int[n];
        for (int i = 0; i < n; i++){
            temp[i] = (int) (radius*
                    (var == 'x' ? Math.cos((2/n)*i*Math.PI):
                            Math.sin((2/n)*i*Math.PI)));
        }
        return temp;
    }
}
