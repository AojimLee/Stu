/**
 * Created by MSI on 2018/7/25.
 */
public class Test6 {
    public void main(String[] args){
        Outer.Inner mm= new Outer().new Inner();
        mm.show();

    }
}

class Outer {
    public int num = 10;
    class Inner {
        public int num = 20;
        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}