package br.com.igor.coursespringboot.entities.enums;

public enum StatusPedido {

	AGUARDANDO_PAGAMENTO(1),
	PAGO(2),
	ENVIDADO(3),
	ENTREGUE(4),
	CANCELADO(5);
	
	private int codigo;
	
	private StatusPedido(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public static StatusPedido valueOf(int codigo) {
		 for (StatusPedido valor : StatusPedido.values()) {
			 if (valor.getCodigo() == codigo) {
				return valor;
			}
		 }
		 throw new IllegalArgumentException("Codigo do Status do pedido invalido");
	}
}
