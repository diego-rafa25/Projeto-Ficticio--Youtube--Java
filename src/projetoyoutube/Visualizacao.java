package projetoyoutube;
public class Visualizacao {
    private Telespectador espectador;
    private Video filme;
    
    public Visualizacao(Telespectador espectador, Video filme){
        this.espectador=espectador;
        this.filme=filme;
        this.espectador.setTotassistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    
    public Telespectador getEspectador(){
        return espectador;
    }
    public void setEspectador(Telespectador es){
        this.espectador=es;
    }
    public Video getFilme(){
        return filme;
    }
    public void setFilme(Video f){
        this.filme=f;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int n){
        this.filme.setAvaliacao(n);
    }
    public void avaliar(float porc){
     int tot =0;
        if (porc <=20) {
         tot=3;   
        }else if (porc <=50) {
            tot=5;
        }else if (porc <=90) {
            tot=8;
            
        }else{
            tot =10;
        }
        this.filme.setAvaliacao(tot);
    }
    
}
