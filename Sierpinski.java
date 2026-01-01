/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		double x1 = 0;
		double y1 = 0;
		double x2 = 1;
		double y2 = 0;
		double x3 = 0.5;
		double y3 = 1;
		sierpinski(n, x1, x2, x3, y1, y2, y3);
		//// Replace this comment with your code
	}
	
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3,
		
			                                 double y1, double y2, double y3) {
			if (n == 0) {
				double [] xs = {x1, x2, x3};
				double [] ys = {y1, y2, y3};
				StdDraw.polygon(xs, ys);
			return;
			}
		 
double p1x = (x1 + x2) / 2;
double p1y = (y1 + y2) / 2;

double p2x = (x1 + x3) / 2;
double p2y = (y1 + y3) / 2;

double p3x = (x2 + x3) / 2;
double p3y = (y2 + y3) / 2;

sierpinski(n - 1, x1, p1x, p2x, y1, p1y, p2y);

sierpinski(n - 1, p1x, x2, p3x, p1y, y2, p3y);

sierpinski(n - 1, p2x, p3x, x3, p2y, p3y, y3);
			}
			}
										
		//// Replace this comment with your code
	

