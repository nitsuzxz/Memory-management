import java.util.*;


class Data{  
	int memory_size;  
	String availability;  

	Data(int memory_size,String availability){  
	 this.memory_size=memory_size;  
	 this.availability=availability;  
  
	}  
  }  

  
public class Next_fit
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
        int counter=0;

		for(int i=0; i<memory.size(); i++){

            while(counter!=memorySegment.size()){

                if(memory.get(i) <= memorySegment.get(counter).memory_size && memorySegment.get(counter).availability =="Unoccupied"){
					
					new_sagment_value= memorySegment.get(counter).memory_size - memory.get(i);

					Data memory_data=new Data( memory.get(i),"Occupied");  
					memorySegment.add(counter,memory_data);

		
					if(new_sagment_value>0){
						Data memory_data_update= new Data(new_sagment_value,"Unoccupied");  
						memorySegment.set((counter+1),memory_data_update);
					}else{
						memorySegment.remove((counter+1));
					}


					memory.set(i,0);
                    break;
                }
                counter++;
            }
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
