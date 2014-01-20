package model;

import java.util.ArrayList;

import model.enums.*;
import static model.enums.EItem.*;
import static model.enums.ERecetteType.*;

public enum Recette {

	//Soit un tableau, soit une suite d'ingrédients
	//Indiquer la méthode d'obtention...
	/*
	 * x|x|x
	 * x|x|x
	 * x|x|x
	 */
	
	/*roche,
	granite,
	diorite,
	andesite,
	*/
	
	/*
	 * Blocs naturels
	 * 
	 * blocs a rajouter :
	 * 						-diorite
	 * 						-andesite
	 * 						-stonebrick (pierre taillée)
	 *						-vines (lierre) j'ai vu qu'il y avait "vine
	 *
	 * 						
	 * 
	 * problème rencontrés : 1 objet peut etre obtenus de différentes manières : grès_gravé * 4   OU  grès_taillé * 4   = grès poli
	 * 
	 * 
	 */

	
	
	roche(1,0,"stone",four,new EItem[][]{}), // a préciser ce qu'il faut mettre ici pour la recette ... comme c'est fait avec le four.
	granite(1,01,"granite",craft,new EItem[][]{{air, diorite, air},{air, quartz, air},{air, air, air}}),
	diorite(1,03,"diorite",craft,new EItem[][]{{cobblestone, quartz, air},{quartz, cobblestone, air},{air, air, air}}),
	andesite(1,05,"andesite",craft,new EItem[][]{{air, diorite, air},{air, cobblestone, air},{air, air, air}}),
	gres(24,0,"sandstone",craft,new EItem[][]{{air,air,air},{air,sand,sand},{air,sand,sand}}),
	gres_taille(24,01,"chiseled_sandstone",craft, new EItem[][]{{air,air,air},{air,sandstone_slab,air},{air,sandstone_slab,air}}),
	gres_poli(24,02,"smooth_sandstone",craft,new EItem[][]{{air, air, air},{air, sandstone, sandstone},{air, sandstone, sandstone}}),
	// recette 2 : gres_poli(24,2,"smooth_sandstone",craft,new EItem[][]{{air, air, air},{air, chiseled_sandstone, chiseled_sandstone},{air, chiseled_sandstone, chiseled_sandstone}}),
	pierre_taillee(98,0,"stone_brick",craft,new EItem[][]{{air, air, air},{air, stone, stone},{air, stone, stone}}),
	pierre_taillee_moussue(98,01,"mossy_stone_brick",craft,new EItem[][]{{air, air, air},{air, stonebrick, air},{air, vines, air}}), //vérifier le nom officiel
	pierre_taillee_sculptee(98,03,"chiseled_stone_brick",craft,new EItem[][]{{air, air, air},{air, stonebrick_slab, air},{air, stonebrick_slab, air}}),
	
	/*
	 * Produits manufacturés
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
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
