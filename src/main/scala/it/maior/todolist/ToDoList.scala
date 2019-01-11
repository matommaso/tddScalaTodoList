package it.maior.todolist


class ToDoList() {
  var items = List[ToDoElement]()
  def add(element: ToDoElement) = {items = element::items}
  def remove(idToRemove: Int): Boolean = {
    val sizePreRemove = items.length
    items = items.filter(_.id != idToRemove)
    if(sizePreRemove > items.size){
      return true
    }
    return false
  }
}
