package apps.Internet;



public class Safari implements NavegadorNaInternet{

    private String url;
    private ArmazenarUrl armazenarUrl;

     public Safari(ArmazenarUrl armazenarUrl){
        this.armazenarUrl = armazenarUrl;
    } 
  
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
