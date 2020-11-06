import java.util.concurrent.*;    

public class DictionSeq extends DictionBase
{

    public DictionSeq() throws Exception
    {
         super();
    }
    public  String translate(String eng) throws Exception
    {
        return translateS(eng);
    }  



   private String translateS (String eng) throws Exception
    {
        //Question A3:sequentially searches for a string in the dictionary.
        //If found, the associated data value is returned, otherwise the
        // string “No comprehendo” is returned.									
        //(5 marks)
        int ndx = 0, found =0;
     String returnval = "No comprehendo";
     while((ndx< this.getCount()) && (found==0))
     {
         TimeUnit.NANOSECONDS.sleep(1);
         //Add code here to implement search

         if (getKey(ndx).equals(eng)){
             returnval = getKey(ndx);
             found=1;
             return getVal(ndx);
         }
         else{
             ndx=ndx+1;
         }
         
        }
      
      return returnval;
    }

}
