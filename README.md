# 📱 Orientação a Objetos e UML: Diagramação de Classes do iPhone

## 📝 Descrição
Este repositório oferece uma implementação extensiva de um exercício de modelagem de software, com o objetivo de desempenhar de forma exata e completa as funcionalidades essencias do primeiro iPhone.

O projeto apresenta os pilares primordiais da orientação a objetos da linguagem Java, assim como maneiras de utlização da modelagem em UML, apresentando de forma transparente a costrução das funcionalidades do primeiro Iphone, que tinha como função: Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

A apresentação do programa principal na linguagem Java, trás o contato do Usuario com o Iphone, onde dependendo de qual função ele queira interagir, o programa irá realizar suas ordens. 

# 📃 Diagrama de Classes
- Obs: É necessário aplicar um zoom pra melhor visualização. 
- Caso queira optar por ver em PDF, deixarei o arquivo ao lado para download.  [Modelando Iphone.pdf](https://github.com/user-attachments/files/16461172/Modelando.Iphone.pdf) 

![Modelando Imagem](https://github.com/user-attachments/assets/88604809-b14d-4971-be9e-f0a5edaffc23)

A baixo, você encontrará uma descrição minuciosa de cada classe exibida no diagrama de classes do projeto. Cada classe tem um propósito específico e contribui para o funcionamento coeso do sistema.

### ``Usuário``

- A classe Usuário, representa o programa principal, onde por meio dos seus comandos no `Iphone`, o programa retornará o acesso que foi ordenado.

### ``Iphone``

- A classe Iphone, mostra o dispositivo em sua completude. Ela implementa a Interface `ReprodutorMusical`, `AparelhoTelefônico`, `NavegadorInternet`. Esta classe desempenha as 3 funcionalidades.

### ``NavegadorInternet``

- A interface `NavegadorInternet` define métodos para a navegação na internet, como `exibirPagina()`, `adicionarNovaAba()` e `atualizarPagina()`. As classes que implementam essa interface podem atuar como navegadores da Internet, que no caso é a Classe Entidade `Safari` e a Classe `Iphone`.

### ``ReprodutorMusical``

- A interface `ReprodutorMusical` define os métodos essenciais para controlar a reprodução de música, como `tocar()`, `pausar()` e `selecionarMusica()`. As classes que implementam essa interface são capazes de reproduzir músicas que no caso é a Classe Entidade `ItunesMusic` e a Classe `Iphone`.

### ``AparelhoTelefonico``

- A interface `AparelhoTelefonico` define os métodos para realizar chamadas telefônicas e enviar mensagens, incluindo `ligar()`, `atender()` e `iniciarCorreioVoz()`. As classes que implementam essa interface podem funcionar como dispositivos telefônicos, que no caso é a Classe Entidade `Telephone` e a Classe `Iphone`.

### ``Safari| ItunesMusic| Telephone``

- Classes Entidades exibidos como um software que é uma implementação das Interfaces. No caso do primeiro Iphone, para interagir com as funcionalidades, so tinha apenas esses 3 aplicativos. Os Atributos e Métodos dessas classes, são os mesmos que contém na Classe `Iphone`. Ou seja, para o Iphone de todas essas funcionalidades, ele precisa acessar cada Software Correspondente, (`Safari| ItunesMusic| Telephone`) de acordo com os Comandos da Classe ``Usuário``.

### ``ArmazenamentoURL``

- Classe Responsável por armazenar o Site Escolhido.

### ``ArmazenamentMusica``

- Classe Responsável por armazenar a Musica Escolhida.

### ``Contatos``

- Classe Responsável por armazenar o Número Escolhido.

``Cada classe ou interface assume um papel particular no sistema, o que favorece a multifuncionalidade do iPhone e a sua capacidade de realizar uma variedade de tarefas.``
