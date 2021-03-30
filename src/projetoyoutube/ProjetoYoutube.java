
package projetoyoutube;

public class ProjetoYoutube {

   
    public static void main(String[] args) {
       Video v [] = new Video [2];
       v[0] = new Video("php");
       v[1] = new Video("JAVA");
        //.out.println(v[0].toString());
        //System.out.println(v[1].toString());
        
        Telespectador i [] = new Telespectador[2];
        i[0] = new Telespectador ("Maria", "F", 25, "mr");
        i[1] = new Telespectador ("Joao", "M", 23, "joaool");
        
        //System.out.println(i[0].toString()); 
        
       Visualizacao visu[] = new Visualizacao[3];
        visu[0] = new Visualizacao(i[0], v[0]);
         visu[0].avaliar();
        System.out.println(visu[0].toString());
       
        visu[1] = new Visualizacao(i[0], v[1]);
        visu[1].avaliar(87.0f);
        System.out.println(visu[1].toString());
        
        //System.out.println( v[1].toString());
    }
    
}
