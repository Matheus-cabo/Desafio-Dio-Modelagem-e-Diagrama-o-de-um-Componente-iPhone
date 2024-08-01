package usuario;


import java.util.Scanner;
import apps.Internet.NavegadorNaInternet;
import apps.Music.ReprodutorMusical;
import apps.Phone.AparelhoTelefonico;
import apps.multifuncional.Iphone;




public class Usuario {

    public static void main(String[] args) {
        Iphone em = new Iphone(null, null, null);
        
        while (true) {
            // Exibe o menu principal
            
            System.out.println("1: Navegar no Telephone");
            System.out.println("2: Navegar no Itunes");
            System.out.println("3: Navegar no Safari");
            System.out.println("0: Bloquear o celular");

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o newline após o nextInt

            switch (opcao) {
                case 1:
                    // Navegação no Telephone
                    
                    System.out.println("Digite o numero do telefone para ligar: ");
                    String numero = scanner.nextLine();
                    AparelhoTelefonico telephone = em;

                    telephone.ligar(numero);

                    boolean atender = telephone.sortearAtender();
                    telephone.atender(atender);
                    break;

                case 2:
                    // Navegação no Itunes
                    while (true) {
                        ReprodutorMusical itunes = em;
                        System.out.println("Escolha uma opção:");
                        System.out.println("1: Tocar música");
                        System.out.println("2: Pausar música");
                        System.out.println("3: Selecionar música");
                        System.out.println("0: Sair do App");

                        int opcao2 = scanner.nextInt();
                        scanner.nextLine(); // Consumir o newline após o nextInt

                        switch (opcao2) {
                            case 1:
                                itunes.tocar();
                                break;
                            case 2:
                                itunes.pausar();
                                break;
                            case 3:
                                System.out.println("Digite o nome da musica: ");
                                String musica = scanner.nextLine();
                                itunes.selecionarMusica(musica);
                                break;
                            case 0:
                                System.out.println("Saindo do Itunes.\n");
                                break; // Saí do loop interno e volta ao menu principal
                            default:
                                System.err.println("Opção inválida. Tente novamente");
                        }
                        if (opcao2 == 0) {
                            break;
                        }
                    }
                    break;
                    
                case 3:
                    // Navegação no Safari
                    while (true) {
                        System.out.println("Escolha uma opção:");
                        System.out.println("1: Exibir Pagina");
                        System.out.println("2: Adicionar Nova Aba");
                        System.out.println("0: Encerrar programa");
                        NavegadorNaInternet safari = em;

                        int opcao3 = scanner.nextInt();
                        scanner.nextLine(); // Consumir o newline após o nextInt

                        switch (opcao3) {
                            case 1:
                                System.out.println("Digite a URL");
                                String url = scanner.nextLine();
                                safari.exibirPagina(url);
                                break;
                            case 2:
                                safari.adicionarNovaAba();
                                break;
                            case 0:
                                System.out.println("Saindo do Safari.\n");
                                return; // Saí do loop interno e volta ao menu principal
                            default:
                                System.out.println("Opção inválida. Tente Novamente");
                        }
                        if (opcao3 == 0) {
                            break;
                        }                      
                    }
                    break;

                case 0:
                    // Bloquear o celular e encerrar o programa
                    System.out.println("Celular Bloqueado.\n");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente");
            }
        }
    }
}

