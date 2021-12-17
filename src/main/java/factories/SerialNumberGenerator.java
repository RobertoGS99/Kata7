package factories;

public class SerialNumberGenerator {
    private Integer serialNumber = 0;
    private static SerialNumberGenerator serialNumberGenerator;

    private SerialNumberGenerator() {   
    }
    
    public static SerialNumberGenerator getInstance(){
        if (null == serialNumberGenerator){
            serialNumberGenerator = new SerialNumberGenerator();
        }
        return serialNumberGenerator;
    }
    
    public Integer next(){
        return serialNumber++;
    }
    
}
