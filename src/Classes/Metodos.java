package Classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Metodos {

    public void salvar(Dados_Motoristas x) {
        x.motoristas.add(x);
        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
    }

    public void salvarveiculospasseio(Dados_Veiculos_Passeio x) {
        x.passeio.add(x);
        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
    }

    public void salvarveiculoscarga(Dados_Veiculos_Carga x) {
        x.carga.add(x);
        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
    }

    public void salvarmovimentacao(Dados_Movimentacao x) {
        x.movimentacao.add(x);
        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
    }

    public void salvarmanutencao(Dados_Manutencao x) {
        x.manutencao.add(x);
        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
    }

    public ArrayList dataM() {
        ArrayList<Dados_Movimentacao> listaMovi = new ArrayList<Dados_Movimentacao>();
        int v = 0;

        String data;

        for (int i = 0; i < Dados_Movimentacao.movimentacao.size(); i++) {
            v = 0;
            Dados_Movimentacao x = new Dados_Movimentacao();

            data = Dados_Movimentacao.movimentacao.get(i).getData();
            for (int j = 0; j < listaMovi.size(); j++) {
                if (Dados_Movimentacao.movimentacao.get(i).getData().equals(listaMovi.get(j).getData())) {
                    v++;
                }
            }
            if (v == 0) {
                x.setData(Dados_Movimentacao.movimentacao.get(i).getData());
                listaMovi.add(x);
            }
        }
        return listaMovi;
    }

    
    public ArrayList dataMovimentacao(String data) {
        ArrayList<Dados_Movimentacao> listaMovimentacao = new ArrayList<Dados_Movimentacao>();
        for (int i = 0; i < Dados_Movimentacao.movimentacao.size(); i++) {
            if (data.equals(Dados_Movimentacao.movimentacao.get(i).getData())) {
                Dados_Movimentacao x = new Dados_Movimentacao();
                x.setData(Dados_Movimentacao.movimentacao.get(i).getData());
                x.setNome(Dados_Movimentacao.movimentacao.get(i).getNome());
                x.setPlaca(Dados_Movimentacao.movimentacao.get(i).getPlaca());
                x.setMarca(Dados_Movimentacao.movimentacao.get(i).getMarca());
                x.setModelo(Dados_Movimentacao.movimentacao.get(i).getModelo());
                x.setKminicial(Dados_Movimentacao.movimentacao.get(i).getKminicial());
                x.setKmfinal(Dados_Movimentacao.movimentacao.get(i).getKmfinal());
                
                listaMovimentacao.add(x);
                
            }
        }
        return listaMovimentacao;
    }
    
    
    
    public ArrayList dataManutencao(String data) {
        ArrayList<Dados_Manutencao> listaManutencao = new ArrayList<Dados_Manutencao>();
        for (int i = 0; i < Dados_Manutencao.manutencao.size(); i++) {
            if (data.equals(Dados_Manutencao.manutencao.get(i).getData())) {
                Dados_Manutencao x = new Dados_Manutencao();
                x.setData(Dados_Manutencao.manutencao.get(i).getData());
                x.setPlaca(Dados_Manutencao.manutencao.get(i).getPlaca());
                x.setModelo(Dados_Manutencao.manutencao.get(i).getModelo());
                x.setDescricao_servico(Dados_Manutencao.manutencao.get(i).getDescricao_servico());
                x.setDescricao_manutencao(Dados_Manutencao.manutencao.get(i).getDescricao_manutencao());
                listaManutencao.add(x);
            }
        }

        return listaManutencao;
    }
    
    
    public ArrayList data() {
        ArrayList<Dados_Manutencao> lista = new ArrayList<Dados_Manutencao>();
        int v = 0;

        String data;

        for (int i = 0; i < Dados_Manutencao.manutencao.size(); i++) {
            v = 0;
            Dados_Manutencao x = new Dados_Manutencao();

            data = Dados_Manutencao.manutencao.get(i).getData();
            for (int j = 0; j < lista.size(); j++) {
                if (Dados_Manutencao.manutencao.get(i).getData().equals(lista.get(j).getData())) {
                    v++;
                }
            }
            if (v == 0) {
                x.setData(Dados_Manutencao.manutencao.get(i).getData());
                lista.add(x);
            }
        }
        return lista;
    }
}
