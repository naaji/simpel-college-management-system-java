

package javaapplication150;

public class collegeofCom 
{
	public String firstname,lastname;
	public int GBA;
        public String Adsesse;
    
	
   
	
	public collegeofCom(String f,String l)
	{
		firstname=f; 
                lastname=l; 
                
                
                
	}

    collegeofCom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
  
	public int GbaforRegst()
	{
            if(GBA>60)
                System.out.println("you are accepted in the college of computer sience");
		if(GBA<60)
              
                
               
        if(GBA<60)
    
                        System.out.println("you are not  accepted in the college sience");
                         
                       
        return GBA;
        }
	public int getGBA()
	{
		return GBA;
	}
	
	
	public void setGBA(int G)
	{
		GBA=G;
	}
	public String toString()
	{
		return firstname+" "+lastname+""+GBA+"GBA  = "+GbaforRegst();
	}
        
 
}

