
package Classes;

import java.util.ArrayList;

public class Dados_Veiculos_Carga {
    
    public static ArrayList<Dados_Veiculos_Carga> carga = new ArrayList<Dados_Veiculos_Carga>();
    
    //dados veiculo;
    private String chassi;  
    private String placa;
    private String marca;
    private String modelo;  
    private double cargamaxima;
    private int km;
    
    //dados revendedor
    private String revendedor;
    private String endereço;
    private String telefone;

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    
    
    
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

    public double getCargamaxima() {
        return cargamaxima;
    }

    public void setCargamaxima(double cargamaxima) {
        this.cargamaxima = cargamaxima;
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

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
