package day10.mypac;

public class KPop implements Cloneable{
	public String musicName;
	public String singerName;
	
	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}
