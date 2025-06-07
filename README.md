# UnicapMod:

Repositório oficial do projeto UnicapMod. Este mod para Minecraft foi desenvolvido como parte da nota do 2GQ da disciplina de Programação Orientada a Objetos e tem como objetivo explorar os conceitos teóricos de JAVA vistos em sala de maneira prática.
## 📜 Sobre o Projeto

O UnicapMod visa investigar e implementar a adição de um novo tier de mineração e equipamentos, a criação de um item interativo com GUI customizada, a exploração de mecânicas de drop customizadas e a utilização do sistema de geração de dados do Forge para recursos, receitas e geração de mundo, aplicando conceitos de design de jogos para expandir a experiência vanilla do Minecraft.

As funcionalidades atuais demonstram:

* **Novos Recursos Minerais:** Introdução do minério de Titânio, com sua própria lógica de geração no mundo e propriedades de extração.
* **Sistema de Equipamentos:** Desenvolvimento de um conjunto completo de armaduras e ferramentas de Titânio, com atributos e balanceamento projetados para serem superiores aos materiais existentes no jogo base (como Netherita).
* **Itens com Interface Customizada:** Implementação do item "R.A." (Registro Acadêmico), que, ao ser utilizado, exibe uma Interface Gráfica do Usuário (GUI) customizada com informações do jogador.
* **Modificação de Loot de Entidades:** Demonstração de como alterar os drops de entidades existentes no jogo, como a adição da "Pena Mágica" ao loot de galinhas.

## ✨ Funcionalidades Implementadas

* **Minério de Titânio e Processamento:**
    * **Geração:** O Titânio é gerado nas camadas profundas do Overworld, com uma taxa de aparição e tamanho de veio configurados para se assemelhar à raridade do diamante, com um máximo de 3 blocos por veio.
    * **Extração:** Requer uma picareta de [**Netherita ou Titânio**] para ser minerado e dropar o item "Raw Titanium". O tempo de quebra foi balanceado para que, com uma Picareta de Netherita, seja comparável ao tempo de quebrar Obsidiana com uma Picareta de Diamante. A Picareta de Titânio possui maior eficiência na extração deste minério.
    * **Refino:** O "Raw Titanium" pode ser fundido em uma Fornalha (Furnace) ou Alto-Forno (Blast Furnace) para produzir "Titanium Ingots".
* **Conjunto de Equipamentos de Titânio:**
    * **Ferramentas:** Espada, Picareta, Machado, Pá e Enxada fabricadas com Lingotes de Titânio. Projetadas para exceder as de Netherita em atributos como durabilidade, velocidade de mineração e dano.
    * **Armadura:** Conjunto completo (Capacete, Peitoral, Calças, Botas) fabricado com Lingotes de Titânio, oferecendo proteção e durabilidade superiores.
* **Itens Especiais e GUI:**
    * **Pena Mágica (Magic Feather):** Um item com 5% de chance de ser dropado por galinhas. Utilizado na receita do item "R.A.".
    * **Item R.A. (Registro Acadêmico):**
        * Obtido através de uma receita de fabricação combinando um Livro com Pena e uma Pena Mágica.
        * Ao ser utilizado pelo jogador (clique com o botão direito), uma GUI customizada é exibida.
        * A GUI apresenta:
            * Nome do jogador.
            * Um espaço reservado para uma representação visual.
            * Um número de matrícula gerado dinamicamente.
            * O campo "Curso: Ciência da Computação".

![Image](https://github.com/user-attachments/assets/8261dd85-c927-4311-ab41-ae2d8aa95918)



## 🛠️ Instruções de Instalação e Uso

1.  **Pré-requisitos:** É necessário ter o [Minecraft Forge](https://files.minecraftforge.net/net/minecraftforge/forge/) instalado para a versão **1.21.1** do Minecraft (ou a versão para a qual o mod foi compilado).
2.  **Download:** Baixe o arquivo `.jar` da versão mais recente do UnicapMod neste repositório.
3.  **Instalação:** Coloque o arquivo `.jar` baixado na pasta `mods` localizada no diretório de instalação do seu Minecraft (comumente `%appdata%\.minecraft\mods` no Windows).
4.  **Execução:** Inicie o Minecraft utilizando o perfil do Forge correspondente. O mod deverá ser carregado automaticamente.

## 🤝 Contribuições

Este projeto foi desenvolvido por Felipe Assis e Júlio César.
