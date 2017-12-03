package wersja_alternatywna;

public class samochod {
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marka == null) ? 0 : marka.hashCode());
		long temp;
		temp = Double.doubleToLongBits(moc);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		temp = Double.doubleToLongBits(pojemnosc);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + rokProdukcji;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		samochod other = (samochod) obj;
		if (marka == null) {
			if (other.marka != null)
				return false;
		} else if (!marka.equals(other.marka))
			return false;
		if (Double.doubleToLongBits(moc) != Double.doubleToLongBits(other.moc))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Double.doubleToLongBits(pojemnosc) != Double.doubleToLongBits(other.pojemnosc))
			return false;
		if (rokProdukcji != other.rokProdukcji)
			return false;
		return true;
	}

	private String marka, model;
	private int rokProdukcji;
	private double pojemnosc, moc;
	
	public samochod() {
		
	}

	public samochod(String marka, String model, int rokProdukcji, double pojemnosc, double moc) {
		this.marka = marka;
		this.model = model;
		this.rokProdukcji = rokProdukcji;
		this.pojemnosc = pojemnosc;
		this.moc = moc;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRokProdukcji() {
		return rokProdukcji;
	}

	public void setRokProdukcji(int rokProdukcji) {
		this.rokProdukcji = rokProdukcji;
	}

	public double getPojemnosc() {
		return pojemnosc;
	}

	public void setPojemnosc(double pojemnosc) {
		this.pojemnosc = pojemnosc;
	}

	public double getMoc() {
		return moc;
	}

	public void setMoc(double moc) {
		this.moc = moc;
	}

	@Override
	public String toString() {
		return "samochod [marka=" + marka + ", model=" + model + ", rokProdukcji=" + rokProdukcji + ", pojemnosc="
				+ pojemnosc + ", moc=" + moc + ", getMarka()=" + getMarka() + ", getModel()=" + getModel()
				+ ", getRokProdukcji()=" + getRokProdukcji() + ", getPojemnosc()=" + getPojemnosc() + ", getMoc()="
				+ getMoc() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
