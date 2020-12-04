public class Main {

    private int p =20;
    protected int q = 10;
    static int count=10;
    transient Object mutex = new Object();
    volatile int v_random = 999;
    final String name = "Nisha";

    public static void conditionalCheck() {
        if(count<10) {
            // do something
        } else {
            //else block
        }
    }

    public static void main(String[] args) {
	// write your code here
        //primitive keywords
        boolean flag = false;
        byte b = -128;
        char c = 'n';
        short s = 1267;
        int i =2;
        long l = 5468568;
        float f = 1.57f;
        double d = 1.7e6;
        System.out.println(d);

        //Modifier

        //conditional, Declaration and Miscellaneous


        try {
            throw new Exception("Excp");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Done");
        }


        do {
            System.out.println("Inside do while");
        } while (false);


        for (int k = 0; k < count; k++) {
            if (k == 5)
                continue;
            if (k == 8)
                break;
            System.out.println(k);
        }


        switch (count) {
            case 1, 2, 3, 10 -> System.out.println("switch stmt");
            default -> System.out.println("NA");
        }

        String s1 = "abc";
        if (s1 instanceof String) {
            System.out.println(s1);
        }
        Main obj1 = new Main();


    }
}
