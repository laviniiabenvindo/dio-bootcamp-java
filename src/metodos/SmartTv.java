package metodos;

public class SmartTv {
 boolean ligada = false;
 int canal = 0;
 int volume = 0;

 public void ligar() {
  ligada = true;
  System.out.println("TV Ligada");
 }

 public void desligar() {
  ligada = false;
  System.out.println("TV Desligada");
 }

 public void mudarCanal(int novoCanal) {
  canal = novoCanal;
  System.out.println("Canal: " + canal);
 }


 public void aumentarVolume() {
  volume++;
  System.out.println("Volume: " + volume);

 }

 public void diminuirVolume() {
  volume--;
  System.out.println("Volume: " + volume);
 }
}