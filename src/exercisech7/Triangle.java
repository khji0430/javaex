package exercisech7;

public class Triangle implements Comparable{
  int width;
  int height;
  ;

  public Triangle(int width, int height){
    this.width = width;
    this.height = height;
  }

  @Override
  public int compareTo(Object o) {
    if(o instanceof Triangle){
      Triangle t = (Triangle) o;
      int result;
      if(this.getArea() < t.getArea()) result = -1;
      else if(this.getArea() > t.getArea()) result = 1;
      else result = 0;
      return result;
    }
    return -999;
  }

  public  double getArea(){
    return (height * width) / (double)2;
  }


  @Override
  public String toString() {
    return "삼각형[" +
        "width=" + width +
        ", height=" + height +
        ", 넓이=" + getArea() +
        ']';
  }
}
