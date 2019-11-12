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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DarkLogin {
  @FXML public AnchorPane loginBackground;
  @FXML public ImageView logo;
  @FXML public Label loginEmailLabel;
  @FXML public TextField loginEmail;
  @FXML public Text forgotEmail;
  @FXML public Label loginPasswordLabel;
  @FXML public PasswordField loginPassword;
  @FXML public Text forgotPassword;
  @FXML public Button login;
  @FXML public Button signUp;
  @FXML public Label statusText;
  @FXML public Pane backDrop;

  public void handleForgotEmailAction(MouseEvent mouseEvent) throws IOException {
    Parent homePageParent = FXMLLoader.load(getClass().getResource("darkForgotEmail.fxml"));
    Scene homePageScene = new Scene(homePageParent);
    Stage homeStage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
    homeStage.setScene(homePageScene);
    homeStage.show();
  }

  public void handleForgotPasswordAction(MouseEvent mouseEvent) throws IOException {
    Parent homePageParent = FXMLLoader.load(getClass().getResource("darkForgotPassword.fxml"));
    Scene homePageScene = new Scene(homePageParent);
    Stage homeStage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
    homeStage.setScene(homePageScene);
    homeStage.show();
  }

  public void handleLoginAction(ActionEvent actionEvent) throws IOException {
    Parent homePageParent = FXMLLoader.load(getClass().getResource("darkHome.fxml"));
    Scene homePageScene = new Scene(homePageParent);
    Stage homeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
    homeStage.setScene(homePageScene);
    homeStage.show();
  }

  public void handleSignUpAction(ActionEvent actionEvent) throws IOException {
    Parent homePageParent = FXMLLoader.load(getClass().getResource("darkSignUp.fxml"));
    Scene homePageScene = new Scene(homePageParent);
    Stage homeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
    homeStage.setScene(homePageScene);
    homeStage.show();
  }
}
