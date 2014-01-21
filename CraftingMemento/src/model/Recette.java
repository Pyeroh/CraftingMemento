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
	 * 						-pierre taillée (stone_brick)			|
	 * 
	 *	 a	corriger :
	 * 					-nether_brick_     ----> nether_brick
	 * 
	 * 
	 *
	 * 						
	 * 
	 * problème rencontrés : 1 objet peut etre obtenus de différentes manières : grès_gravé * 4   OU  grès_taillé * 4   = grès poli
	 * 
	 * Modèle à copier pour une recette : new EItem[][]{{air,air,air},{air,air,air},{air,air,air}}
	 */

	
	
	/* LES RECETTES AU FOUR
	 * 
	 * 
	 * roche(1,0,"stone", 1,four,new EItem[][]{}),
	 * verre(20,0,"glass",four, 1, new EItem[][]{{air, air, air},{air, sand, air},{air, air, air}}),  recette avec un four
	 * verre(20,0,"glass",four, 1, new EItem[][]{{air, air, air},{air, red_sand, air},{air, air, air}}),  recette avec un four | attention 2eme recette !
	 * 
	 * 
	 * 
	 * 
	 * Il va falloir redéfinir la manière dont on crée une recette de four, de telle manière à ce
	 * qu'on ait même pas besoin d'indiquer craft, four ou alambic. Donc pour le moment, pas de recettes
	 * avec un four ou un alambic tant qu'on a pas fini les recettes sur table de craft. 
	 */
	
	/* LES NOUVELLES RECETTES PAS IMPLEMENTEES (v 1.8)
	 * 
	 * 
	 * 	
	 * granite(1,01,"stone",craft, 1, new EItem[][]{{air, diorite, air},{air, quartz, air},{air, air, air}}),
	 * diorite(1,03,"stone",craft, 2, new EItem[][]{{cobblestone, quartz, air},{quartz, cobblestone, air},{air, air, air}}),
	 * andesite(1,05,"stone",craft,2 , new EItem[][]{{air, diorite, air},{air, cobblestone, air},{air, air, air}}),
	 * pierre_taillee_moussue(98,01,"stonebrick",craft,new EItem[][]{{air, air, air},{air, smooth_brick, air},{air, vine, air}}), //pas encore ajouté, 
	 * pierre_taillee_sculptee(98,03,"stonebrick",craft,new EItem[][]{{air, air, air},{air, stonebrick_slab, air},{air, stonebrick_slab, air}}), 
	 * granite_poli(1,1,"stone",craft,4,new EItem[][]{{granite,diorite,air},{granite,granite,air},{air,air,air}}),
	 * diorite_poli(1,4,"stone",craft,4,new EItem[][]{{diorite,diorite,air},{diorite,diorite,air},{air,air,air}}),
	 * andesite_poli(1,6,"stone",craft,4,new EItem[][]{{andesite,andesite,air},{andesite,andesite,air},{air,air,air}}),
	 * bloc_de_slime(45,0,"slime_block",craft, 1, new EItem[][]{{slime_ball, slime_ball, slime_ball},{slime_ball, slime_ball, slime_ball},{slime_ball, slime_ball, slime_ball}}),
	 * terre_cuite(45,0,"hardened_clay",four, 1, new EItem[][]{{air, air, air},{air, clay_block, air},{air, air, air}}),
	 */

	
	
	
	
	gres(24,0,"sandstone",craft,1,new EItem[][]{{air,air,air},{air,sand,sand},{air,sand,sand}}),
	gres_taille(24,1,"sandstone",craft, 1, new EItem[][]{{air,air,air},{air,sandstone_slab,air},{air,sandstone_slab,air}}),
	gres_poli(24,2,"sandstone",craft, 4, new EItem[][]{{air, air, air},{air, sandstone, sandstone},{air, sandstone, sandstone}}),
	gres_poli2(24,2,"sandstone",craft, 4, new EItem[][]{{air, air, air},{air, chiseled_sandstone, chiseled_sandstone},{air, chiseled_sandstone, chiseled_sandstone}}),
	gres_poli3(24,2,"sandstone",craft, 4, new EItem[][]{{air,air,air},{air,smooth_sandstone,smooth_sandstone},{air,smooth_sandstone,smooth_sandstone}}),
	pierre_taillee(98,0,"stonebrick",craft, 4, new EItem[][]{{air, air, air},{air, stone, stone},{air, stone, stone}}),

	
	
	
	/*
	 * Produits manufacturés
	 * 
	 */

	
	// LES PLANCHES
	planche_chene(5,0,"oak_wooden_plank",craft, 4, new EItem[][]{{air, air, air},{air, wood, air},{air, air, air}}),
	planche_sapin(5,1,"spruce_wooden_plank",craft, 4, new EItem[][]{{air, air, air},{air, wood, air},{air, air, air}}),
	planche_bouleau(5,2,"birch_wooden_plank",craft, 4, new EItem[][]{{air, air, air},{air, wood, air},{air, air, air}}),
	planche_acajou(5,3,"jungle_wooden_plank",craft, 4, new EItem[][]{{air, air, air},{air, wood, air},{air, air, air}}),
	planche_acacia(5,4,"acacia_wooden_plank",craft, 4, new EItem[][]{{air, air, air},{air, wood, air},{air, air, air}}),
	planche_chene_noir(5,5,"dark_oak_wooden_plank",craft, 4, new EItem[][]{{air, air, air},{air, wood, air},{air, air, air}}),
	
	// LES DALLES
	dalle_de_roche(44,0,"stone-slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{stone, stone, stone}}),
	dalle_de_roche_de_sable(44,1,"sandstone-slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{sandstone, sandstone, sandstone}}),
	dalle_de_bois_de_chene(44,2,"oak_wood_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{oak_wooden_plank, oak_wooden_plank, oak_wooden_plank}}),
	dalle_de_pierre(44,3,"cobblestone_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{cobblestone, cobblestone, cobblestone}}),
	dalle_de_brique(44,4,"bricks_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{brick, brick, brick}}),
	dalle_de_pierre_taillee(44,5,"stone_bricks_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{stone_brick, stone_brick, stone_brick}}),
	dalle_de_brick_du_nether(44,6,"nether_bricks_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{nether_brick, nether_brick, nether_brick}}),
	dalle_de_quartz(44,7,"quartz_slab",craft, 6, new EItem[][]{{air, air, air},{air, air, air},{quartz_block, quartz_block, quartz_block}}),
	
	
	//LES ESCALIERS
	
	escalier_de_chene(53,0,"oak_wood_stairs",craft, 4, new EItem[][]{{oak_wooden_plank, air, air},{oak_wooden_plank, oak_wooden_plank, air},{oak_wooden_plank, oak_wooden_plank, oak_wooden_plank}}),
	escalier_de_pierre(67,0,"cobblestone_stairs",craft, 4, new EItem[][]{{cobblestone, air, air},{cobblestone, cobblestone, air},{cobblestone, cobblestone, cobblestone}}),
	escalier_de_brique(108,0,"brick_stairs",craft, 4, new EItem[][]{{brick, air, air},{brick, brick, air},{brick, brick, brick}}),
	escalier_de_pierre_taillee(109,0,"stone_brick_stairs",craft, 4, new EItem[][]{{stone_brick, air, air},{stone_brick, stone_brick, air},{stone_brick, stone_brick, stone_brick}}),
	escalier_de_roche_de_sable(135,0,"sandstone_brick_stairs",craft, 4, new EItem[][]{{sandstone_brick, air, air},{sandstone_brick, sandstone_brick, air},{sandstone_brick, sandstone_brick, sandstone_brick}}),
	escalier_de_sapin(134,0,"spruce_wood_stairs",craft, 4, new EItem[][]{{spruce_wooden_plank, air, air},{spruce_wooden_plank, spruce_wooden_plank, air},{spruce_wooden_plank, spruce_wooden_plank, spruce_wooden_plank}}),
	escalier_de_bouleau(135,0,"birch_wood_stairs",craft, 4, new EItem[][]{{birch_wooden_plank, air, air},{birch_wooden_plank, birch_wooden_plank, air},{birch_wooden_plank, birch_wooden_plank, birch_wooden_plank}}),
	escalier_d_acajou(136,0,"jungle_wood_stairs",craft, 4, new EItem[][]{{jungle_wooden_plank, air, air},{jungle_wooden_plank, jungle_wooden_plank, air},{jungle_wooden_plank, jungle_wooden_plank, jungle_wooden_plank}}),
	escalier_d_acacia(163,0,"acacia_wood_stairs",craft, 4, new EItem[][]{{acacia_wooden_plank, air, air},{acacia_wooden_plank, acacia_wooden_plank, air},{acacia_wooden_plank, acacia_wooden_plank, acacia_wooden_plank}}),
	escalier_de_chene_noir(164,0,"dark_oak_wood_stairs",craft, 4, new EItem[][]{{dark_oak_wooden_plank, air, air},{dark_oak_wooden_plank, dark_oak_wooden_plank, air},{dark_oak_wooden_plank, dark_oak_wooden_plank, dark_oak_wooden_plank}}),
	escalier_de_quartz(156,0,"quartz_stairs",craft, 4, new EItem[][]{{quartz_block, air, air},{quartz_block, quartz_block, air},{quartz_block, quartz_block, quartz_block}}),
	
	// BLOCS DIVERS
	
	brique(45,0,"bricks",craft, 1, new EItem[][]{{air, air, air},{air, brick, brick},{air, brick, brick}}),
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	 * Constructeur à ne pas appeler, permet de construire rapidement et sans répétition
	 * un enum
	 * @param id Identifiant numérique dans le jeu
	 * @param metadata Aussi appelé Damage Value, permet d'identifier les blocs partageant le même ID
	 * @param mid Nouveau "Minecraft ID", le nom dans le jeu pour y accéder via un /give
	 * @param type Type de recette pour l'obtention ({@link ERecetteType})
	 * @param quantite Quantité obtenue
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
	 * @param recette Tableau d'ingrédients, 3x3, tout doit être rempli (même par de l'{@linkplain EItem#air air})
	 * @see Recette#Recette(int, int, String, ERecetteType)
	 */
	Recette(int id, int metadata, String mid, ERecetteType type, int quantite, EItem[][] recette) {
		this(id, metadata, mid, type, quantite);
		this.forme = ERecetteForme.forme;
		if (recette.length==3) {
			if(recette[0].length==3 && recette[1].length==3 && recette[2].length==3) {
				this.recette = recette;
			}
			else throw new IllegalArgumentException("Le tableau d'ingrédients n'est pas de dimension 3x3"); 
		}
		else throw new IllegalArgumentException("Le tableau d'ingrédients n'est pas de dimension 3x3");
	}
	
	/**
	 * Constructeur pour une recette en craft, de type "sans forme"
	 * @param ingredients Liste des ingrédients
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
