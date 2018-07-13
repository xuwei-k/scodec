package scodec

abstract class Compat {
  implicit def factoryToCanBuildFrom[A, B, C](implicit f: scala.collection.Factory[B, C]): CanBuildFrom[A, B, C] =
    new CanBuildFrom[A, B, C] {
      override def apply() = f.newBuilder
    }
}
