package apps.multifuncional;

import java.util.Random;

import apps.Internet.ArmazenarUrl;
import apps.Internet.NavegadorNaInternet;
import apps.Music.ArmazenarMusica;
import apps.Music.ReprodutorMusical;
import apps.Phone.AparelhoTelefonico;
import apps.Phone.Contato;


public class Iphone implements NavegadorNaInternet, ReprodutorMusical, AparelhoTelefonico  {

    private Random random = new Random();
    private Contato contato;
    private ArmazenarMusica armazenarMusica;
    private ArmazenarUrl armazenarUrl;
    

    public Iphone(Contato contato, ArmazenarMusica armazenarMusica, ArmazenarUrl armazenarUrl){
        this.contato = contato;
        this.armazenarMusica = armazenarMusica;
        this.armazenarUrl = armazenarUrl;
    }
    
    public void ligar(String numero) {
        if (contato != null){
            System.out.println("Ligando para " + contato.getNumero());
        }
        
    }
    public  void atender(boolean atender) {   
        if (atender) {
            System.out.println("Atendendo a chamada");
            System.out.println("Alô");
        }else{
            System.out.println("Chamada não atendida");
            iniciarCorreioVoz();
        }
            
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    
    }
    public boolean sortearAtender() {
        return random.nextBoolean();
        
    }

    private boolean tocando = true;

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

    private String url;
  
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba");
        atualizarPagina();
        exibirPagina(url);
    }
   
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }

    public void exibirPagina(String url) {
        if (armazenarUrl != null) {
            System.out.println("Exibindi pagina " + armazenarUrl.getUrl());
            atualizarPagina();
        }
    }
    
    
}
