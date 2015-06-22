package restaurant.grailsapp

class Mesa {
	
	Integer numeroMesa
	
	static hasMany = [pedidos:Pedido]

	static constraints = {
		numeroMesa unique:true, nullable:false, blank:false
    }
}