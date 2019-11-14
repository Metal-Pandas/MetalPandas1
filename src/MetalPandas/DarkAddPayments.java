package MetalPandas;


import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DarkAddPayments {

 @FXML public AnchorPane addPaymentBackground;
 @FXML public Pane backDrop;
 @FXML public Text addPaymentTitle;
 @FXML public Text paymentType;
 @FXML public ComboBox<String> paymentCombo;
 @FXML public Text cardHolderLabel;
 @FXML public  TextField cardHolderName;
 @FXML public  Text cardNumberLabel;
 @FXML public  TextField cardNumber;
 @FXML public  Text CCVlabel;
 @FXML public  TextField paymentCCV;
 @FXML public Button paymentConfirm;
 @FXML public Button paymentBack;
 @FXML public Text expirationLabel;
 @FXML public ComboBox<Integer> expirationMonth;
 @FXML public TextField expirationYear;


  public void handleBackAction(ActionEvent actionEvent) throws IOException {
   Parent homePageParent = FXMLLoader.load(getClass().getResource("darkPayments.fxml"));
   Scene homePageScene = new Scene(homePageParent);
   Stage homeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
   homeStage.setScene(homePageScene);
   homeStage.show();
  }

  public void handleConfirmAction(ActionEvent actionEvent) throws IOException {
   Parent homePageParent = FXMLLoader.load(getClass().getResource("darkSchedule.fxml"));
   Scene homePageScene = new Scene(homePageParent);
   Stage homeStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
   homeStage.setScene(homePageScene);
   homeStage.show();
  }

 public void initialize(){
  try{
   paymentCombo.setItems(FXCollections.observableArrayList("Gift Card", "Debit/Credit"));
   expirationMonth.setItems(FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
  } catch (Exception e){
   e.printStackTrace();
  }
 }
}
