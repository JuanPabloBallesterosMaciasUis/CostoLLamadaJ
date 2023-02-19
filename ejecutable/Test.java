package ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) {
        
        //Declaración de variales

        int mIngresados;
        int costo;


        //int

        mIngresados = Integer.parseInt(JOptionPane.showInputDialog(
            "Dijite la cantidad de minutos de la llamada"));

        // Condicionales y proceso

        

        if (mIngresados <= 3)
        {
            costo = 500;

            JOptionPane.showMessageDialog(null,
                "La llamada de "+ mIngresados +" minutos cuesta "+costo + 
                " pesos","Costo de la llamada",JOptionPane.PLAIN_MESSAGE);
        }

        else if (mIngresados > 3)
        {
            costo = ((mIngresados - 3)*50)+300;

            JOptionPane.showMessageDialog(null,
            "La llamada de "+ mIngresados +" minutos cuesta "+costo + 
            " pesos","Costo de la llamada",JOptionPane.PLAIN_MESSAGE);
        }
    }
}