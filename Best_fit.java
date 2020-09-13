import java.util.*;


class Data{  
	int memory_size;  
	String availability;  

	Data(int memory_size,String availability){  
	 this.memory_size=memory_size;  
	 this.availability=availability;  
  
	}  
  }  

  
public class Best_fit
{
	public static void main(String[] args) {
		
		ArrayList<Data> memorySegment=new ArrayList<Data>();		   
        ArrayList<Integer> memory = new ArrayList<Integer>();
        ArrayList<Integer> filter = new ArrayList<Integer>();
		
		Scanner input= new Scanner(System.in);  
	
		int total_sagment,segment_val,total_memory,memory_val,new_sagment_value,minSize,x;
		
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
		for(int i=0; i<memory.size(); i++){

			for(int j=0; j<memorySegment.size(); j++){

				if(memory.get(i) < memorySegment.get(j).memory_size && memorySegment.get(j).availability =="Unoccupied"){
				//store unoccupied memory size
                    filter.add(memorySegment.get(j).memory_size);		
                }
                
            }
        //get min size of memorr
        minSize= Collections.min(filter);
        //empty the array list
        filter.clear();
        //trying to get index of memory block but unsuccessfull
        x =memorySegment.memory_size.indexOf(minSize);
        System.out.println("index of x" + x);
		}

		System.out.println("//////////////////////////////");
		for(Data n : memorySegment)
		{
			
			System.out.println(n.memory_size+ "  "+ n.availability);
		}

		System.out.println("/////////////end////////////");
		
		memory.forEach((n)->{
			if(n!=0){
				System.out.println("Unallocated memory is "+ n);
			}
		});
		
        input.close(); //to avoid memory leakage
	 
	    
	}
}