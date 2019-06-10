package MenuOpciones;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TablaLagrange {
    
   private String cabecera[]={"i","X","F(x)"};
   private ArrayList<VariablesLagrange>lista;
   
   TablaLagrange(ArrayList<VariablesLagrange>listaEntregada){
       this.lista=listaEntregada;
   }
   
   TablaLagrange(){}
   //metodo para saber tamanio de la lista ingresada
   public int getRowCount() {
        return this.lista.size();
    }
   //cuenta el numero de datos en la cabecera
   public int getColumnCount() {
        return this.cabecera.length;
    }
   
    public Object getValueAt(int fila, int columna) {
        //columna: 0= i, 1= X, 2= fx
       switch(columna){
           
           case 0: return this.lista.get(fila).getI();
           case 1: return this.lista.get(fila).getX();
           case 2: return this.lista.get(fila).getFx();
           default: return null;
       }
    }
    
    public String getColumnName(int i){
        return this.cabecera[i];
    }
    
}
