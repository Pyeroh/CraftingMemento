package model;

import java.util.ArrayList;

import model.enums.*;
import static model.enums.EItem.*;
import static model.enums.ERecetteType.*;

public enum Recette {

	//Soit un tableau, soit une suite d'ingrédients
	//Indiquer la méthode d'obtention...
	
	/*roche,
	granite,
	diorite,
	andesite,
	*/
	gres(24,0,"sandstone",craft,new EItem[][]{{air,air,air},{air,sand,sand},{air,sand,sand}}),
	gres_taille(24,1,"sandstone",craft, new EItem[][]{{air,air,air},{air,sandstone_slab,air},{air,sandstone_slab,air}}),
	;
	
	private int id;
	private int metadata;
	private String mid;
	private ERecetteForme forme;
	private ERecetteType type;
	private EItem[][] recette = new EItem[3][3];
	private ArrayList<EItem> ingredients = new ArrayList<EItem>(); 
	
	Recette(int id, int metadata, String mid, ERecetteType type) {
		this.id = id;
		this.metadata = metadata;
		this.mid = "minecraft:"+mid;
		this.type = type;
	}
	
	Recette(int id, int metadata, String mid, ERecetteType type, EItem[][] recette) {
		this(id, metadata, mid, type);
		this.forme = ERecetteForme.forme;
		if (recette.length==3) {
			if(recette[0].length==3 && recette[1].length==3 && recette[2].length==3) {
				this.recette = recette;
			}
			else throw new IllegalArgumentException("Le tableau d'ingrédients n'est pas de dimension 3x3"); 
		}
		else throw new IllegalArgumentException("Le tableau d'ingrédients n'est pas de dimension 3x3");
	}
	
	Recette(int id, int metadata, String mid, ERecetteType type, EItem... ingredients) {
		this(id, metadata, mid, type);
		for(int i=0;i<ingredients.length;i++) {
			this.ingredients.add(ingredients[i]);
		}
		this.forme = ERecetteForme.sansforme;
	}

	public int getId() {
		return id;
	}

	public int getMetadata() {
		return metadata;
	}

	public String getMid() {
		return mid;
	}

	public ERecetteForme getForme() {
		return forme;
	}

	public ERecetteType getType() {
		return type;
	}

	public EItem[][] getRecette() {
		return recette;
	}

	public ArrayList<EItem> getIngredients() {
		return ingredients;
	}
	
}
