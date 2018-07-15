public class atest {
    public static void main(String[] args) throws Exception{
        people a = new people();
        System.out.println(a);
        Object b = a.clone();  // 并不会调用构造方法
        System.out.println(b);
        people c = a.getClass().newInstance();
        System.out.println(c);
    }
}

class people implements Cloneable{
    people(){
        System.out.println("i am a person");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("u am a person");
        return super.clone();
    }
}
