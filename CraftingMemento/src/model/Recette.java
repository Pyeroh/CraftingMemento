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
	 * ATTENTION :  j'ai remarqué un doublon pour un Eitem  :  nether_brick_    et nether_brick_bloc
	 * 
	 * 
	 */



	
	
	/* LES RECETTES AU FOUR
	 * 
	 * 
	 * 
	 * 
	 * Il va falloir redéfinir la manière dont on crée une recette de four, de telle manière à ce
	 * qu'on ait même pas besoin d'indiquer craft, four ou alambic. Donc pour le moment, pas de recettes
	 * avec un four ou un alambic tant qu'on a pas fini les recettes sur table de craft. 
	 */
	
	
	 roche(1,0,"stone",cobblestone),
	 verre(20,0,"glass", sand),
	 verre2(20,0,"glass",redsand),
	 terre_cuite(172,0,"hardened_clay",clay),
	 charbon_cuit(263,0,"coal",coal_ore),
	 charbon_bois(263,1,"coal",oak_log),
	 charbon_bois2(263,1,"coal",spruce_log),
	 charbon_bois3(263,1,"coal",birch_log),
	 charbon_bois4(263,1,"coal",jungle_log),
	 charbon_bois5(263,1,"coal",acacia_log),
	 charbon_bois6(263,1,"coal",darkoak_log),
	 diamant_cuit(264,0,"diamond",diamond_ore),
	 cuit(265,0,"iron_ingot",iron_ore),
	 or_cuit(266,0,"gold_ingot",gold_ore),
	 redstone_cuite(331,0,"redstone",redstone_ore),
	 lapis_lazuli_cuit(351,4,"dye",lapis_ore),
	 emeraude_cuite(388,0,"emerald",emerald_ore),
	 brique_du_nether(405,0,"netherbrick",netherrack),
	 quartz(406,0,"quartz",quartz_ore),
	 cote_porc_cuite(320,0,"cooked_porkchop",raw_pork),
	 poisson_cuit(350,0,"cooked_fished",raw_fish),
	 saumon_cuit(350,1,"cooked_fished",raw_salmon),
	 steak(364,0,"cooked_beef",raw_beef),
	 poulet_roti(366,0,"cooked_chicken",raw_chicken),
	 patate_cuite(393,0,"baked_potato",potato),
	 colorant_vert(351,2,"dye",cactus),
	 brique_argile(336,0,"brick",clay_ball),
	 

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
	 * bloc_slime(165,0,"slime",craft, 1, new EItem[][]{{slime_ball, slime_ball, slime_ball},{slime_ball, slime_ball, slime_ball},{slime_ball, slime_ball, slime_ball}}),
	 * terre_cuite(172,0,"hardened_clay",four, 1, new EItem[][]{{air, air, air},{air, clay_block, air},{air, air, air}}),
	 */





	gres(24,0,"sandstone",1,new EItem[][]{{air,air,air},{air,sand,sand},{air,sand,sand}}),
	gres_taille(24,1,"sandstone", 1, new EItem[][]{{air,air,air},{air,sandstone_slab,air},{air,sandstone_slab,air}}),
	gres_poli(24,2,"sandstone", 4, new EItem[][]{{air, air, air},{air, sandstone, sandstone},{air, sandstone, sandstone}}),
	gres_poli2(24,2,"sandstone", 4, new EItem[][]{{air, air, air},{air, chiseled_sandstone, chiseled_sandstone},{air, chiseled_sandstone, chiseled_sandstone}}),
	gres_poli3(24,2,"sandstone", 4, new EItem[][]{{air,air,air},{air,smooth_sandstone,smooth_sandstone},{air,smooth_sandstone,smooth_sandstone}}),
	pierre_taillee(98,0,"stonebrick", 4, new EItem[][]{{air, air, air},{air, stone, stone},{air, stone, stone}}),




	/*
	 * Produits manufacturés
	 * 
	 */


	// LES PLANCHES
	planche_chene(5,0,"planks", 4, oak_log),
	planche_sapin(5,1,"planks", 4, spruce_log),
	planche_bouleau(5,2,"planks", 4, birch_log),
	planche_acajou(5,3,"planks", 4, jungle_log),
	planche_acacia(5,4,"planks", 4, acacia_log),
	planche_chene_noir(5,5,"planks", 4, darkoak_log),
	
	// LES DALLES
	dalle_roche(44,0,"stone_slab", 6, new EItem[][]{{air, air, air},{air, air, air},{stone, stone, stone}}),
    dalle_roche_sable(44,1,"stone_slab", 6, new EItem[][]{{air, air, air},{air, air, air},{sandstone, sandstone, sandstone}}),
    dalle_pierre(44,3,"stone_slab", 6, new EItem[][]{{air, air, air},{air, air, air},{cobblestone, cobblestone, cobblestone}}),
    dalle_brique(44,4,"stone_slab", 6, new EItem[][]{{air, air, air},{air, air, air},{brick, brick, brick}}),
    dalle_pierre_taillee(44,5,"stone_slab", 6, new EItem[][]{{air, air, air},{air, air, air},{smooth_brick, smooth_brick, smooth_brick}}),
    dalle_brique_nether(44,6,"stone_slab", 6, new EItem[][]{{air, air, air},{air, air, air},{nether_brick_block, nether_brick_block, nether_brick_block}}),
    dalle_quartz(44,7,"stone_slab", 6, new EItem[][]{{air, air, air},{air, air, air},{quartz_block, quartz_block, quartz_block}}),
    dalle_bois_chene(126,0,"wooden_slab", 6, new EItem[][]{{air, air, air},{air, air, air},{oak_wood, oak_wood, oak_wood}}),
    dalle_bois_sapin(126,1,"wooden_slab", 6, new EItem[][]{{air, air, air},{air, air, air},{spruce_wood, spruce_wood, spruce_wood}}),
    dalle_bois_bouleau(126,2,"wooden_slab", 6, new EItem[][]{{air, air, air},{air, air, air},{birch_wood, birch_wood, birch_wood}}),
    dalle_bois_acajou(126,3,"wooden_slab", 6, new EItem[][]{{air, air, air},{air, air, air},{jungle_wood, jungle_wood, jungle_wood}}),
    dalle_bois_acacia(126,4,"wooden_slab", 6, new EItem[][]{{air, air, air},{air, air, air},{acacia_wood, acacia_wood, acacia_wood}}),
    dalle_bois_chene_noir(126,5,"wooden_slab", 6, new EItem[][]{{air, air, air},{air, air, air},{darkoak_wood, darkoak_wood, darkoak_wood}}),
	
	
	//LES ESCALIERS

	escalier_chene(53,0,"oak_stairs", 4, new EItem[][]{{oak_wood, air, air},{oak_wood, oak_wood, air},{oak_wood, oak_wood, oak_wood}}),
	escalier_pierre(67,0,"stone_stairs", 4, new EItem[][]{{cobblestone, air, air},{cobblestone, cobblestone, air},{cobblestone, cobblestone, cobblestone}}),
	escalier_brique(108,0,"brick_stairs", 4, new EItem[][]{{brick, air, air},{brick, brick, air},{brick, brick, brick}}),
	escalier_pierre_taillee(109,0,"stone_brick_stairs", 4, new EItem[][]{{smooth_brick, air, air},{smooth_brick, smooth_brick, air},{smooth_brick, smooth_brick, smooth_brick}}),
	escalier_roche_sable(135,0,"sandstone_stairs", 4, new EItem[][]{{sandstone, air, air},{sandstone, sandstone, air},{sandstone, sandstone, sandstone}}),
	escalier_sapin(134,0,"spruce_stairs", 4, new EItem[][]{{spruce_wood, air, air},{spruce_wood, spruce_wood, air},{spruce_wood, spruce_wood, spruce_wood}}),
	escalier_bouleau(135,0,"birch_stairs", 4, new EItem[][]{{birch_wood, air, air},{birch_wood, birch_wood, air},{birch_wood, birch_wood, birch_wood}}),
	escalier_acajou(136,0,"jungle_stairs", 4, new EItem[][]{{jungle_wood, air, air},{jungle_wood, jungle_wood, air},{jungle_wood, jungle_wood, jungle_wood}}),
	escalier_acacia(163,0,"acacia_stairs", 4, new EItem[][]{{acacia_wood, air, air},{acacia_wood, acacia_wood, air},{acacia_wood, acacia_wood, acacia_wood}}),
	escalier_chene_noir(164,0,"dark_oak_stairs", 4, new EItem[][]{{darkoak_wood, air, air},{darkoak_wood, darkoak_wood, air},{darkoak_wood, darkoak_wood, darkoak_wood}}),
	escalier_quartz(156,0,"quartz_stairs", 4, new EItem[][]{{quartz_block, air, air},{quartz_block, quartz_block, air},{quartz_block, quartz_block, quartz_block}}),

	// BLOCS DIVERS
	
	bloc_brique(45,0,"bricks", 1, new EItem[][]{{air, air, air},{air, brick, brick},{air, brick, brick}}),
	bloc_quartz(155,0,"quartz_block", 1, new EItem[][]{{air, air, air},{air, EItem.quartz, EItem.quartz},{air, EItem.quartz, EItem.quartz}}),
	bloc_quartz_sculptee(155,1,"chiseled_quartz_block", 1, new EItem[][]{{air, air, air},{air, quartz_slab, air},{air, quartz_slab, air}}),
	bloc_quartz_rayee(155,2,"pillar_quartz_block", 2, new EItem[][]{{air, air, air},{air, quartz_block, air},{air, quartz_block, air}}),
	
	
	
	// TABLE DE CRAFT

	enclume(47,0,"anvil", 1, new EItem[][]{{iron_block, iron_block, iron_block},{air, iron_ingot, air},{iron_ingot, iron_ingot, iron_ingot}}),
	table_craft(58,0,"crafting_table", 1, new EItem[][]{{air, air, air},{air, oak_wooden_plank, oak_wooden_plank},{air, oak_wooden_plank, oak_wooden_plank}}), //recettes multiples
	fourneau(61,0,"furnace", 1, new EItem[][]{{cobblestone, cobblestone, cobblestone},{cobblestone, air, cobblestone},{cobblestone, cobblestone, cobblestone}}),
	table_enchantement(116,0,"enchanting_table", 1, new EItem[][]{{air, book, air},{diamond, obsidian, diamond},{obsidian, obsidian, obsidian}}),
	alambique(117,0,"brewing_stand", 1, new EItem[][]{{air, air, air},{air, blaze_rod, air},{cobblestone, cobblestone, cobblestone}}),
	
	
	
	
	/*
	 *	BLOCS DECORATIFS
	 * 
	 */
	
	
	barreaux_fer(101,0,"iron_bars", 16, new EItem[][]{{air, air, air},{iron_ingot, iron_ingot, iron_ingot},{iron_ingot, iron_ingot, iron_ingot}}),
	muret(139,0,"clobblestone_wall", 6, new EItem[][]{{air, air, air},{cobblestone, cobblestone, cobblestone},{cobblestone, cobblestone, cobblestone}}),
	muret_moussu(139,1,"clobblestone_wall", 6, new EItem[][]{{air, air, air},{mossy_cobblestone, mossy_cobblestone, mossy_cobblestone},{mossy_cobblestone, mossy_cobblestone, mossy_cobblestone}}),
	pot_fleur(140,0,"flower_pot", 1, new EItem[][]{{air, air, air},{brick, air, brick},{air, brick, air}}),
	bloc_neige(80,0,"snow", 1, new EItem[][]{{air, air, air},{air, snow_ball, snow_ball},{air, snow_ball, snow_ball}}),
	neige(78,0,"snow_layer", 6, new EItem[][]{{air, air, air},{air, air, air},{snow_block, snow_block, snow_block}}),
	bloc_argile(82,0,"clay", 1, new EItem[][]{{air, air, air},{clay_ball, clay_ball, air},{clay_ball, clay_ball, air}}),
	balise(138,0,"beacon", 1, new EItem[][]{{glass, glass, glass},{glass, nether_star, glass},{obsidian, obsidian, obsidian}}),
	
	
	
	
	/*
	 *	BLOCS MINERAIS
	 * 
	 */
	
	
	bloc_charbon(173,0,"block_of_coal", 1, new EItem[][]{{coal, coal, coal},{coal, coal, coal},{coal, coal, coal}}),
	charbon(173,0,"coal", 9, new EItem[][]{{air, air, air},{air, coal_block, air},{air, air, air}}),

	bloc_redstone(152,0,"redstone_block", 1, new EItem[][]{{coal, coal, coal},{coal, coal, coal},{coal, coal, coal}}),
	redstone(331,0,"redstone", 9, new EItem[][]{{air, air, air},{air, redstone_block, air},{air, air, air}}),
	
	bloc_emeraude(133,0,"redstone_block", 1, new EItem[][]{{emerald, emerald, emerald},{emerald, emerald, emerald},{emerald, emerald, emerald}}),
	emeraude(388,0,"redstone", 9, new EItem[][]{{air, air, air},{air, emerald_block, air},{air, air, air}}),
	
	bloc_diamant(133,0,"diamond_block", 1, new EItem[][]{{diamond, diamond, diamond},{diamond, diamond, diamond},{diamond, diamond, diamond}}),
	diamant(388,0,"diamond", 9, new EItem[][]{{air, air, air},{air, diamond_block, air},{air, air, air}}),
	
	bloc_fer(42,0,"iron_block", 1, new EItem[][]{{iron_ingot, iron_ingot, iron_ingot},{iron_ingot, iron_ingot, iron_ingot},{iron_ingot, iron_ingot, iron_ingot}}),
	fer(265,0,"iron_ingot", 9, new EItem[][]{{air, air, air},{air, iron_block, air},{air, air, air}}),
	
	bloc_or(41,0,"gold_block", 1, new EItem[][]{{gold_ingot, gold_ingot, gold_ingot},{gold_ingot, gold_ingot, gold_ingot},{gold_ingot, gold_ingot, gold_ingot}}),
	or(266,0,"gold_ingot", 9, new EItem[][]{{air, air, air},{air, gold_block, air},{air, air, air}}),
	
	bloc_lapis_lazuli(41,0,"gold_block", 1, new EItem[][]{{lapis_lazuli, lapis_lazuli, lapis_lazuli},{lapis_lazuli, lapis_lazuli, lapis_lazuli},{lapis_lazuli, lapis_lazuli, lapis_lazuli}}),
	gemme_lapis_lazuli(266,0,"lapis_lazuli", 9, new EItem[][]{{air, air, air},{air, lapis_block, air},{air, air, air}}),
	
	
	
	
	
	/*
	 * 
	 * VEGETATION
	 * 
	 */
	
	
	botte_foin(170,0,"hay_block", 1, new EItem[][]{{wheat, wheat, wheat},{wheat, wheat, wheat},{wheat, wheat, wheat}}),
	ble(296,0,"wheat", 9, new EItem[][]{{air, air, air},{air, hay_block, air},{air, air, air}}),
	
	pasteque(103,0,"melon_block", 1, new EItem[][]{{melon, melon, melon},{melon, melon, melon},{melon, melon, melon}}),
	tranche_pasteque(360,0,"melon", 9, new EItem[][]{{air, air, air},{air, melon_block, air},{air, air, air}}),
	
	graines_citrouille(86,0,"pumpkin", 4, new EItem[][]{{air, air, air},{air, pumpkin, air},{air, air, air}}),
	
	
	
		//VITRES ET BLOCS DE VERRE
		
		vitre(102,0,"glass_pane", 1, new EItem[][]{{air, air, air},{glass, glass, glass},{glass, glass, glass}}),
		vitre_teinte(160,0,"glass_pane", 1, new EItem[][]{{air, air, air},{glass, glass, glass},{glass, glass, glass}}),
		
	

	/*
	 *	OBJETS
	 * 
	 */
	
	torche(50,0,"torch", 4, new EItem[][]{{air, air, air},{air, coal, air},{air, stick, air}}),
	torche2(50,0,"torch", 4, new EItem[][]{{air, air, air},{air, charcoal, air},{air, stick, air}}),
	porte_fer(71,0,"iron_door", 1, new EItem[][]{{iron_ingot, iron_ingot, air},{iron_ingot, iron_ingot, air},{iron_ingot, iron_ingot, air}}),
	echelle(65,0,"ladder", 3, new EItem[][]{{stick, air, stick},{stick, stick, air},{stick, air, stick}}),
	coffre_ender(130,2,"ender_chest", 1, new EItem[][]{{air, air, air},{tripwire_hook, chest, air},{air, air, air}}),
	
	lanterne(91,0,"lit_pumpkin", 1, new EItem[][]{{air, air, air},{air, pumpkin, air},{air, torch, air}}),
	
	/*
	 * ELEMENTS DU NETHER
	 * 
	 */
	
	pierre_lumineuse(89,0,"glowstone", 1, new EItem[][]{{air, air, air},{glowstone_dust, glowstone_dust, air},{glowstone_dust, glowstone_dust, air}}),
	barriere_nether(113,0,"nether_brick_fence", 6, new EItem[][]{{air, air, air},{nether_brick_, nether_brick_, nether_brick_},{nether_brick_, nether_brick_, nether_brick_}}),
	escalier_nether(114,0,"nether_brick_stairs", 4, new EItem[][]{{nether_brick_, air, air},{nether_brick_, nether_brick_, air},{nether_brick_, nether_brick_, nether_brick_}}),
	
	
	/*
	 * BLOCS COLORES
	 * 
	 */
	
	
	
	/*____________________________________________________________
	 * 
	 * 
	 * 
	 * Plusieurs combinaions possibles préciser dans le constructeur ?
	 */

	lit(26,0,"bed", 1, new EItem[][]{{air, air, air},{white_wool, white_wool, white_wool},{oak_wooden_plank, oak_wooden_plank, oak_wooden_plank}}),
	bibliotheque(155,2,"bookshelf", 1, new EItem[][]{{oak_wooden_plank, oak_wooden_plank, oak_wooden_plank},{book, book, book},{oak_wooden_plank, oak_wooden_plank, oak_wooden_plank}}),
	portillon(107,0,"fence_gate", 1, new EItem[][]{{air, air, air},{stick, oak_wooden_plank, stick},{stick, oak_wooden_plank, stick}}),
	barriere(85,0,"fence", 2, new EItem[][]{{air, air, air},{stick, stick, stick},{stick, stick, stick}}),
	sign(68,0,"standing_sign", 3, new EItem[][]{{oak_wooden_plank, oak_wooden_plank, oak_wooden_plank},{oak_wooden_plank, oak_wooden_plank, oak_wooden_plank},{air, stick, air}}),
	coffre(54,0,"chest", 1, new EItem[][]{{oak_wooden_plank, oak_wooden_plank, oak_wooden_plank},{oak_wooden_plank, air, oak_wooden_plank},{oak_wooden_plank, oak_wooden_plank, oak_wooden_plank}}),
	coffre_piege(146,0,"trapped_chest", 1, new EItem[][]{{oak_wooden_plank, oak_wooden_plank, oak_wooden_plank},{oak_wooden_plank, air, oak_wooden_plank},{oak_wooden_plank, oak_wooden_plank, oak_wooden_plank}}),
	
	porte_bois(64,0,"wooden_door", 1, new EItem[][]{{oak_wooden_plank, oak_wooden_plank, air},{oak_wooden_plank, oak_wooden_plank, air},{oak_wooden_plank, oak_wooden_plank, air}}),
	jukebox(84,0,"jukebox", 1, new EItem[][]{{oak_wooden_plank, oak_wooden_plank, oak_wooden_plank},{oak_wooden_plank, diamond, oak_wooden_plank},{oak_wooden_plank, stick, oak_wooden_plank}}),
	trappe(96,0,"trapdoor", 2, new EItem[][]{{air, air, air},{oak_wooden_plank, oak_wooden_plank, oak_wooden_plank},{oak_wooden_plank, oak_wooden_plank, oak_wooden_plank}}),
	
	
	
	
	
	
	
	
	
	
	;

	 private int id;
     private int metadata;
     private String mid;
     private ERecetteForme forme = null;
     private ERecetteType type;
     private EItem[][] recette = new EItem[3][3];
     private ArrayList<EItem> ingredients = new ArrayList<EItem>();
     private int quantite;
     private boolean combinable = false;

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
      * @see Recette#Recette(int, int, String, ERecetteType, int)
      */
     Recette(int id, int metadata, String mid, int quantite, EItem[][] recette) {
             this(id, metadata, mid, craft, quantite);
             this.forme = ERecetteForme.forme;
             if (recette.length==3) {
                     if(recette[0].length==3 && recette[1].length==3 && recette[2].length==3) {
                             this.recette = recette;
                     }
                     else throw new IllegalArgumentException("Le tableau d'ingrédients n'est pas de dimension 3x3"); 
             }
             else throw new IllegalArgumentException("Le tableau d'ingrédients n'est pas de dimension 3x3");
     }
     
     Recette(int id, int metadata, String mid, int quantite, EItem[][] recette, boolean combinable) {
             this(id, metadata, mid, quantite, recette);
             this.combinable = combinable;
     }

     /**
      * Constructeur pour une recette, de type "sans forme"
      * @param ingredients Liste des ingrédients
      * @see Recette#Recette(int, int, String, ERecetteType, int
      */
     Recette(int id, int metadata, String mid, int quantite, EItem... ingredients) {
             this(id, metadata, mid, craft, quantite);
             for(int i=0;i<ingredients.length;i++) {
                     this.ingredients.add(ingredients[i]);
             }
             this.forme = ERecetteForme.sansforme;
     }
     
     /**
      * Constructeur pour une recette de four
      * @param acuire l'ingrédient à cuire
      * @see Recette#Recette(int, int, String, ERecetteType, int
      */
     Recette(int id, int metadata, String mod, EItem acuire) {
             this(id, metadata, mod, four, 1);
             this.ingredients.add(acuire);
     }
     
     /**
      * Constructeur pour une recette de potion
      * @param ingredient L'ingrédient nécessaire à l'obtention de la potion
      * @param potion_base La potion utilisée pour devenir la nouvelle potion
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

     public boolean isCombinable() {
             return combinable;
     }

}
