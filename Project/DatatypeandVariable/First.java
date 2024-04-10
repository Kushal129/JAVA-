package DatatypeandVariable;
class First {
    int a = 10; // instance variable
    static double b = 20.5; // Static Variable

    public static void main(String[] args) {
        boolean c = true; // Local Variable
        First f = new First();
        
        System.out.println(f.a);
        System.out.println(First.b); // Access static variable using class name
        System.out.println(c);
    }
}

