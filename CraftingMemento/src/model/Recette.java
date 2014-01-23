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
	 * 						-granite (v 1.8)
	 * 						-diorite (v 1.8)
	 * 						-andesite (v1.8)
	 * 						
	 * 
	 * 						-bois de chene (oak_wood)             	|
	 * 						-bois de sapin (spruce_wood)			|
	 * 						-bois de bouleau (birch_wood)			|
	 * 						-bois de acajou (jungle_wood)			|
	 * 						-bois de acacia (acacia_wood)			|
	 * 						-bois de chene noir (dark_oak_wood)		|
	 * 						-pierre taill�e (stone_brick)			|
	 * 
	 *	 a	corriger :
	 * 					-nether_brick_     ----> nether_brick
	 * 
	 * 
	 *
	 * 						
	 * 
	 * probl�me rencontr�s : 1 objet peut etre obtenus de diff�rentes mani�res : gr�s_grav� * 4   OU  gr�s_taill� * 4   = gr�s poli
	 * m�me problemes avec : 
	 * 							-lit (laine de couleur + planches de bois)
	 * 							-bibliotheque (planches)
	 * 							-portillon (planches)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Mod�le � copier pour une recette : new EItem[][]{{air,air,air},{air,air,air},{air,air,air}}
	 */



	/* LES RECETTES AU FOUR
	 * 
	 * 
	 * roche(1,0,"stone", 1,four,new EItem[][]{}),
	 * verre(20,0,"glass",four, 1, new EItem[][]{{air, air, air},{air, sand, air},{air, air, air}}),  recette avec un four
	 * verre(20,0,"glass",four, 1, new EItem[][]{{air, air, air},{air, red_sand, air},{air, air, air}}),  recette avec un four | attention 2eme recette !
	 * terre_cuite(172,0,"hardened_clay",four, 1, new EItem[][]{{air, air, air},{air, clay_block, air},{air, air, air}}),
	 * 
	 * 
	 * 
	 * 
	 * Il va falloir red�finir la mani�re dont on cr�e une recette de four, de telle mani�re � ce
	 * qu'on ait m�me pas besoin d'indiquer craft, four ou alambic. Donc pour le moment, pas de recettes
	 * avec un four ou un alambic tant qu'on a pas fini les recettes sur table de craft. 
	 */

	/* LES NOUVELLES RECETTES PAS IMPLEMENTEES (v 1.8)
	 * 
	 * 
	 * 	
	 * granite(1,01,"stone",craft, 1, new EItem[][]{{air, diorite, air},{air, quartz, air},{air, air, air}}),
	 * diorite(1,03,"stone",craft, 2, new EItem[][]{{cobblestone, quartz, air},{quartz, cobblestone, air},{air, air, air}}),
	 * andesite(1,05,"stone",craft,2 , new EItem[][]{{air, diorite, air},{air, cobblestone, air},{air, air, air}}),
	 * pierre_taillee_moussue(98,01,"stonebrick",craft,new EItem[][]{{air, air, air},{air, smooth_brick, air},{air, vine, air}}),
	 * pierre_taillee_sculptee(98,03,"stonebrick",craft,new EItem[][]{{air, air, air},{air, stonebrick_slab, air},{air, stonebrick_slab, air}}), 
	 * granite_poli(1,1,"stone",craft,4,new EItem[][]{{granite,diorite,air},{granite,granite,air},{air,air,air}}),
	 * diorite_poli(1,4,"stone",craft,4,new EItem[][]{{diorite,diorite,air},{diorite,diorite,air},{air,air,air}}),
	 * andesite_poli(1,6,"stone",craft,4,new EItem[][]{{andesite,andesite,air},{andesite,andesite,air},{air,air,air}}),
	 * bloc_de_slime(165,0,"slime",craft, 1, new EItem[][]{{slime_ball, slime_ball, slime_ball},{slime_ball, slime_ball, slime_ball},{slime_ball, slime_ball, slime_ball}}),
	 */





	gres(24,0,"sandstone",craft,1,new EItem[][]{{air,air,air},{air,sand,sand},{air,sand,sand}}),
	gres_taille(24,1,"sandstone",craft, 1, new EItem[][]{{air,air,air},{air,sandstone_slab,air},{air,sandstone_slab,air}}),
	gres_poli(24,2,"sandstone",craft, 4, new EItem[][]{{air, air, air},{air, sandstone, sandstone},{air, sandstone, sandstone}}),
	gres_poli2(24,2,"sandstone",craft, 4, new EItem[][]{{air, air, air},{air, chiseled_sandstone, chiseled_sandstone},{air, chiseled_sandstone, chiseled_sandstone}}),
	gres_poli3(24,2,"sandstone",craft, 4, new EItem[][]{{air,air,air},{air,smooth_sandstone,smooth_sandstone},{air,smooth_sandstone,smooth_sandstone}}),
	pierre_taillee(98,0,"stonebrick",craft, 4, new EItem[][]{{air, air, air},{air, stone, stone},{air, stone, stone}}),




	/*
	 * Produits manufactur�s
	 * 
	 */


	// LES PLANCHES
	planche_chene(5,0,"planks",craft, 4, oak_log),
	planche_sapin(5,1,"planks",craft, 4, spruce_log),
	planche_bouleau(5,2,"planks",craft, 4, birch_log),
	planche_acajou(5,3,"planks",craft, 4, jungle_log),
	planche_acacia(5,4,"planks",craft, 4, acacia_log),
	planche_chene_noir(5,5,"planks",craft, 4, darkoak_log),

	// LES DALLES
	dalle_de_roche(44,0,"stone_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{stone, stone, stone}}),
	dalle_de_roche_de_sable(44,1,"stone_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{sandstone, sandstone, sandstone}}),
	dalle_de_pierre(44,3,"stone_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{cobblestone, cobblestone, cobblestone}}),
	dalle_de_brique(44,4,"stone_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{brick, brick, brick}}),
	dalle_de_pierre_taillee(44,5,"stone_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{smooth_brick, smooth_brick, smooth_brick}}),
	dalle_de_brick_du_nether(44,6,"stone_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{nether_brick_block, nether_brick_block, nether_brick_block}}),
	dalle_de_quartz(44,7,"stone_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{quartz_block, quartz_block, quartz_block}}),
	dalle_de_bois_de_chene(126,0,"wooden_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{oak_wood, oak_wood, oak_wood}}),
	dalle_de_bois_de_sapin(126,1,"wooden_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{spruce_wood, spruce_wood, spruce_wood}}),
	dalle_de_bois_de_bouleau(126,1,"wooden_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{birch_wood, birch_wood, birch_wood}}),
	dalle_de_bois_d_acajou(126,1,"wooden_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{jungle_wood, jungle_wood, jungle_wood}}),
	dalle_de_bois_d_acacia(126,1,"wooden_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{acacia_wood, acacia_wood, acacia_wood}}),
	dalle_de_bois_de_chene_noir(126,1,"wooden_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{darkoak_wood, darkoak_wood, darkoak_wood}}),


	//LES ESCALIERS

	escalier_de_chene(53,0,"oak_stairs",craft, 4, new EItem[][]{{oak_wood, air, air},{oak_wood, oak_wood, air},{oak_wood, oak_wood, oak_wood}}),
	escalier_de_pierre(67,0,"stone_stairs",craft, 4, new EItem[][]{{cobblestone, air, air},{cobblestone, cobblestone, air},{cobblestone, cobblestone, cobblestone}}),
	escalier_de_brique(108,0,"brick_stairs",craft, 4, new EItem[][]{{brick, air, air},{brick, brick, air},{brick, brick, brick}}),
	escalier_de_pierre_taillee(109,0,"stone_brick_stairs",craft, 4, new EItem[][]{{smooth_brick, air, air},{smooth_brick, smooth_brick, air},{smooth_brick, smooth_brick, smooth_brick}}),
	escalier_de_roche_de_sable(135,0,"sandstone_stairs",craft, 4, new EItem[][]{{sandstone, air, air},{sandstone, sandstone, air},{sandstone, sandstone, sandstone}}),
	escalier_de_sapin(134,0,"spruce_stairs",craft, 4, new EItem[][]{{spruce_wood, air, air},{spruce_wood, spruce_wood, air},{spruce_wood, spruce_wood, spruce_wood}}),
	escalier_de_bouleau(135,0,"birch_stairs",craft, 4, new EItem[][]{{birch_wood, air, air},{birch_wood, birch_wood, air},{birch_wood, birch_wood, birch_wood}}),
	escalier_d_acajou(136,0,"jungle_stairs",craft, 4, new EItem[][]{{jungle_wood, air, air},{jungle_wood, jungle_wood, air},{jungle_wood, jungle_wood, jungle_wood}}),
	escalier_d_acacia(163,0,"acacia_stairs",craft, 4, new EItem[][]{{acacia_wood, air, air},{acacia_wood, acacia_wood, air},{acacia_wood, acacia_wood, acacia_wood}}),
	escalier_de_chene_noir(164,0,"dark_oak_stairs",craft, 4, new EItem[][]{{darkoak_wood, air, air},{darkoak_wood, darkoak_wood, air},{darkoak_wood, darkoak_wood, darkoak_wood}}),
	escalier_de_quartz(156,0,"quartz_stairs",craft, 4, new EItem[][]{{quartz_block, air, air},{quartz_block, quartz_block, air},{quartz_block, quartz_block, quartz_block}}),

	// BLOCS DIVERS

	brique(45,0,"bricks",craft, 1, new EItem[][]{{air, air, air},{air, clay_brick, clay_brick},{air, clay_brick, clay_brick}}),
	bloc_de_quartz(155,0,"quartz_block",craft, 1, new EItem[][]{{air, air, air},{air, quartz, quartz},{air, quartz, quartz}}),
	bloc_de_quartz_sculpte(155,1,"quartz_block",craft, 1, new EItem[][]{{air, air, air},{air, quartz_slab, air},{air, quartz_slab, air}}),
	bloc_de_quartz_raye(155,2,"quartz_block",craft, 2, new EItem[][]{{air, air, air},{air, quartz_block, air},{air, quartz_block, air}}),



	// TABLE DE CRAFT

	enclume(47,0,"anvil",craft, 1, new EItem[][]{{iron_block, iron_block, iron_block},{air, iron_ingot, air},{iron_ingot, iron_ingot, iron_ingot}}),



	//BLOCS DECORATIFS

	//bibliotheque(155,2,"bookshelf",craft, 1, new EItem[][]{{oak_wooden_plank, oak_wooden_plank, oak_wooden_plank},{book, book, book},{oak_wooden_plank, oak_wooden_plank, oak_wooden_plank}}), *** plusieurs recettes possibles
	//portillon(156,0,"fence_gate",craft, 1, new EItem[][]{{air, air, air},{stick, oak_wooden_plank, stick},{stick, oak_wooden_plank, stick}}), ***





	;

	private int id;
	private int metadata;
	private String mid;
	private ERecetteForme forme = null;
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
	 * @see Recette#Recette(int, int, String, ERecetteType, int)
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
	 * Constructeur pour une recette, de type "sans forme"
	 * @param ingredients Liste des ingr�dients
	 * @see Recette#Recette(int, int, String, ERecetteType, int
	 */
	Recette(int id, int metadata, String mid, ERecetteType type, int quantite, EItem... ingredients) {
		this(id, metadata, mid, type, quantite);
		for(int i=0;i<ingredients.length;i++) {
			this.ingredients.add(ingredients[i]);
		}
		this.forme = ERecetteForme.sansforme;
	}
	
	/**
	 * Constructeur pour une recette de four
	 * @param acuire l'ingr�dient � cuire
	 * @see Recette#Recette(int, int, String, ERecetteType, int
	 */
	Recette(int id, int metadata, String mod, EItem acuire) {
		this(id, metadata, mod, four, 1);
		this.ingredients.add(acuire);
	}
	
	/**
	 * Constructeur pour une recette de potion
	 * @param ingredient L'ingr�dient n�cessaire � l'obtention de la potion
	 * @param potion_base La potion utilis�e pour devenir la nouvelle potion
	 * @see Recette#Recette(int, int, String, ERecetteType, int
	 */
	Recette(int metadata, EItem ingredient, EItem potion_base) {
		this(373, metadata, "potion", alambic, 1);
		this.ingredients.add(ingredient);
		this.ingredients.add(potion_base);
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
