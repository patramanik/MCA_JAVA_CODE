class Sw {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        String t = null;
        String[] name = new String[] { "Madras", "delhi", "kolkata", "bombay" };
        System.out.println("the given list is: ");
        for (i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        for (i = 0; i < name.length; i++) 
        {
            for (j = i + 1; j < name.length; j++) {
                if (name[j].compareTo(name[i]) < 0) 
                {
                    t = name[i];
                    //System.out.println(name[i]+" t value\n");
                    name[i] = name[j];
                    name[j] = t;
                }
            }
        }
        System.out.println("The sorted list is: ");
        for (i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
