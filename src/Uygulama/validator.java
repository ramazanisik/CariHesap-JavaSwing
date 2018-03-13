
package Uygulama;


public class validator {
    
    public boolean harfkontrol(String gelen)
    {
        boolean kontrol=true;
     for(Character harf:gelen.toCharArray())
     {
     if(!(Character.isAlphabetic(harf)))
     {
     kontrol=false;
     break;
     
     }
     
     }
    
    return kontrol;
    }
    public boolean rakamkontrol(String gelen)
    {
               boolean kontrol=true;
     for(Character harf:gelen.toCharArray())
     {
     if(!(Character.isDigit(harf)))
     {
     kontrol=false;
     break;
     
     }
     
     }
    
    return kontrol;
   
    }
    
}
