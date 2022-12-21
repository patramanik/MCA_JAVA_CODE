//inheritens

class A
{
 void show()
  {
   System.out.println("I am in super class A");
  }


}

class B extends A
{
   void show()
  {
   System.out.println("I am in sub class b");
  }

}

class Ranpoly
{
 public static void main(String args[])
  {
    
    B b=new B();
    b.show();
  }

}