import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button ButtonAccess;

    @FXML
    private TextField TextFieldUser;

    @FXML
    private Label labelResult;

    @FXML
    void ActionLogin(ActionEvent event) {
        String name = TextFieldUser.getText();

        if (name.equals("")) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("*Campo Obrigatório!");
            alert.setHeaderText(null);
            alert.setContentText("Por favor preencha o campo Nome");
            alert.show();

        } else {
            System.out.println("Seja Bem Vindo(a) " + name);

            labelResult.setText("SEJA BEM VINDO(A) " + name.toUpperCase());
        }

    }

}
