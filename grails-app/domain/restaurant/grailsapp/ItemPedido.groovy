package restaurant.grailsapp

class ItemPedido {

	Integer quantidade
	Double valorVenda
	String observacao
	
	Pedido pedido
	Produto produto
	
	static belongsTo = [Pedido]
	
    static constraints = {
		quantidade min:0
		valorVenda min:new Double(0)
		observacao nullable:true, blank:true
    }
	
	static mapping = {
		produto column : "id_produto"
		pedido column : "id_pedido"
	}
}