
package br.ulbra.model;


public class Fornecedor {
     private int idFor;
    private String nomeRazao;
    private String nomeFantasia;
    private String telefone;
    private String email;
   
    public Fornecedor(){
    }
   
    public Fornecedor(int idFor, String nomeRazao, String nomeFantasia, String telefone, String email){
        this.idFor = idFor;
        this.nomeRazao = nomeRazao;
        this.nomeFantasia = nomeFantasia;
        this.telefone = telefone;
        this.email = email;
    }

    public int getIdFor() {
        return idFor;
    }

    public void setIdFor(int idFor) {
        this.idFor = idFor;
    }

    public String getNomeRazao() {
        return nomeRazao;
    }

    public void setNomeRazao(String nomeRazao) {
        this.nomeRazao = nomeRazao;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    @Override
    public String toString(){
        return "ID: "+idFor+" Nome: "+nomeRazao+" nomeFantasia: "+nomeFantasia+"Telefone: "+telefone+" Email: "+email;
    }
   
} 
    

