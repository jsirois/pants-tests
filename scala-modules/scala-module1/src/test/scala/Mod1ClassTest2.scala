import org.scalatest.FunSuite

import scala.io.Source

class Mod1ClassTest2 extends FunSuite {
	test("Should succeed") {
		val a = this.getClass.getResource("1.txt").openStream()
		println(Source.fromInputStream(a).mkString)
		println("testing")
		assert(new Mod1Class().test() == "testing11")
	}
}
