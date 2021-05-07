package org.example

import groovy.transform.CompileStatic


@CompileStatic
class TestExtensionClass {
  static void getTestString(List<String> self) {
    // no-op
  }

  static <S extends String> void getTestStringOrSubclass(List<S> self) {
    // no-op
  }
}
