import java.io.*;

public class PrimitiveWriteChars {
    private String ruta = "/home/dam/Desktop/primitiveWriteChars/texto5.txt";
    private String cadea = "o tempo está xélido";
    private Integer lonxitude = cadea.length();
    private FileOutputStream fos;
    private FileInputStream fis;
    private BufferedOutputStream bos;
    private BufferedInputStream bis;
    private DataInputStream dis;
    private DataOutputStream dos;

    public void escribir() {
        try {
            fos = new FileOutputStream(ruta);
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bos);
            for (int i=0; i<3; i++) {
                dos.writeChars(cadea);
                System.out.println("Escribindo: " + cadea);
                System.out.println("levamos :" + dos.size() + " bytes escritos");
            }
            dos.close();
        } catch (IOException e) {
            System.out.println("Error de escritura");
        }
    }
    public void leer() {
        try {
            fis = new FileInputStream(ruta);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);
            while (dis.available()>0) {
                for (int i=0; i<lonxitude; i++){
                    System.out.print(dis.readChar());
                }
                System.out.println();
                System.out.println("Bytes restantes: " + dis.available());
            }
            if (dis.available() == 0) {
                System.out.println("Non quedan bytes por ler");
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
}
