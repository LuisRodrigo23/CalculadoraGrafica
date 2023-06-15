package org.luisvaquin.main;

import static java.lang.Math.sqrt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    double num1, num2, total;
    int opcion;

    @FXML
    private TextField txtPantalla;

    @FXML

    private Button btnCero;
    @FXML
    private Button btnUno;

    @FXML
    private Button btnDos;

    @FXML
    private Button btnTres;

    @FXML
    private Button btnCuatro;

    @FXML
    private Button btnCinco;

    @FXML
    private Button btnSeis;

    @FXML
    private Button btnSiete;

    @FXML
    private Button btnOcho;

    @FXML
    private Button btnNueve;

    @FXML
    private Button btnC;

    @FXML
    private Button btnCE;

    @FXML
    private Button btnSuma;

    @FXML
    private Button btnMenos;

    @FXML
    private Button btnMult;

    @FXML
    private Button btnD;

    @FXML
    private Button btnDivision;

    @FXML
    private Button btnPunto;

    @FXML
    private Button btnMasMenos;

    @FXML
    private Button btnUnoX;

    @FXML
    private Button btnCuadrado;

    @FXML
    private Button btnRaiz;

    @FXML
    private Button btnPorciento;

    @FXML
    private Button btnIgual;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnCero) {
            txtPantalla.setText(txtPantalla.getText() + "0");
        }

        if (event.getSource() == btnUno) {
            txtPantalla.setText(txtPantalla.getText() + "1");
        }

        if (event.getSource() == btnDos) {
            txtPantalla.setText(txtPantalla.getText() + "2");
        }

        if (event.getSource() == btnTres) {
            txtPantalla.setText(txtPantalla.getText() + "3");
        }

        if (event.getSource() == btnCuatro) {
            txtPantalla.setText(txtPantalla.getText() + "4");
        }

        if (event.getSource() == btnCinco) {
            txtPantalla.setText(txtPantalla.getText() + "5");
        }

        if (event.getSource() == btnSeis) {
            txtPantalla.setText(txtPantalla.getText() + "6");
        }

        if (event.getSource() == btnSiete) {
            txtPantalla.setText(txtPantalla.getText() + "7");
        }

        if (event.getSource() == btnOcho) {
            txtPantalla.setText(txtPantalla.getText() + "8");
        }

        if (event.getSource() == btnNueve) {
            txtPantalla.setText(txtPantalla.getText() + "9");
        } else if (event.getSource() == btnSuma) {
            num1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            btnPunto.setDisable(false);
            opcion = 1;
        }

        // ----------------------------------------------------------    
        if (event.getSource() == btnMenos) {
            num1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            btnPunto.setDisable(false);
            opcion = 2;
        }

        if (event.getSource() == btnMult) {
            num1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            btnPunto.setDisable(false);
            opcion = 3;
        }
        if (event.getSource() == btnDivision) {
            num1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            btnPunto.setDisable(false);
            opcion = 4;
        }

        if (event.getSource() == btnPunto) {
            txtPantalla.setText(txtPantalla.getText() + ".");
            btnPunto.setDisable(false);
        }

        if (event.getSource() == btnC) {
            txtPantalla.setText("");
        }

        if (event.getSource() == btnCE) {
            num2 = 0;
            txtPantalla.setText("");
        }

        if (event.getSource() == btnPorciento) {
            num2 = Double.parseDouble(txtPantalla.getText());
            num2 = num1 * (num2 / 100);
            txtPantalla.setText(String.valueOf(num2));
        }

        if (event.getSource() == btnMasMenos) {
            num1 = Double.parseDouble(txtPantalla.getText());
            num1 = -num1;
            txtPantalla.setText(String.valueOf(num1));
        }

        if (event.getSource() == btnUnoX) {
            num1 = Double.parseDouble(txtPantalla.getText());
            total = 1 / (num1);
            txtPantalla.setText(String.valueOf(total));
        }

        if (event.getSource() == btnCuadrado) {
            num1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            total = Math.pow(num1, 2);
            txtPantalla.setText(String.valueOf(total));
        }

        if (event.getSource() == btnRaiz) {
            num1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            total = sqrt(num1);
            txtPantalla.setText(String.valueOf(total));
        }

        if (event.getSource() == btnIgual) {
            num2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");

            switch (opcion) {
                case 1:
                    total = num1 + num2;
                    txtPantalla.setText(String.valueOf(total));

                    break;
                case 2:
                    total = num1 - num2;
                    txtPantalla.setText(String.valueOf(total));

                    break;
                case 3:
                    total = num1 * num2;
                    txtPantalla.setText(String.valueOf(total));
                    break;

                case 4:
                    total = num1 / num2;
                    txtPantalla.setText(String.valueOf(total));
                    break;
            }

        } else if (event.getSource() == btnD) {
            System.exit(0);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
