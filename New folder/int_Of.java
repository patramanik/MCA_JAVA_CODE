class A {
    
}

class B extends A {
    
}

class int_Of {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        boolean b1 = a instanceof A;
        boolean b2 = a instanceof B;
        boolean b3 = b instanceof A;
        boolean b4 = b instanceof B;
        System.out.println("A= "+b1);
        System.out.println("B= "+b2);
        System.out.println("A= "+b3);
        System.out.println("B= "+b4);

    }
}
