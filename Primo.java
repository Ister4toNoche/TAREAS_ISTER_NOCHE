 	public class Primo {
        private int tamaño;

    public Primo(int tamaño, int numero) {
        this.tamaño = tamaño;
        
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

   
    

	 public void mostrarSerie(){
        System.out.print("Serie de numeros primos "+tamaño+":\n");
        for (int i = 0; i < tamaño; i++) {
            calcular(i);
        }
        System.out.println();
    }
         public void calcular(int n){
            if(n%2==1)
               System.out.println(""+n);
        }
}
