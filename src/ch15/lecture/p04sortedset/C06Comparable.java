package ch15.lecture.p04sortedset;

import java.util.TreeSet;

public class C06Comparable {
	public static void main(String[] args) {
		TreeSet<Computer> coms = new TreeSet<Computer>();
		
		coms.add(new Computer(3,2));
		coms.add(new Computer(3,4));
		coms.add(new Computer(7,2));
		
		System.out.println(coms);
	}
}

class Computer implements Comparable<Computer>{
	private int cpu;
	private int ram;
	
	@Override
	public int compareTo(Computer o) {
		// TODO Auto-generated method stub
		if(this.cpu==o.cpu) {
			return this.ram-o.ram;
		}
		return this.cpu - o.cpu;
	}
	
	public Computer(int cpu, int ram) {
		super();
		this.cpu = cpu;
		this.ram = ram;
	}
	
	public int getCpu() {
		return cpu;
	}
	
	public int getRam() {
		return ram;
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + "]";
	}
	
}