import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    String name;

    static String name2;

    private int salary;
    //protected int salary; - reconhece no pacote/diretorio
    public static void main(String[] args) {
        //variaveis
        // int idade = 23;
        var nome = "Julia";

        //tipos primitivos - byte, short, int, long
        //byte idade = 23;

        boolean eBrasileiro = true;
        char letra = 'A';
        String palavra = "oi"; // não é um tipo primitivo e sim uma classe

        //double, float
        double idade = 22,50;
        float salario = 1.5400F; // f no final pra setar float

        //condicionais
        if(idade > 22,60) {
            System.out.println("maior");
        } else if (idade == 22.60) {
            System.out.println("igual");
        } else {
            System.out.println("menor");
        }

        //vetores - arrays

        int[] idades = {2,3,4,5};
        idades[0] = 4;

        int[] idades = new int[10];
        String[] nomes = new String[10];
        boolean[] saobrasileiros = new boolean[10];

        //formato dinamico - arraylist

        int[] valores1 = new int[10];
        valores1.length;
        ArrayList<Integer> valores = new ArrayList<Integer>();
        valores.add(2);
        valores.add(33);
        valores.add(55);
        valores.remove(0);
        valores.get(1);
        valores.size();

        // loops

        int valor2 = 10;
        int i2 = 0;
        for(var i = 0; i < valor2; i++){
            System.out.println("oi");
        }

        while(i2 < valor2){
            i2++;
        }

        //casting

        int idade2 = 23;
        double idade3 = idade2;
        idade2 = (int) idade3;

        char letra2 = "S";
        String nome2 = String.valueOf(letra);
        letra = nome2.charAt('0');

        String nome2 = String.valueOf(idade2);
        idade2 = Interger.parseInt(nome2);

        //POO
        //classes

        //System.out.println(name);
        System.out.println(name2);

        Ser meuSerAnimal = new Human();
        meuSerAnimal.setName("Anthuawn");

    }

    static void teste(){
    }
    void declaraName() {
        System.out.println(name2);
        Main.teste();
        name = "Gabe";

        Main meuMain = new Main();
        meuMain.declaraName();
        System.out.println(meuMain.name);
    }
    String getName(){
        return name;
    }

    //construtores
    public Main(String palavra, int velhice){
        this.palavra = palavra;
        this.velhice = velhice;
    }
}

class Pessoa {
    void criaMain(){
        Main meuMain = new Main("doce", "60");
    }
}

//modificadores de acesso - visibilizadades das classes, dos atributos e dos métodos das classes

private void atualizaSalary(){
    this.salary = 3200;
}

public int getSalary(){
    this.atualizaSalary();
    return this.salary;
}

class Person {
    void criaMain(){
        Main meuMain = new Main();
        System.out.println(meuMain.name);
        System.out.println(meuMain.salary);
        System.out.println(meuMain.atualizaSalary);
        System.out.println(meuMain.getSalary());
    }
}