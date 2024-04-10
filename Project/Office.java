class Emp {
    int Salary = 6000;
}

class Empye extends Emp {
    int Benifits = 10000;
}

class Office {
    public static void main(String args[]) {
        Empye e1 = new Empye(); 
        System.out.println("Salary " + e1.Salary + " " + e1.Benifits);
    }
}
