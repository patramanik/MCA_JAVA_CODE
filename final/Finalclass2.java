class A {
    void Super() {
        System.out.println("I am super class");
    }
}

class B extends A {
    final void Sub() {
        System.out.println("I am Sub class");
    }
}

class Finalclass2 {
    public static void main(String[] args) {
        B ob = new B();
        ob.Sub();
        ob.Super();
    }
}