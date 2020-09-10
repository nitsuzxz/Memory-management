import java.util.*;


public class First_Fit
{
	public static void main(String[] args) {
	    
	    ArrayList<Integer> memory = new ArrayList<Integer>();
	    ArrayList<Integer> segment = new ArrayList<Integer>();
	    ArrayList<Integer> results = new ArrayList<Integer>();
	     
        Scanner input= new Scanner(System.in);
        int total_memory,total_sagment,memory_val,segment_val,new_sagment_value;
	  
	    System.out.println("Please enter total number of memory");
	    
	    total_memory=input.nextInt();
	    
	    for(int i=0; i< total_memory; i++){
	        
	         System.out.println("Please enter value of memory "+ (i+1));
	         memory_val=input.nextInt();
	         memory.add(memory_val);
	         
	    }
	    
	
	    
	    System.out.println("Please enter total number of memory sagment");
	    
	    total_sagment=input.nextInt();
	    
	    for(int i=0; i< total_sagment; i++){
	        
	        System.out.println("Please enter value for memory segment "+ (i+1));
	        segment_val=input.nextInt();
	        segment.add(segment_val);
	         
        }
        
        for(int i=0;i<memory.size(); i++){

            for(int j=0; j<segment.size();j++){
                
                if(memory.get(i)<segment.get(j)){
                    
                  
                    new_sagment_value= segment.get(j) - memory.get(i);
                    segment.set(j,new_sagment_value);
                    j=segment.size();

                }
            }

        }


            //foreach in java
	    // for(int i: segment){
	    //    System.out.println(i);
	    // }
        input.close(); //to avoid memory leakage
	 
	    
	}
}
