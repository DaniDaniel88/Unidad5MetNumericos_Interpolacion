package MenuOpciones;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class METLAGRANGE {
     double ResultadoFinal;
    public ArrayList<VariablesLagrange> MetodoInterLagrange(int NGradoSelect, double x)
    {
        ArrayList<VariablesLagrange> lista;
        int NoIteracion = 0;
        lista = new ArrayList<VariablesLagrange>();

        int i;
        double a[][] = new double[4][2];

        do { // n = 1 y n = 5
        } while (NGradoSelect < 2 || NGradoSelect > 4);
        for (i = 0; i < NGradoSelect; i++) 
        {
            //pide dato de la tabla en X0....
            a[i][0] = Double.parseDouble(JOptionPane.showInputDialog("X " + i));
            //pide dato de la tabla en Fx....
            a[i][1] = Double.parseDouble(JOptionPane.showInputDialog("F(" + i+")"));

            VariablesLagrange fila = new VariablesLagrange();
            fila.setI(i); fila.setX(a[i][0]); fila.setFx(a[i][1]);
            lista.add(fila);
        }


        switch (NGradoSelect) {
            case 2:
                ResultadoFinal = (((((x - a[1][0]) * a[0][1]) / (a[0][0] - a[1][0])) + (((x - a[0][0]) * a[1][1]) / (a[1][0] - a[0][0]))));
                break;
            case 3:
                ResultadoFinal = ((x - a[1][0]) * (x - a[2][0]) * a[0][1]) / ((a[0][0] - a[1][0]) * (a[0][0] - a[2][0])) + ((x - a[0][0]) * (x - a[2][0]) * a[1][1]) / ((a[1][0] - a[0][0]) * (a[1][0] - a[2][0])) + ((x - a[1][0]) * ((x - a[0][0]) * a[2][1]) / ((a[2][0] - a[0][0]) * (a[2][0] - a[1][0])));
                break;
            case 4:
                ResultadoFinal = ((x - a[1][0]) * (x - a[3][0]) * (x - a[2][0]) * a[0][1]) / ((a[0][0] - a[1][0]) * (a[0][0] - a[2][0]) * (a[0][0] - a[3][0])) + ((x - a[0][0]) * (x - a[2][0]) * (x - a[3][0]) * a[1][1]) / ((a[1][0] - a[0][0]) * (a[1][0] - a[2][0]) * (a[1][0] - a[3][0])) + ((x - a[0][0]) * (x - a[1][0]) * ((x - a[3][0]) * a[2][1]) / ((a[2][0] - a[0][0]) * (a[2][0] - a[1][0]) * (a[2][0] - a[3][0])) + ((x - a[0][0]) * (x - a[1][0]) * ((x - a[2][0]) * a[3][1]) / ((a[3][0] - a[0][0]) * (a[3][0] - a[1][0]) * (a[3][0] - a[2][0]))));
                break;
            default:
                JOptionPane.showInputDialog("GRADO INVALIDO");
                break;
        }
        return lista;
    }

    public String resultado() 
    {
        return String.valueOf(ResultadoFinal);
    }
    
}
