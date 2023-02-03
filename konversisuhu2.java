package aaaaa;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

        // double kelvin; 
        // double farenheit;
        // double reamur;

        // kelvin = suhu + 273.15;
        // farenheit = (suhu * 9/5) + 32;
        // reamur = suhu * 4/5; 

public class konversisuhu2 {
    public static void main(String[] args) {
        double celcius;
        ImageIcon icon = new ImageIcon("images.png");
        String suhu = (String) JOptionPane.showInputDialog(null,"Masukkan Celcius :","Converter Suhu",JOptionPane.INFORMATION_MESSAGE,icon,null,"");
        DecimalFormat df = new DecimalFormat ("0.00");
        if ( suhu != null ) {
            celcius = Double.parseDouble(suhu);
            double kelvin    = celcius + 273.15;
            double farenheit = (celcius * 9/5) + 32;
            double reamur    = celcius * 4/5;
            JOptionPane.showMessageDialog(null, "kelvin = " +  df.format(kelvin) + " C" + "\n" 
                                            + "farenheit = " + df.format(farenheit)+ " F" + "\n" +  "reamur = " + df.format(reamur) + " R" );
        }
    }
}
