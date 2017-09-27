/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10tabelas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author ice
 */
public class Aula10Tabelas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Pessoa> dados = getSampleData();
        JanelaTabela janela = new JanelaTabela(dados);
        janela.setSize(400,300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
    
    private static List<Pessoa> getSampleData(){
        List<Pessoa> pessoas = new ArrayList<Pessoa>(){
            {
                add(new Pessoa("Fulano", 18,"fulano@gmail.com"));
                add(new Pessoa("Beltrano", 18,"beltrano@gmail.com"));
                add(new Pessoa("Siclano", 18,"sicranu@gmail.com"));
        } 
                };
        return pessoas;
    }
    
}
