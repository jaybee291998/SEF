package sef.module7.activity;

import java.util.Objects;

/**
 * An implementation of the Denomination interface.  The equality test for between instances
 * of this class considers the name and the symbol
 * 
 * @author John Doe
 *
 */
public class DenominationImpl implements Denomination {

	private String name;
	private String description;
	private String symbol;
	/**
	 * Creates a new instance with the specified parameters
	 * 
	 * @param name the name of the denomination
	 * @param description a description 
	 * @param symbol
	 */
	public DenominationImpl(String name, String description, String symbol) {
		this.name = name;
		this.description = description;
		this.symbol = symbol;
	}

	/* (non-Javadoc)
	 * @see sef.module6.activity.Denomination#getDescription()
	 */
	public String getDescription() {
		return description;
	}
	
	/* (non-Javadoc)
	 * @see sef.module6.activity.Denomination#getName()
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see sef.module6.activity.Denomination#getSymbol()
	 */
	public String getSymbol() {
		return symbol;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s %s %s", name, description, symbol);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
//	public boolean equals(Object o) {
//		if(this == o) return true;
//		Denomination denomination = objectToDenomination(o);
//		if(denomination == null) return false;
//		return name.equals(denomination.getName()) && symbol.equals(denomination.getSymbol());
//	}

	
	public Denomination objectToDenomination(Object o) {
		if(o == null) return null;
		if(getClass() != o.getClass()) return null;		
		return (Denomination) o;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DenominationImpl other = (DenominationImpl) obj;
		return Objects.equals(name, other.name) && Objects.equals(symbol, other.symbol);
	}

}
