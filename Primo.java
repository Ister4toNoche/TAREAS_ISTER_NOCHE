 	public class Primo {
        private int tama�o;

    public Primo(int tama�o, int numero) {
        this.tama�o = tama�o;
        
    }

    public int getTama�o() {
        return tama�o;
    }

    public void setTama�o(int tama�o) {
        this.tama�o = tama�o;
    }

   
    

	 public void mostrarSerie(){
        System.out.print("Serie de numeros primos "+tama�o+":\n");
        for (int i = 0; i < tama�o; i++) {
            calcular(i);
        }
        System.out.println();
    }
         public void calcular(int n){
            if(n%2==1)
               System.out.println(""+n);
        }
}
