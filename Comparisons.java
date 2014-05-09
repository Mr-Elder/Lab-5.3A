// ****************************************************************
//   Comparisons.java
// ****************************************************************
import static java.lang.System.out;

public class Comparisons
{
    public static void main(String[] args)
    {

        String string1, string2, string3;
        String returnString = new String("***EMPTY***");

        string1 = GetInfo.getString("Enter the 1st string: ");
        string2 = GetInfo.getString("Enter the 2nd string: ");
        string3 = GetInfo.getString("Enter the 3rd string: ");

        
		GetInfo.showMessage("String 1 : " + string1 + "\nString 2 : " + string2 + "\nString 3 : " + string3 + "\nLargest Integer : " + Compare3.Largest(string1, string2, string3));

        int int1, int2, int3;

        int1 = GetInfo.getInt("Enter the 1st Integer: ");
        int2 = GetInfo.getInt("Enter the 2nd Integer: ");
        int3 = GetInfo.getInt("Enter the 3rd Integer: ");


        Object integer1 = new Integer(int1);	/*  Integer Objects ��� Wrapper Class */
        Object integer2 = new Integer(int2); 	/*  Integer Objects ��� Wrapper Class */
        Object integer3 = new Integer(int3); 	/*  Integer Objects ��� Wrapper Class */

        GetInfo.showMessage("Integer 1 : " + ((Integer)integer1).intValue() + "\nInteger 2 : " + ((Integer)integer2).intValue() + "\nInteger 3 : " + ((Integer)integer3).intValue() + "\nLargest Integer : " + (Compare3Int.Largest(integer1, integer2, integer3)));

    }

}
