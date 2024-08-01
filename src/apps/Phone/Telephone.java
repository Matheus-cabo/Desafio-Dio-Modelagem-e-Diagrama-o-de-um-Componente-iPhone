package apps.Phone;

import java.util.Random;

public class Telephone implements AparelhoTelefonico {

    

    private Random random = new Random();
    private Contato contato;
    

    public Telephone(Contato contato){
        this.contato = contato;
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
    
    
    
}
