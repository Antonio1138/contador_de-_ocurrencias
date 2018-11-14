package practica;

import java.util.Scanner;

public class ContadorOcurrencias extends Thread {

    Scanner sc=new Scanner(System.in);
    String texto;
    String sTextoBuscado;
    int contador;

    public ContadorOcurrencias(){
        this.texto=texto;
        this.sTextoBuscado=sTextoBuscado;
        this.contador=contador;
    }

    public void run(){

        //Pedimos al usuario la palabra a buscar
        System.out.print("Introduce la palabra que deseas buscar: ");
        sTextoBuscado = sc.nextLine();

        //El usuario empieza a escribir
        System.out.println("Introduce texto: ");
        texto = sc.nextLine();



        // Contador de ocurrencias
        while (texto.indexOf(sTextoBuscado) > -1) {
            texto = texto.substring(texto.indexOf(sTextoBuscado)+sTextoBuscado.length());
            contador++;
        }

        System.out.println (contador);
    }

    public static void main(String[] args) {

        ContadorOcurrencias con = new ContadorOcurrencias();
        con.start();
        try {
            con.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
