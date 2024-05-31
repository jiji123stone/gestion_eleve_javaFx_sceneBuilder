package Controller;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class HomeCntrl1 implements  Initializable {
	  @FXML
	    private AnchorPane rp;

	    @FXML
	    void lance1(ActionEvent event) throws IOException {
	    	AnchorPane p =FXMLLoader.load(getClass().getResource("/Vue/Win1.fxml"));
	    	rp.getChildren().setAll(p);
	    }

	    @FXML
	    void lance2(ActionEvent event) throws IOException {
	    	int i=0 ;
	    	 
	    	AnchorPane p =FXMLLoader.load(getClass().getResource("/Vue/Win2.fxml"));
	    	rp.getChildren().setAll(p); i++ ;
	    }	    
@FXML
	    void insert(ActionEvent event) throws IOException
	    	{
	    	AnchorPane p =FXMLLoader.load(getClass().getResource("/Vue/InsertEleve.fxml"));
	    	rp.getChildren().setAll(p);
	    }

	 @FXML
	    void quitter(ActionEvent event) {
         System.exit(0);
	    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
