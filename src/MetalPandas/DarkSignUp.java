package MetalPandas;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

public class DarkSignUp {
  @FXML public AnchorPane signUpBackground;
  @FXML public ImageView profileImage;
  @FXML public Button editButton;
  @FXML public TextField firstName;
  @FXML public TextField lastName;
  @FXML public TextField emailAddress;
  @FXML public TextField phoneNumber;
  @FXML public TextField street;
  @FXML public TextField state;
  @FXML public TextField city;
  @FXML public TextField zipCode;
  @FXML public TextField country;
  @FXML public PasswordField password;
  @FXML public PasswordField reenterPassword;
  @FXML public ComboBox<String> month;
  @FXML public ComboBox<Integer> day;
  @FXML public TextField year;
  @FXML public Pane backDrop;
  @FXML public Label passDriveLabel;
  @FXML public Label genderLabel;
  @FXML public ChoiceBox<String> driverPassenger;
  @FXML public ChoiceBox<String> gender;
  @FXML public Button signUP;

  public void handleEditAction(ActionEvent actionEvent) {
    Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

    FileChooser chooseImage = new FileChooser();
    chooseImage.setTitle("Open Image");

    // Set to user's directory or go to the default C drive if cannot access
    String userDirectoryString = System.getProperty("user.home") + "\\Pictures";
    File userDirectory = new File(userDirectoryString);

    if (!userDirectory.canRead()) {
      userDirectory = new File("C:/");
    } else {
      chooseImage.setInitialDirectory(userDirectory);
    }

    File filePath = chooseImage.showOpenDialog(stage);

    // Try to update the image by loading the new image
    try {
      BufferedImage bufferedImage = ImageIO.read(filePath);

      Image image = SwingFXUtils.toFXImage(bufferedImage, null);

      profileImage.setImage(image);
    } catch (IOException e) {

      System.out.println(e.getMessage());
    }
  }

  public void handleSignUpAction(ActionEvent actionEvent) throws IOException {
    Parent homePageParent = FXMLLoader.load(getClass().getResource("darkHome.fxml"));
    Scene homePageScene = new Scene(homePageParent);
    Stage homeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
    homeStage.setScene(homePageScene);
    homeStage.show();
  }

  public void initialize(){
    try{
      month.setItems(FXCollections.observableArrayList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
      day.setItems(FXCollections.observableArrayList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31));
      driverPassenger.setItems(FXCollections.observableArrayList("Driver", "Passenger"));
      gender.setItems(FXCollections.observableArrayList("Female", "Male", "Non-binary", "Metal Panda"));
    } catch (Exception e){
      e.printStackTrace();
    }
  }

}
