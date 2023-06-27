package Arrays;

import java.util.*;

public class ParticleSimulation {

	private ArrayList<Particle> particles;

	public ParticleSimulation() {
		particles = new ArrayList<>();
	}

	public void addParticle(Particle particle) {
		particles.add(particle);

	}

	public void update() {
		for (Particle particle : particles) {
			particle.update();
		}
	}

	public void render() {
		Formatter formatter = new Formatter();
		formatter.format("%10s %10s\n", "x", "y");
		for (Particle particle : particles) {
			formatter.format("%10.2f %10.2f\n", particle.getX(), particle.getY());
//			particle.render();  This is normal without formatting
		}
		System.out.println(formatter);
	}

	public void simulate(int numberOfSteps) {
		for (int i = 0; i < numberOfSteps; i++) {
			update();
			render();
		}
	}

	public static void main(String[] args) {
		ParticleSimulation simulation = new ParticleSimulation();
		simulation.addParticle(new Particle(100, 100, 0, 0));
		simulation.addParticle(new Particle(200, 200, 10, 20));
		simulation.simulate(100);

	}

}

class Particle {
	private double x, y;
	private double vx, vy;

	public Particle(double x, double y, double vx, double vy) {
		super();
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}

	public void update() {
		x += vx;
		y += vy;

	}

	public void render() {
		System.out.println("(" + x + " , " + y + ")");
	}

}
