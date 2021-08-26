
import java.util.List;


public class CPURegister {
    private int PC;
    private int AC;
    private int IR;
    private int AX;
    private int BX;
    private int CX;
    private int DX;

    public CPURegister(int PC, int AC, int IR, int AX, int BX, int CX, int DX) {
        this.PC = PC;
        this.AC = AC;
        this.IR = IR;
        this.AX = AX;
        this.BX = BX;
        this.CX = CX;
        this.DX = DX;
    }
    
    
    public int getPC() {
        return PC;
    }

    public void setPC(int PC) {
        this.PC = PC;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public int getIR() {
        return IR;
    }

    public void setIR(int IR) {
        this.IR = IR;
    }

    public int getAX() {
        return AX;
    }

    public void setAX(int AX) {
        this.AX = AX;
    }

    public int getBX() {
        return BX;
    }

    public void setBX(int BX) {
        this.BX = BX;
    }

    public int getCX() {
        return CX;
    }

    public void setCX(int CX) {
        this.CX = CX;
    }

    public int getDX() {
        return DX;
    }

    public void setDX(int DX) {
        this.DX = DX;
    }

    public void runInstruction(String fileName){
       Reader x = new Reader();
       List<Memory> data = x.readFile(fileName);
       for(int i = 0; i < data.size(); i++){
           instruction(data.get(i).getIntruction());
       }
       
    }
    public void instruction(String lines) {
                String[] instruction = lines.split(" ");
		
                    if(instruction[0].equals("MOV")){
                        RegisterMOV(instruction);
                    }else if(instruction[0].equals("STORE")){
                        RegisterSTORE(instruction);
                    } else if(instruction[0].equals("LOAD")){
                        RegisterLOAD(instruction);
                    }else if(instruction[0].equals("ADD")){
                        RegisterADD(instruction);
                    }else{
                        RegisterSUB(instruction);
                    }
                   
                      
                   
                    
                
                
	}
         public void RegisterMOV(String[] instruction){
             
             if(instruction[1].equals("AX,")){
                 this.AX = Integer.parseInt(instruction[2]);
                 System.out.println(this.AX);
             } else if(instruction[1].equals("BX,")){
                 this.BX = Integer.parseInt(instruction[2]);
                 System.out.println(this.BX);
             } else if(instruction[1].equals("CX,")){
                 this.CX = Integer.parseInt(instruction[2]);
                 System.out.println(this.CX);
             } else if(instruction[1].equals( "DX,")){
                 this.DX = Integer.parseInt(instruction[2]);
                 System.out.println(this.DX);
             }
            
         }
         
         public void RegisterSTORE(String[] instruction){
             
             if(instruction[1].equals("AX")){
                 this.AX = this.AC;
                 System.out.println(this.AX);
             } else if(instruction[1].equals("BX")){
                 this.BX = this.AC;
                 System.out.println(this.BX);
             } else if(instruction[1].equals("CX")){
                 this.CX = this.AC;
                 System.out.println(this.CX);
             } else if(instruction[1].equals( "DX")){
                 this.DX = this.AC;
                 System.out.println(this.DX);
             } 
            
         }
         
         public void RegisterLOAD(String[] instruction){
             if(instruction[1].equals("AX")){
                 this.AC = this.AX;
                 System.out.println(this.AC);
             } else if(instruction[1].equals("BX")){
                 this.AC = this.BX;
             } else if(instruction[1].equals("CX")){
                 this.AC = this.CX;
             } else if(instruction[1].equals( "DX")){
                 this.AC = this.DX;
             }System.out.println(this.AC);
            
         }
         
         public void RegisterADD(String[] instruction){
             
             if(instruction[1].equals("AX")){
                 this.AC += this.AX;
             } else if(instruction[1].equals("BX")){
                 this.AC += this.BX;
             } else if(instruction[1].equals("CX")){
                 this.AC += this.CX;
             } else if(instruction[1].equals( "DX")){
                 this.AC += this.DX;
             } System.out.println(this.AC);
            
         }
         public void RegisterSUB(String[] instruction){
             
             if(instruction[1].equals("AX")){
                 this.AC -= this.AX;
             } else if(instruction[1].equals("BX")){
                 this.AC -= this.BX;
             } else if(instruction[1].equals("CX")){
                 this.AC -= this.CX;
             } else if(instruction[1].equals( "DX")){
                 this.AC -= this.DX;
             }System.out.println(this.AC);
            
         }
}
