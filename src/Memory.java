public class Memory {

    
    private int id;
    private String intruction;
    private String binary;
    public Memory(int id, String intruction, String binary) {
        this.id = id;
        this.intruction = intruction;
        this.binary = binary;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntruction() {
        return intruction;
    }

    public void setIntruction(String intruction) {
        this.intruction = intruction;
    }

    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }
    
}
