package lesson6.calculator2;

public class Delenie extends Calculate {
    @Override
    void excec(double a,double b){
        if(b==0){
            System.out.println("Делить на ноль нельзя");
        }else{
            System.out.println(a/b);
        }
    }
}
