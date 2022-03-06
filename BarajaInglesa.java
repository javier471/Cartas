package sieteMedia;

public class BarajaInglesa extends Baraja{
	
	public BarajaInglesa(int numCartas) {
		super(numCartas);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String generaPalo() {
		String resul;
		int num = (int) (Math.random() * 4);
		resul = PalosBarajaInglesa.values()[num].toString();
		return resul;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
}
