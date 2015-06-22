package restaurant.grailsapp

class Estoque {
	Integer quantidade
	Integer quantidadeMinima
	Produto produto
	

	static constraints = {
		quantidade min:0
		quantidade min:0
		produto nullable:false
	}
}