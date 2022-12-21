//Types of peramitars

class Area

{
      int ar;
      float br;
      int a(int x,int y)
      {
        ar=(x*y);
        return(ar);
      }

      float a(float x,float y)
      {
       br=(x*1);
       return(br);
      }
}

class Overlod1
{
  public static void main(String args[])
  
      {
        Area obj=new Area();
        obj.a(500,5000);
        obj.a(50.0f,20.0f);
        System.out.println("area is "+obj.ar);
        System.out.println("area is "+obj.br);
      }
}