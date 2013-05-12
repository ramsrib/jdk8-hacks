
README :

JDK 8 Features :

* Static methods in Interface
* Default methods in Interface
  ** Default methods can't override (Object class's methods) equals(), hashCode() & toString() methods
* Functional Interface : @FunctionalInterface - defines exactly one abstract method, Ex : Runnable Interface

* Lambdas 

Examples : 
(int x, int y) -> { return x + y; }
(x, y) -> x + y
x -> x * x
() -> x
x -> { System.out.println(x); }
                           

                           Method reference :   Equivalent Lambda expression
 Static method reference: String::valueOf : x -> String.valueOf(x)
 Non-static method reference: Object::toString : x -> x.toString()
 Capturing method reference: x::toString : () -> x.toString()
 Constructor reference: ArrayList::new : () -> new ArrayList<>()

Updates to java.util.function  : Functional Interfaces

New java.util.stream to support functional style operations on streams of values.  Stream is like Iterator and supports sequential() as well as parallel(). 

Stream<T> stream = collection.stream();

Example :
int sumOfWeights = blocks.stream().filter(b -> b.getColor() == RED)
                                  .mapToInt(b -> b.getWeight())
                                  .sum();
Obtain stream, perform one or more intermediate operations (like filter, map) and perform one terminal operation (like sum).

General properties of stream operations :
* Stateful 
* Short-circuiting

Intermediate operations (lazy) :
Filter, Map, flatMap, peek, distinct, sorted, limit & substream

Terminal operations : 
forEach, toArray, reduce, collect, min, max, count, anyMatch, allMatch, noneMatch, findFirst & findAny

collect from Collectors Interface :
List<String> strings = values.stream()
                             .filter(...)
                             .map(...)
                             .collect(Collectors.toList());

Generic type inference improvements:
// In Java 7:
foo(Utility.<Type>bar());
Utility.<Type>foo().bar();

// In Java 8:
foo(Utility.bar());
Utility.foo().bar();    

* New Date/Time API java.time

* Additions to Collections API

* Additions to Concurrency API
  ** ForkJoinPool
  ** WorkStealingPool

* Additions to IO/NIO API

* Reflection and Annotation Changes 

* Nashorn JavaScript Engine


Reference URL : http://www.techempower.com/blog/2013/03/26/everything-about-java-8/

