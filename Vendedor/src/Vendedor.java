import javax.swing.JOptionPane;

public class Vendedor {

	public static void main(String[] args) {
		double iten1 = 239.99, iten2 = 129.75, iten3 = 99.95, iten4 = 350.99, vendedor = 200, valor = 0;
		int item;
		String aVendedor;
		
		aVendedor = JOptionPane.showInputDialog("Digite o numero do Iten ou -1 para sair:");
		item = Integer.parseInt(aVendedor);
		
		while (item != -1) {
			
			if (item == 1) {
				valor = valor + iten1 * 0.09;
				vendedor = vendedor + valor;
				
			
			}else if (item == 2){
				valor = valor + iten2 * 0.09;
				vendedor = vendedor + valor;
				
			}else if(item == 3) {
				 valor = valor + iten3 * 0.09;
				 vendedor = vendedor + valor;
				
			}else if (item == 4) {
				valor = valor + iten4 * 0.09;
				vendedor = vendedor + valor;
				
			}
			
			
			aVendedor = JOptionPane.showInputDialog("Digite o numero do Iten ou -1 para sair:");
			item = Integer.parseInt(aVendedor);
			
		}
		JOptionPane.showConfirmDialog(null, "O valor da comissao do vendedor foi de:" + vendedor, "VENDAS", JOptionPane.INFORMATION_MESSAGE);

	}

}
