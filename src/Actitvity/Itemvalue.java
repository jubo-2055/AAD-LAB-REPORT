package Actitvity;

public class Itemvalue {
  private String s;
  private int start,finish;
public String getS() {
	return s;
}
public void setS(String s) {
	this.s = s;
}
public int getStart() {
	return start;
}
public void setStart(int start) {
	this.start = start;
}
public int getFinish() {
	return finish;
}
public void setFinish(int finish) {
	this.finish = finish;
}
@Override
public String toString() {
	return "Itemvalue [s=" + s + ", start=" + start + ", finish=" + finish + "]";
}
  
}