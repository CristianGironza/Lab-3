package controller;

import java.io.File;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Observable;
import java.util.ResourceBundle;

import javax.swing.filechooser.FileFilter;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class ControllerWindow implements Initializable {
	@FXML
	private TextField name;
	@FXML
	private TextField age;
	@FXML
	private TextField team;
	@FXML
	private TextField games;
	@FXML
	private TextField per;
	@FXML
	private TextField trp;
	@FXML
	private TextField orp;
	@FXML
	private TextField drp;
	@FXML
	private ImageView profile;
	@FXML
	private ComboBox<String> type;
	@FXML
	private TextField input;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<String> options = FXCollections.observableArrayList("Games","True Shooting Percentage","Offensive Rebound Percentage","Deffensive Rebound Percentage");
		type.setItems(options);
	}

	public void helloworld() {
		System.out.println("hola");
		per.setText("hola");
	}
}
