package HelloWorldJavaFX;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author vinic
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMensagem;
    
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Olá, Mundo!!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
