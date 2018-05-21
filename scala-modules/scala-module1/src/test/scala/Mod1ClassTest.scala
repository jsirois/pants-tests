import org.scalatest.FunSuite

class Mod1ClassTest extends FunSuite {
	test("Should succeed") {
		val a = this.getClass.getResource("1.txt").getContent
		println(a)
		println("testing")
		assert(new Mod1Class().test() == "testing")
	}
}
