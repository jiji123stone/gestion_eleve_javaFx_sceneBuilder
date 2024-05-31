package Controller;

import java.net.URL;

import java.util.ResourceBundle;

import Connect.DAOEleve;
import Models.Eleve;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;


public class UpdateDeleteCntrl implements Initializable {
	@FXML
    private TextField n;

    @FXML
    private TextField p;

    @FXML
    private TextField d;

    @FXML
    private TextField niv;

    @FXML
    private TextField i;

    @FXML
    void delete(ActionEvent event) {
    	String sid =i.getText();
    	int id=Integer.parseInt(sid);
    	
    	 
    	int s=DAOEleve.DELETE(id);
    	if(s>0) {
    		Alert al=new Alert(AlertType.INFORMATION);
    		al.setTitle("Suppression eleve !!");
    		al.setHeaderText("Information !");
    		al.setContentText("BIEN SUPPRIME !!!!!");
    		al.showAndWait();
    		
    	}else {
    		Alert al=new Alert(AlertType.ERROR);
    		al.setTitle("Suppression eleve !!");
    		al.setHeaderText("Information !");
    		al.setContentText("NON   SUPPRIME !!!!!");
    		al.showAndWait();
    		
    	}

     
    }

    @FXML
  public  void find(ActionEvent event) {
   String sid=i.getText();
   int id=Integer.parseInt(sid);
   Eleve e=DAOEleve.FIND(id);
   n.setText(e.getNom());
   p.setText(e.getPrenom());
   d.setText(e.getDate());
   niv.setText(e.getNiveau());   
    }

    @FXML
    void update(ActionEvent event) {
    	String sid =i.getText();
    	int id=Integer.parseInt(sid);
    	
    	String nom=n.getText();
    	String prenom=p.getText();
    	String date=d.getText();
    	String niveau=niv.getText();
    	Eleve e=new Eleve();
    	e.setId(id);
    	e.setNom(nom);
    	e.setPrenom(prenom);
    	e.setDate(date);
    	e.setNiveau(niveau);
    	int s=DAOEleve.UPDATE(e);
    	if(s>0) {
    		Alert al=new Alert(AlertType.INFORMATION);
    		al.setTitle("Update eleve !!");
    		al.setHeaderText("Information !");
    		al.setContentText("BIEN Modifié !!!!!");
    		al.showAndWait();
    		
    	}else {
    		Alert al=new Alert(AlertType.ERROR);
    		al.setTitle("Update eleve !!");
    		al.setHeaderText("Information !");
    		al.setContentText("NON   Modifié !!!!!");
    		al.showAndWait();
    		
    	}

    }


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		 

	}

}
