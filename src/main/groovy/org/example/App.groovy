package org.example

import groovy.transform.CompileStatic

@CompileStatic
class App {
  static void main(String[] args) {
    List<String> listOfStrings = new ArrayList<String>()
    List<Integer> listOfInteger = new ArrayList<Integer>()

    // OK: Compiles and should compile
    listOfStrings.getTestString()
    listOfStrings.testString
    listOfStrings.getTestStringOrSubclass()
    listOfStrings.testStringOrSubclass

    //
    // static void getTestString(List<String> self)
    //
    // NOT OK: Compiles, but shouldn't compile
    listOfInteger.getTestString()
    //
    // NOT OK: Compiles, but shouldn't compile
    listOfInteger.testString

    //
    // static <S extends String> void getTestStringOrSubclass(List<S> self) {
    //
    // OK: Doesn't compile, shouldn't compile
    // listOfInteger.getTestStringOrSubclass()
    //
    // NOT OK: Compiles, but shouldn't compile
    listOfInteger.testStringOrSubclass
  }
}
