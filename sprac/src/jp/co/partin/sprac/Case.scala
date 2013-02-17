package jp.co.partin.sprac

class Case {

}

abstract class Expr {
  def simplifyTop: Expr = this match {
    case UnOp("-", UnOp("-", e)) => e
    case BinOp("+", e, Number(0)) => e
    case BinOp("*", e, Number(1)) => e
    // case BinOp(_, e, e) => BinOp(_, e.simplifyTop, e) : will not work
    case _ => this
  }  
}
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr,right: Expr) extends Expr

//merge test, add this comment
//fix