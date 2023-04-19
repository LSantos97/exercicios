package devdojo;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 26;
        long numberGreater = 100000;
        double salaryDouble = 2000;
        float salaryFloat = 2500;
        byte ageByte = -128;
        short ageShort = 26;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 82; // '\u0041'; podemos utilizar unidcode
        String name = "Lohan";
        var nome2 = "Santos";

        System.out.println("My age is " + age + "y");
        System.out.println(verdadeiro);
        System.out.println("char "+caractere);
        System.out.println("Meu nome é "+name+" e eu tenho "+age+" anos!");
    }
}
