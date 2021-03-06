package controller;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

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
	private Label lblResult;
	@FXML
	private Label lblValue;
	@FXML
	private Label lblLocale;
	@FXML
	private Label lblAmount;
	
	@FXML
	private void initialize() {
		ObservableList<Languages> list = FXCollections.observableArrayList();
		list.addAll(Languages.values());
		cmbLanguage.setItems(list);
		cmbLanguage.setValue(Languages.PORTUGUES);
		
		txtValor.setText("0");
	}
	
	@FXML
	private void handleLanguage() {
		Locale locale = cmbLanguage.getValue().getLocale();
		ResourceBundle bundle = ResourceBundle.getBundle("language", locale);
		
		NumberFormat format = NumberFormat.getCurrencyInstance(locale);
		lblAmount.setText(format.format(Double.parseDouble(txtValor.getText())));
		
		lblValue.setText(bundle.getString("value"));
		lblLocale.setText(bundle.getString("locale"));
		lblResult.setText(bundle.getString("result"));
	}
}
