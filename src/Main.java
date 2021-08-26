import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.List;
import java.util.Scanner; 


public class Main {

	public static void main(String[] args) {
		CPURegister cpu = new CPURegister(0,0,0,0,0,0,0);
                cpu.runInstruction("file.asm");
                System.out.println(cpu.getBX());
                
                
                
	}

}
