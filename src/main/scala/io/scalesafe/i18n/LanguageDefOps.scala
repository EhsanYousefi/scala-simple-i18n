package io.scalesafe.i18n

trait LanguageDefOps {

  dataTypes: ADTs =>

  implicit def languageDefToMultiLang(
    languageDef: LanguageDef
  ): MultiLang =
    Map(languageDef.lang -> languageDef.t).lift

  implicit class RichLanguageDef(val underlying: LanguageDef) {

    def toMultiLang: MultiLang =
      languageDefToMultiLang(underlying)

    def --(other: LanguageDef) : Language => Option[String] =
      lang =>
        Map(
          underlying.lang -> underlying,
          other.lang -> other.underlying
        ) lift lang map (_.t)
  }

}
