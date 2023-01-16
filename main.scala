object Main {
	def main(args: Array[String]) {
		println("Hello VERDIS");
		println(Main.+(5,3));
		println("New changes made on myBranch");
	}

	def +(x: Int, y: Int): Int = {
		return x+y;
	}
}
