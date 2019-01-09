/*
package it.maior.test.matchers

import it.maior.tdd.todo.Item
import org.specs2.matcher.{Expectable, Matcher}

object ItemMatcherSpecs2 {
  def anItem = new ItemMatcherSpecs2
}

class ItemMatcherSpecs2 private() extends Matcher[Item] {
  private var id: Int = _

  def withId(id: Int): ItemMatcherSpecs2 = {
    this.id = id
    this
  }

  override def apply[S <: Item](s: Expectable[S]) = {
    result(s.value.id.equals(id),
      s.description + " id is matching",
      s.description + " id not matching, expected $id, found $actualItem.id ",
      s)
  }
}
*/