package org.lulu.scalamod2

import org.lulu.mod1.JavaTest1

class Mod1Class {
	def test(): String = JavaTest1.java1() + "Mod1Class"
}

object Mod1Class extends App {
	println(new Mod1Class().test())
}