package lesson6.calculator2;

import lesson5.battleunit.BattleUnit;

import java.util.LinkedList;

public class Calculator{


    public static void main(String[] args){
        Calculate plus =new Plus();
        plus.excec(0.4,0.5);






        Calculate minus=new Minus();
        minus.excec(0.6,0.3);
        Calculate Delenie=new Delenie();
        Delenie.excec(4,2);
        Calculate Umnojenie=new Umnojenie();
        Umnojenie.excec(5,2);
    }
}
