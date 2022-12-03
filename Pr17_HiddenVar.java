
class A{
   static int x;
   A(int x){
        this.x = x;
   }
}

class B extends A{
    int x;
    B(int a, int b){
        super(a);
        this.x = b;
    }
    void dspl(){
        System.out.println("X in A is " + super.x);
        System.out.println("X in B is " + this.x);
    }
}

class Pr17_HiddenVar{
    public static void main(String[] args){
        B obj = new B(10,20);
        obj.dspl();
    }
}