package io.scalesafe.i18n

trait DefaultLanguages {

  dateTypes: ADTs =>

  object EN extends Language
  case class EN(t: String) extends LanguageDef {
    override val lang: Language = EN
  }

  object FA extends Language
  case class FA(t: String) extends LanguageDef {
    override val lang: Language = FA
  }

  object FR extends Language
  case class FR(t: String) extends LanguageDef {
    override val lang: Language = FR
  }

  object ES extends Language
  case class ES(t: String) extends LanguageDef {
    override val lang: Language = ES
  }

  object DE extends Language
  case class DE(t: String) extends LanguageDef {
    override val lang: Language = DE
  }

  object ZH extends Language
  case class ZH(t: String) extends LanguageDef {
    override val lang: Language = ZH
  }

  object JA extends Language
  case class JA(t: String) extends LanguageDef {
    override val lang: Language = JA
  }

  object TR extends Language
  case class TR(t: String) extends LanguageDef {
    override val lang: Language = TR
  }

  object AR extends Language
  case class AR(t: String) extends LanguageDef {
    override val lang: Language = AR
  }

  object NB extends Language
  case class NB(t: String) extends LanguageDef {
    override val lang: Language = NB
  }

  object RU extends Language
  case class RU(t: String) extends LanguageDef {
    override val lang: Language = RU
  }

  object HE extends Language
  case class HE(t: String) extends LanguageDef {
    override val lang: Language = HE
  }

  object HI extends Language
  case class HI(t: String) extends LanguageDef {
    override val lang: Language = HI
  }

  object PT extends Language
  case class PT(t: String) extends LanguageDef {
    override val lang: Language = PT
  }

  object SV extends Language
  case class SV(t: String) extends LanguageDef {
    override val lang: Language = SV
  }

}
