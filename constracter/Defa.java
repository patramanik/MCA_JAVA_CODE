class And
  {
     int ram;
     boolean mar;
     String abcd;

   And()
       {
       ram=12;
       mar=true;
       abcd="mca";
       }
}
class Defa
{
   public static void main(String args[])

    {
     And ob1=new And();
     System.out.println("int= "+ob1.ram);
     And ob2=new And();
     System.out.println("boolean= "+ob2.mar);
     And ob3=new And();
     System.out.println("string= "+ob3.abcd);
    }
}