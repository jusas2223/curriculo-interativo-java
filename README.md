# 📄 Currículo Interativo em Java (CLI Application)

Uma aplicação de terminal desenvolvida em **Java** para exibir informações profissionais de forma dinâmica e interativa, simulando a leitura de dados de produção a partir de um arquivo estruturado em formato **JSON**.

---

##  Tecnologias e Conceitos Aplicados

Este projeto foi construído do zero para aplicar e consolidar boas práticas de engenharia de software e arquitetura de código, englobando:

* **Java 17 / POO**: Uso prático dos pilares da Orientação a Objetos, com forte foco em **Encapsulamento** (atributos privados e métodos acessores `get`) para proteção dos dados em memória.
* **Gerenciamento de Dependências com Maven**: Configuração e gerenciamento automatizado do ciclo de vida da aplicação através do arquivo `pom.xml`.
* **Manipulação de JSON (Google Gson)**: Integração da biblioteca de código aberto `com.google.code.gson` para realizar o mapeamento objeto-relacional direto a partir de arquivos físicos.
* **Arquitetura Modular (Camadas)**: Divisão clara de responsabilidades no código separando os Modelos de Dados (`model`), a Lógica de Leitura (`controller`) e a Interface com o Usuário (`Main`).
* **Tratamento de Exceções**: Implementação de blocos robustos de `try/catch` para prevenção de falhas de I/O (entrada/saída de dados) e tratamento de erros de digitação no console.

---

##  Como Funciona o Sistema

A aplicação inicializa lendo de forma assíncrona o arquivo local `curriculo.json`. Utilizando o motor do **Gson**, o texto puro é convertido instantaneamente em instâncias e listas de objetos Java.

A partir daí, um menu interativo em laço (`while`) permite que o usuário navegue pelas seções do currículo:

1.  **Objetivo Profissional**
2.  **Habilidades Técnicas** (Desenvolvimento back-end, banco de dados, e infraestrutura/redes Cisco)
3.  **Experiência Profissional**
4.  **Formação Acadêmica**
5.  **Projetos do Portfólio**

---

##  Estrutura do Projeto

* `src/main/java/org/example/model/`: Contém as classes que moldam as entidades de dados (`Curriculo`, `Experiencia`, `Formacao`, `Projeto`).
* `src/main/java/org/example/controller/`: Contém a inteligência de persistência e leitura do arquivo (`LeitorCurriculo`).
* `src/main/java/org/example/Main.java`: Ponto de entrada do sistema contendo a interface de menu e capturas de console (`Scanner`).
* `curriculo.json`: O "banco de dados" estruturado da aplicação.

---

##  Como Executar o Projeto Localmente

Caso queira clonar e testar a navegação na sua máquina através de uma IDE (como IntelliJ IDEA, Eclipse ou VS Code):

1. Certifique-se de possuir o **JDK 17 ou superior** instalado.
2. Clone o repositório em seu terminal:
   ```bash
   git clone [https://github.com/jusas2223/curriculo-interativo-java.git](https://github.com/jusas2223/curriculo-interativo-java.git)