public class InvStackMAIN {
    public static void main(String[] args) {
        verificador stackInv = new verificador(10);
        String cadEnt = "perro";
        String cadSal = stackInv.invertirCadena(cadEnt);
        System.out.println(cadSal);
    }
}
