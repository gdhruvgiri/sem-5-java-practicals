class Pr14_4_ReturningRef{
    int num = 101;
    Pr14_4_ReturningRef method() { 
        return new Pr14_4_ReturningRef(); 
    }

    public static void main(String[] args){
        Pr14_4_ReturningRef obj = new Pr14_4_ReturningRef();
        System.out.println("obj num is " + obj.num);
        System.out.println("Method num is " + obj.method().num);
    }
}