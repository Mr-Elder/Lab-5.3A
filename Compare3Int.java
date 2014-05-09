public class Compare3Int
{
	
    public static Object Largest(Object S1, Object S2, Object S3){
    	
        Integer returnInteger = null;

        Integer integer1 = (Integer)S1;
        Integer integer2 = (Integer)S2;
        Integer integer3 = (Integer)S3;
        
        if(integer1.intValue() == integer2.intValue() && integer1.intValue() == integer3.intValue() && integer2.intValue() == integer3.intValue())
        	return "All the integers were the same value";
        
        if(integer1.intValue() > integer2.intValue() && integer1.intValue() > integer3.intValue())
        	return "Integer 1 : " + integer1.intValue() +  " was the greatest value";
        
        if(integer2.intValue() > integer1.intValue() && integer2.intValue() > integer3.intValue())
        	return "Integer 2 : " + integer2.intValue() +  " was the greatest value";
       
        if(integer3.intValue() > integer2.intValue() && integer3.intValue() > integer1.intValue())
        	return "Integer 3 : " + integer3.intValue() +  " was the greatest value";
        
        return returnInteger;
    }
}
