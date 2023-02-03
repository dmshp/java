package aaaaa;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class konversiuang {


    //"0.000000"
    public static void main(String[] args) {
        /* int num1;
        String FirstNumber = JOptionPane.showInputDialog(null, "Please Enter Rupiah : ");
        if ( FirstNumber != null ) {
            num1 = Integer.parseInt(FirstNumber);
            Double jadiDouble = (double) num1;
            Double toDollar = jadiDouble * 0.000067;
            JOptionPane.showMessageDialog(null, "Maka menjadi = " + "$" +toDollar);
        } */

        double num1;
        ImageIcon icon = new ImageIcon("images.png");
        
        DecimalFormat df = new DecimalFormat ("0.00");
        String FirstNumber = (String) JOptionPane.showInputDialog(null,"Masukkan Jumlah rupiah","Converter Rupiah to USD",JOptionPane.INFORMATION_MESSAGE,icon,null,"");
        if ( FirstNumber != null ) {
            num1 = Double.parseDouble(FirstNumber);
            double toDollar = num1 * 0.000067;
            JOptionPane.showMessageDialog(null, "Maka menjadi = " + "$" + df.format(toDollar));
        }
        
    }
}
