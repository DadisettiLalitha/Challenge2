package coreproject;

public class StringReverse {
  
	public static void main(String args[]){
		StringReverse sr = new StringReverse();
		 String givenStr = "racecar";
		 String riversRst =	sr.stringReverseMethod(givenStr);
		 
		 if(givenStr.equals(riversRst)){
			 System.out.println("given string is palindrome ");
		 }else
		 {
			 System.out.println(riversRst);
		 }
	}

	public String stringReverseMethod(String str) {
		   String rResult = "";
		   if(str.length()== 1){
			   return str;
		   }else{
			   rResult += str.charAt(str.length()-1)
					   + stringReverseMethod(str.substring(0,str.length()-1));
					      
		   }
		return rResult;
		
	}
	
}
