package model;

import java.util.ArrayList;

import model.enums.*;
import static model.enums.EItem.*;
import static model.enums.ERecetteType.*;

public enum Recette {

	//Soit un tableau, soit une suite d'ingr�dients
	//Indiquer la m�thode d'obtention...
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
	 * 						-granite
	 * 						-diorite
	 * 						-andesite
	 *
	 * 						
	 * 
	 * probl�me rencontr�s : 1 objet peut etre obtenus de diff�rentes mani�res : gr�s_grav� * 4   OU  gr�s_taill� * 4   = gr�s poli
	 * 
	 * Mod�le � copier pour une recette : new EItem[][]{{air,air,air},{air,air,air},{air,air,air}}
	 */

	
	
	//roche(1,0,"stone",four,new EItem[][]{}),
	/*Il va falloir red�finir la mani�re dont on cr�e une recette de four, de telle mani�re � ce
	 * qu'on ait m�me pas besoin d'indiquer craft, four ou alambic. Donc pour le moment, pas de recettes
	 * avec un four ou un alambic tant qu'on a pas fini les recettes sur table de craft. 
	 */
	//granite(1,01,"stone",craft,new EItem[][]{{air, diorite, air},{air, quartz, air},{air, air, air}}),
	//diorite(1,03,"stone",craft,new EItem[][]{{cobblestone, quartz, air},{quartz, cobblestone, air},{air, air, air}}),
	//andesite(1,05,"stone",craft,new EItem[][]{{air, diorite, air},{air, cobblestone, air},{air, air, air}}),
	gres(24,0,"sandstone",craft,1,new EItem[][]{{air,air,air},{air,sand,sand},{air,sand,sand}}),
	gres_taille(24,01,"sandstone",craft, 1, new EItem[][]{{air,air,air},{air,sandstone_slab,air},{air,sandstone_slab,air}}),
	gres_poli(24,02,"sandstone",craft, 4, new EItem[][]{{air, air, air},{air, sandstone, sandstone},{air, sandstone, sandstone}}),
	gres_poli2(24,2,"sandstone",craft, 4, new EItem[][]{{air, air, air},{air, chiseled_sandstone, chiseled_sandstone},{air, chiseled_sandstone, chiseled_sandstone}}),
	gres_poli3(24,2,"sandstone",craft, 4, new EItem[][]{{air,air,air},{air,smooth_sandstone,smooth_sandstone},{air,smooth_sandstone,smooth_sandstone}}),
	pierre_taillee(98,0,"stonebrick",craft, 4, new EItem[][]{{air, air, air},{air, stone, stone},{air, stone, stone}}),
	//pierre_taillee_moussue(98,01,"stonebrick",craft,new EItem[][]{{air, air, air},{air, smooth_brick, air},{air, vine, air}}), //pas encore ajout�, v1.8
	//pierre_taillee_sculptee(98,03,"stonebrick",craft,new EItem[][]{{air, air, air},{air, stonebrick_slab, air},{air, stonebrick_slab, air}}), //v1.8
	
	
	/*
	 * Produits manufactur�s
	 * 
	 */
	//granite_poli(1,1,"stone",craft,4,new EItem[][]{{granite,diorite,air},{granite,granite,air},{air,air,air}}), //v1.8
	//diorite_poli(1,4,"stone",craft,4,new EItem[][]{{diorite,diorite,air},{diorite,diorite,air},{air,air,air}}), //v1.8
	//andesite_poli(1,6,"stone",craft,4,new EItem[][]{{andesite,andesite,air},{andesite,andesite,air},{air,air,air}}), //v1.8
	
	
	;
	
	private int id;
	private int metadata;
	private String mid;
	private ERecetteForme forme;
	private ERecetteType type;
	private EItem[][] recette = new EItem[3][3];
	private ArrayList<EItem> ingredients = new ArrayList<EItem>();
	private int quantite;
	
	/**
	 * Constructeur � ne pas appeler, permet de construire rapidement et sans r�p�tition
	 * un enum
	 * @param id Identifiant num�rique dans le jeu
	 * @param metadata Aussi appel� Damage Value, permet d'identifier les blocs partageant le m�me ID
	 * @param mid Nouveau "Minecraft ID", le nom dans le jeu pour y acc�der via un /give
	 * @param type Type de recette pour l'obtention ({@link ERecetteType})
	 * @param quantite Quantit� obtenue
	 */
	Recette(int id, int metadata, String mid, ERecetteType type, int quantite) {
		this.id = id;
		this.metadata = metadata;
		this.mid = "minecraft:"+mid;
		this.type = type;
		this.quantite = quantite;
	}
	
	/**
	 * Constructeur pour une recette en craft, de type "avec forme"
	 * @param recette Tableau d'ingr�dients, 3x3, tout doit �tre rempli (m�me par de l'{@linkplain EItem#air air})
	 * @see Recette#Recette(int, int, String, ERecetteType)
	 */
	Recette(int id, int metadata, String mid, ERecetteType type, int quantite, EItem[][] recette) {
		this(id, metadata, mid, type, quantite);
		this.forme = ERecetteForme.forme;
		if (recette.length==3) {
			if(recette[0].length==3 && recette[1].length==3 && recette[2].length==3) {
				this.recette = recette;
			}
			else throw new IllegalArgumentException("Le tableau d'ingr�dients n'est pas de dimension 3x3"); 
		}
		else throw new IllegalArgumentException("Le tableau d'ingr�dients n'est pas de dimension 3x3");
	}
	
	/**
	 * Constructeur pour une recette en craft, de type "sans forme"
	 * @param ingredients Liste des ingr�dients
	 * @see Recette#Recette(int, int, String, ERecetteType)
	 */
	Recette(int id, int metadata, String mid, ERecetteType type, int quantite, EItem... ingredients) {
		this(id, metadata, mid, type, quantite);
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

	public int getQuantite() {
		return quantite;
	}

}
