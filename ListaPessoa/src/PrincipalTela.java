import javax.swing.JFrame;
import java.awt.EventQueue;


public class PrincipalTela extends JFrame {
	private PessoaTableModel model;
	
	public PrincipalTela() {
		initComponents();
		model = new PessoaTableModel();
		tablePessoa.setModel(model);
	}
	
	@SuppressWarnings("uncheked")
	private void initComponents(){
		
		
		
	}
}
