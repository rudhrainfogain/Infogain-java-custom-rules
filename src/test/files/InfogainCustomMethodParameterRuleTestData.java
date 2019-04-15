/**
 * This class is a testing data class to test my custom rule
 * @author Rudhra Koul
 *
 */
class A {

  int foo() {}
  int foo(int a) {} // Noncompliant {{Infogain Recomends Avoiding Method With Same return Type and Argument}}
  int foo(int a, int b) {}

  Object foo(Object a){} // Noncompliant {{Infogain Recomends Avoiding Method With Same return Type and Argument}}
  String foo(String a){} // Noncompliant {{Infogain Recomends Avoiding Method With Same return Type and Argument}}
  String foo(Object a){}
}