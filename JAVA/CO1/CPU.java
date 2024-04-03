public class CPU{
    int price;
    class processor{
        int cores;
        String producer;
        processor(int noC,String manu){
            cores=noC;
            producer= manu;
        }
        void display(){
            System.out.println("\nProcessor info");
            System.out.println("Number of Cores: "+cores+"\n");
            System.out.println("Manufacturer=" +producer +"\n" );

        }
    }
    static class RAM{
        int mem;
        String manuf;
        RAM(int memory,String producer){
            mem=memory;
            manuf=producer;
        }
        void display(){
            System.out.println("\nRAM info");
            System.out.print("Memory ="+mem+ "GB"+"\n");
            System.out.print("Manufacturer ="+manuf+ "\n");
        }
    }
    public static void main(String[] args){
        CPU.RAM obj1= new CPU.RAM(8,"Intel");
        CPU obj2=new CPU();
        CPU.processor obj3=obj2.new processor(8,"Samsung");
        obj1.display();
        obj3.display();
    }
}

