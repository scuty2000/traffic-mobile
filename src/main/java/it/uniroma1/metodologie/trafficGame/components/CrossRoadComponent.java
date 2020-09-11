package it.uniroma1.metodologie.trafficGame.components;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.Component;

public class CrossRoadComponent extends Component{
	
	private Set<Entity> s = new HashSet<>();
	
	private int carsOnCrossroad;
	
	public void addCar(Entity e) {
		s.add(e); }
	public void subCar(Entity e) {
		s.remove(e); 
	}
	
	public boolean isFree() { return s.size() == 0; }
}
