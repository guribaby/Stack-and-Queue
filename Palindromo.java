public class palindromo {
	    int max;
	    int top;
	    public char[] stack;

	    public palindromo(int stackSize) {
	        this.stack = new char[stackSize];
	        this.max = this.stack.length;
	        this.top = -1;
	    }

	    public void push(char value) {
	        if (top == max - 1) {
	            System.out.println("Capacidad llena");
	            return;
	        }
	        top++;
	        stack[top] = value;
	    }

	    public char pop() {
	        if (top == -1) {
	            System.out.println("Espacio libre");
	            return '\0';
	        }
	        char value = stack[top];
	        top--;
	        return value;
	    }

	    public String invertirCadena(String cadEnt) {
	        palindromo stack = new palindromo(cadEnt.length());

	        for (int i = 0; i < cadEnt.length(); i++) {
	            stack.push(cadEnt.charAt(i));
	        }

	        String cadSal = "";
	        while (stack.top != -1) {
	          cadSal = cadSal + stack.pop();
	        }
	        return cadSal;
	    }
	}   
