//inheritens

class A
{
 void show1()
  {
   System.out.println("I am in super class A");
  }


}

class B extends A
{
   void show2()
  {
   System.out.println("I am in sub class b");
  }

}

class Poly
{
 public static void main(String args[])
  {
    A a=new A();
    B b=new B();
    a.show1();
    b.show2();
    //a.show2();
    b.show1();
  }

}