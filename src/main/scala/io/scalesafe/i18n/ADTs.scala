package io.scalesafe.i18n

trait ADTs {

  trait Language
  trait LanguageDef {
    val lang: Language
    val t: String
  }

  type MultiLang = Language => Option[String]

}

