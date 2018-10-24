package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControllerWindow implements Initializable {
	
	private Button delate;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void helloworld(ActionEvent e) {
		System.out.println("hola");
	}
}
