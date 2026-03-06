package src1.test1;

import java.util.List;
import java.util.stream.Stream;

public class Persion1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Persion1> list=List.of(new Persion1("a","b","c",10,List.of(new Persion1("a1","b1","c1",11))));
		List<Persion1> lp1=list.stream().map(p->new Persion1(p.getFirst_name(),p.getLast_name(),p.getAddress(),p.getAge())).toList();
		System.out.println(lp1);
		List<Persion1> lp2= list.stream().flatMap(p->p.getNeighbours().stream()).toList();
		System.out.println(lp2);
		List<Persion1> lp=Stream.concat(lp1.stream(), lp2.stream()).filter(p->p.getAge()<11).toList();
		System.out.println(lp);
	}

}
