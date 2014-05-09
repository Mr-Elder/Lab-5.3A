public class Compare3
{

    public static Object Largest(Object object1, Object object2, Object object3){
    	
    	String returnString = "All strings were equal in length.";
    	
    	String string1 = (String)object1;
    	String string2 = (String)object2;
    	String string3 = (String)object3;
    	
    	if(string1.length() == string2.length() && string1.length() == string3.length() && string2.length() == string3.length())
    		return returnString;
    	
    	if(string1.length() > string2.length() && string1.length() > string3.length())
    		return string1 + " was the largest string";
    	
    	if(string2.length() > string3.length() && string2.length() > string1.length())
    		return string2 + " was the largest string";
    	
    	if(string3.length() > string2.length() && string3.length() > string1.length())
    		return string3 + " was the largest string";
    	
    	return null;
        
    }
}

 
