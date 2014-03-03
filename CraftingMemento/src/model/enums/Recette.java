package model.enums;

import static model.enums.EItem.*;
import static model.enums.ERecetteType.craft;
import static model.enums.ERecetteType.four;

import java.util.ArrayList;

import model.Item;

public enum Recette {

	//Soit un tableau, soit une suite d'ingr�dients
	//Indiquer la m�thode d'obtention...
	/*
	 * x|x|x
	 * x|x|x
	 * x|x|x
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


	 /*
	  * BLOCS ROCHEUX
	  * 
	  */


	gres(24,0,"sandstone",1,new EItem[][]{{air,air,air},{air,sand,sand},{air,sand,sand}}),
	gres_taille(24,1,"sandstone", 1, new EItem[][]{{air,air,air},{air,sandstone_slab,air},{air,sandstone_slab,air}}),
	gres_poli(24,2,"sandstone", 4, new EItem[][]{{air, air, air},{air, sandstone, sandstone},{air, sandstone, sandstone}}),
	gres_poli2(24,2,"sandstone", 4, new EItem[][]{{air, air, air},{air, chiseled_sandstone, chiseled_sandstone},{air, chiseled_sandstone, chiseled_sandstone}}),
	gres_poli3(24,2,"sandstone", 4, new EItem[][]{{air,air,air},{air,smooth_sandstone,smooth_sandstone},{air,smooth_sandstone,smooth_sandstone}}),
	pierre_taillee(98,0,"stonebrick", 4, new EItem[][]{{air, air, air},{air, stone, stone},{air, stone, stone}}),




	/*
	 * Produits manufactur�s
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
	table_craft(58,0,"crafting_table", 1, new EItem[][]{{air, air, air},{air, oak_wood, oak_wood},{air, oak_wood, oak_wood}},true),
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
	
	bloc_emeraude(133,0,"emerald_block", 1, new EItem[][]{{emerald, emerald, emerald},{emerald, emerald, emerald},{emerald, emerald, emerald}}),
	emeraude(388,0,"emerald", 9, emerald_block),
	
	bloc_diamant(133,0,"diamond_block", 1, new EItem[][]{{diamond, diamond, diamond},{diamond, diamond, diamond},{diamond, diamond, diamond}}),
	diamant2(388,0,"diamond", 9, diamond_block),
	
	bloc_fer(42,0,"iron_block", 1, new EItem[][]{{iron_ingot, iron_ingot, iron_ingot},{iron_ingot, iron_ingot, iron_ingot},{iron_ingot, iron_ingot, iron_ingot}}),
	fer2(265,0,"iron_ingot", 9, iron_block),
	
	bloc_or(41,0,"gold_block", 1, new EItem[][]{{gold_ingot, gold_ingot, gold_ingot},{gold_ingot, gold_ingot, gold_ingot},{gold_ingot, gold_ingot, gold_ingot}}),
	or2(266,0,"gold_ingot", 9, gold_block),
	or3(266,0,"gold_ingot",1,new EItem[][]{{gold_nugget,gold_nugget,gold_nugget},{gold_nugget,gold_nugget,gold_nugget},{gold_nugget,gold_nugget,gold_nugget}}),
	pepite_or(371,0,"gold_nugget",9,gold_ingot),
	
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
	 *	OBJETS DIVERS
	 * 
	 */
	
	torche(50,0,"torch", 4, new EItem[][]{{air, air, air},{air, coal, air},{air, stick, air}}),
	torche2(50,0,"torch", 4, new EItem[][]{{air, air, air},{air, charcoal, air},{air, stick, air}}),
	porte_fer(71,0,"iron_door", 1, new EItem[][]{{iron_ingot, iron_ingot, air},{iron_ingot, iron_ingot, air},{iron_ingot, iron_ingot, air}}),
	echelle(65,0,"ladder", 3, new EItem[][]{{stick, air, stick},{stick, stick, air},{stick, air, stick}}),
	coffre_ender(130,2,"ender_chest", 1, new EItem[][]{{obsidian, obsidian, obsidian},{obsidian, eye_of_ender, obsidian},{obsidian, obsidian, obsidian}}),
	
	lanterne(91,0,"lit_pumpkin", 1, new EItem[][]{{air, air, air},{air, pumpkin, air},{air, torch, air}}),
	
	papier(339,0,"paper",1,new EItem[][]{{air,air,air},{air,air,air},{sugar_cane,sugar_cane,sugar_cane}}),
	livre(340,0,"book",1,leather,paper,paper,paper),
	cahier(386,0,"writable_book",1,feather,ink_sack,book),
	livre_manuscrit(387,0,"written_book",1,written_book,book_and_quill),
	livre_manuscrit2(387,0,"written_book",2,written_book,book_and_quill,book_and_quill),
	livre_manuscrit3(387,0,"written_book",3,written_book,book_and_quill,book_and_quill,book_and_quill),
	livre_manuscrit4(387,0,"written_book",4,written_book,book_and_quill,book_and_quill,book_and_quill,book_and_quill),
	livre_manuscrit5(387,0,"written_book",5,written_book,book_and_quill,book_and_quill,book_and_quill,book_and_quill,book_and_quill),
	livre_manuscrit6(387,0,"written_book",6,written_book,book_and_quill,book_and_quill,book_and_quill,book_and_quill,book_and_quill,book_and_quill),
	livre_manuscrit7(387,0,"written_book",7,written_book,book_and_quill,book_and_quill,book_and_quill,book_and_quill,book_and_quill,book_and_quill,book_and_quill),
	livre_manuscrit8(387,0,"written_book",8,written_book,book_and_quill,book_and_quill,book_and_quill,book_and_quill,book_and_quill,book_and_quill,book_and_quill,book_and_quill),
	cadre(389,0,"item_frame",1,new EItem[][]{{stick,stick,stick},{stick,leather,stick},{stick,stick,stick}}),
	pot_de_fleur(390,0,"flower_pot",1,new EItem[][]{{air,air,air},{clay_brick,air,clay_brick},{air,clay_brick,air}}),
	
	chaudron(380,0,"cauldron",1,new EItem[][]{{iron_ingot,air,iron_ingot},{iron_ingot,air,iron_ingot},{iron_ingot,iron_ingot,iron_ingot}}),
	boule_de_feu(385,0,"fire_charge",3,new EItem[][]{{air,gunpowder,air},{air,coal,air},{air,blaze_powder,air}}),
	boule_de_feu2(385,0,"fire_charge",3,new EItem[][]{{air,gunpowder,air},{air,charcoal,air},{air,blaze_powder,air}}),
	
	carotte_sur_baton(398,0,"carrot_on_a_stick",1,new EItem[][]{{fishing_rod,air,air},{air,carrot,air},{air,air,air}}),
	
	feu_dartifice(401,0,"fireworks",1,paper,gunpowder),
	explosif_dartifice(402,0,"firework_charge",1,gunpowder,ink_sack),
	
	laisse(420,0,"lead",1,new EItem[][]{{string,string,air},{string,slime_ball,air},{air,air,string}}),
	
	
	
	/*
	 * ELEMENTS DU NETHER
	 * 
	 */
	
	pierre_lumineuse(89,0,"glowstone", 1, new EItem[][]{{air, air, air},{glowstone_dust, glowstone_dust, air},{glowstone_dust, glowstone_dust, air}}),
	bloc_de_brique_du_nether(112,0,"nether_brick", 1, new EItem[][]{{air, air, air},{air, nether_brick, nether_brick},{air, nether_brick, nether_brick}}),
	barriere_nether(113,0,"nether_brickfence", 6, new EItem[][]{{air, air, air},{nether_brick, nether_brick, nether_brick},{nether_brick, nether_brick, nether_brick}}),
	escalier_nether(114,0,"nether_brickstairs", 4, new EItem[][]{{nether_brick, air, air},{nether_brick, nether_brick, air},{nether_brick, nether_brick, nether_brick}}),
	
	
	
	/*
	 * ITEMS A COMBINABILITES VARIABLE (DIVERS)
	 * 
	 */

	lit(26,0,"bed", 1, new EItem[][]{{air, air, air},{white_wool, white_wool, white_wool},{oak_wood, oak_wood, oak_wood}}, true),
	bibliotheque(155,2,"bookshelf", 1, new EItem[][]{{oak_wood, oak_wood, oak_wood},{book, book, book},{oak_wood, oak_wood, oak_wood}},true),
	portillon(107,0,"fence_gate", 1, new EItem[][]{{air, air, air},{stick, oak_wood, stick},{stick, oak_wood, stick}},true),
	panneau(68,0,"standing_sign", 3, new EItem[][]{{oak_wood, oak_wood, oak_wood},{oak_wood, oak_wood, oak_wood},{air, stick, air}},true),
	coffre(54,0,"chest", 1, new EItem[][]{{oak_wood, oak_wood, oak_wood},{oak_wood, air, oak_wood},{oak_wood, oak_wood, oak_wood}},true),
	coffre_piege(146,0,"trapped_chest", 1, new EItem[][]{{air, air, air},{tripwire_hook, chest, air},{air, air, air}}),
	porte_bois(64,0,"wooden_door", 1, new EItem[][]{{oak_wood, oak_wood, air},{oak_wood, oak_wood, air},{oak_wood, oak_wood, air}},true),
	jukebox(84,0,"jukebox", 1, new EItem[][]{{oak_wood, oak_wood, oak_wood},{oak_wood, diamond, oak_wood},{oak_wood, oak_wood, oak_wood}},true),
	trappe(96,0,"trapdoor", 2, new EItem[][]{{air, air, air},{oak_wood, oak_wood, oak_wood},{oak_wood, oak_wood, oak_wood}},true),
	baton(280,0,"stick",4,new EItem[][]{{air,air,air},{air,oak_wood,air},{air,oak_wood,air}},true),
	bol(281,0,"bowl",4,new EItem[][]{{air,air,air},{oak_wood,air,oak_wood},{air,oak_wood,air}},true),
	tableau(321,0,"painting",1,new EItem[][]{{stick,stick,stick},{stick,white_wool,stick},{stick,stick,stick}},true),
	
	
	/*
	 * MECANIQUE ET REDSTONE
	 * 
	 */
	
	distributeur(23,0,"dispenser",1, new EItem[][]{{cobblestone,cobblestone,cobblestone},{cobblestone,bow,cobblestone},{cobblestone,EItem.redstone,cobblestone}}),
	noteblock(25,0,"noteblock",1,new EItem[][]{{oak_wood,oak_wood,oak_wood},{oak_wood,EItem.redstone,oak_wood},{oak_wood,oak_wood,oak_wood}},true),
	rail_booster(27,0,"golden_rail",6,new EItem[][]{{gold_ingot,air,gold_ingot},{gold_ingot,stick,gold_ingot},{gold_ingot,EItem.redstone,gold_ingot}}),
	rail_detecteur(28,0,"detector_rail",6,new EItem[][]{{iron_ingot,air,iron_ingot},{iron_ingot,stone_plate,iron_ingot},{iron_ingot,EItem.redstone,iron_ingot}}),
	piston_collant(29,0,"sticky_piston",1,new EItem[][]{{air,air,air},{air,slime_ball,air},{air,EItem.piston,air}}),
	piston(33,0,"piston",1,new EItem[][]{{oak_wood,oak_wood,oak_wood},{cobblestone,iron_ingot,cobblestone},{cobblestone,EItem.redstone,cobblestone}}),
	tnt(46,0,"tnt",1,new EItem[][]{{gunpowder,sand,gunpowder},{sand,gunpowder,sand},{gunpowder,sand,gunpowder}}),
	tnt2(46,0,"tnt",1,new EItem[][]{{gunpowder,redsand,gunpowder},{redsand,gunpowder,redsand},{gunpowder,redsand,gunpowder}}),
	rail(66,0,"rail",16,new EItem[][]{{iron_ingot,air,iron_ingot},{iron_ingot,stick,iron_ingot},{iron_ingot,air,iron_ingot}}),
	levier(69,0,"lever",1,new EItem[][]{{air,air,air},{air,stick,air},{air,cobblestone,air}}),
	plaque_pression_pierre(70,0,"stone_pressure_plate",1,new EItem[][]{{air,air,air},{air,air,air},{stone,stone,air}}),
	plaque_pression_bois(72,0,"wooden_pressure_plate",1,new EItem[][]{{air,air,air},{air,air,air},{oak_wood,oak_wood,air}},true),
	torche_redstone(76,0,"redstone_torch",1,new EItem[][]{{air,air,air},{air,EItem.redstone,air},{air,stick,air}}),
	bouton_pierre(77,0,"stone_button",1,stone),
	lampe_redstone(123,0,"redstone_lamp",1,new EItem[][]{{air,EItem.redstone,air},{EItem.redstone,glowstone,EItem.redstone},{air,EItem.redstone,air}}),
	crochet(131,0,"tripwire_hook",2,new EItem[][]{{air,iron_ingot,air},{air,stick,air},{air,oak_wood,air}},true),
	bouton_bois(143,0,"wooden_button",1,true,oak_wood),
	plaque_pression_sensible(147,0,"light_weighted_pressure_plate",1,new EItem[][]{{air,air,air},{air,air,air},{gold_ingot,gold_ingot,air}}),
	plaque_pression_lourde(148,0,"heavy_weighted_pressure_plate",1,new EItem[][]{{air,air,air},{air,air,air},{iron_ingot,iron_ingot,air}}),
	capteur_solaire(151,0,"daylight_detector",1,new EItem[][]{{glass,glass,glass},{EItem.quartz,EItem.quartz,EItem.quartz},{oakwood_slab,oakwood_slab,oakwood_slab}},true),
	entonnoir(154,0,"hopper",1,new EItem[][]{{iron_ingot,air,iron_ingot},{iron_ingot,chest,iron_ingot},{air,iron_ingot,air}}),
	rail_activation(157,0,"activator_rail",6,new EItem[][]{{iron_ingot,stick,iron_ingot},{iron_ingot,redstone_torch_on,iron_ingot},{iron_ingot,stick,iron_ingot}}),
	droppeur(158,0,"dropper",1,new EItem[][]{{cobblestone,cobblestone,cobblestone},{cobblestone,air,cobblestone},{cobblestone,EItem.redstone,cobblestone}}),
	
	repeteur(356,0,"repeater",1,new EItem[][]{{air,air,air},{redstone_torch_on,EItem.redstone,redstone_torch_on},{stone,stone,stone}}),
	comparateur(404,0,"comparator",1,new EItem[][]{{air,redstone_torch_on,air},{redstone_torch_on,EItem.quartz,redstone_torch_on},{stone,stone,stone}}),
	
	
	/*
	 * NOURRITURE
	 * 
	 */
	
	soupe_champi(282,0,"mushroom_stew",1,red_mushroom,brown_mushroom,bowl),
	pain(297,0,"bread",1,new EItem[][]{{air,air,air},{air,air,air},{wheat,wheat,wheat}}),
	pomme_or(322,0,"golden_apple",1,new EItem[][]{{gold_nugget,gold_nugget,gold_nugget},{gold_nugget,apple,gold_nugget},{gold_nugget,gold_nugget,gold_nugget}}),
	pomme_or_enchant(322,1,"golden_apple",1,new EItem[][]{{gold_block,gold_block,gold_block},{gold_block,apple,gold_block},{gold_block,gold_block,gold_block}}),
	sucre(353,0,"sugar",1,sugar_cane),
	gateau(354,0,"cake",1,new EItem[][]{{milk_bucket,milk_bucket,milk_bucket},{sugar,egg,sugar},{wheat,wheat,wheat}}),
	cookie(357,0,"cookie",8,new EItem[][]{{air,air,air},{wheat,cocoa_beans,wheat},{air,air,air}}),
	carotte_doree(396,0,"golden_carrot",1,new EItem[][]{{gold_nugget,gold_nugget,gold_nugget},{gold_nugget,carrot,gold_nugget},{gold_nugget,gold_nugget,gold_nugget}}),
	tarte_citrouille(400,0,"pumpkin_pie",1,egg,pumpkin,sugar),
	
	
	/*
	 * OUTILS
	 * 
	 */
	
	pelle_fer(256,0,"iron_shovel",1,new EItem[][]{{air,iron_ingot,air},{air,stick,air},{air,stick,air}}),
	pioche_fer(257,0,"iron_pickaxe",1,new EItem[][]{{iron_ingot,iron_ingot,iron_ingot},{air,stick,air},{air,stick,air}}),
	hache_fer(258,0,"iron_axe",1,new EItem[][]{{iron_ingot,iron_ingot,air},{iron_ingot,stick,air},{air,stick,air}}),
	
	briquet(259,0,"flint_and_steel",1,new EItem[][]{{air,air,air},{iron_ingot,air,air},{air,flint,air}}),
	
	pelle_bois(269,0,"wooden_shovel",1,new EItem[][]{{air,oak_wood,air},{air,stick,air},{air,stick,air}},true),
	pioche_bois(270,0,"wooden_pickaxe",1,new EItem[][]{{oak_wood,oak_wood,oak_wood},{air,stick,air},{air,stick,air}},true),
	hache_bois(271,0,"wooden_axe",1,new EItem[][]{{oak_wood,oak_wood,air},{oak_wood,stick,air},{air,stick,air}},true),
	
	pelle_pierre(273,0,"stone_shovel",1,new EItem[][]{{air,cobblestone,air},{air,stick,air},{air,stick,air}}),
	pioche_pierre(274,0,"stone_pickaxe",1,new EItem[][]{{cobblestone,cobblestone,cobblestone},{air,stick,air},{air,stick,air}}),
	hache_pierre(275,0,"stone_axe",1,new EItem[][]{{cobblestone,cobblestone,air},{cobblestone,stick,air},{air,stick,air}}),
	
	pelle_diamant(277,0,"diamond_shovel",1,new EItem[][]{{air,diamond,air},{air,stick,air},{air,stick,air}}),
	pioche_diamant(278,0,"diamond_pickaxe",1,new EItem[][]{{diamond,diamond,diamond},{air,stick,air},{air,stick,air}}),
	hache_diamant(279,0,"diamond_axe",1,new EItem[][]{{diamond,diamond,air},{diamond,stick,air},{air,stick,air}}),
	
	pelle_or(284,0,"gold_shovel",1,new EItem[][]{{air,gold_ingot,air},{air,stick,air},{air,stick,air}}),
	pioche_or(285,0,"gold_pickaxe",1,new EItem[][]{{gold_ingot,gold_ingot,gold_ingot},{air,stick,air},{air,stick,air}}),
	hache_or(286,0,"gold_axe",1,new EItem[][]{{gold_ingot,gold_ingot,air},{gold_ingot,stick,air},{air,stick,air}}),
	
	faux_bois(290,0,"wooden_hoe",1,new EItem[][]{{oak_wood,oak_wood,air},{air,stick,air},{air,stick,air}},true),
	faux_pierre(291,0,"stone_hoe",1,new EItem[][]{{cobblestone,cobblestone,air},{air,stick,air},{air,stick,air}}),
	faux_fer(292,0,"iron_hoe",1,new EItem[][]{{iron_ingot,iron_ingot,air},{air,stick,air},{air,stick,air}}),
	faux_diamant(293,0,"diamond_hoe",1,new EItem[][]{{diamond,diamond,air},{air,stick,air},{air,stick,air}}),
	faux_or(294,0,"gold_hoe",1,new EItem[][]{{gold_ingot,gold_ingot,air},{air,stick,air},{air,stick,air}}),
	
	seau(325,0,"bucket",1,new EItem[][]{{air,air,air},{iron_ingot,air,iron_ingot},{air,iron_ingot,air}}),
	boussole(345,0,"compass",1,new EItem[][]{{air,iron_ingot,air},{iron_ingot,EItem.redstone,iron_ingot},{air,iron_ingot,air}}),
	canne_a_peche(346,0,"fishing_rod",1,new EItem[][]{{air,air,stick},{air,stick,string},{stick,air,string}}),
	montre(347,0,"clock",1,new EItem[][]{{air,gold_ingot,air},{gold_ingot,EItem.redstone,gold_ingot},{air,gold_ingot,air}}),
	cisailles(359,0,"shears",1, new EItem[][]{{air,air,air},{air,iron_ingot,air},{iron_ingot,air,air}}),
	
	
	/*
	 * ARMES ET ARMURES
	 * 
	 */
	
	arc(261,0,"bow",1,new EItem[][]{{string,stick,air},{string,air,stick},{string,stick,air}}),
	fleche(262,0,"arrow",4,new EItem[][]{{air,flint,air},{air,stick,air},{air,feather,air}}),
	
	epee_fer(267,0,"iron_sword",1,new EItem[][]{{air,iron_ingot,air},{air,iron_ingot,air},{air,stick,air}}),
	epee_bois(268,0,"wooden_sword",1,new EItem[][]{{air,oak_wood,air},{air,oak_wood,air},{air,stick,air}},true),
	epee_pierre(272,0,"stone_sword",1,new EItem[][]{{air,cobblestone,air},{air,cobblestone,air},{air,stick,air}}),
	epee_diamant(276,0,"diamond_sword",1,new EItem[][]{{air,diamond,air},{air,diamond,air},{air,stick,air}}),
	epee_or(283,0,"golden_sword",1,new EItem[][]{{air,gold_ingot,air},{air,gold_ingot,air},{air,stick,air}}),
	
	tete_cuir(298,0,"leather_helmet",1,new EItem[][]{{air,air,air},{leather,leather,leather},{leather,air,leather}}),
	torse_cuir(299,0,"leather_chestplate",1,new EItem[][]{{leather,air,leather},{leather,leather,leather},{leather,leather,leather}}),
	jambes_cuir(300,0,"leather_leggings",1,new EItem[][]{{leather,leather,leather},{leather,air,leather},{leather,air,leather}}),
	pieds_cuir(301,0,"leather_boots",1,new EItem[][]{{air,air,air},{leather,air,leather},{leather,air,leather}}),
	
	tete_maille(302,0,"chainmail_helmet",1,new EItem[][]{{air,air,air},{fire,fire,fire},{fire,air,fire}}),
	torse_maille(303,0,"chainmail_chestplate",1,new EItem[][]{{fire,air,fire},{fire,fire,fire},{fire,fire,fire}}),
	jambes_maille(304,0,"chainmail_leggings",1,new EItem[][]{{fire,fire,fire},{fire,air,fire},{fire,air,fire}}),
	pieds_maille(305,0,"chainmail_boots",1,new EItem[][]{{air,air,air},{fire,air,fire},{fire,air,fire}}),
	
	tete_fer(306,0,"iron_helmet",1,new EItem[][]{{air,air,air},{iron_ingot,iron_ingot,iron_ingot},{iron_ingot,air,iron_ingot}}),
	torse_fer(307,0,"iron_chestplate",1,new EItem[][]{{iron_ingot,air,iron_ingot},{iron_ingot,iron_ingot,iron_ingot},{iron_ingot,iron_ingot,iron_ingot}}),
	jambes_fer(308,0,"iron_leggings",1,new EItem[][]{{iron_ingot,iron_ingot,iron_ingot},{iron_ingot,air,iron_ingot},{iron_ingot,air,iron_ingot}}),
	pieds_fer(309,0,"iron_boots",1,new EItem[][]{{air,air,air},{iron_ingot,air,iron_ingot},{iron_ingot,air,iron_ingot}}),
	
	tete_diamant(310,0,"diamond_helmet",1,new EItem[][]{{air,air,air},{diamond,diamond,diamond},{diamond,air,diamond}}),
	torse_diamant(311,0,"diamond_chestplate",1,new EItem[][]{{diamond,air,diamond},{diamond,diamond,diamond},{diamond,diamond,diamond}}),
	jambes_diamant(312,0,"diamond_leggings",1,new EItem[][]{{diamond,diamond,diamond},{diamond,air,diamond},{diamond,air,diamond}}),
	pieds_diamant(313,0,"diamond_boots",1,new EItem[][]{{air,air,air},{diamond,air,diamond},{diamond,air,diamond}}),
	
	tete_or(314,0,"golden_helmet",1,new EItem[][]{{air,air,air},{gold_ingot,gold_ingot,gold_ingot},{gold_ingot,air,gold_ingot}}),
	torse_or(315,0,"golden_chestplate",1,new EItem[][]{{gold_ingot,air,gold_ingot},{gold_ingot,gold_ingot,gold_ingot},{gold_ingot,gold_ingot,gold_ingot}}),
	jambes_or(316,0,"golden_leggings",1,new EItem[][]{{gold_ingot,gold_ingot,gold_ingot},{gold_ingot,air,gold_ingot},{gold_ingot,air,gold_ingot}}),
	pieds_or(317,0,"golden_boots",1,new EItem[][]{{air,air,air},{gold_ingot,air,gold_ingot},{gold_ingot,air,gold_ingot}}),
	
	/*
	 * TRANSPORT
	 * 
	 */
	
	wagon(328,0,"minecart",1,new EItem[][]{{air,air,air},{iron_ingot,air,iron_ingot},{iron_ingot,iron_ingot,iron_ingot}}),
	bateau(333,0,"boat",1,new EItem[][]{{air,air,air},{oak_wood,air,oak_wood},{oak_wood,oak_wood,oak_wood}},true),
	wagon_coffre(342,0,"chest_minecart",1,new EItem[][]{{air,air,air},{air,chest,air},{air,minecart,air}}),
	locomotive(343,0,"furnace_minecart",1,new EItem[][]{{air,air,air},{air,furnace,air},{air,minecart,air}}),
	carte(358,0,"filled_map",1,new EItem[][]{{paper,paper,paper},{paper,map,paper},{paper,paper,paper}}),
	carte2(358,0,"filled_map",2,empty_map,map),
	carte_vierge(395,0,"map",1,new EItem[][]{{paper,paper,paper},{paper,compass,paper},{paper,paper,paper}}),
	wagon_tnt(407,0,"tnt_minecart",1,new EItem[][]{{air,air,air},{air,EItem.tnt,air},{air,minecart,air}}),
	wagon_entonnoir(408,0,"hopper_minecart",1,new EItem[][]{{air,air,air},{air,hopper,air},{air,minecart,air}}),
	
	
	/*
	 * COLORANTS
	 * 
	 */
	
	colorant_rouge(351,1,"dye",1,poppy),
	colorant_rouge1(351,1,"dye",1,red_tulip),
	colorant_rouge2(351,1,"dye",2,rose_bush),
	colorant_violet(351,5,"dye",2,rose_red,EItem.lapis_lazuli),
	colorant_cyan(351,6,"dye",2,cactus_green,EItem.lapis_lazuli),
	colorant_gris_clair(351,7,"dye",3,ink_sack,white_dye,white_dye),
	colorant_gris_clair2(351,7,"dye",2,gray_dye,white_dye),
	colorant_gris_clair3(351,7,"dye",1,azure_bluet),
	colorant_gris_clair4(351,7,"dye",1,white_tulip),
	colorant_gris_clair5(351,7,"dye",1,oxeye_daisy),
	colorant_gris(351,8,"dye",2,ink_sack,white_dye),
	colorant_rose(351,9,"dye",2,rose_red,white_dye),
	colorant_rose2(351,9,"dye",1,pink_tulip),
	colorant_rose3(351,9,"dye",2,peony),
	colorant_vert_clair(351,9,"dye",1,cactus_green,white_dye),
	colorant_jaune(351,11,"dye",1,yellow_flower),
	colorant_jaune2(351,11,"dye",2,sunflower),
	colorant_bleu_clair(351,12,"dye",2,EItem.lapis_lazuli,white_dye),
	colorant_bleu_clair2(351,12,"dye",1,blue_orchid),
	colorant_magenta(351,13,"dye",2,purple_dye,pink_dye),
	colorant_magenta2(351,13,"dye",3,pink_dye,rose_red,EItem.lapis_lazuli),
	colorant_magenta3(351,13,"dye",4,EItem.lapis_lazuli,white_dye,rose_red,rose_red),
	colorant_magenta4(351,13,"dye",1,allium),
	colorant_magenta5(351,13,"dye",2,lilac),
	colorant_orange(351,14,"dye",2,rose_red,dandelion_yellow),
	colorant_orange2(351,14,"dye",1,orange_tulipe),
	engrais(351,15,"dye",3,bone),
	
	/*
	 * ALCHIMIE
	 * 
	 */
	
	fiole(374,0,"glass_bottle",3,new EItem[][]{{air,air,air},{glass,air,glass},{air,glass,air}}),
	
	oeil_araignee_fermente(376,0,"fermented_spider_eye",1,spider_eye,sugar,brown_mushroom),
	poudre_blaze(377,0,"blaze_powder",2,blaze_rod),
	creme_magma(378,0,"magma_cream",1,slime_ball,blaze_powder),
	oeil_ender(381,0,"ender_eye",1,blaze_powder,ender_pearl),
	pasteque_scintillante(382,0,"speckled_melon",1,new EItem[][]{{gold_nugget,gold_nugget,gold_nugget},{gold_nugget,melon,gold_nugget},{gold_nugget,gold_nugget,gold_nugget}}),
	
	
	/*
	 * POTIONS
	 * 
	 */
	
	potion_malsaine(16,nether_wart,p_waterB),
	potion_epaisse(32,glowstone_dust,p_waterB),
	potion_banale(8192,sugar,p_waterB),
	potion_banale2(8192,ghast_tear,p_waterB),
	potion_banale3(8192,spider_eye,p_waterB),
	potion_banale4(8192,blaze_powder,p_waterB),
	potion_banale5(8192,magma_cream,p_waterB),
	potion_banale6(8192,speckled_melon,p_waterB),
	potion_banale_ext(64,EItem.redstone,p_waterB),
	
	potion_regeneration(8193,ghast_tear,p_awkward),
	potion_regeneration_ext(8257,EItem.redstone,p_regeneration),
	potion_regeneration_ext2(8257,EItem.redstone,p_regeneration_II),
	potion_regeneration_II(8225,glowstone_dust,p_regeneration),
	potion_regeneration_II2(8225,glowstone_dust,p_regeneration_ext),
	
	potion_vitesse(8194,sugar,p_awkward),
	potion_vitesse_ext(8258,EItem.redstone,p_swiftness),
	potion_vitesse_ext2(8258,EItem.redstone,p_swiftness_II),
	potion_vitesse_II(8226,glowstone_dust,p_swiftness),
	potion_vitesse_II2(8226,glowstone_dust,p_swiftness_ext),
	
	potion_resistance_feu(8195,magma_cream,p_awkward),
	potion_resistance_feu_ext(8259,EItem.redstone,p_fire_resistance),
	
	potion_poison(8196,spider_eye,p_awkward),
	potion_poison_ext(8260,EItem.redstone,p_poison),
	potion_poison_ext2(8260,EItem.redstone,p_poison_II),
	potion_poison_II(8228,glowstone_dust,p_poison),
	potion_poison_II2(8228,glowstone_dust,p_poison_ext),
	
	potion_soin(8197,speckled_melon,p_awkward),
	potion_soin_II(8261,EItem.redstone,p_healing),
	
	potion_vision_nocturne(8265,golden_carrot,p_awkward),
	potion_vision_nocturne_ext(8233,EItem.redstone,p_night_vision),
	
	potion_faiblesse(8200,fermented_spider_eye,p_mundane),
	potion_faiblesse2(8200,fermented_spider_eye,p_waterB),
	potion_faiblesse3(8200,fermented_spider_eye,p_thick),
	potion_faiblesse4(8200,glowstone_dust,p_weakness_ext),
	potion_faiblesse5(8200,fermented_spider_eye,p_healing_II),
	potion_faiblesse6(8200,fermented_spider_eye,p_strength),
	potion_faiblesse7(8200,fermented_spider_eye,p_strength_II),
	potion_faiblesse8(8200,fermented_spider_eye,p_regeneration),
	potion_faiblesse9(8200,fermented_spider_eye,p_regeneration_II),
	potion_faiblesse_ext(8264,fermented_spider_eye,p_mundane_ext),
	potion_faiblesse_ext2(8264,EItem.redstone,p_weakness),
	potion_faiblesse_ext3(8264,fermented_spider_eye,p_healing),
	potion_faiblesse_ext4(8264,fermented_spider_eye,p_strength_ext),
	potion_faiblesse_ext5(8264,fermented_spider_eye,p_regeneration_ext),
	
	potion_force(8198,blaze_powder,p_awkward),
	potion_force_ext(8262,EItem.redstone,p_strength),
	potion_force_ext2(8262,EItem.redstone,p_strength_II),
	potion_force_II(8201,glowstone_dust,p_strength),
	potion_force_II2(8201,glowstone_dust,p_strength_ext),
	
	potion_lenteur(8202,fermented_spider_eye,p_fire_resistance),
	potion_lenteur2(8202,fermented_spider_eye,p_swiftness),
	potion_lenteur3(8202,fermented_spider_eye,p_swiftness_II),
	potion_lenteur_ext(8266,EItem.redstone,p_slowness),
	potion_lenteur_ext2(8266,fermented_spider_eye,p_swiftness_ext),
	potion_lenteur_ext3(8266,fermented_spider_eye,p_fire_resistance_ext),
	
	potion_degat(8204,fermented_spider_eye,p_poison),
	potion_degat2(8204,EItem.redstone,p_harming_II),
	potion_degat3(8204,fermented_spider_eye,p_poison_ext),
	potion_degat_II(8268,glowstone,p_harming),
	potion_degat_II2(8268,fermented_spider_eye,p_poison_II),
	
	potion_respiration(8205,pufferfish,p_awkward),
	potion_respiration_ext(8269,EItem.redstone,p_water_breathing),
	
	potion_invisibilite(8206,fermented_spider_eye,p_night_vision),
	potion_invisibilite_ext(8270,EItem.redstone,p_invisibility),
	
	
	potion_splash_banale(16384,gunpowder,p_mundane),
	
	potion_splash_regeneration(16385,gunpowder,p_regeneration),
	potion_splash_regeneration_ext(16449,gunpowder,p_regeneration_ext),
	potion_splash_regeneration_ext2(16449,EItem.redstone,s_p_regeneration),
	potion_splash_regeneration_ext3(16449,EItem.redstone,s_p_regeneration_II),
	potion_splash_regeneration_II(16417,gunpowder,p_regeneration_II),
	potion_splash_regeneration_II2(16417,glowstone_dust,s_p_regeneration),
	potion_splash_regeneration_II3(16417,glowstone_dust,s_p_regeneration_ext),
	
	potion_splash_vitesse(16386,gunpowder,p_swiftness),
	potion_splash_vitesse_ext(16450,gunpowder,p_swiftness_ext),
	potion_splash_vitesse_ext2(16450,EItem.redstone,s_p_swiftness),
	potion_splash_vitesse_ext3(16450,EItem.redstone,s_p_swiftness_II),
	potion_splash_vitesse_II(16418,gunpowder,p_swiftness_II),
	potion_splash_vitesse_II2(16418,glowstone_dust,s_p_swiftness),
	potion_splash_vitesse_II3(16418,glowstone_dust,s_p_swiftness_ext),
	
	potion_splash_resistance_feu(16387,gunpowder,p_fire_resistance),
	potion_splash_resistance_feu_ext(16451,gunpowder,p_fire_resistance_ext),
	potion_splash_resistance_feu_ext2(16451,EItem.redstone,s_p_fire_resistance),
	
	potion_splash_poison(16388,gunpowder,p_poison),
	potion_splash_poison_ext(16452,gunpowder,p_poison_ext),
	potion_splash_poison_ext2(16452,EItem.redstone,s_p_poison),
	potion_splash_poison_ext3(16452,EItem.redstone,s_p_poison_II),
	potion_splash_poison_II(16420,gunpowder,p_poison_II),
	potion_splash_poison_II2(16420,glowstone_dust,s_p_poison),
	potion_splash_poison_II3(16420,glowstone_dust,s_p_poison_ext),
	
	potion_splash_soin(16389,gunpowder,p_healing),
	potion_splash_soin_ext(16421,gunpowder,p_healing_II),
	potion_splash_soin_ext2(16421,EItem.redstone,s_p_healing),
	
	potion_splash_vision_nocturne(16390,gunpowder,p_night_vision),
	potion_splash_vision_nocturne_ext(16454,gunpowder,p_night_vision_ext),
	potion_splash_vision_nocturne_ext2(16454,EItem.redstone,s_p_night_vision),
	
	potion_splash_faiblesse(16392,gunpowder,p_weakness),
	potion_splash_faiblesse2(16392,fermented_spider_eye,s_p_mundane),
	potion_splash_faiblesse3(16392,glowstone_dust,s_p_weakness_ext),
	potion_splash_faiblesse4(16392,fermented_spider_eye,s_p_healing),
	potion_splash_faiblesse5(16392,fermented_spider_eye,s_p_strength),
	potion_splash_faiblesse6(16392,fermented_spider_eye,s_p_strength_II),
	potion_splash_faiblesse7(16392,fermented_spider_eye,s_p_regeneration),
	potion_splash_faiblesse8(16392,fermented_spider_eye,s_p_regeneration_II),
	
	potion_splash_force(16393,gunpowder,p_strength),
	potion_splash_force_ext(16457,gunpowder,p_strength_ext),
	potion_splash_force_ext2(16457,EItem.redstone,p_strength),
	potion_splash_force_ext3(16457,EItem.redstone,p_strength_II),
	potion_splash_force_II(16425,gunpowder,p_strength_II),
	potion_splash_force_II2(16425,glowstone_dust,p_strength),
	potion_splash_force_II3(16425,glowstone_dust,p_strength_ext),
	
	potion_splash_lenteur(16394,gunpowder,p_slowness),
	potion_splash_lenteur2(16394,fermented_spider_eye,s_p_fire_resistance),
	potion_splash_lenteur3(16394,fermented_spider_eye,s_p_swiftness),
	potion_splash_lenteur4(16394,fermented_spider_eye,s_p_swiftness_II),
	potion_splash_lenteur_ext(16458,gunpowder,p_slowness_ext),
	potion_splash_lenteur_ext2(16458,EItem.redstone,s_p_slowness),
	potion_splash_lenteur_ext3(16458,fermented_spider_eye,s_p_swiftness_ext),
	potion_splash_lenteur_ext4(16458,fermented_spider_eye,s_p_fire_resistance_ext),
	
	potion_splash_degat(16396,gunpowder,p_harming),
	potion_splash_degat2(16396,fermented_spider_eye,p_poison),
	potion_splash_degat3(16396,EItem.redstone,p_harming),
	potion_splash_degat4(16396,fermented_spider_eye,p_poison_ext),
	potion_splash_degat_II(16428,gunpowder,p_harming_II),
	potion_splash_degat_II2(16428,glowstone_dust,s_p_harming),
	potion_splash_degat_II3(16428,fermented_spider_eye,s_p_poison_II),
	
	potion_splash_respiration(16397,gunpowder,p_water_breathing),
	potion_splash_respiration_ext(16461,gunpowder,p_water_breathing_ext),
	potion_splash_respiration_ext2(16461,EItem.redstone,s_p_water_breathing),
	
	potion_splash_invisibilite(16398,gunpowder,p_invisibility),
	potion_splash_invisibilite2(16398,fermented_spider_eye,s_p_night_vision),
	potion_splash_invisibilite_ext(16462,gunpowder,p_invisibility_ext),
	potion_splash_invisibilite_ext2(16462,EItem.redstone,s_p_invisibility),
	
	
	
	
	
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
     Recette(int id, int metadata, String mid, int quantite, EItem[][] recette) {
             this(id, metadata, mid, craft, quantite);
             this.forme = ERecetteForme.forme;
             if (recette.length==3) {
                     if(recette[0].length==3 && recette[1].length==3 && recette[2].length==3) {
                             this.recette = recette;
                     }
                     else throw new IllegalArgumentException("Le tableau d'ingr�dients n'est pas de dimension 3x3"); 
             }
             else throw new IllegalArgumentException("Le tableau d'ingr�dients n'est pas de dimension 3x3");
     }
     
     Recette(int id, int metadata, String mid, int quantite, EItem[][] recette, boolean combinable) {
             this(id, metadata, mid, quantite, recette);
             this.combinable = combinable;
     }

     /**
      * Constructeur pour une recette, de type "sans forme"
      * @param ingredients Liste des ingr�dients
      * @see Recette#Recette(int, int, String, ERecetteType, int
      */
     Recette(int id, int metadata, String mid, int quantite, EItem... ingredients) {
             this(id, metadata, mid, craft, quantite);
             for(int i=0;i<ingredients.length;i++) {
                     this.ingredients.add(ingredients[i]);
             }
             this.forme = ERecetteForme.sansforme;
     }
     
     Recette(int id, int metadata, String mid, int quantite, boolean combinable, EItem... ingredients) {
    	 this(id,metadata,mid,quantite,ingredients);
    	 this.combinable = combinable;
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

     public Item getItem() {
    	 return new Item(EItem.searchBy(id, metadata), quantite);
     }

     public boolean isCombinable() {
             return combinable;
     }
     
     public String toString() {
    	 String sRecette = "\n\t";
    	 switch (type) {
		case craft:
			switch (forme) {
			case forme:
				sRecette = "";
				for(int i=0;i<3;i++) {
					sRecette += "\n\t";
					for(int j=0;j<3;j++) {
						sRecette += recette[i][j].getGuiName()+" | ";
					}
				}
				break;
			case sansforme:
				for(int i=0;i<ingredients.size();i++) {
					 sRecette += ingredients.get(i).getGuiName()+" ";
				 }
				break;
			default:
				break;
			}
			break;
		case four:
			sRecette += ingredients.get(0).getGuiName();
			break;
		case alambic:
			sRecette += ingredients.get(1).getGuiName()+" + "+ingredients.get(0).getGuiName();
			break;
		default:
			break;
		}
    	 return mid+" : "+type.name()+" "+forme.name()+sRecette;
     }
     
     public static ArrayList<Recette> getRecettes(EItem item) {
    	 ArrayList<Recette> recettes = new ArrayList<>();
    	 Recette[] values = values();
    	 for(int i=0;i<values.length;i++) {
    		 if(item.getId()==values[i].id && item.getMeta()==values[i].metadata) {
    			 recettes.add(values[i]);
    		 }
    	 }
    	 return recettes;
     }
     
     public static int getFirst(ERecetteType type, ArrayList<Recette> recettes) {
    	 int i = 0;
    	 while(i<recettes.size() && recettes.get(i).getType()!=type) {
    		 i++;
    	 }
    	 if(i<recettes.size()) return i;
    	 else return -1;
     }

}