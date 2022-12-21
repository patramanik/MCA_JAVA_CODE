class A
{
   int i=20;//static variable
   void fan()
    {
       i=100; //local Variable
       System.out.println("The value of local variable"+i);
     }
}
class Localins
{
   public static void main(String args[])
     
     {   
        A ob1=new A();
        ob1.i=50;//instance variable
       System.out.println("The value of instans variable is= "+ob1.i);
      }

}