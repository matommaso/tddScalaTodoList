package it.maior.todolist


class ToDoList() {

  var items = List[ToDoElement]()
  def add(element: ToDoElement) = {items = element::items}
}
