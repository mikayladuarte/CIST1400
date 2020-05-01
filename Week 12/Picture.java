public class Picture {
   // Instance variables
   private int size;
   private boolean color;
   private String format;
   
   // Default constructor
   public Picture() {
      setSize(0);
      setColor(true);
      setFormat("none");
   }
   
   // Overloaded constructor with size, format, and color inputs
   public Picture(int s, String f, boolean c) {
      setSize(s);
      setColor(c);
      setFormat(f);
   }
   
   // Getters
   public int getSize() {
      return this.size;
   }
   
   public boolean getColor() {
      return this.color;
   }
   
   public String getFormat() {
      return this.format;
   }
   
   // Setters
   public void setSize(int s) {
      if (s >= 0) 
      {
         this.size = s;
      }
   }
   
   public void setColor(boolean c) {
      this.color = c;
   }
   
   public void setFormat(String f) {
      switch (f.toLowerCase()) {
         case "bmp" : case "jpeg" : case "tiff" : case "png" : case "gif" :
            this.format = f.toLowerCase();
            break;
         default :
            this.format = "none";
      }
   }
   
   // Override methods
   public String toString() {
      String colorStr;
      if (this.color) 
      {
         colorStr = "color";
      }
      else
      {
         colorStr = "black and white";
      }
      
      return "Picture is " + colorStr + ", " + this.size + " kb big, and in " + this.format + " format"; 
   }
   
   public boolean equals(Picture other) {
      return (this.size == other.size && this.color == other.color && this.format.equals(other.format));
   }
}