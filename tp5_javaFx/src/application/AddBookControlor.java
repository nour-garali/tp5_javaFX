package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AddBookControlor implements Initializable {
	 @FXML
	 private TextField tfLastName;
	 @FXML
	 private TextField tfFirstName;
	 @FXML
	 private TextField tfEmail;
	 @FXML
	 private Button addBtn;
	 @FXML
	 private Button exportBtn;
	 @FXML
	 private Button importBtn;
	 @FXML
	 private Button removeBtn;
	 @FXML
	 private Button quitBtn;
	 @FXML
	 private TableView<Person> table;

	 
	 @FXML
	 private TableColumn<Person, String> emailCol;
	 @FXML
	 private TableColumn<Person, String> firstNameCol;
	 @FXML
	 private TableColumn<Person, String> lastNameCol;
	 private DataClass data;
	 private ObservableList<Person> list;

	 @Override
	 public void initialize(URL arg0, ResourceBundle arg1) {
	     lastNameCol.setCellValueFactory(new PropertyValueFactory<>("nom"));
	     firstNameCol.setCellValueFactory(new PropertyValueFactory<>("prenom"));
	     emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
	     list = getListO();
	     table.setItems(list);
	 }

	 public ObservableList<Person> getListO() {
	     ObservableList<Person> list = FXCollections.observableArrayList();
	     for (Person e : data.getImportList()) {
	         list.add(e);
	     }
	     return list;
	 }
	 
	 
	 
	 
	 
	 
}

