
public class Dagiac {
    private int sideNum;
    private int[] sideValue;

    public Dagiac(){}
    public Dagiac(int sideNum, int[] sideValue){
        this.sideNum = sideNum;
        this.sideValue = sideValue;
    }

    public int getPerimeter(int[] sideValue){
        int Circ = 0;
        for (int i = 0; i < sideValue.length; i++) {
            Circ += sideValue[i];
        }
        return Circ;
    }

    public void getSide(int[] sideValue){
        for (int i = 0; i < sideValue.length; i++) {
            System.out.println(sideValue[i]);
        }
    }


}
