
package Classes;

import java.util.ArrayList;

public class Dados_Manutencao {
    
    public static ArrayList<Dados_Manutencao> manutencao = new ArrayList<Dados_Manutencao>();

    private String placa;
    private String descricao_servico;
    private String descricao_manutencao;
    private String marca;
    private String modelo;
    private String data;
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDescricao_servico() {
        return descricao_servico;
    }

    public void setDescricao_servico(String descricao_servico) {
        this.descricao_servico = descricao_servico;
    }

    public String getDescricao_manutencao() {
        return descricao_manutencao;
    }

    public void setDescricao_manutencao(String descricao_manutencao) {
        this.descricao_manutencao = descricao_manutencao;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
