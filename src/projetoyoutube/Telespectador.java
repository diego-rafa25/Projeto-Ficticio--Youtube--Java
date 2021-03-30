
package projetoyoutube;


public class Telespectador extends Pessoa {
    private String login;
    private int totAssistido;
    //Métodos acessores e modificadores

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido(){
        return totAssistido;
    }
    public void setTotassistido( int t){
        this.totAssistido=t;
    }
    
    public Telespectador(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login=login;
        this.totAssistido=0;
    }

    @Override
    public String toString() {
        return "Telespectador{"  +super.toString() +  "\n login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
