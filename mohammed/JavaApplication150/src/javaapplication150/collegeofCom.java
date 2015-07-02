

package javaapplication150;

public class collegeofCom extends Student
{
	
       collegeofCom(String firstname,String lastname,int GBA)
	{
			this.firstname=firstname;
                        this.lastname =lastname;
                        this.GBA =GBA;
    
	
   
        }
	public collegeofCom(String f,String l)
	{
		firstname=f; 
                lastname=l; 
                
                
                
	}

   
   
  
	public int GbaforRegst()
	{
            if(GBA>60)
                System.out.println("you are accepted in the college of computer sience");
		
              
                
               
        if(GBA<60)
    
                        System.out.println("you are not  accepted in the college of computer sience");
       
                         
                       
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

