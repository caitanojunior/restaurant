package restaurant.grailsapp

class Bebida extends Produto{
	
	Double liquido
	String unidade
	
    static constraints = {
    	liquido min:new Double(0)
		unidade blank:false, inList:["L","ml"]		
	}
}
