package bytebank.encapsulado;

import javax.swing.JOptionPane;


public class Cliente {
    
   private String nome;
   private String cpf;
   private String profissao;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
   
   
    public void dados(){
    
        this.nome = JOptionPane.showInputDialog("Digite seu nome");
        this.cpf = JOptionPane.showInputDialog("Qual é o seu CPF? ");
        this.profissao = JOptionPane.showInputDialog("Qual é a sua profissão? ");
        
    }
}

