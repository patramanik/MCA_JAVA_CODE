//write a java program to explan the purpas of indexof method
class Index
{
    public static void main(String[] args) {
        String str = new String("manik patra");
        String str1 = "java";
        int i = str.indexOf('p');
        int j = str1.indexOf('a', 1);
        int k = str.indexOf('m');
        int a = str.indexOf('i');
        int b = str.indexOf('t');
        int l = str.indexOf('a', 6);
        int o = str1.indexOf('a', 11);
        int m = str1.indexOf("ava");
        int n = str.indexOf("patra");
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(a);
        System.out.println(b);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
    }
}