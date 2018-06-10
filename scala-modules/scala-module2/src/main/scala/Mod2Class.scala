import org.lulu.scalamod2.Mod1Class

class Mod2Class {

	def run(): String = {
		new Mod1Class().test()
	}

}

object Mod2Class extends App {
	println(new Mod2Class().run())
}
