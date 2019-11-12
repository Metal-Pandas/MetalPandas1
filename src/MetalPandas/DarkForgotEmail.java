package MetalPandas;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DarkForgotEmail {
  @FXML public AnchorPane forgotEmailBackground;
  @FXML public TextField forgotPhoneNumber;
  @FXML public Label forgotEmailLabel;
  @FXML public Button confirm;
  @FXML public Button back;
  @FXML public Label forgotEmailStatus;

  public void handleConfirmAction(ActionEvent actionEvent) {
    // we want a text sent to the number given!!!
  }

  public void handleBackAction(ActionEvent actionEvent) throws IOException {
    Parent homePageParent = FXMLLoader.load(getClass().getResource("darkLogin.fxml"));
    Scene homePageScene = new Scene(homePageParent);
    Stage homeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
    homeStage.setScene(homePageScene);
    homeStage.show();
  }
}
