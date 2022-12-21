class Area
{
  public static void main(String args[])
  
  {
    int a=5,b=6;
    Akg obj=new Akg();
     obj.area(a,b);
   System.out.println("area is "+obj.ar);
    
  }
}

class Akg
{
    int ar;
    int area(int x,int y)
     {
        ar=x*y;
        return(ar);
     }
}
