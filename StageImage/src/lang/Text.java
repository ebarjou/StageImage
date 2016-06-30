package lang;

public enum Text {
	/*UI text*/
	WIN_TITLE("Photogrammetry", "Photogramm�trie"),
	BT_SWITCH_1("Images", "Images"),
	BT_SWITCH_2("Calibrate", "Calibration"),
	BT_SWITCH_3("Result", "R�sultat"),
	BT_SELECT_IMAGE("Select image", "Choisir une image"),
	BT_ADD_IMAGE("Add image", "Ajouter une image"),
	BT_RMV_IMAGE("Remove", "Supprimer"),
	BT_COMPUTE("Compute", "Calculer"),
	/*Image Errors*/
	ERR_FILENOTFOUND("File not found : ", "Fichier non trouv� : "),
	ERR_ACCESSOUTISEIMAGE("Coordinate given are outside of the image ", "les coordon�e donn�es sont � l'ext�rieur de l'image "),
	ERR_TYPE("Types don't correspond ", "Les types ne correspondes pas "),
	ERR_WRITE("Can't write ", "Impossible d'�crire "),
	/*UI Errors*/
	ERR_TABARGUMENT("Wrong number of argument for TabbedPane ", "Nombre d'argument incorrect pour le tabbedPane "),
	
	TEST("a", "b");

	private String fr = "";
	private String en = "";
	int lang = 1;
	
	Text(String en, String fr){
		this.fr = fr;
		this.en = en;
	}
	
	Text(String en){
		this.en = en;
	}
	
	public String fr(){
		if (fr != null) return fr;
		if (en != null) return en;
		return "Error";
	}
	
	public String en(){
		if (en != null) return en;
		return "Error";
	}
	
	public String toString(){
		if ( lang == 1 ) return this.fr();
		return this.en();
	}

}
