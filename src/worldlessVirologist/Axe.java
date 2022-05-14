package worldlessVirologist;

public class Axe extends Equipment{
	
	public Axe() {
		this.name="Axe";
	}
	
	/**
	 * pick this axe up
	 * @param v virologist who find an axe
	 * 
	 */
	public void TakeEquip(Virologist v) {
		System.out.println(v.getName()+" takes an Axe.");
		v.setEquipment(this);
		
	}

	/**
	 * put this axe down
	 * @param v virologist who dont want the axe
	 * 
	 */
	public void DropEquip(Virologist v, Field f) {
		System.out.println("The Virologist drops an Axe.");
		v.removeEquipment(this);
	}
}
