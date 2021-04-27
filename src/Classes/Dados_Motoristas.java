
package Classes;

import java.util.ArrayList;

public class Dados_Motoristas {
    
    public static ArrayList<Dados_Motoristas> motoristas = new ArrayList<Dados_Motoristas>();

    private int matricula;
    private String nome;
    private String correcaovisual;
    private String validadehabilitacao;
    private String tipo;    
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorrecaovisual() {
        return correcaovisual;
    }

    public void setCorrecaovisual(String correcaovisual) {
        this.correcaovisual = correcaovisual;
    }

    public String getValidadehabilitacao() {
        return validadehabilitacao;
    }

    public void setValidadehabilitacao(String validadehabilitacao) {
        this.validadehabilitacao = validadehabilitacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}