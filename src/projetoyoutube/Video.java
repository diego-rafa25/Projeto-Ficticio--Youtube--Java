package projetoyoutube;
public class Video implements AcoesVideo {
    private int views, curtidas, avaliacao;
    private String titulo;
    private boolean reproduzindo;
    //Construtor

    public Video(String titulo) {
        this.titulo = titulo;
        this.views=0;
        this.curtidas=0;
        this.avaliacao=1;
        this.reproduzindo= false;
    }
    
    //Métodos acessores e modificadores
    public int getViews(){
        return views;
    }
    public void setViews(int v){
        this.views=v;
    }
    public  int getCurtidas(){
        return curtidas;
    }
    public void setCurtidas(int c){
        this.curtidas=c;
    }
    public int getAvaliacao(){
        return avaliacao;
    }
    public void setAvaliacao(int av){
        int nova;
        nova  = (this.avaliacao+av)/this.views;
        this.avaliacao=nova;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String t){
        this.titulo=t;
    }
    public boolean getReproduzindo(){
        return reproduzindo;
    }
    public void setReproduzindo(boolean r){
        this.reproduzindo=r;
    }
    //Métodos abstratos
    @Override
    public void play() {
        this.reproduzindo= true;
    }

    @Override
    public void pause() {
        this.reproduzindo=false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return "Video{" + "views=" + views + ", curtidas=" + curtidas + ", avaliacao=" + avaliacao + ", titulo=" + titulo + ", reproduzindo=" + reproduzindo + '}';
    }
    
}
