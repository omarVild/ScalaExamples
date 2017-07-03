import scala.io.Source 

object wordCount {
	def main(args: Array[String]) {
		val animales = Source.fromFile("animales.txt")("UTF-8").getLines().toList
		
		animales.foreach(println)
		
		//Scala filters
		val abAnimals = animales.filter(_.startsWith("Ab"))
		println("Animales que empiezan con Ab: "+ abAnimals.length)
		
		abAnimals.foreach(println)

	}
}


