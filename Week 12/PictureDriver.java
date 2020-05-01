// This file will test your implementation of the Picture class.

public class PictureDriver 
{
   public static void main(String[] args)
   {
        
      Picture p = new Picture();
      System.out.println("Size: " + p.getSize() + (p.getColor() ? " color " : " BW ") 
         + " Format: " + p.getFormat());
      
      Picture s = new Picture(90, "JPEG", false);
      System.out.println("Size: " + s.getSize() + (s.getColor() ? " color " : " BW ") 
         + " Format: " + s.getFormat());
      
      Picture y = new Picture(0, "TIff", true);
      System.out.println("Size: " + y.getSize() + (y.getColor() ? " color " : " BW ") 
         + " Format: " + y.getFormat());
      
      Picture z = new Picture(5, "mmm", true);
      System.out.println("Size: " + z.getSize() + (z.getColor() ? " color " : " BW ") 
         + " Format: " + z.getFormat());
      
      System.out.println("s is " + s);
      System.out.println("y is " + y);
      System.out.println("z is " + z);
      
      s.setSize(10);
      System.out.println("s is " + s);
      s.setSize(0);
      System.out.println("s is " + s);
      s.setSize(500);
      System.out.println("s is " + s);
      
      s.setFormat("BMP");
      System.out.println("s is " + s);
      s.setFormat("png");
      System.out.println("s is " + s);
      s.setFormat("Gif");
      System.out.println("s is " + s);
      s.setFormat("jpg");
      System.out.println("s is " + s);
      s.setFormat("jpeg");
      System.out.println("s is " + s);
      s.setFormat("mmm");
      System.out.println("s is " + s);
      s.setFormat("tiff");
      System.out.println("s is " + s);
   
      Picture abc = new Picture(10, "TIff", true);
      Picture def = new Picture(10, "tiff", true);
      Picture ghi = new Picture(10, "png", true);
      
      if (abc.equals(def)) 
      {
         System.out.printf("These two Picture objects are equal:\n\t%s\n\t%s\n\n",
            abc, def);
      }
      else
      {
         System.out.println("equals() method does not work correctly for objects abc and def!");
      }

      if (abc.equals(ghi)) 
      {
         System.out.println("equals() method does not work correctly for objects abc and ghi!");
      }
      else
      {
         System.out.printf("These two Picture objects are not equal:\n\t%s\n\t%s\n\n",
            abc, ghi);
      }
   
   }
   
}