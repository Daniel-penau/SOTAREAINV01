import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
public List<Memory> readFile(String fileName) {
                
		String data = "";
                List<Memory> lines = new ArrayList();
		try {
	      File myObj = new File(fileName);
	      Scanner myReader = new Scanner(myObj);
	      int i = 1;
	      while (myReader.hasNextLine()) {
                Memory mem = new Memory(0,"","");
	    	data = myReader.nextLine();
                mem.setId(20+i);
                mem.setIntruction(data);
                String bin = instructionToBinary(data);
                mem.setBinary(bin);
                lines.add(mem);
	        System.out.println(data);
               i++;
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();    
	    }
	return lines;
	
	} 
	
	
	public String instructionToBinary(String lines) {
		String bin = "";
                String[] instruction = lines.split(" ");
		for(int i= 0; i < instruction.length;i++){
                   
                   
                       if (i == 2){
                          
                          bin += binaryNumber(instruction[i]); 
                           
                       }else{
                           
                           
                           bin += binaryRegister(instruction[i]);
                       }
                   
                    
                }
                System.out.println(bin);
                return bin;
	}
         public String binaryRegister(String instruction){
             String bin = "0000";
             if(instruction.equals("MOV")){
                 bin = "0011";
                 
             } else if(instruction.equals("LOAD")){
                 bin = "0001";
                 
             } else if(instruction.equals("STORE")){
                 bin = "0010";
                 
             } else if(instruction.equals("ADD")){
                 bin = "0100";
                 
             } else if(instruction.equals("SUB")){
                 bin = "0101";
                 
             } else if(instruction.equals("AX,")||instruction.equals("AX")){
                 bin = "0001";
             } else if(instruction.equals("BX,")||instruction.equals("BX")){
                 bin = "0010";
             } else if(instruction.equals("CX,")||instruction.equals("CX")){
                 bin = "0011";
             } else if(instruction.equals( "DX,")||instruction.equals("DX")){
                 bin = "0100";
             }
             
             return bin;
         } 
         public String binaryNumber(String instruction){
             String eightbit = "";
             int num = Integer.parseInt(instruction);
             String bin = Integer.toBinaryString(num);
             eightbit = bin;
            
             if(eightbit.length() < 7){
                 
                 while (eightbit.length() < 7){
                    eightbit= "0"+ eightbit;
                    
                 }
             if (num < 0){
                eightbit = "1"+eightbit;
             }else{
               eightbit = "0"+eightbit;  
             }
             
             }
             
             
             return eightbit;
         }
   
}
        

