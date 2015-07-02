

package javaapplication150;

public class collegeofeng extends  Student
{
	collegeofeng(String firstname,String lastname,int GBA)
	{
			this.firstname=firstname;
                        this.lastname =lastname;
                        this.GBA =GBA;
    
	
   
        }
         public collegeofeng(String f,String l)
	{
		firstname=f; 
                lastname=l; 
                
                
                
	}
	public int GbaforRegst()
	{
		 if(GBA>80)
                System.out.println("you are accepted in the college eng");
	
              
                
               
        if(GBA<100)
    
                        System.out.println("you are not  accepted in the college eng");
                         
                       
        return  GBA;
             
        }		
        
        	public int getGBA()
	{
		return GBA;
	}
	
	
	public void setGBA(int G)
	{
		GBA=G;
	}
	}	 
