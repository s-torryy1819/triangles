import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle {

    int leg1_1;
    int leg1_2;
    int leg2_1;
    int leg2_2;
    double leg1_3 = sqrt(pow(leg1_1, 2) + pow(leg1_2, 2));
    double leg2_3 = sqrt(pow(leg2_1, 2) + pow(leg2_2, 2));
    double square1;
    double square2;
    double perimeter1;
    double perimeter2;

    public Triangle(int leg1_1, int leg1_2, int leg2_1, int leg2_2){
        this.leg1_1 = leg1_1;
        this.leg1_2 = leg1_2;
        this.leg2_1 = leg2_1;
        this.leg2_2 = leg2_2;
    }

    public  void findSquare(){
        square1 = 0.5 * leg1_1 * leg1_2;
        square2 = 0.5 * leg2_1 * leg2_2;
    }
    public void findPerimeter(){
        perimeter1 = leg1_1 + leg1_2 + leg1_3;
        perimeter2 = leg2_1 + leg2_2 + leg2_3;
    }
     void areSimilar(){
        if(leg1_1 % leg2_1 == leg1_2 % leg2_2){
            System.out.println("Triangles are similar");
        }
        else{
            System.out.println("Triangles are NOT similar");
        }
    }
}
