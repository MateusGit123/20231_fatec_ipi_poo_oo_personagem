public class Personagem{
    String nome;
    int energia;
    int fome;
    int sono;

    //isso é metodo de instância
    void cacar(){
        System.out.println(nome + "cacando");
    }
    void comer(){
        System.out.println(nome + "comendo");
    }
    void dormir(){
        System.out.println(nome + "dormindo");
    }
}