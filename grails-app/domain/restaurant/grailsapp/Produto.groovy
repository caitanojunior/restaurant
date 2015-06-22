package restaurant.grailsapp

class Produto {

	String nome
	Double preco
	Estoque estoque
	
	static hasMany = [pedidos:Pedido]
	
	static hasOne = [estoque:Estoque]
	
	static hasmany = [itens: ItemPedido]
	
	
	
	static constraints = {
		discriminator column:"tipo", value:"GERAL"
		nome blank:false
		preco min:new Double(0)
		estoque min:0 	
	}
}