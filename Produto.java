public class Produto {
    private String nome;
    private String cpf;
    
    public Produto(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf; 
    }
    
    public Produto(String nome){
        this(nome, "");
    }
    
    public Produto(){
        this("","");
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public String toString(){
        String r;
        r = "\nNome:"+this.nome+"\nCpf:"+this.cpf;
        return r;
    }
    }