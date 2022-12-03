class Pr14_2_PasingByRef{
    int num;
    
    Pr14_2_PasingByRef(int num){
        this.num = num;
    }

    void method(Pr14_2_PasingByRef ref){
        System.out.println("Num of Ref is " + ref.num);
    }

    public static void main(String[] args){
        Pr14_2_PasingByRef obj = new Pr14_2_PasingByRef(50);
        obj.method(obj);
    }
}