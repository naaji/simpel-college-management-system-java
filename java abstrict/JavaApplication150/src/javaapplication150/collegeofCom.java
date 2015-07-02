

package javaapplication150;

public class collegeofCom extends Student
{
	
    private double GbaforRegst;

    public collegeofCom(String firstname, String lastname, int GBA) {
        super(firstname, lastname, GBA);
    }

	
   
   
  
	public  int GbaforRegst(int GBA)
	{
            if(GBA>60)
                System.out.println("you are accepted in the college of computer sience");
		
              
                
               
        if(GBA<60)
    
                        System.out.println("you are not  accepted in the college of computer sience");
       
                         
                       
        return GBA;
        }
	
	
        public void collegeofCom(String lastname,String firstname){
             firstname= firstname;
             lastname = lastname;
             
        }
 
}

