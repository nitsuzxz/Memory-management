import java.util.*;


class Data{  
	int memory_size;  
	String availability;  

	Data(int memory_size,String availability){  
	 this.memory_size=memory_size;  
	 this.availability=availability;  
  
	}  
  }  
public class First_Fit
{
	public static void main(String[] args) {
		
		ArrayList<Data> memorySegment=new ArrayList<Data>();		   
		ArrayList<Integer> memory = new ArrayList<Integer>();
		
		Scanner input= new Scanner(System.in);  
	
		int total_sagment,segment_val,total_memory,memory_val,new_sagment_value;
		
		System.out.println("Please enter total number of memory sagment");
	    total_sagment=input.nextInt();
	    
	    for(int i=0; i< total_sagment; i++){
	        
	        System.out.println("Please enter value for memory segment "+ (i+1));
			segment_val=input.nextInt();
			Data memory_data=new Data(segment_val,"Unoccupied");  
	        memorySegment.add(memory_data);
	         
		}
		
		System.out.println("Please enter total number of memory");
	    
	    total_memory=input.nextInt();
	    
	    for(int i=0; i< total_memory; i++){
	        
	         System.out.println("Please enter size of memory "+ (i+1));
	         memory_val=input.nextInt();
	         memory.add(memory_val);
	         
		}
		Iterator itr=memorySegment.iterator(); 

		System.out.println("here"+ memorySegment.get(0).memory_size);

		for(int i=0; i<memory.size(); i++){

			for(int j=0; j<memorySegment.size(); j++){
				    new_sagment_value= memorySegment.get(j).memory_size - memory.get(i);
                    segment.set(j,new_sagment_value);
                    j=segment.size();

			}
		}

	


		
		// while(itr.hasNext()){  
 		// 	 Data st=(Data)itr.next();  
		// 	 System.out.println(st.memory_size+" "+st.availability);  
		// } 

		// for(int i:memory){
		// 	System.out.println("this is memory size"+ i);
		// }

        input.close(); //to avoid memory leakage
	 
	    
	}
}
