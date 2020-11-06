import java.util.concurrent.*;

public class DictionBin extends DictionBase
{
   

    public DictionBin() throws Exception
    {
          super();
    }
    public  String translate(String eng) throws Exception
    {
         //Question A5
         //Initiates translateB				
         //(2 marks)
        return translateB(eng.toLowerCase(),0,getCount());
    }

     private  String translateB ( String eng,int lo, int hi) throws Exception
    {
        //Question A4.
        //Uses a binary search to search for a string in the dictionary. 
        //If found, the associated data value is returned, otherwise the 
        //string “No comprehendo” is returned.
        //(9 marks) 
        int mid, found =0;
         String returnval;
          returnval = "No comprehendo";
                    
         TimeUnit.NANOSECONDS.sleep(1);
         
         ///////////////////////////////////////////////
         //Add your code to complete below this point
         
         while(lo<=hi){
             mid = (hi+lo)/2;

             int def = eng.compareTo(getKey(mid));
             if (def==0){
                 found=1;
                 return getVal(mid);
             }
             if (def>0){
                 lo = mid+1;

             }
             else{
                 hi = mid-1;
             }
         }
         
         return returnval;
    }
    
     
}
