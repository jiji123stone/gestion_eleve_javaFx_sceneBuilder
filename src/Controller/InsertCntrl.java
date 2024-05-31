package Controller;

import java.net.URL;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

//import com.gluonhq.charm.glisten.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import java.time.LocalDate;
import java.util.ResourceBundle;

import Connect.DAOEleve;
import Models.Eleve;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class InsertCntrl implements Initializable {
    @FXML
    private TextField n;

    @FXML
    private TextField p;

    @FXML
    private DatePicker d;
    
    @FXML
    private TextField i;

    @FXML
    private ComboBox<String> niv;
    
    public  ObservableList<  String> l =FXCollections.observableArrayList("1","2","3","4","5");
    
    @FXML
   public void inserer_eleve(ActionEvent event) {
    	 
    	String a=i.getText();
    	int id=Integer.parseInt(a);
     
    	int s;
    	LocalDate d1=d.getValue();
    	String nom=n.getText();
    	String prenom=p.getText();
    	String date=d1.toString();
    	
    	Eleve e=new Eleve();
    	e.setId(id);
    	e.setNom(nom);
    	e.setPrenom(prenom);
    	e.setDate(date);
    	e.setNiveau(niv.getValue());
    	
    	s=DAOEleve.save(e);
    	if(s>0) {
    		Alert al=new Alert(AlertType.INFORMATION);
    		al.setTitle("add eleve !!");
    		al.setHeaderText("Information !");
    		al.setContentText("BIEN AJOUTE !!!!!");
    		al.showAndWait();
    		/*i.clear();
    		n.clear();
        	p.clear();
        	d.setValue(null);
        	niv.setValue(null);*/
    		
    	}else {
    		Alert al=new Alert(AlertType.ERROR);
    		al.setTitle("add eleve !!");
    		al.setHeaderText("Information !");
    		al.setContentText("NON  AJOUTE !!!!!");
    		al.showAndWait();
    		
    	}
    	 

    }
    
    @FXML
    void vider(ActionEvent event) {
    	n.clear();
    	p.clear();
    	d.setValue(null);
    	niv.setValue(null);

    }
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
      // niv.setItems(l);
		niv.setItems(l);
	}

}
