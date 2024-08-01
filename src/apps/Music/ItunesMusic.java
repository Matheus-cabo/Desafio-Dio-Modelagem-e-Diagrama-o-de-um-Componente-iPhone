package apps.Music;


public class ItunesMusic implements ReprodutorMusical{

    private boolean tocando = true;
    private ArmazenarMusica armazenarMusica;

     public ItunesMusic(ArmazenarMusica armazenamentoMusica){
        this.armazenarMusica = armazenamentoMusica;
    } 

    public void tocar() {
        if (tocando) {
            System.out.println("Tocando musica");
        }
    }   
    public void pausar() {
        if (tocando) {
            System.out.println("Pausando música");
            
        }
    }    
    public void selecionarMusica(String musica) {
        if (armazenarMusica != null) {
            System.out.println("Selecionando musica " + armazenarMusica.getMusica());
            tocar();
        }

    }
    
}
