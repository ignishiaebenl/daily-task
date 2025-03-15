interface Phone {
    void storage();
}

public class AnonymousInnerClass {

    public static void main(String[] args) {
        
        // Anonymous inner class that implements the Phone interface
        Phone obj = new Phone() {
            @Override
            public void storage() {
                System.out.println("256 GB");
            }
        };
        
        obj.storage();  // Calls the overridden storage method
    }
}
