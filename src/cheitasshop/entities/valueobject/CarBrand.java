package cheitasshop.entities.valueobject;

public enum CarBrand {
	RENAULT("Renault"), SUZUKI("Suzuki"), FORD("Ford"), VOLKSWAGEN("Volkswagen");
	String brandname;

	private CarBrand(String brand) {
		this.brandname = brand;
	}

		public static String toString(CarBrand carBrand) {
		return ;
	}

	@Override
	public String toString() {
		return brandname;

	}
}
