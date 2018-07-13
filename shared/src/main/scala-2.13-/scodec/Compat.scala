package scodec

abstract class Compat {
  type CanBuildFrom[-From, -A, +C] = scala.collection.generic.CanBuildFrom[From, A, C]
}
