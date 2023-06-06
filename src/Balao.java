public class Balao {

    // Atributos

    int id;
    String registro;
    String cor;
    String tipo;
    double altura;
    double peso;
    String porte;
    int capacidade;

    // Métodos
    public String voar(Combustivel fogo){
        return "voando com" + fogo;
    }
}
