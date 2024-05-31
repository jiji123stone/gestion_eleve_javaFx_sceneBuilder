package Controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import Connect.ConxDB;
import Models.Eleve;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
 

public class GestionEleve implements Initializable {
	  @FXML
	    private TableView<Eleve> tab;

	    @FXML
	    private TableColumn<Eleve, Integer> ide;

	    @FXML
	    private TableColumn<Eleve, String> nom;

	    @FXML
	    private TableColumn<Eleve,  String> prenom;

	    @FXML
	    private TableColumn<Eleve,  String> date;

	    @FXML
	    private TableColumn<Eleve,  String> niv;
	    
	    @FXML
	    void update_delete(ActionEvent event) throws IOException {
	    	 Stage s=new Stage();
	            Parent root = (  Parent)FXMLLoader.load(Main.class.getResource("/Vue/UpdateDelete.fxml"));
				 
				Scene scene = new Scene(root );
				s.setScene(scene);
				s.setTitle("UD eleve 2222222222222");
				s.show();
	    }

	    
	    
	    
	    @FXML
	    
	   public void inserer(ActionEvent event) throws IOException {
	    	  
            Stage s=new Stage();
            Parent root = (  Parent)FXMLLoader.load(Main.class.getResource("/Vue/InsertEleve.fxml"));
			 
			Scene scene = new Scene(root );
			s.setScene(scene);
			s.setTitle("insert eleve 111111111111111111");
			s.show();
	    	
	    }
	   public  ObservableList< Eleve> l =FXCollections.observableArrayList();
	    
	   
	    
	   
	    @FXML
	    public void show_eleve(ActionEvent event ) {
	    
	    	try {
	    	Connection cnx= ConxDB.getInstance();
	     
	    	String sql ="select * from  eleve" ;
	    	
	    		PreparedStatement st=cnx.prepareStatement(sql);
				ResultSet s=st.executeQuery();
				while(s.next()) {
					l.add(new  Eleve(s.getInt(1),s.getString(2),s.getString(3),s.getString(4),s.getString(5)));
				}
				cnx.close();
			} catch ( Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	ide.setCellValueFactory(new PropertyValueFactory<Eleve,Integer>("idE"));
	    	prenom.setCellValueFactory(new PropertyValueFactory<Eleve,String>("prenom"));
	    	nom.setCellValueFactory(new PropertyValueFactory<Eleve,String>("nom"));
	    	date.setCellValueFactory(new PropertyValueFactory<Eleve,String>("date"));
	    	niv.setCellValueFactory(new PropertyValueFactory<Eleve,String>("nive"));
	    	tab.setItems(l);
	    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
