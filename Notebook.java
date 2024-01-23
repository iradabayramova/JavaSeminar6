import java.util.Objects;
public class Notebook {
    private String Ram;
    private String Hdd;
    private String Prosessor;
    private String color;
    

    public Notebook(String Ram, String color, String Hdd, String Prosessor) {
        this.Ram = Ram;
        this.color = color;
        this.Hdd = Hdd;
        this.Prosessor = Prosessor;
    }
    public boolean matchesCriteria(String criteria, String value) {
        switch (criteria) {
            case "1":
                return Integer.parseInt(Ram) >= Integer.parseInt(value);
            case "2":
                return Integer.parseInt(Hdd) >= Integer.parseInt(value);
            case "3":
                return Prosessor.contains(value);
            case "4":
                return color.equalsIgnoreCase(value);
            // Add more cases for additional criteria
            default:
                return false;
        }
        }
    // public String getRam(){
    //     return Ram;
    // }
    // public String getColor(){
    //     return color;
    // }
    // public String getHdd(){
    //     return Hdd;
    // }
    // public String getProsessor(){
    //     return Prosessor;
    // }
    // public void setRam(String Ram){
    //     this.Ram = Ram;
    // }
    // public void setColor(String color) {
    //     this.color = color;
    // }
    // public void setHdd(String Hdd) {
    //     this.Hdd = Hdd;
    // }
    // public void setProsessor(String Prosessor) {
    //     this.Prosessor = Prosessor;
    // }
    @Override
    public String toString() {
         return "RAM: " + Ram + ", color: " + color + ", HDD: " + Hdd + ", Prosessor: " + Prosessor + "" ;
    }
}
