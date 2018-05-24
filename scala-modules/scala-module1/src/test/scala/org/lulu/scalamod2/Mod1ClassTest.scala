package org.lulu.scalamod2

import org.scalatest.FunSuite

class Mod1ClassTest extends FunSuite {
	test("Should succeed") {
		val a = this.getClass.getResource("/1.txt").getContent
		println(a)
		println("testing")
		println(new Mod1Class().test())
		assert(new Mod1Class().test() == "java1Mod1Class")
	}
}
