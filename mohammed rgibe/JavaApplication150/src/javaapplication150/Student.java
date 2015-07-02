/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication150;

/**
 *
 * @author ofa
 */
public  abstract class Student   {
  private String firstname;
  private String  lastname;
  private int GBA;
        
        public Student  (String firstname,String lastname,int GBA){
        
        
        this.GBA=GBA;
        this.firstname=firstname;
        this.lastname = lastname;
        }
        
        
        public Student(String f,String l)
	{
		firstname=f; 
                lastname=l; 
                
                
                
	}
         public String gefirstname()
   {
      return firstname;
   }
         
         
   public void setfirstname(String newfirstname)
   {
      firstname= newfirstname;
   }
   
   
   
       public String gelastname()
   {
      return lastname;
   }
         
         
   public void setlastname(String newlastname)
   {
    lastname= newlastname;
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
		return firstname+" "+lastname+""+GBA;
	}
}
