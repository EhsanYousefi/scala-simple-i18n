package io.scalesafe.i18n

trait MultiLangOps {

  dataTypes: ADTs =>

  implicit class RichMultiLang(val underlying: MultiLang) {

    def --(other: MultiLang): MultiLang =
      lang =>
        underlying(lang).orElse(other(lang))
  }

}