package io.scalesafe.test.i18n

import org.scalatest.{FunSpec, Matchers}
import io.scalesafe.i18n.api._

class PrimarySpec extends FunSpec with Matchers {

  object SomeLanguage extends Language
  case class SomeLanguage(t: String) extends LanguageDef {
    override val lang: Language = SomeLanguage
  }

  object OtherLanguage extends Language
  case class OtherLanguage(t: String) extends LanguageDef {
    override val lang: Language = OtherLanguage
  }

  describe("LanguageDef") {

    describe("`toMultiLang`") {
      it("should return `MultiLang`") {
        val (multiLang: MultiLang) = SomeLanguage("someText").toMultiLang
      }
    }

    it("should return `MultiLang` implicitly -- singular") {
      val (multiLang: MultiLang) = SomeLanguage("someText")
    }

    it("should return `MultiLang` implicitly -- plural") {
      val (multiLang: MultiLang) =
        SomeLanguage("someText") --
          OtherLanguage("someText")
    }

  }

  describe("MultiLang") {

    describe("`apply`") {

      it("should return optional translation based on given language") {
        val multiLang = SomeLanguage("someLanguage") -- OtherLanguage("otherLanguage")
        multiLang(OtherLanguage) shouldBe Some("otherLanguage")
        multiLang(SomeLanguage) shouldBe Some("someLanguage")
      }

      it("should return None if no translation found for given language") {
        val multiLang = SomeLanguage("someLanguage")
        multiLang(OtherLanguage) shouldBe None
      }

    }
  }
}
