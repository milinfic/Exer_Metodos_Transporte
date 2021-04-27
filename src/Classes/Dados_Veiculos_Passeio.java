package Classes;

import java.util.ArrayList;

public class Dados_Veiculos_Passeio {

    public static ArrayList<Dados_Veiculos_Passeio> passeio = new ArrayList<Dados_Veiculos_Passeio>();
    
    private String chassi;
    private String placa;
    private String marca;
    private String modelo;
    private int velocidademaxima;
    private int quantidadepassageiros;
    private int km;

    //dados revendedor
    private String revendedor;
    private String endereço;
    private String telefone;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
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

    public int getVelocidademaxima() {
        return velocidademaxima;
    }

    public void setVelocidademaxima(int velocidademaxima) {
        this.velocidademaxima = velocidademaxima;
    }

    public int getQuantidadepassageiros() {
        return quantidadepassageiros;
    }

    public void setQuantidadepassageiros(int quantidadepassageiros) {
        this.quantidadepassageiros = quantidadepassageiros;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getRevendedor() {
        return revendedor;
    }

    public void setRevendedor(String revendedor) {
        this.revendedor = revendedor;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    //dados veiculo;
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }   

}
