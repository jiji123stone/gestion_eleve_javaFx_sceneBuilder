package Controller;

import java.net.URL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import Connect.ConxDB;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ConnectCntrl implements Initializable {
@FXML private TextField t ;
@FXML private PasswordField p ;
@FXML private Label l ;

@FXML 
public void login(ActionEvent a)throws SQLException {
	
	Connection c=ConxDB.getInstance();
 
	PreparedStatement s=null;
	ResultSet rs=null;
	
	String sql="select * from users where nom=? and password=? " ;
	try {s=c.prepareStatement(sql);
	s.setString(1,t.getText().toString());
	s.setString(2,p.getText().toString());
	rs=s.executeQuery();
	if(rs.next()) {
		l.setText("Connecte");
		Stage stage=new Stage();
		Parent root = (  Parent)FXMLLoader.load(Main.class.getResource("/Vue/Home1.fxml"));
		Scene scene=new Scene(root);
		stage.setScene(scene);
		stage.setTitle("home 1.1");
		stage.show();
		
		
	}
	else {
		l.setText("NON tyrrr mabldek");
		Alert al=new Alert(AlertType.ERROR);
		al.setTitle("erreur !!!");
		al.setContentText("password or username ERROR!!");
		al.showAndWait();
		
	}
	}
	catch(Exception e) {}
}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
