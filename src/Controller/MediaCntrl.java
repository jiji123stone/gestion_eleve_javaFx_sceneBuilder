package Controller;

import java.awt.Image;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MediaCntrl implements Initializable {
	 private Media m ;
	    private File f ;
	    private MediaPlayer mp;
	    
	    @FXML ImageView k;  
	@FXML
    private MediaView media;

    @FXML
    private Button pl;

    @FXML
    private Button pa;

    @FXML
    private Button r;
    

    @FXML
    void pause(ActionEvent event) {
    	mp.pause();

    }

    @FXML
    void play(ActionEvent event) {
     mp.play();
    }

    @FXML
    void reset(ActionEvent event) {

    }
    
    
    
    
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		f=new File("C:\\Users\\21627\\OneDrive\\Bureau\\reseau\\gada.mp4");
		String b="C:\\Users\\21627\\OneDrive\\Images\\salah 10.mp4";
		
		
		m=new Media(f.toURI().toString());
		mp=new MediaPlayer(m);
		media.setMediaPlayer(mp);
		 
	

	}

}
