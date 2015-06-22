package restaurant.grailsapp

class Sobremesa extends Produto{

	Integer calorias
		
	static constraints = {
		calorias min:0
	}
}
