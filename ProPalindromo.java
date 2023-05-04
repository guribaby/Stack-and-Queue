public class  PalinMAIN{
    public static void main(String[] args) {
        palindromo stackInv = new palindromo(10);
        String cadEnt = "anita lava la tina";
        String cadSal = stackInv.invertirCadena(cadEnt);
        System.out.println(cadSal);
        
    	String lowerString = cadSal.toLowerCase();
    	String replacesp = lowerString.replace(" ", "");
    	String cadenainv = ""; 
    	for (int n = replacesp.length() - 1; n >= 0; n--) {
    		cadenainv += replacesp.charAt(n); 
    		}
    	Boolean result = cadenainv.equals(replacesp);
    	if (result == true) {
    		System.out.println("Tu cadena es un palindromo"); 
    	}
    	else {
    		System.out.println("Tu cadena no es un palindromo"); 
    	}
    	
    }
}
