interface P1{
    final int p1 = 1;
    void dspl1();
}
interface P2{
    final int p2 = 2;
    void dspl2();
}
interface P12 extends P1, P2{
    final int p12 = 12;
    void dspl12();
}

class Q implements P12{
    public void dspl1(){
        System.out.println("P1 : " + p1);
    }
    public void dspl2(){
        System.out.println("P2 : " + p2);
    }
    public void dspl12(){
        System.out.println("P12 : " + p12);
    }
}

class Pr19_Interface{
    public static void main(String[] args){
        Q obj = new Q();
        obj.dspl1();
        obj.dspl2();
        obj.dspl12();
    }
}