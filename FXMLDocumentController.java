/*
 *《程式語言教學誌》的範例程式
 * http://kaiching.org/
 * 檔名：FXMLDocumentController.java
 * 功能：比大小的 Controller 類別
 * 作者：張凱慶
 */

package biggerdemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private TextField n1;

    @FXML
    private TextField n2;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        int a = Integer.parseInt(n1.getText());
        int b = Integer.parseInt(n2.getText());

        if (a == b) {
            label.setText("兩者相等。");
        }
        else {
            if (a > b) {
                label.setText(String.valueOf(a) + "比較大。");
            }
            else {
                label.setText(String.valueOf(b) + "比較大。");
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
