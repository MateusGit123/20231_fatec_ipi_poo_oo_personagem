import static java.lang.Math.min;
public class Personagem{
    //variavel de instancia
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    //isso é metodo de instância
    void cacar(){
        if (energia >= 2){
        System.out.println(nome + "cacando");
        energia = energia - 2; //Ou voce pode escrever energia -= 2
    }
    else{
        System.out.println(nome + "sem energia para cacar");
        fome = min(fome + 1, 10);
        sono = min(fome + 1, 10);
    }
}


    void comer(){
        if (fome >= 1){
        System.out.println(nome + "comendo");
        energia = min (energia +1, 10);
        fome -= 1;
    }
    else{
        System.out.println(nome + "sem fome");
    }
}


    void dormir(){
        if (sono >= 1){
        System.out.println(nome + "dormindo");
        energia = energia + 1 < 10 ? energia + 1 : 10; //O : é o "se nao"
        sono --;
    }
    else{
        System.out.println(nome + "sem sono");
    }
}
}