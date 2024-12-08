import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwdInput;

    @FXML
    private TextField unameInput;

    @FXML
    void loginHandler(ActionEvent event) throws IOException {
        String username = unameInput.getText();
        String password = passwdInput.getText();

        if (username.equals("Nazwa") && password.equals("Rafi")) {
            try {
                Parent loginParent = FXMLLoader.load(getClass().getResource("InventoryController.fxml"));
                Scene loginPage = new Scene(loginParent);

                Stage stage = (Stage) loginButton.getScene().getWindow();
                stage.setScene(loginPage);
                stage.show();
            } catch (IOException e) {
                showAlert("Error", "Tidak dapat memuat halaman Inventory!", AlertType.ERROR);
                e.printStackTrace();
            }
        } else {
            showAlert("Login Error", "Username atau password salah!", AlertType.ERROR);
        }
    }

    private void showAlert(String title, String message, AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
