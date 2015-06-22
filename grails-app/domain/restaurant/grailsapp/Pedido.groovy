package restaurant.grailsapp

class Pedido {

	Date dataHora
	Double valorTotal
	
	Mesa mesa
	
	static hasmany = [itens: ItemPedido]
	
	
	static constraints = {
		valorTotal min:new Double(0)
		mesa nullable:false
	}
}