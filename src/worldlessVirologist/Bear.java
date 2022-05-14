package worldlessVirologist;

public class Bear extends Agent {
	public Bear() {
		this.name="Bear";
	}
	
	/**
	 * @param v virologist who find a the bear virus
	 * v start move randomly
	 */
	public void Apply(Virologist v) {
		System.out.println("Bear is applied on "+ v.getName()+ "!");
		v.setBear();
	}
	
	public void Unapply(Virologist v) {
	}
	
}
