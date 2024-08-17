public class Variavel {
 public static void main(String[] args) {
  // tipos de variável
  String meuNome = "Lavínia";
  int anoFabricacao = 2024;
  boolean verdadeira = true;
  boolean falsa = false;  

  // Métodos
  String primeiroNome = "Lavínia";
  String segundoNome = "Emelly";

  String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
  System.out.println(nomeCompleto);
 }
 public static String nomeCompleto (String primeiroNome, String segundoNome){
  return primeiroNome.concat(" ").concat(segundoNome);
 }
}
