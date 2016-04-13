package controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import application.Language;
import application.Main;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

public class ApplicationController {

	private List<Button> botoes;

	@FXML
	private Button btnSeg;
	@FXML
	private Button btnTer;
	@FXML
	private Button btnQua;
	@FXML
	private Button btnQui;
	@FXML
	private Button btnSex;
	@FXML
	private Button btnSab;
	@FXML
	private Button btnDom;
	@FXML
	private Button btnChange;

	@FXML
	private void initialize() {
		botoes = FXCollections.observableArrayList();
		botoes.addAll(Arrays.asList(btnDom, btnSeg, btnTer, btnQua, btnQui, btnSex, btnSab));
	}

	@FXML
	private void changeLanguage() {
		if (Main.getLanguage().equals(Language.LANGUAGE_US)) {
			ResourceBundle bundleBR = ResourceBundle.getBundle("language", Language.LANGUAGE_BR.getLanguage());
			botoes.forEach(btn -> btn.setText(bundleBR.getString(btn.getId())));
			btnChange.setText(bundleBR.getString(btnChange.getId()));
			Main.setLanguage(Language.LANGUAGE_BR);
		}

		else  {
			ResourceBundle bundleUS = ResourceBundle.getBundle("language", Language.LANGUAGE_US.getLanguage());
			botoes.forEach(btn -> btn.setText(bundleUS.getString(btn.getId())));
			btnChange.setText(bundleUS.getString(btnChange.getId()));
			Main.setLanguage(Language.LANGUAGE_US);
		}
	}
}
