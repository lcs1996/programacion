
public class Dado{
	private int valor;
	
	public Dado () {
		;
	}
	
	public void tirarDado(){
		//este metodo dara un valor aleatorio
		this.valor=(int) ((Math.random()*6)+1);
		return this.valor;
	}
	
	public int getValor() {
	return this.valor;
	}	
}