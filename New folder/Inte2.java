class A extends Thread {
    
        public void run() {
            for (int i = 1; i <= 6; i++) {
                System.out.println("In the run A " + i);
            }
            System.out.println("End of thread A");
        }

}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 4; j++) {
            System.out.println("In the run B " + j);
        }
        System.out.println("End of thread B");
    }
}

class C extends Thread {
    public void run() {
        for(int k = 1;k <= 3;k++)
        {
            System.out.println("In the run C " + k);
        }
        System.out.println("End of thread C");
    }
}



class Inte2 {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        new B().start();
        new C().start();
    }
}
