package ex01;

// Classe Pessoa
class Pessoa {
    String nome;
    int idade;
    String cpf;
    String email;

    void andar() {
        System.out.println(nome + " está andando.");
    }

    void comer() {
        System.out.println(nome + " está comendo.");
    }

    void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    void falar() {
        System.out.println(nome + " está falando.");
    }
}

// Classe Animal
class Animal {
    String especie;
    int idade;
    String cor;
    double peso;

    void comer() {
        System.out.println("Animal comendo.");
    }

    void dormir() {
        System.out.println("Animal dormindo.");
    }

    void correr() {
        System.out.println("Animal correndo.");
    }

    void latir() {
        System.out.println("Animal latindo.");
    }
}

// Classe Carro (faltava no seu código)
class Carro {
    String marca;
    String modelo;
    String cor;
    String placa;

    void ligar() {
        System.out.println("Carro ligado.");
    }

    void acelerar() {
        System.out.println("Carro acelerando.");
    }

    void frear() {
        System.out.println("Carro freando.");
    }

    void buzinar() {
        System.out.println("Biiiii!");
    }
}

// Classe principal com o método main
public class Ex01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Weverton";
        pessoa.andar();
        pessoa.comer();

        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.modelo = "Uno";
        carro.buzinar();

        Animal animal = new Animal();
        animal.especie = "Cachorro";
        animal.latir();
    }
}
