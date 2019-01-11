package it.maior.tdd.todo

import scala.collection.mutable.ArrayBuffer
import it.maior.todolist.{ToDoElement, ToDoList}


class ToDoListTestSpecs2 extends org.specs2.mutable.Specification {
  isolated

  "ToDoList specs" >> {
    // Shared Given

    "An empty List">> {
      val todoList = new ToDoList()

      "should by empty" >> {
        // Given

        // When
        val actualItems = todoList.items
        // Then
        actualItems must have size 0
      }

      "Add an element, then it should contain an element" >> {
        // Given
        // When
        val todoElement = new ToDoElement(0, "Apply TDD principle")
        todoList.add(todoElement)
        val actualItems = todoList.items
        // Then
        actualItems must contain(exactly(todoElement))
      }

      "Add two element, then it should contain both elements" >> {
        // Given
        val todoElement00 = new ToDoElement(0, "Apply TDD principle")
        val todoElement01 = new ToDoElement(1, "Apply TDD principle01")
        val expectedItems = List[ToDoElement](todoElement01, todoElement00)

        // When
        todoList.add(todoElement00)
        todoList.add(todoElement01)

        val actualItems = todoList.items
        // Then
        actualItems mustEqual expectedItems
      }

      "Add 3 elements, then it should contain 3 elements" >> {
        // Given
        // When
        val todoElement00 = new ToDoElement(0, "Apply TDD principle")
        todoList.add(todoElement00)
        val todoElement01 = new ToDoElement(1, "Apply TDD principle 01")
        todoList.add(todoElement01)
        val todoElement02 = new ToDoElement(2, "Apply TDD principle 02")
        todoList.add(todoElement02)
        val actualItems = todoList.items
        // Then
        actualItems must contain(exactly(todoElement00, todoElement01, todoElement02))
      }
    }
    "A ToDoElement List containing 2 elements ">>{
      val todoList = new ToDoList()
      val todoElement00 = new ToDoElement(0,"Apply TDD principle")
      todoList.add(todoElement00)
      val todoElement01 = new ToDoElement(1,"Apply TDD principle 01")
      todoList.add(todoElement01)

      "delete an element" >> {
        // Given
        val idToRemove = 1
        // When
        val result = todoList.remove(idToRemove)

        // Then
        result must_== true
        todoList.items must not contain (todoElement01)
      }
    }
  }
}