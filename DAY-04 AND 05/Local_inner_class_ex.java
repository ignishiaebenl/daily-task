class Computer1 {

    void storage() {
        
        class Storage {
            void display() {
                System.out.println("512 GB");
            }
        }

        Storage s = new Storage();
        s.display();
    }
}

public class Local_inner_class_ex {

    public static void main(String[] args) {

        Computer1 c = new Computer1();
        c.storage();
    }

}
