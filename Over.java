//paramitarised constracter

class A
{
  int a;
  A(int l,int b)
    {
      a= l*b;
     }
     A(int l)
     {
       a=l*l;
     }
}

class Overprm
{
  public static void main(String args[])

  {
    A ob1=new A(5,6);
    System.out.println("the area is= "+ob1.a);
    A ob2=new A(4);
    System.out.println("the area is= "+ob2.a);  
  }
}