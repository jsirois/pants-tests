object Mod1Class extends App {
	println(new Mod1Class().test())
}

class Mod1Class {
	def test(): String = JavaTest1.java1() + "Mod1Class"
}
