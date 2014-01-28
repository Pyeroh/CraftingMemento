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
	 * ATTENTION :  j'ai remarqué un doublon pour un Eitem  :  nether_brick    et nether_brickbloc
	 * Réponse : ce n'est pas une erreur, t'inquiète pas ^^ C'est vrai que le "_" peut porter à confusion, je l'ai d'ailleurs retiré
	 * Par contre, y'a une différence entre la nether brick, et le bloc de nether brick. Qu'est-ce qui se passe 
	 * si tu fais cuire de la netherrack, d'après toi...? :p
	 * 
	 * 
	 */



	
	
	/* LES RECETTES AU FOUR
	 * 
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
	 diamant(264,0,"diamond",diamond_ore),
	 fer(265,0,"iron_ingot",iron_ore),
	 or(266,0,"gold_ingot",gold_ore),
	 redstone(331,0,"redstone",redstone_ore),
	 lapis_lazuli(351,4,"dye",lapis_ore),
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
	bloc_quartz_sculptee(155,1,"quartz_block", 1, new EItem[][]{{air, air, air},{air, quartz_slab, air},{air, quartz_slab, air}}),
	bloc_quartz_rayee(155,2,"quartz_block", 2, new EItem[][]{{air, air, air},{air, quartz_block, air},{air, quartz_block, air}}),
	
	
	
	// TABLE DE CRAFT

	enclume(47,0,"anvil", 1, new EItem[][]{{iron_block, iron_block, iron_block},{air, iron_ingot, air},{iron_ingot, iron_ingot, iron_ingot}}),
	table_craft(58,0,"crafting_table", 1, new EItem[][]{{air, air, air},{air, oak_wood, oak_wood},{air, oak_wood, oak_wood}}), //recettes multiples
	fourneau(61,0,"furnace", 1, new EItem[][]{{cobblestone, cobblestone, cobblestone},{cobblestone, air, cobblestone},{cobblestone, cobblestone, cobblestone}}),
	table_enchantement(116,0,"enchanting_table", 1, new EItem[][]{{air, book, air},{diamond, obsidian, diamond},{obsidian, obsidian, obsidian}}),
	alambic(117,0,"brewing_stand", 1, new EItem[][]{{air, air, air},{air, blaze_rod, air},{cobblestone, cobblestone, cobblestone}}),
	
	
	
	
	/*
	 *	BLOCS DECORATIFS
	 * 
	 */
	
	
	barreaux_fer(101,0,"iron_bars", 16, new EItem[][]{{air, air, air},{iron_ingot, iron_ingot, iron_ingot},{iron_ingot, iron_ingot, iron_ingot}}),
	muret(139,0,"cobblestone_wall", 6, new EItem[][]{{air, air, air},{cobblestone, cobblestone, cobblestone},{cobblestone, cobblestone, cobblestone}}),
	muret_moussu(139,1,"cobblestone_wall", 6, new EItem[][]{{air, air, air},{mossy_cobblestone, mossy_cobblestone, mossy_cobblestone},{mossy_cobblestone, mossy_cobblestone, mossy_cobblestone}}),
	pot_fleur(140,0,"flower_pot", 1, new EItem[][]{{air, air, air},{brick, air, brick},{air, brick, air}}),
	bloc_neige(80,0,"snow", 1, new EItem[][]{{air, air, air},{air, snow_ball, snow_ball},{air, snow_ball, snow_ball}}),
	neige(78,0,"snow_layer", 6, new EItem[][]{{air, air, air},{air, air, air},{snow_block, snow_block, snow_block}}),
	bloc_argile(82,0,"clay", 1, new EItem[][]{{air, air, air},{clay_ball, clay_ball, air},{clay_ball, clay_ball, air}}),
	balise(138,0,"beacon", 1, new EItem[][]{{glass, glass, glass},{glass, nether_star, glass},{obsidian, obsidian, obsidian}}),
	barriere(85,0,"fence", 2, new EItem[][]{{air, air, air},{stick, stick, stick},{stick, stick, stick}}),
	
	
	
	/*
	 *	BLOCS MINERAIS
	 * 
	 */
	
	
	bloc_charbon(173,0,"block_of_coal", 1, new EItem[][]{{coal, coal, coal},{coal, coal, coal},{coal, coal, coal}}),
	charbon(173,0,"coal", 9, coal_block),

	bloc_redstone(152,0,"redstone_block", 1, new EItem[][]{	{EItem.redstone, EItem.redstone, EItem.redstone},
															{EItem.redstone, EItem.redstone, EItem.redstone},
															{EItem.redstone, EItem.redstone, EItem.redstone}}),
	redstone2(331,0,"redstone", 9, redstone_block),
	
	bloc_emeraude(133,0,"redstone_block", 1, new EItem[][]{{emerald, emerald, emerald},{emerald, emerald, emerald},{emerald, emerald, emerald}}),
	emeraude(388,0,"redstone", 9, emerald_block),
	
	bloc_diamant(133,0,"diamond_block", 1, new EItem[][]{{diamond, diamond, diamond},{diamond, diamond, diamond},{diamond, diamond, diamond}}),
	diamant2(388,0,"diamond", 9, diamond_block),
	
	bloc_fer(42,0,"iron_block", 1, new EItem[][]{{iron_ingot, iron_ingot, iron_ingot},{iron_ingot, iron_ingot, iron_ingot},{iron_ingot, iron_ingot, iron_ingot}}),
	fer2(265,0,"iron_ingot", 9, iron_block),
	
	bloc_or(41,0,"gold_block", 1, new EItem[][]{{gold_ingot, gold_ingot, gold_ingot},{gold_ingot, gold_ingot, gold_ingot},{gold_ingot, gold_ingot, gold_ingot}}),
	or2(266,0,"gold_ingot", 9, gold_block),
	
	bloc_lapis_lazuli(41,0,"gold_block", 1, new EItem[][]{	{EItem.lapis_lazuli, EItem.lapis_lazuli, EItem.lapis_lazuli},
															{EItem.lapis_lazuli, EItem.lapis_lazuli, EItem.lapis_lazuli},
															{EItem.lapis_lazuli, EItem.lapis_lazuli, EItem.lapis_lazuli}}),
	lapis_lazuli2(266,0,"lapis_lazuli", 9, lapis_block),
	
	
	
	
	
	/*
	 * 
	 * VEGETATION
	 * 
	 */
	
	
	botte_foin(170,0,"hay_block", 1, new EItem[][]{{wheat, wheat, wheat},{wheat, wheat, wheat},{wheat, wheat, wheat}}),
	ble(296,0,"wheat", 9, hay_block),
	
	pasteque(103,0,"melon_block", 1, new EItem[][]{{melon, melon, melon},{melon, melon, melon},{melon, melon, melon}}),
	tranche_pasteque(360,0,"melon", 9, melon_block),
	
	graines_citrouille(361,0,"pumpkin_seeds", 4, pumpkin),
	graines_pasteque(362,0,"melon_seeds", 4, melon),
	
	
	/*
	 * BLOCS COLORES
	 */
	
	laine_blanche(35,0,"wool",1,new EItem[][]{{air,air,air},{air,string,string},{air,string,string}}),
	laine_blanche2(35,0,"wool",1,white_wool,white_dye),
	laine_orange(35,1,"wool",1,white_wool,orange_dye),
	laine_magenta(35,2,"wool",1,white_wool,magenta_dye),
	laine_bleu_clair(35,3,"wool",1,white_wool,l_blue_dye),
	laine_jaune(35,4,"wool",1,white_wool,dandelion_yellow),
	laine_vert_clair(35,5,"wool",1,white_wool,l_green_dye),
	laine_rose(35,6,"wool",1,white_wool,pink_dye),
	laine_grise(35,7,"wool",1,white_wool,gray_dye),
	laine_gris_clair(35,8,"wool",1,white_wool,l_gray_dye),
	laine_cyan(35,9,"wool",1,white_wool,cyan_dye),
	laine_violette(35,10,"wool",1,white_wool,purple_dye),
	laine_bleue(35,11,"wool",1,white_wool,EItem.lapis_lazuli),
	laine_marron(35,12,"wool",1,white_wool,cocoa_beans),
	laine_verte(35,13,"wool",1,white_wool,cactus_green),
	laine_rouge(35,14,"wool",1,white_wool,rose_red),
	laine_noire(35,15,"wool",1,white_wool,ink_sack),
	
	verre_blanc(95,0,"stained_glass",8,new EItem[][]{{glass,glass,glass},{glass,white_dye,glass},{glass,glass,glass}}),
	verre_orange(95,1,"stained_glass",8,new EItem[][]{{glass,glass,glass},{glass,orange_dye,glass},{glass,glass,glass}}),
	verre_magenta(95,2,"stained_glass",8,new EItem[][]{{glass,glass,glass},{glass,magenta_dye,glass},{glass,glass,glass}}),
	verre_bleu_clair(95,3,"stained_glass",8,new EItem[][]{{glass,glass,glass},{glass,l_blue_dye,glass},{glass,glass,glass}}),
	verre_jaune(95,4,"stained_glass",8,new EItem[][]{{glass,glass,glass},{glass,dandelion_yellow,glass},{glass,glass,glass}}),
	verre_vert_clair(95,5,"stained_glass",8,new EItem[][]{{glass,glass,glass},{glass,l_green_dye,glass},{glass,glass,glass}}),
	verre_rose(95,6,"stained_glass",8,new EItem[][]{{glass,glass,glass},{glass,pink_dye,glass},{glass,glass,glass}}),
	verre_gris(95,7,"stained_glass",8,new EItem[][]{{glass,glass,glass},{glass,gray_dye,glass},{glass,glass,glass}}),
	verre_gris_clair(95,8,"stained_glass",8,new EItem[][]{{glass,glass,glass},{glass,l_gray_dye,glass},{glass,glass,glass}}),
	verre_cyan(95,9,"stained_glass",8,new EItem[][]{{glass,glass,glass},{glass,cyan_dye,glass},{glass,glass,glass}}),
	verre_violet(95,10,"stained_glass",8,new EItem[][]{{glass,glass,glass},{glass,purple_dye,glass},{glass,glass,glass}}),
	verre_bleu(95,11,"stained_glass",8,new EItem[][]{{glass,glass,glass},{glass,EItem.lapis_lazuli,glass},{glass,glass,glass}}),
	verre_marron(95,12,"stained_glass",8,new EItem[][]{{glass,glass,glass},{glass,cocoa_beans,glass},{glass,glass,glass}}),
	verre_vert(95,13,"stained_glass",8,new EItem[][]{{glass,glass,glass},{glass,cactus_green,glass},{glass,glass,glass}}),
	verre_rouge(95,14,"stained_glass",8,new EItem[][]{{glass,glass,glass},{glass,rose_red,glass},{glass,glass,glass}}),
	verre_noir(95,15,"stained_glass",8,new EItem[][]{{glass,glass,glass},{glass,ink_sack,glass},{glass,glass,glass}}),
	
	terre_cuite_blanche(159,0,"stained_hardened_clay",8,new EItem[][]{{hardened_clay,hardened_clay,hardened_clay},{hardened_clay,white_dye,hardened_clay},{hardened_clay,hardened_clay,hardened_clay}}),
	terre_cuite_orange(159,1,"stained_hardened_clay",8,new EItem[][]{{hardened_clay,hardened_clay,hardened_clay},{hardened_clay,orange_dye,hardened_clay},{hardened_clay,hardened_clay,hardened_clay}}),
	terre_cuite_magenta(159,2,"stained_hardened_clay",8,new EItem[][]{{hardened_clay,hardened_clay,hardened_clay},{hardened_clay,magenta_dye,hardened_clay},{hardened_clay,hardened_clay,hardened_clay}}),
	terre_cuite_bleu_clair(159,3,"stained_hardened_clay",8,new EItem[][]{{hardened_clay,hardened_clay,hardened_clay},{hardened_clay,l_blue_dye,hardened_clay},{hardened_clay,hardened_clay,hardened_clay}}),
	terre_cuite_jaune(159,4,"stained_hardened_clay",8,new EItem[][]{{hardened_clay,hardened_clay,hardened_clay},{hardened_clay,dandelion_yellow,hardened_clay},{hardened_clay,hardened_clay,hardened_clay}}),
	terre_cuite_vert_clair(159,5,"stained_hardened_clay",8,new EItem[][]{{hardened_clay,hardened_clay,hardened_clay},{hardened_clay,l_green_dye,hardened_clay},{hardened_clay,hardened_clay,hardened_clay}}),
	terre_cuite_rose(159,6,"stained_hardened_clay",8,new EItem[][]{{hardened_clay,hardened_clay,hardened_clay},{hardened_clay,pink_dye,hardened_clay},{hardened_clay,hardened_clay,hardened_clay}}),
	terre_cuite_grise(159,7,"stained_hardened_clay",8,new EItem[][]{{hardened_clay,hardened_clay,hardened_clay},{hardened_clay,gray_dye,hardened_clay},{hardened_clay,hardened_clay,hardened_clay}}),
	terre_cuite_gris_clair(159,8,"stained_hardened_clay",8,new EItem[][]{{hardened_clay,hardened_clay,hardened_clay},{hardened_clay,l_gray_dye,hardened_clay},{hardened_clay,hardened_clay,hardened_clay}}),
	terre_cuite_cyan(159,9,"stained_hardened_clay",8,new EItem[][]{{hardened_clay,hardened_clay,hardened_clay},{hardened_clay,cyan_dye,hardened_clay},{hardened_clay,hardened_clay,hardened_clay}}),
	terre_cuite_violette(159,10,"stained_hardened_clay",8,new EItem[][]{{hardened_clay,hardened_clay,hardened_clay},{hardened_clay,purple_dye,hardened_clay},{hardened_clay,hardened_clay,hardened_clay}}),
	terre_cuite_bleue(159,11,"stained_hardened_clay",8,new EItem[][]{{hardened_clay,hardened_clay,hardened_clay},{hardened_clay,EItem.lapis_lazuli,hardened_clay},{hardened_clay,hardened_clay,hardened_clay}}),
	terre_cuite_marron(159,12,"stained_hardened_clay",8,new EItem[][]{{hardened_clay,hardened_clay,hardened_clay},{hardened_clay,cocoa_beans,hardened_clay},{hardened_clay,hardened_clay,hardened_clay}}),
	terre_cuite_verte(159,13,"stained_hardened_clay",8,new EItem[][]{{hardened_clay,hardened_clay,hardened_clay},{hardened_clay,cactus_green,hardened_clay},{hardened_clay,hardened_clay,hardened_clay}}),
	terre_cuite_rouge(159,14,"stained_hardened_clay",8,new EItem[][]{{hardened_clay,hardened_clay,hardened_clay},{hardened_clay,rose_red,hardened_clay},{hardened_clay,hardened_clay,hardened_clay}}),
	terre_cuite_noire(159,15,"stained_hardened_clay",8,new EItem[][]{{hardened_clay,hardened_clay,hardened_clay},{hardened_clay,ink_sack,hardened_clay},{hardened_clay,hardened_clay,hardened_clay}}),
	
	vitre(102,0,"glass_pane", 16, new EItem[][]{{air, air, air},{glass, glass, glass},{glass, glass, glass}}),
	
	vitre_blanche(160,0,"stained_glass_pane", 16, new EItem[][]{{air, air, air},{white_glass, white_glass, white_glass},{white_glass, white_glass, white_glass}}),
	vitre_orange(160,1,"stained_glass_pane", 16, new EItem[][]{{air, air, air},{orange_glass_pane, orange_glass_pane, orange_glass_pane},{orange_glass_pane, orange_glass_pane, orange_glass_pane}}),
	vitre_magenta(160,2,"stained_glass_pane", 16, new EItem[][]{{air, air, air},{magenta_glass_pane, magenta_glass_pane, magenta_glass_pane},{magenta_glass_pane, magenta_glass_pane, magenta_glass_pane}}),
	vitre_bleu_clair(160,3,"stained_glass_pane", 16, new EItem[][]{{air, air, air},{l_blue_glass_pane, l_blue_glass_pane, l_blue_glass_pane},{l_blue_glass_pane, l_blue_glass_pane, l_blue_glass_pane}}),
	vitre_jaune(160,4,"stained_glass_pane", 16, new EItem[][]{{air, air, air},{yellow_glass_pane, yellow_glass_pane, yellow_glass_pane},{yellow_glass_pane, yellow_glass_pane, yellow_glass_pane}}),
	vitre_vert_clair(160,5,"stained_glass_pane", 16, new EItem[][]{{air, air, air},{l_green_glass_pane, l_green_glass_pane, l_green_glass_pane},{l_green_glass_pane, l_green_glass_pane, l_green_glass_pane}}),
	vitre_rose(160,6,"stained_glass_pane", 16, new EItem[][]{{air, air, air},{pink_glass_pane, pink_glass_pane, pink_glass_pane},{pink_glass_pane, pink_glass_pane, pink_glass_pane}}),
	vitre_grise(160,7,"stained_glass_pane", 16, new EItem[][]{{air, air, air},{gray_glass_pane, gray_glass_pane, gray_glass_pane},{gray_glass_pane, gray_glass_pane, gray_glass_pane}}),
	vitre_gris_clair(160,8,"stained_glass_pane", 16, new EItem[][]{{air, air, air},{l_gray_stained_clay, l_gray_stained_clay, l_gray_stained_clay},{l_gray_stained_clay, l_gray_stained_clay, l_gray_stained_clay}}),
	vitre_cyan(160,9,"stained_glass_pane", 16, new EItem[][]{{air, air, air},{cyan_glass_pane, cyan_glass_pane, cyan_glass_pane},{cyan_glass_pane, cyan_glass_pane, cyan_glass_pane}}),
	vitre_violette(160,10,"stained_glass_pane", 16, new EItem[][]{{air, air, air},{purple_glass_pane, purple_glass_pane, purple_glass_pane},{purple_glass_pane, purple_glass_pane, purple_glass_pane}}),
	vitre_bleue(160,11,"stained_glass_pane", 16, new EItem[][]{{air, air, air},{blue_glass_pane, blue_glass_pane, blue_glass_pane},{blue_glass_pane, blue_glass_pane, blue_glass_pane}}),
	vitre_marron(160,12,"stained_glass_pane", 16, new EItem[][]{{air, air, air},{brown_glass_pane, brown_glass_pane, brown_glass_pane},{brown_glass_pane, brown_glass_pane, brown_glass_pane}}),
	vitre_verte(160,13,"stained_glass_pane", 16, new EItem[][]{{air, air, air},{green_glass_pane, green_glass_pane, green_glass_pane},{green_glass_pane, green_glass_pane, green_glass_pane}}),
	vitre_rouge(160,14,"stained_glass_pane", 16, new EItem[][]{{air, air, air},{red_glass_pane, red_glass_pane, red_glass_pane},{red_glass_pane, red_glass_pane, red_glass_pane}}),
	vitre_noire(160,15,"stained_glass_pane", 16, new EItem[][]{{air, air, air},{black_glass_pane, black_glass_pane, black_glass_pane},{black_glass_pane, black_glass_pane, black_glass_pane}}),
	
	tapis_blanc(171,0,"carpet", 3, new EItem[][]{{air, air, air},{white_wool, white_wool, air},{air, air, air}}),
	tapis_orange(171,1,"carpet", 3, new EItem[][]{{air, air, air},{orange_wool, orange_wool, air},{air, air, air}}),
	tapis_magenta(171,2,"carpet", 3, new EItem[][]{{air, air, air},{magenta_wool, magenta_wool, air},{air, air, air}}),
	tapis_bleu_clair(171,3,"carpet", 3, new EItem[][]{{air, air, air},{l_blue_wool, l_blue_wool, air},{air, air, air}}),
	tapis_jaune(171,4,"carpet", 3, new EItem[][]{{air, air, air},{yellow_wool, yellow_wool, air},{air, air, air}}),
	tapis_vert_clair(171,5,"carpet", 3, new EItem[][]{{air, air, air},{l_green_wool, l_green_wool, air},{air, air, air}}),
	tapis_rose(171,6,"carpet", 3, new EItem[][]{{air, air, air},{pink_wool, pink_wool, air},{air, air, air}}),
	tapis_gris(171,7,"carpet", 3, new EItem[][]{{air, air, air},{gray_wool, gray_wool, air},{air, air, air}}),
	tapis_gris_clair(171,8,"carpet", 3, new EItem[][]{{air, air, air},{l_gray_wool, l_gray_wool, air},{air, air, air}}),
	tapis_cyan(171,9,"carpet", 3, new EItem[][]{{air, air, air},{cyan_wool, cyan_wool, air},{air, air, air}}),
	tapis_violet(171,10,"carpet", 3, new EItem[][]{{air, air, air},{purple_wool, purple_wool, air},{air, air, air}}),
	tapis_bleu(171,11,"carpet", 3, new EItem[][]{{air, air, air},{blue_wool, blue_wool, air},{air, air, air}}),
	tapis_marron(171,12,"carpet", 3, new EItem[][]{{air, air, air},{brown_wool, brown_wool, air},{air, air, air}}),
	tapis_vert(171,13,"carpet", 3, new EItem[][]{{air, air, air},{green_wool, green_wool, air},{air, air, air}}),
	tapis_rouge(171,14,"carpet", 3, new EItem[][]{{air, air, air},{red_wool, red_wool, air},{air, air, air}}),
	tapis_noir(171,15,"carpet", 3, new EItem[][]{{air, air, air},{black_wool, black_wool, air},{air, air, air}}),

	/*
	 *	OBJETS
	 * 
	 */
	
	torche(50,0,"torch", 4, new EItem[][]{{air, air, air},{air, coal, air},{air, stick, air}}),
	torche2(50,0,"torch", 4, new EItem[][]{{air, air, air},{air, charcoal, air},{air, stick, air}}),
	porte_fer(71,0,"iron_door", 1, new EItem[][]{{iron_ingot, iron_ingot, air},{iron_ingot, iron_ingot, air},{iron_ingot, iron_ingot, air}}),
	echelle(65,0,"ladder", 3, new EItem[][]{{stick, air, stick},{stick, stick, air},{stick, air, stick}}),
	coffre_ender(130,2,"ender_chest", 1, new EItem[][]{{obsidian, obsidian, obsidian},{obsidian, eye_of_ender, obsidian},{obsidian, obsidian, obsidian}}),
	
	lanterne(91,0,"lit_pumpkin", 1, new EItem[][]{{air, air, air},{air, pumpkin, air},{air, torch, air}}),
	
	/*
	 * ELEMENTS DU NETHER
	 * 
	 */
	
	pierre_lumineuse(89,0,"glowstone", 1, new EItem[][]{{air, air, air},{glowstone_dust, glowstone_dust, air},{glowstone_dust, glowstone_dust, air}}),
	barriere_nether(113,0,"nether_brickfence", 6, new EItem[][]{{air, air, air},{nether_brick, nether_brick, nether_brick},{nether_brick, nether_brick, nether_brick}}),
	escalier_nether(114,0,"nether_brickstairs", 4, new EItem[][]{{nether_brick, air, air},{nether_brick, nether_brick, air},{nether_brick, nether_brick, nether_brick}}),
	
	
	
	/*____________________________________________________________
	 * 
	 * 
	 * 
	 * Plusieurs combinaions possibles préciser dans le constructeur ?
	 * J'ai oublié de faire ça...
	 * TODO Faire un constructeur pour spécifier les items à combinabilité variable (\o/)
	 */

	lit(26,0,"bed", 1, new EItem[][]{{air, air, air},{white_wool, white_wool, white_wool},{oak_wood, oak_wood, oak_wood}}),
	bibliotheque(155,2,"bookshelf", 1, new EItem[][]{{oak_wood, oak_wood, oak_wood},{book, book, book},{oak_wood, oak_wood, oak_wood}}),
	portillon(107,0,"fence_gate", 1, new EItem[][]{{air, air, air},{stick, oak_wood, stick},{stick, oak_wood, stick}}),
	panneau(68,0,"standing_sign", 3, new EItem[][]{{oak_wood, oak_wood, oak_wood},{oak_wood, oak_wood, oak_wood},{air, stick, air}}),
	coffre(54,0,"chest", 1, new EItem[][]{{oak_wood, oak_wood, oak_wood},{oak_wood, air, oak_wood},{oak_wood, oak_wood, oak_wood}}),
	coffre_piege(146,0,"trapped_chest", 1, new EItem[][]{{air, air, air},{tripwire_hook, chest, air},{air, air, air}}),
	porte_bois(64,0,"wooden_door", 1, new EItem[][]{{oak_wood, oak_wood, air},{oak_wood, oak_wood, air},{oak_wood, oak_wood, air}}),
	jukebox(84,0,"jukebox", 1, new EItem[][]{{oak_wood, oak_wood, oak_wood},{oak_wood, diamond, oak_wood},{oak_wood, oak_wood, oak_wood}}),
	trappe(96,0,"trapdoor", 2, new EItem[][]{{air, air, air},{oak_wood, oak_wood, oak_wood},{oak_wood, oak_wood, oak_wood}}),
	
	
	
	
	
	
	
	
	
	
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
             this(373, metadata, "potion", ERecetteType.alambic, 1);
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
