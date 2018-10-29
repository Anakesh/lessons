package lesson5;

import lesson5.battleunit.BattleUnit;
import lesson5.battleunit.Knight;
import lesson5.battleunit.Spearman;

public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight(100, 20);
        Knight knight1 = new Knight(100, 20);

        knight.attack(knight1);
    }
}
