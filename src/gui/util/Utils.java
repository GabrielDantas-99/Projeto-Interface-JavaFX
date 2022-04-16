package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {

	public static Stage currentStage(ActionEvent event) {
		// Acesssando o stage aonde o controller do evento esta 
		return (Stage) ((Node) event.getSource()).getScene().getWindow();
	}
	
	
}
