/*
 * Scala (https://www.scala-lang.org)
 *
 * Copyright EPFL and Lightbend, Inc.
 *
 * Licensed under Apache License 2.0
 * (http://www.apache.org/licenses/LICENSE-2.0).
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

package scala.collection.next

final class TestOptionOpsExtensions {
  // Compile checks the return type, no need to run as test.
  def tapEachReturnType(): Option[Int] = Option(5).tapEach(identity)
}
