package ua.lviv.lgs.task1;

public class Methods {
    private int a;
    private int b;

    public Methods(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void Summ() throws IllegalAccessException, MyException {
        ghu();
        double result = a + b;
        System.out.println(result);
    }

    public  void Rests() throws IllegalAccessException, MyException {
        ghu();
        double result = a - b;
        System.out.println(result);
    }

    public void Multi() throws IllegalAccessException, MyException {
        ghu();
        double result = a*b;
        System.out.println(result);
    }

    public void Divis () throws IllegalAccessException, MyException {
        ghu();
        double result = a / b;
        System.out.println(result);
    }

    public void ghu() throws MyException, IllegalAccessException {
        if(this.a<0 && this.b<0){
            throw new IllegalArgumentException("A and B smoller than 0");
        }
         if((this.a==0 && this.b!=0) || (this.a!=0 && this.b==0)){
            throw new ArithmeticException("A or B is not 0");
        }
         if(this.a==0 && this.b == 0) {
            throw new IllegalAccessException("A and B equal 0");
        }
         if(this.a>0 && this.b>0) {
            String sos = ("Big problem ");
            throw new MyException(sos);
        }
    }


}
