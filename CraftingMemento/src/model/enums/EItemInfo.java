package model.enums;

public enum EItemInfo {

	;

	private StackSize size;

	private Version version;

	private enum StackSize {
		S1(1),
		S16(16),
		S64(64);

		private int size;

		private StackSize(int size) {
			this.size = size;
		}

		public int getSize() {
			return size;
		}

	}

	private enum Version {

		Classic009a("Classic 0.0.9a"),
		Classic0011a("Classic 0.0.11a"),
		Classic0012a("Classic 0.0.12a"),
		Classic0014a("Classic 0.0.14a"),
		Classic0018a("Classic 0.0.18a"),
		Classic020("Classic 0.20"),
		Classic024("Classic 0.24"),
		Classic026("Classic 0.26"),
		Indev("Indev"),
		Indev031("Indev 0.31"),
		Infdev("Infdev"),
		Alpha100("Alpha 1.0.0"),
		Alpha101("Alpha 1.0.1"),
		Alpha104("Alpha 1.0.4"),
		Alpha105("Alpha 1.0.5"),
		Alpha106("Alpha 1.0.6"),
		Alpha1011("Alpha 1.0.11"),
		Alpha1014("Alpha 1.0.14"),
		Alpha1017("Alpha 1.0.17"),
		Alpha120("Alpha 1.2.0"),
		Beta12("Bêta 1.2"),
		Beta13("Bêta 1.3"),
		Beta15("Bêta 1.5"),
		Beta16("Bêta 1.6"),
		Beta17("Bêta 1.7"),
		Beta18("Bêta 1.8"),
		Beta19PR1("Bêta 1.9 Pre-Release 1"),
		Beta19PR2("Bêta 1.9 Pre-Release 2"),
		Beta19PR3("Bêta 1.9 Pre-Release 3"),
		Beta19PR4("Bêta 1.9 Pre-Release 4"),
		Beta19PR6("Bêta 1.9 Pre-Release 6"),
		Release11("Release 1.1"),
		Release12("Release 1.2"),
		Release124("Release 1.2.4"),
		Release13("Release 1.3"),
		Release14("Release 1.4"),
		Release146("Release 1.4.6"),
		Release15("Release 1.5"),
		Release16("Release 1.6"),
		Release17("Release 1.7"),
		Release18("Release 1.8"),
		;

		private String numVersion;

		private Version(String numVersion) {
			this.numVersion = numVersion;
		}

		public String getNumVersion() {
			return numVersion;
		}

	}





	public int getSize() {
		return size.getSize();
	}

	public String getVersion() {
		return version.getNumVersion();
	}

}


