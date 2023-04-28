package ch121;

import java.util.ArrayList;
import java.util.Comparator;

class Fruit {
	String name;
	int weight;
	
	Fruit(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	public String toString() {return name+ "(" +weight+")";}
}
	
class Apple extends Fruit {
	Apple (String name, int weight) {
		super(name, weight);
	}
}
class Grape extends Fruit {
	Grape (String name, int weight) {
		super(name, weight);
	}
}

class AppleCom implements Comparator<Apple> {
	public int compare(Apple t1, Apple t2) {
		return t2.weight - t1.weight;
	}
}
class GrapeCom implements Comparator<Grape> {
	public int compare(Grape t1, Grape t2) {
		return t2.weight - t1.weight;
	}
}
class FruitCom implements Comparator<Fruit> {
	public int compare(Fruit t1, Fruit t2) {
		return t2.weight - t1.weight;
	}
}


class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		String tmp = "";
		
		for(Fruit f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}

public class FruitBoxEx3 {

	public static void main(String[] args) {

		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}   // main
}

class FruitBox<T extends Fruit> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get (int i) {return list.get(i); }
	ArrayList<T> getList() {return list; }
	int size() {return list.size();}
	public String toString() {return list.toString();}
}
