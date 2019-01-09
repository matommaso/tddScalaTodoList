package it.maior.test.matchers


import org.specs2.matcher.{Expectable, Matcher}


object LambdaMatcherSpecs2 {
  def aMatching[T] = new LambdaMatcherSpecs2[T]
}

class LambdaMatcherSpecs2[T] private() extends Matcher[T] {
  private var matcher: Function[T, Boolean] = _
  private var description: String = _

  def where(matcher: Function[T, Boolean]): LambdaMatcherSpecs2[T] = {
    this.matcher = matcher
    this
  }

  def withErrorMessage(description: String): LambdaMatcherSpecs2[T] = {
    this.description = description
    this
  }

  override def apply[S <: T](s: Expectable[S]) = {
    result(matcher.apply(s.value),
      s.description +  s"violated: ${s.value}",
      s.description +  s"violated: ${s.value}",
      s)
  }
}