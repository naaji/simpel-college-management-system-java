

package javaapplication150;

public class collegeofeng extends  Student
{
   private double GbaforRegst;

    public collegeofeng(String firstname, String lastname, int GBA) {
        super(firstname, lastname, GBA);
    }

	
   
   
  
	public  int GbaforRegst(int GBA)
	{
            if(GBA>60)
                System.out.println("you are accepted in the college of computer eng");
		
              
                
               
        if(GBA<60)
    
                        System.out.println("you are not  accepted in the college of computer eng");
       
                         
                       
        return GBA;
        }
	
	
        public void collegeofeng(String lastname,String firstname){
             firstname= firstname;
             lastname = lastname;
             
        }
 
}
