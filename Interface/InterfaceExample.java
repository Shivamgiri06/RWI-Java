//Interface
interface Bank {
    float rateOfInterests();
}

class SBI implements Bank {
    public float rateOfInterests(){
        return 9.15f;
    }
}

class PNB implements Bank {
    public float rateOfInterests(){
        return 9.7f;
    }
}

class InterfaceExample {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("ROI: "+b.rateOfInterests());
    }
}