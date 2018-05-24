package org.lulu.scalamod2

import org.scalatest.FunSuite

class Mod1ClassTest2 extends FunSuite {
	test("Should succeed") {
//		val a = this.getClass.getResource("1.txt").openStream()
//		println(Source.fromInputStream(a).mkString)
		println("testing")
		println(new Mod1Class().test())
		assert(new Mod1Class().test() == "java1Mod1Class")
	}
}
