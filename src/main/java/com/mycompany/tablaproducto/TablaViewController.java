// Morones Torres Jorge Arnulfo
package com.mycompany.tablaproducto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.Arrays;


/**
 * FXML Controller class
 *
 * @author jorgi
 */
public class TablaViewController implements Initializable {
    
    @FXML private TableView<Producto>tvProducto;
    @FXML private TableColumn<Producto, String> tcNombre;
    @FXML private TableColumn<Producto, Double> tcPrecio;
    @FXML private TableColumn<Producto, Integer> tcCantidad;
    @FXML private TableColumn<Producto, Double> tcPeso;
    
    
    @FXML private TextField tfNombre;
    @FXML private TextField tfPrecio;
    @FXML private TextField tfCantidad;
    @FXML private TextField tfPeso;
    private ObservableList<Producto> productList;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        tcNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tcPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
        tcCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
        tcPeso.setCellValueFactory(new PropertyValueFactory<>("peso"));
        
        productList = FXCollections.observableArrayList(
        new Producto("Manzana",1.99,100,0.20),
        new Producto("Pera",2.99,200,0.25)
    );
    tvProducto.setItems(productList);
        tvProducto.setEditable(true);
        tvProducto.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
       
    }    
        @FXML
    private void handleBtnAgregar(javafx.event.ActionEvent event){
        String nombre = tfNombre.getText();
        double precio = Double.parseDouble(tfPrecio.getText());
        int cantidad = Integer.parseInt(tfCantidad.getText());
        double peso = Double.parseDouble(tfPeso.getText());
        
        productList.add(new Producto(nombre,precio,cantidad,peso));
        }

        @FXML
    private void handleBtnLimpiar(javafx.event.ActionEvent event){
        tfNombre.setText("");
        tfPrecio.setText("");
        tfCantidad.setText("");
        tfPeso.setText("");
    }
    
       @FXML
    private void handleBtnEliminar(javafx.event.ActionEvent event){
        ObservableList<Integer> selectedIndices = tvProducto.getSelectionModel().getSelectedIndices();
        Integer[] array = selectedIndices.toArray(new Integer[0]);
        Arrays.sort(array);
        
        
        for(int i = array.length - 1; i>=0; i--){
            tvProducto.getSelectionModel().clearSelection(array [i]);
            tvProducto.getItems().remove(array[i].intValue());
        }
        
    }
    
    
}
