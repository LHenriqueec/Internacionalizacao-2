package controller;

import java.text.NumberFormat;
import java.util.Locale;

import application.Languages;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ApplicationController {
	@FXML
	private ComboBox<Languages> cmbLanguage;
	@FXML
	private TextField txtValor;
	@FXML
	private Label lblValue;
	
	@FXML
	private void initialize() {
		ObservableList<Languages> list = FXCollections.observableArrayList();
		list.addAll(Languages.values());
		cmbLanguage.setItems(list);
		cmbLanguage.setValue(Languages.PORTUGUES);
		
		txtValor.setText("0");
		
		conversao(cmbLanguage.getValue());
	}
	
	@FXML
	private void handleLanguage() {
		conversao(cmbLanguage.getValue());
	}
	
	private void conversao(Languages language) {
		Locale locale = language.getLocale();
		NumberFormat format = NumberFormat.getCurrencyInstance(locale);
		
		lblValue.setText(format.format(Double.parseDouble(txtValor.getText())));
	}
}
