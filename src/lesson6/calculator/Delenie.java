package lesson6.calculator;

public class Delenie extends Action
{
    public Delenie(int var1, int var2)
    {
        super(var1, var2);
        this.work();
    }

    public void work()
    {
        if(this.getVar2() == 0)
        {
            System.out.println(228.4);
            return;
        }
        System.out.println(this.getVar1()/this.getVar2());
    }
}
