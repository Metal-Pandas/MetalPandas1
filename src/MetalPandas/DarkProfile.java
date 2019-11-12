package MetalPandas;

import java.io.IOException;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class DarkProfile {
  @FXML public SplitPane profileBackground;
  @FXML public VBox drawer;
  @FXML public HBox hBox;
  @FXML public ToolBar toolBar;
  @FXML public Button menuButton;
  @FXML public ToggleButton lightMode;
  @FXML public ToggleButton pandaMode;
  @FXML public Pane backDrop;
  @FXML public Label firstNameLabel;
  @FXML public Label lastNameLabel;
  @FXML public Label emailLabel;
  @FXML public Label phoneNumberLabel;
  @FXML public Label addressLabel;
  @FXML public Label birthdayLabel;
  @FXML public Label genderLabel;
  @FXML public Label modeLabel;
  @FXML public Label ratingLabel;
  @FXML public TextField firstName;
  @FXML public TextField lastName;
  @FXML public TextField emailAddress;
  @FXML public TextField phoneNumber;
  @FXML public TextField address;
  @FXML public TextField birthday;
  @FXML public TextField gender;
  @FXML public TextField mode;
  @FXML public TextField rating;
  @FXML public Button profileUpdate;
  @FXML public ImageView profileImage;
  @FXML public Button homeButton;
  @FXML public Button favouritesButton;
  @FXML public Button logoutButton;

  public void handleUpdateAction(ActionEvent actionEvent) throws IOException {
    Parent homePageParent = FXMLLoader.load(getClass().getResource("darkEdit.fxml"));
    Scene homePageScene = new Scene(homePageParent);
    Stage homeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
    homeStage.setScene(homePageScene);
    homeStage.show();
  }

  public void handlePandaModeAction(ActionEvent actionEvent) {
  }

  public void handleLightModeAction(ActionEvent actionEvent) {
  }

  public void handleMenuAction(ActionEvent actionEvent) {
    hBox.setVisible(true);
    TranslateTransition openNav = new TranslateTransition(new Duration(350), drawer);
    openNav.setToX(0);
    TranslateTransition closeNav = new TranslateTransition(new Duration(350), drawer);
    menuButton.setOnAction(
        (ActionEvent evt) -> {
          if (drawer.getTranslateX() != 0) {
            openNav.play();
          } else {
            closeNav.setToX(-(drawer.getWidth()));
            closeNav.play();
          }
        });
  }

  public void handleLogoutAction(ActionEvent actionEvent) throws IOException {
    Parent homePageParent = FXMLLoader.load(getClass().getResource("darkLogin.fxml"));
    Scene homePageScene = new Scene(homePageParent);
    Stage homeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
    homeStage.setScene(homePageScene);
    homeStage.show();
  }

  public void handleHomeAction(ActionEvent actionEvent) throws IOException {
    Parent homePageParent = FXMLLoader.load(getClass().getResource("darkHome.fxml"));
    Scene homePageScene = new Scene(homePageParent);
    Stage homeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
    homeStage.setScene(homePageScene);
    homeStage.show();
  }

  public void handleFavouritesAction(ActionEvent actionEvent) throws IOException {
    Parent homePageParent = FXMLLoader.load(getClass().getResource("darkFavourites.fxml"));
    Scene homePageScene = new Scene(homePageParent);
    Stage homeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
    homeStage.setScene(homePageScene);
    homeStage.show();
  }
}
