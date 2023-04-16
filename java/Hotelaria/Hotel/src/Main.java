import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/*
*  Hotelaria
*  Verificação de quartos disponíveis
*  Reservar quarto para uma ou duas pessoas
*  Contém um menu de pedir comida que adiciona o gasto ao checkout do quarto
* */

class Food implements Serializable {
    int itemno;
    int quantity;
    float price;

    Food(int itemno, int quantity) {
        this.itemno = itemno;
        this.quantity = quantity;
        switch (itemno) {
            case 1 -> price = quantity * 50;
            case 2 -> price = quantity * 60;
            case 3 -> price = quantity * 70;
            case 4 -> price = quantity * 30;
        }
    }
}

class Singleroom implements Serializable {
    String name;
    String contact;
    String gender;
    ArrayList<Food> food = new ArrayList<>();

    Singleroom() {
        this.name = "";
    }

    Singleroom(String name, String contact, String gender) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
    }
}

class Doubleroom extends Singleroom implements Serializable {
    String name2;
    String contact2;
    String gender2;

    Doubleroom() {
        this.name = "";
        this.name2 = "";
    }

    Doubleroom(String name, String contact, String gender, String name2, String contact2, String gender2) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
        this.name2 = name2;
        this.contact2 = contact2;
        this.gender2 = gender2;
    }
}

class NotAvailable extends Exception {
    @Override
    public String toString() {
        return "Indisponível!";
    }
}

class holder implements Serializable {
    Doubleroom luxury_doublerrom[] = new Doubleroom[10]; // Quarto Luxo
    Doubleroom deluxe_doublerrom[] = new Doubleroom[20]; // Quarto Prime
    Singleroom luxury_singleerrom[] = new Singleroom[10];
    Singleroom deluxe_singleerrom[] = new Singleroom[20];
}

class Hotel {
    static holder hotel_ob = new holder();
    static Scanner sc = new Scanner(System.in);

    static void CustDetails(int i,int rn)
    {
        String name, contact, gender;
        String name2 = null, contact2 = null;
        String gender2="";
        System.out.print("\nInsira o nome do primeiro cliente: ");
        name = sc.next();
        System.out.print("Insira o número de contato: ");
        contact=sc.next();
        System.out.print("Digite o sexo: ");
        gender = sc.next();
        if(i<3)
        {
            System.out.print("Insira o nome do segundo cliente: ");
            name2 = sc.next();
            System.out.print("Insira o número de contato: ");
            contact2=sc.next();
            System.out.print("Digite o sexo: ");
            gender2 = sc.next();
        }
        switch (i) {
            case 1 -> hotel_ob.luxury_doublerrom[rn] = new Doubleroom(name, contact, gender, name2, contact2, gender2);
            case 2 -> hotel_ob.deluxe_doublerrom[rn] = new Doubleroom(name, contact, gender, name2, contact2, gender2);
            case 3 -> hotel_ob.luxury_singleerrom[rn] = new Singleroom(name, contact, gender);
            case 4 -> hotel_ob.deluxe_singleerrom[rn] = new Singleroom(name, contact, gender);
            default -> System.out.println("Opção inválida");
        }
    }

    static void bookroom(int i) {
        int j;
        int rn;
        System.out.println("\nEscolha o número do quarto entre: ");
        switch (i) {
            case 1:
                for (j = 0; j < hotel_ob.luxury_doublerrom.length; j++) {
                    if (hotel_ob.luxury_doublerrom[j] == null) {
                        System.out.print(j + 1 + ",");
                    }
                }
                System.out.print("\nEntre com o número do quarto: ");
                try {
                    rn = sc.nextInt();
                    rn--;
                    if (hotel_ob.luxury_doublerrom[rn] != null)
                        throw new NotAvailable();
                    CustDetails(i, rn);
                } catch (Exception e) {
                    System.out.println("Opção inválida");
                    return;
                }
                break;
            case 2:
                for (j = 0; j < hotel_ob.deluxe_doublerrom.length; j++) {
                    if (hotel_ob.deluxe_doublerrom[j] == null) {
                        System.out.print(j + 11 + ",");
                    }
                }
                System.out.print("\nEntre com o número do quarto:");
                try {
                    rn = sc.nextInt();
                    rn = rn - 11;
                    if (hotel_ob.deluxe_doublerrom[rn] != null)
                        throw new NotAvailable();
                    CustDetails(i, rn);
                } catch (Exception e) {
                    System.out.println("Opção inválida");
                    return;
                }
                break;
            case 3:
                for (j = 0; j < hotel_ob.luxury_singleerrom.length; j++) {
                    if (hotel_ob.luxury_singleerrom[j] == null) {
                        System.out.print(j + 31 + ",");
                    }
                }
                System.out.print("\nEntre com o número do quarto:");
                try {
                    rn = sc.nextInt();
                    rn = rn - 31;
                    if (hotel_ob.luxury_singleerrom[rn] != null)
                        throw new NotAvailable();
                    CustDetails(i, rn);
                } catch (Exception e) {
                    System.out.println("Opção inválida");
                    return;
                }
                break;
            case 4:
                for (j = 0; j < hotel_ob.deluxe_singleerrom.length; j++) {
                    if (hotel_ob.deluxe_singleerrom[j] == null) {
                        System.out.print(j + 41 + ",");
                    }
                }
                System.out.print("\nEntre com o número do quarto: ");
                try {
                    rn = sc.nextInt();
                    rn = rn - 41;
                    if (hotel_ob.deluxe_singleerrom[rn] != null)
                        throw new NotAvailable();
                    CustDetails(i, rn);
                } catch (Exception e) {
                    System.out.println("Opção inválida");
                    return;
                }
                break;
            default:
                System.out.println("Insira uma opção válida");
                break;
        }
        System.out.println("Quarto Reservado!");
    }

    static void features(int i) {
        switch (i) {
            case 1:
                System.out.println("Número de camas de casal : 1\nAC : Sim\nCafé da manhã grátis : Sim\nCusto por dia:4000 ");
                break;
            case 2:
                System.out.println("Número de camas de casal : 1\nAC : Não\nCafé da manhã grátis : Sim\nCusto por dia:000  ");
                break;
            case 3:
                System.out.println("Número de camas de solteiro : 1\nAC : Sim\nCafé da manhã grátis : Sim\nCusto por dia:2200  ");
                break;
            case 4:
                System.out.println("Número de camas de solteiro : 1\nAC : Não\nCafé da manhã grátis : Sim\nCusto por dia:1200 ");
                break;
            default:
                System.out.println("Insira uma opção válida");
                break;
        }
    }

    static void availability(int i) {
        int j, count = 0;
        switch (i) {
            case 1:
                for (j = 0; j < 10; j++) {
                    if (hotel_ob.luxury_doublerrom[j] == null)
                        count++;
                }
                break;
            case 2:
                for (j = 0; j < hotel_ob.deluxe_doublerrom.length; j++) {
                    if (hotel_ob.deluxe_doublerrom[j] == null)
                        count++;
                }
                break;
            case 3:
                for (j = 0; j < hotel_ob.luxury_singleerrom.length; j++) {
                    if (hotel_ob.luxury_singleerrom[j] == null)
                        count++;
                }
                break;
            case 4:
                for (j = 0; j < hotel_ob.deluxe_singleerrom.length; j++) {
                    if (hotel_ob.deluxe_singleerrom[j] == null)
                        count++;
                }
                break;
            default:
                System.out.println("Insira uma opção válida");
                break;


        }
        System.out.println("Número de quartos disponiveis : " + count);
    }

    static void bill(int rn, int rtype) {
        double amount = 0;
        String list[] = {"Sanduiche", "Hamburger", "Miojo", "Refrigerante"};
        System.out.println("\n*******");
        System.out.println(" Conta:-");
        System.out.println("*******");

        switch (rtype) {
            case 1:
                amount += 4000;
                System.out.println("\nTaxas do Quarto - " + 4000);
                System.out.println("\n===============");
                System.out.println("Taxas Alimentares");
                System.out.println("===============");
                System.out.println("Item Quantidade Preço");
                System.out.println("-------------------------");
                for (Food obb : hotel_ob.luxury_doublerrom[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.itemno - 1], obb.quantity, obb.price);
                }
                break;
            case 2:
                amount += 3000;
                System.out.println("Taxas do Quarto - " + 3000);
                System.out.println("\nTaxas Alimentares");
                System.out.println("===============");
                System.out.println("Item Quantidade Preço");
                System.out.println("-------------------------");
                for (Food obb : hotel_ob.deluxe_doublerrom[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.itemno - 1], obb.quantity, obb.price);
                }
                break;
            case 3:
                amount += 2200;
                System.out.println("Taxas do Quarto - " + 2200);
                System.out.println("\nTaxas Alimentares");
                System.out.println("===============");
                System.out.println("Item Quantidade Preço");
                System.out.println("-------------------------");
                for (Food obb : hotel_ob.luxury_singleerrom[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.itemno - 1], obb.quantity, obb.price);
                }
                break;
            case 4:
                amount += 1200;
                System.out.println("Taxas do Quarto - " + 1200);
                System.out.println("Taxas Alimentares:- ");
                System.out.println("===============");
                System.out.println("Item Quantidade Preço");
                System.out.println("-------------------------");
                for (Food obb : hotel_ob.deluxe_singleerrom[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.itemno - 1], obb.quantity, obb.price);
                }
                break;
            default:
                System.out.println("Não disponivel");
        }
        System.out.println("\nValor Total- " + amount);
    }

    static void deallocate(int rn, int rtype) {
        int j;
        char w;
        switch (rtype) {
            case 1:
                if (hotel_ob.luxury_doublerrom[rn] != null)
                    System.out.println("Quarto Ocupado por " + hotel_ob.luxury_doublerrom[rn].name);
                else {
                    System.out.println("Quarto Desocupado");
                    return;
                }
                System.out.println("Você deseja realizar o checkout ? (s/n)");
                w = sc.next().charAt(0);
                if (w == 's' || w == 'S') {
                    bill(rn, rtype);
                    hotel_ob.luxury_doublerrom[rn] = null;
                    System.out.println("Desalocado com sucesso");
                }
                break;
            case 2:
                if (hotel_ob.deluxe_doublerrom[rn] != null)
                    System.out.println("Quarto Ocupado por " + hotel_ob.deluxe_doublerrom[rn].name);
                else {
                    System.out.println("Quarto Desocupado");
                    return;
                }
                System.out.println(" Você deseja realizar o checkout ? (s/n)");
                w = sc.next().charAt(0);
                if (w == 's' || w == 'S') {
                    bill(rn, rtype);
                    hotel_ob.deluxe_doublerrom[rn] = null;
                    System.out.println("Desalocado com sucesso");
                }
                break;
            case 3:
                if (hotel_ob.luxury_singleerrom[rn] != null)
                    System.out.println("Quarto Ocupado por " + hotel_ob.luxury_singleerrom[rn].name);
                else {
                    System.out.println("Quarto Desocupado");
                    return;
                }
                System.out.println(" Você deseja realizar o checkout ? (s/n)");
                w = sc.next().charAt(0);
                if (w == 's' || w == 'S') {
                    bill(rn, rtype);
                    hotel_ob.luxury_singleerrom[rn] = null;
                    System.out.println("Desalocado com sucesso");
                }
                break;
            case 4:
                if (hotel_ob.deluxe_singleerrom[rn] != null)
                    System.out.println("Quarto Ocupado por " + hotel_ob.deluxe_singleerrom[rn].name);
                else {
                    System.out.println("Quarto Desocupado");
                    return;
                }
                System.out.println(" Você deseja realizar o checkout ? (s/n)");
                w = sc.next().charAt(0);
                if (w == 's' || w == 'S') {
                    bill(rn, rtype);
                    hotel_ob.deluxe_singleerrom[rn] = null;
                    System.out.println("Desalocado com sucesso");
                }
                break;
            default:
                System.out.println("\nInsira uma opção valida : ");
                break;
        }
    }

    static void order(int rn, int rtype) {
        int i, q;
        char wish;
        try {
            System.out.println("\n==========\n   Cardápio:  \n==========\n\n1.Sanduiche\tR$50\n2.Hamburger\tR$60\n3.Miojo\tR$70\n4.Refrigerante\tR$30\n");
            do {
                i = sc.nextInt();
                System.out.print("Quantidade- ");
                q = sc.nextInt();

                switch (rtype) {
                    case 1:
                        hotel_ob.luxury_doublerrom[rn].food.add(new Food(i, q));
                        break;
                    case 2:
                        hotel_ob.deluxe_doublerrom[rn].food.add(new Food(i, q));
                        break;
                    case 3:
                        hotel_ob.luxury_singleerrom[rn].food.add(new Food(i, q));
                        break;
                    case 4:
                        hotel_ob.deluxe_singleerrom[rn].food.add(new Food(i, q));
                        break;
                }
                System.out.println("Você desejar pedir algo mais ? (s/n)");
                wish = sc.next().charAt(0);
            } while (wish == 's' || wish == 'S');
        } catch (NullPointerException e) {
            System.out.println("\nQuarto não reservado");
        } catch (Exception e) {
            System.out.println("Não pode ser feito");
        }
    }


}

class write implements Runnable {
    holder hotel_ob;

    write(holder hotel_ob) {
        this.hotel_ob = hotel_ob;
    }

    @Override
    public void run() {
        try {
            FileOutputStream fout = new FileOutputStream("backup");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(hotel_ob);
        } catch (Exception e) {
            System.out.println("Erro na escrita " + e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            File f = new File("backup");
            if (f.exists()) {
                FileInputStream fin = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fin);
                Hotel.hotel_ob = (holder) ois.readObject();
            }
            Scanner sc = new Scanner(System.in);
            int ch, ch2;
            char wish;
            x:
            do {
                System.out.println("\nDigite sua escolha :\n1.Exibir detalhes da sala\n2.Mostrar quartos disponíveis \n3.Reservar\n4.Pedir comida\n5.Checkout\n6.Sair\n");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("\nEscolha o tipo do quarto :\n1.Quarto Duplo Luxo \n2.Quarto Duplo Deluxe \n3.Quarto Individual Luxo \n4.Quarto Individual Deluxe\n");
                        ch2 = sc.nextInt();
                        Hotel.features(ch2);
                        break;
                    case 2:
                        System.out.println("\nEscolha o tipo do quarto :\n1.Quarto Duplo Luxo \n2.Quarto Duplo Deluxe \n3.Quarto Individual Luxo\n4.Quarto Individual Deluxe\n");
                        ch2 = sc.nextInt();
                        Hotel.availability(ch2);
                        break;
                    case 3:
                        System.out.println("\nEscolha o tipo do quarto :\n1.Quarto Duplo Luxo \n2.Quarto Duplo Deluxe \n3.Quarto Individual Luxo\n4.Quarto Individual Deluxe\n");
                        ch2 = sc.nextInt();
                        Hotel.bookroom(ch2);
                        break;
                    case 4:
                        System.out.println("Quarto Número -");
                        ch2 = sc.nextInt();
                        if (ch2 > 60)
                            System.out.println("Quarto não existe");
                        else if (ch2 > 40)
                            Hotel.order(ch2 - 41, 4);
                        else if (ch2 > 30)
                            Hotel.order(ch2 - 31, 3);
                        else if (ch2 > 10)
                            Hotel.order(ch2 - 11, 2);
                        else if (ch2 > 0)
                            Hotel.order(ch2 - 1, 1);
                        else System.out.println("Quarto não existe");
                        break;
                    case 5:
                        System.out.print("Quarto Número -");
                        ch2 = sc.nextInt();
                        if (ch2 > 60)
                            System.out.println("Quarto não existe");
                        else if (ch2 > 40)
                            Hotel.deallocate(ch2 - 41, 4);
                        else if (ch2 > 30)
                            Hotel.deallocate(ch2 - 31, 3);
                        else if (ch2 > 10)
                            Hotel.deallocate(ch2 - 11, 2);
                        else if (ch2 > 0)
                            Hotel.deallocate(ch2 - 1, 1);
                        else System.out.println("Quarto não existe");
                        break;
                    case 6:
                        break x;
                }
                System.out.println("\nContinuar : (s/n)");
                wish = sc.next().charAt(0);
                if (!(wish == 's' || wish == 'S' || wish == 'n' || wish == 'N')) {
                    System.out.println("Opção inválida");
                    System.out.println("\nContinuar : (s/n)");
                    wish = sc.next().charAt(0);
                }
            } while (wish == 's' || wish == 'S');
            Thread t = new Thread(new write(Hotel.hotel_ob));
            t.start();
        } catch (Exception e) {
            System.out.println("Não é uma entrada válida!");
        }
    }
}