class Ser{
    String name;

    int idade;

    void setName(String name){
        this.name = name;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }
}

public class Human extends Ser {
    void criaMain(){
        Main meuMain = new Main();
        System.out.println(meuMain.name);
        System.out.println(meuMain.idade);
        this.idade = 22;
    }
}
