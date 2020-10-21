
public class TamGiac extends Dagiac implements Comparable<TamGiac>{
    int id;
    int sideA;
    int sideB;
    int sideC;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSide(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public TamGiac(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public TamGiac(){}
    @Override
    public int getPerimeter(int[] sideValue) {
        int Circ = 0;
        for (int j : sideValue) {
            Circ += j;
        }
        ;
        return Circ;
    }

    @Override
    public void getSide(int[] sideValue) {
        for (int j : sideValue) {
            System.out.println(j);
        }
    }

    public boolean isTriangle(int a, int b, int c){
        return a + b > c && a + c > b && b + c > a;
    }

    public double getArea(){
        double p = Double.parseDouble(String.valueOf((sideA + sideB + sideC)/2));
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    public String toString(){
        return "triangle id: " + getId() + " with 3 sides: " + getSideA() + ", " + getSideB() + ", " + getSideC() +
                " and area: " + getArea();
    }


    @Override
    public int compareTo(TamGiac o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
