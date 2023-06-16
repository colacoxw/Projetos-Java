import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class PessoaTableModel extends AbstractTableModel {
	private ArrayList<Pessoa> lista;
	private final int COLUNA_NOME = 1;
	private final int COLUNA_ID = 0;
	private String [] columns = {"id","nome"};
	private boolean[] columnsCanEdit = {false, true};
	
	public PessoaTableModel() {
		this.lista = new ArrayList<>();
	}
	
	@Override
	public int getRowCount() {
		return this.lista.size();
	}
	
	@Override
	public int getColumnCount() {
		return this.columns.length;
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return columnsCanEdit[columnIndex];
	}
	
	@Override
	public Class<?> getColumnClass(int columnIndex){
		switch (columnIndex) {
		case COLUNA_ID:
			return Integer.class;
		case COLUNA_NOME:
			return String.class;
		default:
			return String.class;
			
		}
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Pessoa p = this.lista.get(rowIndex);
		
		switch (columnIndex) {
		case COLUNA_NOME:
			return p.getNome();
		case COLUNA_ID:
			return p.getId();
		
		}
		return null;
	}
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Pessoa p = this.lista.get(rowIndex);
		switch (columnIndex) {
		case COLUNA_NOME:
			p.setNome(String.valueOf(aValue));
			break;
		case COLUNA_ID:
			p.setId((int)aValue);
		}
		fireTableDataChanged();
	
	}
	
	//Retorna o indice
	private int indexOf(Pessoa p) {
		return this.lista.indexOf(p);
	}
	
	//Adicionar a lista
	public void addRow(Pessoa p) {
		this.lista.add(p);
		this.fireTableRowsInserted(this.indexOf(p), this.indexOf(p));
	}
	
	//Remove o Objeto
	public void removeRow (int linha) {
		Pessoa p = this.lista.get(linha);
		this.lista.remove(linha);
		super.fireTableRowsDeleted(linha, linha);
	}


}
