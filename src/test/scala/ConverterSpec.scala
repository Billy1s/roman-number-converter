import org.scalatest.{FlatSpec, Matchers}

class ConverterSpec extends FlatSpec with Matchers {

  "Run function: Test Converter 1" should "return the correct output" in {
    val s = Converter

    s.run(1954) should be ("MCMLIV")
  }

  "Run function: Test Converter 2" should "return the correct output" in {
    val s = Converter

    s.run(1990) should be ("MCMXC")
  }

  "Run function: Test Converter 3" should "return the correct output" in {
    val s = Converter

    s.run(2014) should be ("MMXIV")
  }




}