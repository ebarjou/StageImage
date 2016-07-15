package lang;

public enum Text {
	/*UI text*/
	WIN_TITLE("Photogrammetry", "Photogrammétrie"),
	BT_SWITCH_1("Images", "Images"),
	BT_SWITCH_2("Calibrate", "Calibration"),
	BT_SWITCH_3("Result", "Résultat"),
	BT_SELECT_IMAGE("Select image", "Choisir une image"),
	BT_ADD_IMAGE("Add image", "Ajouter une image"),
	BT_RMV_IMAGE("Remove", "Supprimer"),
	BT_COMPUTE("Compute", "Calculer"),
	/*Image Errors*/
	ERR_FILENOTFOUND("File not found : ", "Fichier non trouvé : "),
	ERR_ACCESSOUTISEIMAGE("Coordinate given are outside of the image ", "les coordonée donn�es sont à l'extérieur de l'image "),
	ERR_TYPE("Types don't correspond ", "Les types ne correspondes pas "),
	ERR_WRITE("Can't write ", "Impossible d'écrire "),
	/*UI Errors*/
	ERR_TABARGUMENT("Wrong number of argument for TabbedPane ", "Nombre d'argument incorrect pour le tabbedPane "),
	ERR_NOTENOUGHFILES("Not enough images loaded", "Nombre d'images insuffisant"),
	
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
