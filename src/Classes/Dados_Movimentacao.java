
package Classes;

import java.util.ArrayList;

public class Dados_Movimentacao {
    
    public static ArrayList<Dados_Movimentacao> movimentacao = new ArrayList<Dados_Movimentacao>();

    private String nome;
    private String placa;
    private String marca;
    private String modelo;
    private int kminicial;
    private int kmfinal;
    private String data;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKminicial() {
        return kminicial;
    }

    public void setKminicial(int kminicial) {
        this.kminicial = kminicial;
    }

    public int getKmfinal() {
        return kmfinal;
    }

    public void setKmfinal(int kmfinal) {
        this.kmfinal = kmfinal;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    } 
    
}
