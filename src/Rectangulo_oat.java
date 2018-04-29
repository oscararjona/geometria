/**
 * @ author oscar arjona tena
 * @ version 1.1
 */
public class Rectangulo_oat extends FiguraGeometrica_oat {
	private double l1;
	private double l2;
	/**
	 * @param l1 medida del lado mayor
	 * @param l2 medida del lado menor
	 */

	public Rectangulo_oat(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
/**
 * metodo para calcular el area del rectangulo a partir de sus lados
 * @return area
 */	
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * metodo para calcular el perimetro a partir de sus lados
	 * @return perimetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
