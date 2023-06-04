package p1;
class Base
{
        int def=1;
        private int pri=2;
        public int pub=3;
        protected int pro=4;
        public Base()
        {
                System.out.println("In Base class In p1");
                System.out.println("default:"+def);
                System.out.println("private:"+pri);
                System.out.println("public:"+pub);
                System.out.println("protected:"+pro);
        }
}
class Derived extends Base
{
        Derived()
        {
                 //super();
                System.out.println("In Derived class In p1");
                System.out.println("default:"+def);
                System.out.println("protected:"+pro);
                System.out.println("public:"+pub);
        }
}
class NonSubClass
{
        NonSubClass()
        {
                Base b=new Base();
                System.out.println("In NonSubClass in p1");
                System.out.println("default:"+b.def);
                System.out.println("protected:"+b.pro);
                System.out.println("public:"+b.pub);
        }
}
public class Demo1
{
        public static void main(String args[])
        {
                Base b=new Base();
                Derived d=new Derived();
                NonSubClass n=new NonSubClass();
        }
}
