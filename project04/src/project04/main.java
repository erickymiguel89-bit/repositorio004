package project04;
import javax.swing.JOptionPane;
public class main {
 public static void main(String[] args) {
 int pontosplayer1 = 0;
 int pontosplayer2= 0;
 int i = 0; 
String resultado = null;
 String player1 = JOptionPane.showInputDialog(null, "Nome do player1:");
 String player2 = JOptionPane.showInputDialog(null, "Nome do splayer2:");
 while (i < 5) {
 String escolha1 = JOptionPane.showInputDialog(null, " rodada " + (i + 1) + " n" + player1 + ", escolha impar ou par:").toLowerCase();
 String escolha2 = JOptionPane.showInputDialog(null, " rodada " + (i + 1) + " n" + player2 + ", escolha impar ou par:").toLowerCase();
   if (escolha1.equals(escolha2)) {
   JOptionPane.showMessageDialog(null, "Os dois escolheram a mesma opcao. Jogo encerrado.");
   return; }
 int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, player1 + ", digite um numero:"));
 int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, player2 + ", digite um numero:"));
int soma = n1 + n2;
 if (soma % 2 == 0) {
resultado = "par";
 } else {
  resultado = "impar";
  }
 String infoRodada = "soma: " + soma + "\nResultado: " + resultado;
if (resultado.equals(escolha1)) {
   pontosplayer1++;
  infoRodada += "\nVencedor da rodada: " + player1 + "\nPontos em total " + player1 + ": " + pontosplayer1 + "\nPontos ttotal de " + player2 + ": " + pontosplayer2;
 } else {
pontosplayer2++;
  infoRodada += "\nVencedor da rodada: " + player2 + "\nPontos total de " + player2 + ": " + pontosplayer2 + "\nPontos total de " + player1 + ": " + pontosplayer1;  		}        
 JOptionPane.showMessageDialog(null, infoRodada, "resultado da rodada " + (i + 1), JOptionPane.INFORMATION_MESSAGE);
 i++; 
}
String mensagemFinal = " FIM DO JOGO placar: \n" 
 + player1 + ": " + pontosplayer1 + " pontos\n" 
 + player2 + ": " + pontosplayer2 + " pontos\n\n";

if (pontosplayer1 > pontosplayer2) {
  mensagemFinal += " o vencedor e: " + player1;
} else if (pontosplayer2 > pontosplayer1) {
  mensagemFinal += " o vencedor e: " + player2;
} else {
 mensagemFinal += "empate";
 }
 JOptionPane.showMessageDialog(null, mensagemFinal, "rsesultado Final", JOptionPane.INFORMATION_MESSAGE);}}