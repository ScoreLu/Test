package co;

class Div implements Compute{
    public int computer(int a, int b)
    {
        if(b == 0)
        {
            System.out.println("��ĸΪ0");
            return 0;
        }
        else
        {
            return a / b;
        }
    }
}