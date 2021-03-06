/*
 * Copyright 2018 pragmatic-scala.reactiveplatform.xyz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package chapter12

object ShortCircuit extends App {
  // #snip
  def expensiveComputation() = {
    println("...assume slow operation...")
    false
  }

  def evaluate(input: Int): Unit = {
    println(s"evaluate called with $input")
    if (input >= 10 && expensiveComputation())
      println("doing work...")
    else
      println("skipping")
  }

  evaluate(0)
  evaluate(100)
  // #snip
}
