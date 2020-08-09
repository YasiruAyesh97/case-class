import math.{ sqrt, pow }
object Name {


  def main(args:Array[String])={
    val p = Point(6,9)
    val q =Point(2,6)
    val x=p+q
    println(x)
    val r = p.move(10,10)
    println(r)
    val d =p.distant(q)
    println(d)

    val TP =(p:Point) =>p match{
      case Point(0,0) =>println("Point Orgin")
      case Point(x,0) =>println("Point X axis")
      case Point(0,y) =>println("Point y axis")
      case Point(x, y) =>if(x>y) println("x>y") else println("x<y")
    }
    TP(p)
  }


}

case class Point(x:Int,y:Int){

def +(that:Point) =Point(this.x+that.x,this.y+that.y)
def move(dx:Int,dy:Int) =Point(this.x+dx,this.y+dy)
def distant(that:Point): Double = sqrt(pow((that.x-this.x),2) + pow((that.y-this.y),2))
}


