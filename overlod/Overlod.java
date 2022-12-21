//no of peramitar

class Area

{
      int ar,br;
      int a(int x,int y)
      {
        ar=(x*y);
        return(ar);
      }

      int a(int x)
      {
       br=(x*1);
       return(br);
      }
}

class Overlod
{
  public static void main(String args[])
  
      {
        Area obj=new Area();
        obj.a(500,5000);
        obj.a(50);
        System.out.println("Area is "+obj.ar);
        System.out.println("Area is "+obj.br);
      }
}