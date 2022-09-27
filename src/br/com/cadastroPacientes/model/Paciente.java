
package br.com.cadastroPacientes.model;

public class Paciente {
    private String  nome;
    private String dataNascimento;
    private String sexo;
    private String cardNum;

    public Paciente() {
        this.nome = "";
        this.dataNascimento =  "";
        this.sexo = "";
        this.cardNum =  "";
        
    }

    public Paciente(String nome, String dataNascimento, String sexo, String cardNum) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cardNum = cardNum;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }
    
    
    
    
    
    
            
    
    
}
