package it.polito.tdp.parole;

/**
 * Sample Skeleton for 'Parole.fxml' Controller Class
 */


import it.polito.tdp.parole.model.Parole;
import it.polito.tdp.parole.model.ParoleArray;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ParoleController {
	
	Parole elenco ;
	ParoleArray elenco2;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="btnInserisci"
    private Button btnInserisci; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader
    @FXML // fx:id="txtResult"
    private TextArea txtTime; // Value injected by FXMLLoader

    @FXML // fx:id="btnCancella"
    private Button btnCancella; // Value injected by FXMLLoader

    @FXML // fx:id="btnReset"
    private Button btnReset; // Value injected by FXMLLoader

    

    @FXML
    void doInsert(ActionEvent event) {
    	long to;
    	to = System.nanoTime();

    	elenco.addParola( txtParola.getText() );
    	//passa la parola al metodo add parola creato nella classe parola
    	// per passare la parola ci si serve del metodo getText che crea un collegamento 
    	// con la stringa della classe parola e la parola passata nella classe controller
    	
    	
    	String result = "" ;
    	//voglio stampare un elemenco percio OCCORRE FARE IL FOR EACH per scandire
    	// tutti gli elementi della lista per poi stamparli
    	
    	
    	for(String p: elenco.getElenco())
    		result += p + "\n" ;
    	
    	txtResult.setText(result);
    	//stampo a scìhermo la lista scandita con il determinato elenco 
    	
    	txtParola.clear();
    	//è una sorta di inizializzazione che avremo potuto fare anche in inizialize()
    	
    	txtTime.setText( ""+(System.nanoTime() - to) );
    	
    }
    @FXML
    void doCancella(ActionEvent event) {
    	long to;
    	to = System.nanoTime();
    		elenco.canParola(txtResult.getSelectedText());
    		// metodo che serve per cancellare quella specifica parola
    		String result = "" ;
        	//se non faccio questo passaggio non aggiorno la text area e non vedo l'operazione volta
        	for(String p: elenco.getElenco())
        		result += p + "\n" ;
        	
        	txtResult.setText(result);
        	txtTime.setText( ""+(System.nanoTime() - to) );
    }
    
    @FXML
    void doReset(ActionEvent event) {
    	
    	elenco.reset() ;
    	txtResult.clear() ;

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtTime != null : "fx:id=\"txtTime\" was not injected: check your FXML file 'Parole.fxml'.";

        elenco = new Parole() ;
        elenco2= new ParoleArray();
        
    }
}
