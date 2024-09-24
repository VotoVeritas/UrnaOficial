## Uteis utilizados:
- No desenvolvimento do nosso projeto em Java Swing, utilizamos diversas classes e interfaces que facilitam a interação com o usuário.

- **ActionListener e ActionEvent:** Para capturar eventos de ação, como cliques em botões, implementamos a interface ActionListener. Ao sobrescrever o método actionPerformed(ActionEvent e), conseguimos definir as ações que ocorrem quando o usuário interage com um botão. Utilizamos a classe ActionEvent para obter detalhes sobre o evento, como a fonte do clique.

- **KeyListener e KeyEvent:** Para lidar com eventos de teclado, optamos pela interface KeyListener, bloqueando a utilização do teclado físico pelo usuário.

- **javax.swing.Timer:** Implementamos a classe Timer para executar eventos de troca de informações da tela ou troca de jframe e conteúdo de panels e labels. Essa funcionalidade é especialmente útil para animações e atualizações periódicas na interface.
