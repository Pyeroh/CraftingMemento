package model.enums;

import static model.enums.EItem.*;
import static model.enums.ERecetteType.craft;
import static model.enums.ERecetteType.four;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import model.Ingredients;
import model.Item;

public enum Recette {

	// Soit un tableau, soit une suite d'ingrédients
	// Indiquer la méthode d'obtention...
	/*
	 * x|x|x x|x|x x|x|x
	 */

	/*
	 * LES RECETTES AU FOUR
	 */

	roche(stone, cobblestone),
	verre(glass, sand),
	verre2(glass, redsand),
	terre_cuite(hardened_clay, clay),
	charbon_cuit(coal, coal_ore),
	charbon_bois(charcoal, oak_log, true),
	diamant(diamond, diamond_ore),
	fer(iron_ingot, iron_ore),
	or(gold_ingot, gold_ore),
	redstone(EItem.redstone, redstone_ore),
	lapis_lazuli(EItem.lapis_lazuli, lapis_ore),
	emeraude_cuite(emerald, emerald_ore),
	brique_du_nether(nether_brick, netherrack),
	quartz(EItem.quartz, quartz_ore),
	cote_porc_cuite(cooked_pork, raw_pork),
	poisson_cuit(cooked_fish, raw_fish),
	saumon_cuit(cooked_fish, raw_salmon),
	steak(cooked_beef, raw_beef),
	poulet_roti(cooked_chicken, raw_chicken),
	patate_cuite(baked_potato, potato),
	colorant_vert(cactus_green, cactus),
	brique_argile(clay_brick, clay_ball),

	/*
	 * LES NOUVELLES RECETTES PAS IMPLEMENTEES (v 1.8)
	 *
	 *
	 *
	 * granite(1,01,"stone",craft, 1, new EItem[][]{{air, diorite, air},{air,
	 * quartz, air},{air, air, air}}), diorite(1,03,"stone",craft, 2, new
	 * EItem[][]{{cobblestone, quartz, air},{quartz, cobblestone, air},{air,
	 * air, air}}), andesite(1,05,"stone",craft,2 , new EItem[][]{{air, diorite,
	 * air},{air, cobblestone, air},{air, air, air}}),
	 * pierre_taillee_moussue(98,01,"stonebrick",craft,new EItem[][]{{air, air,
	 * air},{air, smooth_brick, air},{air, vine, air}}),
	 * pierre_taillee_sculptee(98,03,"stonebrick",craft,new EItem[][]{{air, air,
	 * air},{air, stonebrick_slab, air},{air, stonebrick_slab, air}}),
	 * granite_poli(1,1,"stone",craft,4,new EItem[][]{{granite,diorite,air},{
	 * granite,granite,air},{air,air,air}}),
	 * diorite_poli(1,4,"stone",craft,4,new EItem[][]{{diorite,diorite,air},{
	 * diorite,diorite,air},{air,air,air}}),
	 * andesite_poli(1,6,"stone",craft,4,new
	 * EItem[][]{{andesite,andesite,air},{andesite
	 * ,andesite,air},{air,air,air}}), bloc_slime(165,0,"slime",craft, 1, new
	 * EItem[][]{{slime_ball, slime_ball, slime_ball},{slime_ball, slime_ball,
	 * slime_ball},{slime_ball, slime_ball, slime_ball}}),
	 */

	/*
	 * BLOCS ROCHEUX
	 */

	gres(sandstone, 1, new EItem[][] { { air, air, air }, { air, sand, sand }, { air, sand, sand } }),
	gres_taille(chiseled_sandstone, 1, new EItem[][] { { air, air, air }, { air, sandstone_slab, air },
			{ air, sandstone_slab, air } }),
	gres_poli(smooth_sandstone, 4, new EItem[][] { { air, air, air }, { air, sandstone, sandstone },
			{ air, sandstone, sandstone } }),
	gres_poli2(smooth_sandstone, 4, new EItem[][] { { air, air, air }, { air, chiseled_sandstone, chiseled_sandstone },
			{ air, chiseled_sandstone, chiseled_sandstone } }),
	gres_poli3(smooth_sandstone, 4, new EItem[][] { { air, air, air }, { air, smooth_sandstone, smooth_sandstone },
			{ air, smooth_sandstone, smooth_sandstone } }),
	pierre_taillee(smooth_brick, 4, new EItem[][] { { air, air, air }, { air, stone, stone }, { air, stone, stone } }),

	/*
	 * Produits manufacturés
	 */

	// LES PLANCHES
	planche_chene(oak_wood, 4, oak_log),
	planche_sapin(spruce_wood, 4, spruce_log),
	planche_bouleau(birch_wood, 4, birch_log),
	planche_acajou(jungle_wood, 4, jungle_log),
	planche_acacia(acacia_wood, 4, acacia_log),
	planche_chene_noir(darkoak_wood, 4, darkoak_log),

	// LES DALLES
	dalle_roche(stone_slab, 6, new EItem[][] { { air, air, air }, { air, air, air }, { stone, stone, stone } }),
	dalle_roche_sable(sandstone_slab, 6, new EItem[][] { { air, air, air }, { air, air, air },
			{ sandstone, sandstone, sandstone } }),
	dalle_pierre(
			cobble_slab,
			6,
			new EItem[][] { { air, air, air }, { air, air, air }, { cobblestone, cobblestone, cobblestone } }),
	dalle_brique(brick_slab, 6, new EItem[][] { { air, air, air }, { air, air, air }, { brick, brick, brick } }),
	dalle_pierre_taillee(stonebrick_slab, 6, new EItem[][] { { air, air, air }, { air, air, air },
			{ smooth_brick, smooth_brick, smooth_brick } }),
	dalle_brique_nether(netherbrick_slab, 6, new EItem[][] { { air, air, air }, { air, air, air },
			{ nether_brick_block, nether_brick_block, nether_brick_block } }),
	dalle_quartz(quartz_slab, 6, new EItem[][] { { air, air, air }, { air, air, air },
			{ quartz_block, quartz_block, quartz_block } }),
	dalle_bois_chene(oakwood_slab, 6, new EItem[][] { { air, air, air }, { air, air, air }, { oak_wood, oak_wood, oak_wood } }),
	dalle_bois_sapin(sprucewood_slab, 6, new EItem[][] { { air, air, air }, { air, air, air },
			{ spruce_wood, spruce_wood, spruce_wood } }),
	dalle_bois_bouleau(birchwood_slab, 6, new EItem[][] { { air, air, air }, { air, air, air },
			{ birch_wood, birch_wood, birch_wood } }),
	dalle_bois_acajou(junglewood_slab, 6, new EItem[][] { { air, air, air }, { air, air, air },
			{ jungle_wood, jungle_wood, jungle_wood } }),
	dalle_bois_acacia(acacia_slab, 6, new EItem[][] { { air, air, air }, { air, air, air },
			{ acacia_wood, acacia_wood, acacia_wood } }),
	dalle_bois_chene_noir(darkoak_slab, 6, new EItem[][] { { air, air, air }, { air, air, air },
			{ darkoak_wood, darkoak_wood, darkoak_wood } }),

	// LES ESCALIERS

	escalier_chene(wood_stairs, 4, new EItem[][] { { oak_wood, air, air }, { oak_wood, oak_wood, air },
			{ oak_wood, oak_wood, oak_wood } }),
	escalier_pierre(cobblestone_stairs, 4, new EItem[][] { { cobblestone, air, air }, { cobblestone, cobblestone, air },
			{ cobblestone, cobblestone, cobblestone } }),
	escalier_brique(brick_stairs, 4, new EItem[][] { { brick, air, air }, { brick, brick, air }, { brick, brick, brick } }),
	escalier_pierre_taillee(smooth_stairs, 4, new EItem[][] { { smooth_brick, air, air }, { smooth_brick, smooth_brick, air },
			{ smooth_brick, smooth_brick, smooth_brick } }),
	escalier_roche_sable(sandstone_stairs, 4, new EItem[][] { { sandstone, air, air }, { sandstone, sandstone, air },
			{ sandstone, sandstone, sandstone } }),
	escalier_sapin(spruce_wood_stairs, 4, new EItem[][] { { spruce_wood, air, air }, { spruce_wood, spruce_wood, air },
			{ spruce_wood, spruce_wood, spruce_wood } }),
	escalier_bouleau(birch_wood_stairs, 4, new EItem[][] { { birch_wood, air, air }, { birch_wood, birch_wood, air },
			{ birch_wood, birch_wood, birch_wood } }),
	escalier_acajou(jungle_wood_stairs, 4, new EItem[][] { { jungle_wood, air, air }, { jungle_wood, jungle_wood, air },
			{ jungle_wood, jungle_wood, jungle_wood } }),
	escalier_acacia(acacia_stairs, 4, new EItem[][] { { acacia_wood, air, air }, { acacia_wood, acacia_wood, air },
			{ acacia_wood, acacia_wood, acacia_wood } }),
	escalier_chene_noir(darkoak_stairs, 4, new EItem[][] { { darkoak_wood, air, air }, { darkoak_wood, darkoak_wood, air },
			{ darkoak_wood, darkoak_wood, darkoak_wood } }),
	escalier_quartz(quartz_stairs, 4, new EItem[][] { { quartz_block, air, air }, { quartz_block, quartz_block, air },
			{ quartz_block, quartz_block, quartz_block } }),

	// BLOCS DIVERS

	bloc_brique(brick, 1, new EItem[][] { { air, air, air }, { air, clay_brick, clay_brick }, { air, clay_brick, clay_brick } }),
	bloc_quartz(quartz_block, 1, new EItem[][] { { air, air, air }, { air, EItem.quartz, EItem.quartz },
			{ air, EItem.quartz, EItem.quartz } }),
	bloc_quartz_sculptee(chiseled_quartz_block, 1, new EItem[][] { { air, air, air }, { air, quartz_slab, air },
			{ air, quartz_slab, air } }),
	bloc_quartz_rayee(pillar_quartz_block, 2, new EItem[][] { { air, air, air }, { air, quartz_block, air },
			{ air, quartz_block, air } }),

	// TABLE DE CRAFT

	enclume(anvil, 1, new EItem[][] { { iron_block, iron_block, iron_block }, { air, iron_ingot, air },
			{ iron_ingot, iron_ingot, iron_ingot } }),
	table_craft(workbench, 1, new EItem[][] { { air, air, air }, { air, oak_wood, oak_wood }, { air, oak_wood, oak_wood } }, true),
	fourneau(furnace, 1, new EItem[][] { { cobblestone, cobblestone, cobblestone }, { cobblestone, air, cobblestone },
			{ cobblestone, cobblestone, cobblestone } }),
	table_enchantement(enchantment_table, 1, new EItem[][] { { air, book, air }, { diamond, obsidian, diamond },
			{ obsidian, obsidian, obsidian } }),
	alambic(brewing_stand, 1, new EItem[][] { { air, air, air }, { air, blaze_rod, air },
			{ cobblestone, cobblestone, cobblestone } }),

	/*
	 * BLOCS DECORATIFS
	 */

	barreaux_fer(iron_bars, 16, new EItem[][] { { air, air, air }, { iron_ingot, iron_ingot, iron_ingot },
			{ iron_ingot, iron_ingot, iron_ingot } }),
	muret(cobble_wall, 6, new EItem[][] { { air, air, air }, { cobblestone, cobblestone, cobblestone },
			{ cobblestone, cobblestone, cobblestone } }),
	muret_moussu(mossy_cobble_wall, 6, new EItem[][] { { air, air, air },
			{ mossy_cobblestone, mossy_cobblestone, mossy_cobblestone },
			{ mossy_cobblestone, mossy_cobblestone, mossy_cobblestone } }),
	pot_fleur(flower_pot, 1, new EItem[][] { { air, air, air }, { clay_brick, air, clay_brick }, { air, clay_brick, air } }),
	bloc_neige(snow_block, 1, new EItem[][] { { air, air, air }, { air, snow_ball, snow_ball }, { air, snow_ball, snow_ball } }),
	neige(snow, 6, new EItem[][] { { air, air, air }, { air, air, air }, { snow_block, snow_block, snow_block } }),
	bloc_argile(clay, 1, new EItem[][] { { air, air, air }, { clay_ball, clay_ball, air }, { clay_ball, clay_ball, air } }),
	balise(beacon, 1, new EItem[][] { { glass, glass, glass }, { glass, nether_star, glass }, { obsidian, obsidian, obsidian } }),
	barriere(fence, 2, new EItem[][] { { air, air, air }, { stick, stick, stick }, { stick, stick, stick } }),

	/*
	 * BLOCS MINERAIS
	 */

	bloc_charbon(coal_block, 1, new EItem[][] { { coal, coal, coal }, { coal, coal, coal }, { coal, coal, coal } }),
	charbon(coal, 9, coal_block),

	bloc_redstone(redstone_block, 1, new EItem[][] { { EItem.redstone, EItem.redstone, EItem.redstone },
			{ EItem.redstone, EItem.redstone, EItem.redstone }, { EItem.redstone, EItem.redstone, EItem.redstone } }),
	redstone2(EItem.redstone, 9, redstone_block),

	bloc_emeraude(emerald_block, 1, new EItem[][] { { emerald, emerald, emerald }, { emerald, emerald, emerald },
			{ emerald, emerald, emerald } }),
	emeraude(emerald, 9, emerald_block),

	bloc_diamant(diamond_block, 1, new EItem[][] { { diamond, diamond, diamond }, { diamond, diamond, diamond },
			{ diamond, diamond, diamond } }),
	diamant2(diamond, 9, diamond_block),

	bloc_fer(iron_block, 1, new EItem[][] { { iron_ingot, iron_ingot, iron_ingot }, { iron_ingot, iron_ingot, iron_ingot },
			{ iron_ingot, iron_ingot, iron_ingot } }),
	fer2(iron_ingot, 9, iron_block),

	bloc_or(gold_block, 1, new EItem[][] { { gold_ingot, gold_ingot, gold_ingot }, { gold_ingot, gold_ingot, gold_ingot },
			{ gold_ingot, gold_ingot, gold_ingot } }),
	or2(gold_ingot, 9, gold_block),
	or3(gold_ingot, 1, new EItem[][] { { gold_nugget, gold_nugget, gold_nugget }, { gold_nugget, gold_nugget, gold_nugget },
			{ gold_nugget, gold_nugget, gold_nugget } }),
	pepite_or(gold_nugget, 9, gold_ingot),

	bloc_lapis_lazuli(lapis_block, 1, new EItem[][] { { EItem.lapis_lazuli, EItem.lapis_lazuli, EItem.lapis_lazuli },
			{ EItem.lapis_lazuli, EItem.lapis_lazuli, EItem.lapis_lazuli },
			{ EItem.lapis_lazuli, EItem.lapis_lazuli, EItem.lapis_lazuli } }),
	lapis_lazuli2(EItem.lapis_lazuli, 9, lapis_block),

	/*
	 *
	 * VEGETATION
	 */

	botte_foin(hay_block, 1, new EItem[][] { { wheat, wheat, wheat }, { wheat, wheat, wheat }, { wheat, wheat, wheat } }),
	ble(wheat, 9, hay_block),

	pasteque(melon_block, 1, new EItem[][] { { melon, melon, melon }, { melon, melon, melon }, { melon, melon, melon } }),
	tranche_pasteque(melon, 9, melon_block),

	graines_citrouille(pumpkin_seeds, 4, pumpkin),
	graines_pasteque(melon_seeds, 4, melon),

	/*
	 * BLOCS COLORES
	 */

	laine_blanche(white_wool, 1, new EItem[][] { { air, air, air }, { air, string, string }, { air, string, string } }),
	laine_blanche2(white_wool, 1, white_wool, bone_meal),
	laine_orange(orange_wool, 1, white_wool, orange_dye),
	laine_magenta(magenta_wool, 1, white_wool, magenta_dye),
	laine_bleu_clair(l_blue_wool, 1, white_wool, l_blue_dye),
	laine_jaune(yellow_wool, 1, white_wool, dandelion_yellow),
	laine_vert_clair(l_green_wool, 1, white_wool, l_green_dye),
	laine_rose(pink_wool, 1, white_wool, pink_dye),
	laine_grise(gray_wool, 1, white_wool, gray_dye),
	laine_gris_clair(l_gray_wool, 1, white_wool, l_gray_dye),
	laine_cyan(cyan_wool, 1, white_wool, cyan_dye),
	laine_violette(purple_wool, 1, white_wool, purple_dye),
	laine_bleue(blue_wool, 1, white_wool, EItem.lapis_lazuli),
	laine_marron(brown_wool, 1, white_wool, cocoa_beans),
	laine_verte(green_wool, 1, white_wool, cactus_green),
	laine_rouge(red_wool, 1, white_wool, rose_red),
	laine_noire(black_wool, 1, white_wool, ink_sack),

	verre_blanc(white_glass, 8, new EItem[][] { { glass, glass, glass }, { glass, bone_meal, glass }, { glass, glass, glass } }),
	verre_orange(
			orange_glass,
			8,
			new EItem[][] { { glass, glass, glass }, { glass, orange_dye, glass }, { glass, glass, glass } }),
	verre_magenta(magenta_glass, 8, new EItem[][] { { glass, glass, glass }, { glass, magenta_dye, glass },
			{ glass, glass, glass } }),
	verre_bleu_clair(l_blue_glass, 8, new EItem[][] { { glass, glass, glass }, { glass, l_blue_dye, glass },
			{ glass, glass, glass } }),
	verre_jaune(yellow_glass, 8, new EItem[][] { { glass, glass, glass }, { glass, dandelion_yellow, glass },
			{ glass, glass, glass } }),
	verre_vert_clair(l_green_glass, 8, new EItem[][] { { glass, glass, glass }, { glass, l_green_dye, glass },
			{ glass, glass, glass } }),
	verre_rose(pink_glass, 8, new EItem[][] { { glass, glass, glass }, { glass, pink_dye, glass }, { glass, glass, glass } }),
	verre_gris(gray_glass, 8, new EItem[][] { { glass, glass, glass }, { glass, gray_dye, glass }, { glass, glass, glass } }),
	verre_gris_clair(l_gray_glass, 8, new EItem[][] { { glass, glass, glass }, { glass, l_gray_dye, glass },
			{ glass, glass, glass } }),
	verre_cyan(cyan_glass, 8, new EItem[][] { { glass, glass, glass }, { glass, cyan_dye, glass }, { glass, glass, glass } }),
	verre_violet(
			purple_glass,
			8,
			new EItem[][] { { glass, glass, glass }, { glass, purple_dye, glass }, { glass, glass, glass } }),
	verre_bleu(blue_glass, 8, new EItem[][] { { glass, glass, glass }, { glass, EItem.lapis_lazuli, glass },
			{ glass, glass, glass } }),
	verre_marron(
			brown_glass,
			8,
			new EItem[][] { { glass, glass, glass }, { glass, cocoa_beans, glass }, { glass, glass, glass } }),
	verre_vert(green_glass, 8, new EItem[][] { { glass, glass, glass }, { glass, cactus_green, glass }, { glass, glass, glass } }),
	verre_rouge(red_glass, 8, new EItem[][] { { glass, glass, glass }, { glass, rose_red, glass }, { glass, glass, glass } }),
	verre_noir(black_glass, 8, new EItem[][] { { glass, glass, glass }, { glass, ink_sack, glass }, { glass, glass, glass } }),

	terre_cuite_blanche(white_stained_clay, 8, new EItem[][] { { hardened_clay, hardened_clay, hardened_clay },
			{ hardened_clay, bone_meal, hardened_clay }, { hardened_clay, hardened_clay, hardened_clay } }),
	terre_cuite_orange(orange_stained_clay, 8, new EItem[][] { { hardened_clay, hardened_clay, hardened_clay },
			{ hardened_clay, orange_dye, hardened_clay }, { hardened_clay, hardened_clay, hardened_clay } }),
	terre_cuite_magenta(magenta_stained_clay, 8, new EItem[][] { { hardened_clay, hardened_clay, hardened_clay },
			{ hardened_clay, magenta_dye, hardened_clay }, { hardened_clay, hardened_clay, hardened_clay } }),
	terre_cuite_bleu_clair(l_blue_stained_clay, 8, new EItem[][] { { hardened_clay, hardened_clay, hardened_clay },
			{ hardened_clay, l_blue_dye, hardened_clay }, { hardened_clay, hardened_clay, hardened_clay } }),
	terre_cuite_jaune(yellow_stained_clay, 8, new EItem[][] { { hardened_clay, hardened_clay, hardened_clay },
			{ hardened_clay, dandelion_yellow, hardened_clay }, { hardened_clay, hardened_clay, hardened_clay } }),
	terre_cuite_vert_clair(l_green_stained_clay, 8, new EItem[][] { { hardened_clay, hardened_clay, hardened_clay },
			{ hardened_clay, l_green_dye, hardened_clay }, { hardened_clay, hardened_clay, hardened_clay } }),
	terre_cuite_rose(pink_stained_clay, 8, new EItem[][] { { hardened_clay, hardened_clay, hardened_clay },
			{ hardened_clay, pink_dye, hardened_clay }, { hardened_clay, hardened_clay, hardened_clay } }),
	terre_cuite_grise(gray_stained_clay, 8, new EItem[][] { { hardened_clay, hardened_clay, hardened_clay },
			{ hardened_clay, gray_dye, hardened_clay }, { hardened_clay, hardened_clay, hardened_clay } }),
	terre_cuite_gris_clair(l_gray_stained_clay, 8, new EItem[][] { { hardened_clay, hardened_clay, hardened_clay },
			{ hardened_clay, l_gray_dye, hardened_clay }, { hardened_clay, hardened_clay, hardened_clay } }),
	terre_cuite_cyan(cyan_stained_clay, 8, new EItem[][] { { hardened_clay, hardened_clay, hardened_clay },
			{ hardened_clay, cyan_dye, hardened_clay }, { hardened_clay, hardened_clay, hardened_clay } }),
	terre_cuite_violette(purple_stained_clay, 8, new EItem[][] { { hardened_clay, hardened_clay, hardened_clay },
			{ hardened_clay, purple_dye, hardened_clay }, { hardened_clay, hardened_clay, hardened_clay } }),
	terre_cuite_bleue(blue_stained_clay, 8, new EItem[][] { { hardened_clay, hardened_clay, hardened_clay },
			{ hardened_clay, EItem.lapis_lazuli, hardened_clay }, { hardened_clay, hardened_clay, hardened_clay } }),
	terre_cuite_marron(brown_stained_clay, 8, new EItem[][] { { hardened_clay, hardened_clay, hardened_clay },
			{ hardened_clay, cocoa_beans, hardened_clay }, { hardened_clay, hardened_clay, hardened_clay } }),
	terre_cuite_verte(green_stained_clay, 8, new EItem[][] { { hardened_clay, hardened_clay, hardened_clay },
			{ hardened_clay, cactus_green, hardened_clay }, { hardened_clay, hardened_clay, hardened_clay } }),
	terre_cuite_rouge(red_stained_clay, 8, new EItem[][] { { hardened_clay, hardened_clay, hardened_clay },
			{ hardened_clay, rose_red, hardened_clay }, { hardened_clay, hardened_clay, hardened_clay } }),
	terre_cuite_noire(black_stained_clay, 8, new EItem[][] { { hardened_clay, hardened_clay, hardened_clay },
			{ hardened_clay, ink_sack, hardened_clay }, { hardened_clay, hardened_clay, hardened_clay } }),

	vitre(glass_pane, 16, new EItem[][] { { air, air, air }, { glass, glass, glass }, { glass, glass, glass } }),

	vitre_blanche(white_glass_pane, 16, new EItem[][] { { air, air, air }, { white_glass, white_glass, white_glass },
			{ white_glass, white_glass, white_glass } }),
	vitre_orange(orange_glass_pane, 16, new EItem[][] { { air, air, air }, { orange_glass, orange_glass, orange_glass },
			{ orange_glass, orange_glass, orange_glass } }),
	vitre_magenta(magenta_glass_pane, 16, new EItem[][] { { air, air, air }, { magenta_glass, magenta_glass, magenta_glass },
			{ magenta_glass, magenta_glass, magenta_glass } }),
	vitre_bleu_clair(l_blue_glass_pane, 16, new EItem[][] { { air, air, air }, { l_blue_glass, l_blue_glass, l_blue_glass },
			{ l_blue_glass, l_blue_glass, l_blue_glass } }),
	vitre_jaune(yellow_glass_pane, 16, new EItem[][] { { air, air, air }, { yellow_glass, yellow_glass, yellow_glass },
			{ yellow_glass, yellow_glass, yellow_glass } }),
	vitre_vert_clair(l_green_glass_pane, 16, new EItem[][] { { air, air, air }, { l_green_glass, l_green_glass, l_green_glass },
			{ l_green_glass, l_green_glass, l_green_glass } }),
	vitre_rose(pink_glass_pane, 16, new EItem[][] { { air, air, air }, { pink_glass, pink_glass, pink_glass },
			{ pink_glass, pink_glass, pink_glass } }),
	vitre_grise(gray_glass_pane, 16, new EItem[][] { { air, air, air }, { gray_glass, gray_glass, gray_glass },
			{ gray_glass, gray_glass, gray_glass } }),
	vitre_gris_clair(l_gray_glass_pane, 16, new EItem[][] { { air, air, air },
			{ l_gray_stained_clay, l_gray_stained_clay, l_gray_stained_clay },
			{ l_gray_stained_clay, l_gray_stained_clay, l_gray_stained_clay } }),
	vitre_cyan(cyan_glass_pane, 16, new EItem[][] { { air, air, air }, { cyan_glass, cyan_glass, cyan_glass },
			{ cyan_glass, cyan_glass, cyan_glass } }),
	vitre_violette(purple_glass_pane, 16, new EItem[][] { { air, air, air }, { purple_glass, purple_glass, purple_glass },
			{ purple_glass, purple_glass, purple_glass } }),
	vitre_bleue(blue_glass_pane, 16, new EItem[][] { { air, air, air }, { blue_glass, blue_glass, blue_glass },
			{ blue_glass, blue_glass, blue_glass } }),
	vitre_marron(brown_glass_pane, 16, new EItem[][] { { air, air, air }, { brown_glass, brown_glass, brown_glass },
			{ brown_glass, brown_glass, brown_glass } }),
	vitre_verte(green_glass_pane, 16, new EItem[][] { { air, air, air }, { green_glass, green_glass, green_glass },
			{ green_glass, green_glass, green_glass } }),
	vitre_rouge(red_glass_pane, 16, new EItem[][] { { air, air, air }, { red_glass, red_glass, red_glass },
			{ red_glass, red_glass, red_glass } }),
	vitre_noire(black_glass_pane, 16, new EItem[][] { { air, air, air }, { black_glass, black_glass, black_glass },
			{ black_glass, black_glass, black_glass } }),

	tapis_blanc(white_carpet, 3, new EItem[][] { { air, air, air }, { white_wool, white_wool, air }, { air, air, air } }),
	tapis_orange(orange_carpet, 3, new EItem[][] { { air, air, air }, { orange_wool, orange_wool, air }, { air, air, air } }),
	tapis_magenta(magenta_carpet, 3, new EItem[][] { { air, air, air }, { magenta_wool, magenta_wool, air }, { air, air, air } }),
	tapis_bleu_clair(l_blue_carpet, 3, new EItem[][] { { air, air, air }, { l_blue_wool, l_blue_wool, air }, { air, air, air } }),
	tapis_jaune(yellow_carpet, 3, new EItem[][] { { air, air, air }, { yellow_wool, yellow_wool, air }, { air, air, air } }),
	tapis_vert_clair(
			l_green_carpet,
			3,
			new EItem[][] { { air, air, air }, { l_green_wool, l_green_wool, air }, { air, air, air } }),
	tapis_rose(pink_carpet, 3, new EItem[][] { { air, air, air }, { pink_wool, pink_wool, air }, { air, air, air } }),
	tapis_gris(gray_carpet, 3, new EItem[][] { { air, air, air }, { gray_wool, gray_wool, air }, { air, air, air } }),
	tapis_gris_clair(l_gray_carpet, 3, new EItem[][] { { air, air, air }, { l_gray_wool, l_gray_wool, air }, { air, air, air } }),
	tapis_cyan(cyan_carpet, 3, new EItem[][] { { air, air, air }, { cyan_wool, cyan_wool, air }, { air, air, air } }),
	tapis_violet(purple_carpet, 3, new EItem[][] { { air, air, air }, { purple_wool, purple_wool, air }, { air, air, air } }),
	tapis_bleu(blue_carpet, 3, new EItem[][] { { air, air, air }, { blue_wool, blue_wool, air }, { air, air, air } }),
	tapis_marron(brown_carpet, 3, new EItem[][] { { air, air, air }, { brown_wool, brown_wool, air }, { air, air, air } }),
	tapis_vert(green_carpet, 3, new EItem[][] { { air, air, air }, { green_wool, green_wool, air }, { air, air, air } }),
	tapis_rouge(red_carpet, 3, new EItem[][] { { air, air, air }, { red_wool, red_wool, air }, { air, air, air } }),
	tapis_noir(black_carpet, 3, new EItem[][] { { air, air, air }, { black_wool, black_wool, air }, { air, air, air } }),

	/*
	 * OBJETS DIVERS
	 */

	torche(torch, 4, new EItem[][] { { air, air, air }, { air, coal, air }, { air, stick, air } }),
	torche2(torch, 4, new EItem[][] { { air, air, air }, { air, charcoal, air }, { air, stick, air } }),
	porte_fer(iron_door, 1, new EItem[][] { { iron_ingot, iron_ingot, air }, { iron_ingot, iron_ingot, air },
			{ iron_ingot, iron_ingot, air } }),
	echelle(ladder, 3, new EItem[][] { { stick, air, stick }, { stick, stick, air }, { stick, air, stick } }),
	coffre_ender(ender_chest, 1, new EItem[][] { { obsidian, obsidian, obsidian }, { obsidian, eye_of_ender, obsidian },
			{ obsidian, obsidian, obsidian } }),

	lanterne(jack_o_lantern, 1, new EItem[][] { { air, air, air }, { air, pumpkin, air }, { air, torch, air } }),

	papier(paper, 1, new EItem[][] { { air, air, air }, { air, air, air }, { sugar_cane, sugar_cane, sugar_cane } }),
	livre(book, 1, leather, paper, paper, paper),
	cahier(book_and_quill, 1, feather, ink_sack, book),
	livre_manuscrit(written_book, 2, written_book, book_and_quill),
	livre_manuscrit2(written_book, 3, written_book, book_and_quill, book_and_quill),
	livre_manuscrit3(written_book, 4, written_book, book_and_quill, book_and_quill, book_and_quill),
	livre_manuscrit4(written_book, 5, written_book, book_and_quill, book_and_quill, book_and_quill, book_and_quill),
	livre_manuscrit5(
			written_book,
			6,
			written_book,
			book_and_quill,
			book_and_quill,
			book_and_quill,
			book_and_quill,
			book_and_quill),
	livre_manuscrit6(
			written_book,
			7,
			written_book,
			book_and_quill,
			book_and_quill,
			book_and_quill,
			book_and_quill,
			book_and_quill,
			book_and_quill),
	livre_manuscrit7(
			written_book,
			8,
			written_book,
			book_and_quill,
			book_and_quill,
			book_and_quill,
			book_and_quill,
			book_and_quill,
			book_and_quill,
			book_and_quill),
	livre_manuscrit8(
			written_book,
			9,
			written_book,
			book_and_quill,
			book_and_quill,
			book_and_quill,
			book_and_quill,
			book_and_quill,
			book_and_quill,
			book_and_quill,
			book_and_quill),
	cadre(item_frame, 1, new EItem[][] { { stick, stick, stick }, { stick, leather, stick }, { stick, stick, stick } }),

	chaudron(cauldron, 1, new EItem[][] { { iron_ingot, air, iron_ingot }, { iron_ingot, air, iron_ingot },
			{ iron_ingot, iron_ingot, iron_ingot } }),
	boule_de_feu(fireball, 3, new EItem[][] { { air, gunpowder, air }, { air, coal, air }, { air, blaze_powder, air } }),
	boule_de_feu2(fireball, 3, new EItem[][] { { air, gunpowder, air }, { air, charcoal, air }, { air, blaze_powder, air } }),

	carotte_sur_baton(carrot_on_a_stick, 1, new EItem[][] { { fishing_rod, air, air }, { air, carrot, air }, { air, air, air } }),

	feu_dartifice(firework, 1, paper, gunpowder),
	explosif_dartifice(firework_star, 1, gunpowder, ink_sack),

	laisse(leash, 1, new EItem[][] { { string, string, air }, { string, slime_ball, air }, { air, air, string } }),

	/*
	 * ELEMENTS DU NETHER
	 */

	pierre_lumineuse(glowstone, 1, new EItem[][] { { air, air, air }, { glowstone_dust, glowstone_dust, air },
			{ glowstone_dust, glowstone_dust, air } }),
	bloc_de_brique_du_nether(nether_brick_block, 1, new EItem[][] { { air, air, air }, { air, nether_brick, nether_brick },
			{ air, nether_brick, nether_brick } }),
	barriere_nether(nether_fence, 6, new EItem[][] { { air, air, air }, { nether_brick, nether_brick, nether_brick },
			{ nether_brick, nether_brick, nether_brick } }),
	escalier_nether(nether_brick_stairs, 4, new EItem[][] { { nether_brick, air, air }, { nether_brick, nether_brick, air },
			{ nether_brick, nether_brick, nether_brick } }),

	/*
	 * ITEMS A COMBINABILITES VARIABLE (DIVERS)
	 */

	lit(
			bed,
			1,
			new EItem[][] { { air, air, air }, { white_wool, white_wool, white_wool }, { oak_wood, oak_wood, oak_wood } },
			true),
	bibliotheque(bookshelf, 1, new EItem[][] { { oak_wood, oak_wood, oak_wood }, { book, book, book },
			{ oak_wood, oak_wood, oak_wood } }, true),
	portillon(fence_gate, 1, new EItem[][] { { air, air, air }, { stick, oak_wood, stick }, { stick, oak_wood, stick } }, true),
	panneau(
			sign,
			3,
			new EItem[][] { { oak_wood, oak_wood, oak_wood }, { oak_wood, oak_wood, oak_wood }, { air, stick, air } },
			true),
	coffre(chest, 1, new EItem[][] { { oak_wood, oak_wood, oak_wood }, { oak_wood, air, oak_wood },
			{ oak_wood, oak_wood, oak_wood } }, true),
	coffre_piege(trapped_chest, 1, new EItem[][] { { air, air, air }, { tripwire_hook, chest, air }, { air, air, air } }),
	porte_bois(wood_door, 1, new EItem[][] { { oak_wood, oak_wood, air }, { oak_wood, oak_wood, air },
			{ oak_wood, oak_wood, air } }, true),
	jukebox(EItem.jukebox, 1, new EItem[][] { { oak_wood, oak_wood, oak_wood }, { oak_wood, diamond, oak_wood },
			{ oak_wood, oak_wood, oak_wood } }, true),
	trappe(
			trap_door,
			2,
			new EItem[][] { { air, air, air }, { oak_wood, oak_wood, oak_wood }, { oak_wood, oak_wood, oak_wood } },
			true),
	baton(stick, 4, new EItem[][] { { air, air, air }, { air, oak_wood, air }, { air, oak_wood, air } }, true),
	bol(bowl, 4, new EItem[][] { { air, air, air }, { oak_wood, air, oak_wood }, { air, oak_wood, air } }, true),
	tableau(painting, 1, new EItem[][] { { stick, stick, stick }, { stick, white_wool, stick }, { stick, stick, stick } }, true),

	/*
	 * MECANIQUE ET REDSTONE
	 */

	distributeur(dispenser, 1, new EItem[][] { { cobblestone, cobblestone, cobblestone }, { cobblestone, bow, cobblestone },
			{ cobblestone, EItem.redstone, cobblestone } }),
	noteblock(note_block, 1, new EItem[][] { { oak_wood, oak_wood, oak_wood }, { oak_wood, EItem.redstone, oak_wood },
			{ oak_wood, oak_wood, oak_wood } }, true),
	rail_booster(powered_rail, 6, new EItem[][] { { gold_ingot, air, gold_ingot }, { gold_ingot, stick, gold_ingot },
			{ gold_ingot, EItem.redstone, gold_ingot } }),
	rail_detecteur(detector_rail, 6, new EItem[][] { { iron_ingot, air, iron_ingot }, { iron_ingot, stone_plate, iron_ingot },
			{ iron_ingot, EItem.redstone, iron_ingot } }),
	piston_collant(sticky_piston, 1, new EItem[][] { { air, air, air }, { air, slime_ball, air }, { air, EItem.piston, air } }),
	piston(EItem.piston, 1, new EItem[][] { { oak_wood, oak_wood, oak_wood }, { cobblestone, iron_ingot, cobblestone },
			{ cobblestone, EItem.redstone, cobblestone } }),
	tnt(EItem.tnt, 1, new EItem[][] { { gunpowder, sand, gunpowder }, { sand, gunpowder, sand }, { gunpowder, sand, gunpowder } }),
	tnt2(EItem.tnt, 1, new EItem[][] { { gunpowder, redsand, gunpowder }, { redsand, gunpowder, redsand },
			{ gunpowder, redsand, gunpowder } }),
	rail(rails, 16, new EItem[][] { { iron_ingot, air, iron_ingot }, { iron_ingot, stick, iron_ingot },
			{ iron_ingot, air, iron_ingot } }),
	levier(lever, 1, new EItem[][] { { air, air, air }, { air, stick, air }, { air, cobblestone, air } }),
	plaque_pression_pierre(stone_plate, 1, new EItem[][] { { air, air, air }, { air, air, air }, { stone, stone, air } }),
	plaque_pression_bois(wood_plate, 1, new EItem[][] { { air, air, air }, { air, air, air }, { oak_wood, oak_wood, air } }, true),
	torche_redstone(redstone_torch_on, 1, new EItem[][] { { air, air, air }, { air, EItem.redstone, air }, { air, stick, air } }),
	bouton_pierre(stone_button, 1, stone),
	lampe_redstone(redstone_lamp_off, 1, new EItem[][] { { air, EItem.redstone, air },
			{ EItem.redstone, glowstone, EItem.redstone }, { air, EItem.redstone, air } }),
	crochet(tripwire_hook, 2, new EItem[][] { { air, iron_ingot, air }, { air, stick, air }, { air, oak_wood, air } }, true),
	bouton_bois(wood_button, 1, true, oak_wood),
	plaque_pression_sensible(
			gold_plate,
			1,
			new EItem[][] { { air, air, air }, { air, air, air }, { gold_ingot, gold_ingot, air } }),
	plaque_pression_lourde(iron_plate, 1, new EItem[][] { { air, air, air }, { air, air, air }, { iron_ingot, iron_ingot, air } }),
	capteur_solaire(daylight_detector, 1, new EItem[][] { { glass, glass, glass }, { EItem.quartz, EItem.quartz, EItem.quartz },
			{ oakwood_slab, oakwood_slab, oakwood_slab } }, true),
	entonnoir(hopper, 1, new EItem[][] { { iron_ingot, air, iron_ingot }, { iron_ingot, chest, iron_ingot },
			{ air, iron_ingot, air } }),
	rail_activation(activator_rail, 6, new EItem[][] { { iron_ingot, stick, iron_ingot },
			{ iron_ingot, redstone_torch_on, iron_ingot }, { iron_ingot, stick, iron_ingot } }),
	droppeur(dropper, 1, new EItem[][] { { cobblestone, cobblestone, cobblestone }, { cobblestone, air, cobblestone },
			{ cobblestone, EItem.redstone, cobblestone } }),

	repeteur(repeater, 1, new EItem[][] { { air, air, air }, { redstone_torch_on, EItem.redstone, redstone_torch_on },
			{ stone, stone, stone } }),
	comparateur(redstone_comparator, 1, new EItem[][] { { air, redstone_torch_on, air },
			{ redstone_torch_on, EItem.quartz, redstone_torch_on }, { stone, stone, stone } }),

	/*
	 * NOURRITURE
	 */

	soupe_champi(mushroom_soup, 1, red_mushroom, brown_mushroom, bowl),
	pain(bread, 1, new EItem[][] { { air, air, air }, { air, air, air }, { wheat, wheat, wheat } }),
	pomme_or(golden_apple_1, 1, new EItem[][] { { gold_nugget, gold_nugget, gold_nugget }, { gold_nugget, apple, gold_nugget },
			{ gold_nugget, gold_nugget, gold_nugget } }),
	pomme_or_enchant(golden_apple_2, 1, new EItem[][] { { gold_block, gold_block, gold_block },
			{ gold_block, apple, gold_block }, { gold_block, gold_block, gold_block } }),
	sucre(sugar, 1, sugar_cane),
	gateau(cake, 1, new EItem[][] { { milk_bucket, milk_bucket, milk_bucket }, { sugar, egg, sugar }, { wheat, wheat, wheat } }),
	cookie(EItem.cookie, 8, new EItem[][] { { air, air, air }, { wheat, cocoa_beans, wheat }, { air, air, air } }),
	carotte_doree(golden_carrot, 1, new EItem[][] { { gold_nugget, gold_nugget, gold_nugget },
			{ gold_nugget, carrot, gold_nugget }, { gold_nugget, gold_nugget, gold_nugget } }),
	tarte_citrouille(pumpkin_pie, 1, egg, pumpkin, sugar),

	/*
	 * OUTILS
	 */

	pelle_fer(iron_spade, 1, new EItem[][] { { air, iron_ingot, air }, { air, stick, air }, { air, stick, air } }),
	pioche_fer(
			iron_pickaxe,
			1,
			new EItem[][] { { iron_ingot, iron_ingot, iron_ingot }, { air, stick, air }, { air, stick, air } }),
	hache_fer(iron_axe, 1, new EItem[][] { { iron_ingot, iron_ingot, air }, { iron_ingot, stick, air }, { air, stick, air } }),

	briquet(flint_and_steel, 1, new EItem[][] { { air, air, air }, { iron_ingot, air, air }, { air, flint, air } }),

	pelle_bois(wood_spade, 1, new EItem[][] { { air, oak_wood, air }, { air, stick, air }, { air, stick, air } }, true),
	pioche_bois(
			wood_pickaxe,
			1,
			new EItem[][] { { oak_wood, oak_wood, oak_wood }, { air, stick, air }, { air, stick, air } },
			true),
	hache_bois(wood_axe, 1, new EItem[][] { { oak_wood, oak_wood, air }, { oak_wood, stick, air }, { air, stick, air } }, true),

	pelle_pierre(stone_spade, 1, new EItem[][] { { air, cobblestone, air }, { air, stick, air }, { air, stick, air } }),
	pioche_pierre(stone_pickaxe, 1, new EItem[][] { { cobblestone, cobblestone, cobblestone }, { air, stick, air },
			{ air, stick, air } }),
	hache_pierre(stone_axe, 1, new EItem[][] { { cobblestone, cobblestone, air }, { cobblestone, stick, air },
			{ air, stick, air } }),

	pelle_diamant(diamond_spade, 1, new EItem[][] { { air, diamond, air }, { air, stick, air }, { air, stick, air } }),
	pioche_diamant(diamond_pickaxe, 1, new EItem[][] { { diamond, diamond, diamond }, { air, stick, air }, { air, stick, air } }),
	hache_diamant(diamond_axe, 1, new EItem[][] { { diamond, diamond, air }, { diamond, stick, air }, { air, stick, air } }),

	pelle_or(gold_spade, 1, new EItem[][] { { air, gold_ingot, air }, { air, stick, air }, { air, stick, air } }),
	pioche_or(gold_pickaxe, 1, new EItem[][] { { gold_ingot, gold_ingot, gold_ingot }, { air, stick, air }, { air, stick, air } }),
	hache_or(gold_axe, 1, new EItem[][] { { gold_ingot, gold_ingot, air }, { gold_ingot, stick, air }, { air, stick, air } }),

	faux_bois(wood_hoe, 1, new EItem[][] { { oak_wood, oak_wood, air }, { air, stick, air }, { air, stick, air } }, true),
	faux_pierre(stone_hoe, 1, new EItem[][] { { cobblestone, cobblestone, air }, { air, stick, air }, { air, stick, air } }),
	faux_fer(iron_hoe, 1, new EItem[][] { { iron_ingot, iron_ingot, air }, { air, stick, air }, { air, stick, air } }),
	faux_diamant(diamond_hoe, 1, new EItem[][] { { diamond, diamond, air }, { air, stick, air }, { air, stick, air } }),
	faux_or(gold_hoe, 1, new EItem[][] { { gold_ingot, gold_ingot, air }, { air, stick, air }, { air, stick, air } }),

	seau(bucket, 1, new EItem[][] { { air, air, air }, { iron_ingot, air, iron_ingot }, { air, iron_ingot, air } }),
	boussole(compass, 1, new EItem[][] { { air, iron_ingot, air }, { iron_ingot, EItem.redstone, iron_ingot },
			{ air, iron_ingot, air } }),
	canne_a_peche(fishing_rod, 1, new EItem[][] { { air, air, stick }, { air, stick, string }, { stick, air, string } }),
	montre(watch, 1, new EItem[][] { { air, gold_ingot, air }, { gold_ingot, EItem.redstone, gold_ingot },
			{ air, gold_ingot, air } }),
	cisailles(shears, 1, new EItem[][] { { air, air, air }, { air, iron_ingot, air }, { iron_ingot, air, air } }),

	/*
	 * ARMES ET ARMURES
	 */

	arc(bow, 1, new EItem[][] { { string, stick, air }, { string, air, stick }, { string, stick, air } }),
	fleche(arrow, 4, new EItem[][] { { air, flint, air }, { air, stick, air }, { air, feather, air } }),

	epee_fer(iron_sword, 1, new EItem[][] { { air, iron_ingot, air }, { air, iron_ingot, air }, { air, stick, air } }),
	epee_bois(wood_sword, 1, new EItem[][] { { air, oak_wood, air }, { air, oak_wood, air }, { air, stick, air } }, true),
	epee_pierre(stone_sword, 1, new EItem[][] { { air, cobblestone, air }, { air, cobblestone, air }, { air, stick, air } }),
	epee_diamant(diamond_sword, 1, new EItem[][] { { air, diamond, air }, { air, diamond, air }, { air, stick, air } }),
	epee_or(gold_sword, 1, new EItem[][] { { air, gold_ingot, air }, { air, gold_ingot, air }, { air, stick, air } }),

	tete_cuir(leather_helmet, 1, new EItem[][] { { air, air, air }, { leather, leather, leather }, { leather, air, leather } }),
	torse_cuir(leather_chestplate, 1, new EItem[][] { { leather, air, leather }, { leather, leather, leather },
			{ leather, leather, leather } }),
	jambes_cuir(leather_leggings, 1, new EItem[][] { { leather, leather, leather }, { leather, air, leather },
			{ leather, air, leather } }),
	pieds_cuir(leather_boots, 1, new EItem[][] { { air, air, air }, { leather, air, leather }, { leather, air, leather } }),

	tete_maille(chainmail_helmet, 1, new EItem[][] { { air, air, air }, { fire, fire, fire }, { fire, air, fire } }),
	torse_maille(chainmail_chestplate, 1, new EItem[][] { { fire, air, fire }, { fire, fire, fire }, { fire, fire, fire } }),
	jambes_maille(chainmail_leggings, 1, new EItem[][] { { fire, fire, fire }, { fire, air, fire }, { fire, air, fire } }),
	pieds_maille(chainmail_boots, 1, new EItem[][] { { air, air, air }, { fire, air, fire }, { fire, air, fire } }),

	tete_fer(iron_helmet, 1, new EItem[][] { { air, air, air }, { iron_ingot, iron_ingot, iron_ingot },
			{ iron_ingot, air, iron_ingot } }),
	torse_fer(iron_chestplate, 1, new EItem[][] { { iron_ingot, air, iron_ingot }, { iron_ingot, iron_ingot, iron_ingot },
			{ iron_ingot, iron_ingot, iron_ingot } }),
	jambes_fer(iron_leggings, 1, new EItem[][] { { iron_ingot, iron_ingot, iron_ingot }, { iron_ingot, air, iron_ingot },
			{ iron_ingot, air, iron_ingot } }),
	pieds_fer(
			iron_boots,
			1,
			new EItem[][] { { air, air, air }, { iron_ingot, air, iron_ingot }, { iron_ingot, air, iron_ingot } }),

	tete_diamant(diamond_helmet, 1, new EItem[][] { { air, air, air }, { diamond, diamond, diamond }, { diamond, air, diamond } }),
	torse_diamant(diamond_chestplate, 1, new EItem[][] { { diamond, air, diamond }, { diamond, diamond, diamond },
			{ diamond, diamond, diamond } }),
	jambes_diamant(diamond_leggings, 1, new EItem[][] { { diamond, diamond, diamond }, { diamond, air, diamond },
			{ diamond, air, diamond } }),
	pieds_diamant(diamond_boots, 1, new EItem[][] { { air, air, air }, { diamond, air, diamond }, { diamond, air, diamond } }),

	tete_or(gold_helmet, 1, new EItem[][] { { air, air, air }, { gold_ingot, gold_ingot, gold_ingot },
			{ gold_ingot, air, gold_ingot } }),
	torse_or(gold_chestplate, 1, new EItem[][] { { gold_ingot, air, gold_ingot }, { gold_ingot, gold_ingot, gold_ingot },
			{ gold_ingot, gold_ingot, gold_ingot } }),
	jambes_or(gold_leggings, 1, new EItem[][] { { gold_ingot, gold_ingot, gold_ingot }, { gold_ingot, air, gold_ingot },
			{ gold_ingot, air, gold_ingot } }),
	pieds_or(gold_boots, 1, new EItem[][] { { air, air, air }, { gold_ingot, air, gold_ingot }, { gold_ingot, air, gold_ingot } }),

	/*
	 * TRANSPORT
	 */

	wagon(
			minecart,
			1,
			new EItem[][] { { air, air, air }, { iron_ingot, air, iron_ingot }, { iron_ingot, iron_ingot, iron_ingot } }),
	bateau(boat, 1, new EItem[][] { { air, air, air }, { oak_wood, air, oak_wood }, { oak_wood, oak_wood, oak_wood } }, true),
	wagon_coffre(minecart_with_chest, 1, new EItem[][] { { air, air, air }, { air, chest, air }, { air, minecart, air } }),
	locomotive(minecart_with_furnace, 1, new EItem[][] { { air, air, air }, { air, furnace, air }, { air, minecart, air } }),
	carte(map, 1, new EItem[][] { { paper, paper, paper }, { paper, map, paper }, { paper, paper, paper } }),
	carte2(map, 2, empty_map, map),
	carte_vierge(empty_map, 1, new EItem[][] { { paper, paper, paper }, { paper, compass, paper }, { paper, paper, paper } }),
	wagon_tnt(minecart_with_tnt, 1, new EItem[][] { { air, air, air }, { air, EItem.tnt, air }, { air, minecart, air } }),
	wagon_entonnoir(minecart_with_hopper, 1, new EItem[][] { { air, air, air }, { air, hopper, air }, { air, minecart, air } }),

	/*
	 * COLORANTS
	 */

	colorant_rouge(rose_red, 1, poppy),
	colorant_rouge1(rose_red, 1, red_tulip),
	colorant_rouge2(rose_red, 2, rose_bush),
	colorant_violet(purple_dye, 2, rose_red, EItem.lapis_lazuli),
	colorant_cyan(cyan_dye, 2, cactus_green, EItem.lapis_lazuli),
	colorant_gris_clair(l_gray_dye, 3, ink_sack, bone_meal, bone_meal),
	colorant_gris_clair2(l_gray_dye, 2, gray_dye, bone_meal),
	colorant_gris_clair3(l_gray_dye, 1, azure_bluet),
	colorant_gris_clair4(l_gray_dye, 1, white_tulip),
	colorant_gris_clair5(l_gray_dye, 1, oxeye_daisy),
	colorant_gris(gray_dye, 2, ink_sack, bone_meal),
	colorant_rose(pink_dye, 2, rose_red, bone_meal),
	colorant_rose2(pink_dye, 1, pink_tulip),
	colorant_rose3(pink_dye, 2, peony),
	colorant_vert_clair(l_green_dye, 1, cactus_green, bone_meal),
	colorant_jaune(dandelion_yellow, 1, yellow_flower),
	colorant_jaune2(dandelion_yellow, 2, sunflower),
	colorant_bleu_clair(l_blue_dye, 2, EItem.lapis_lazuli, bone_meal),
	colorant_bleu_clair2(l_blue_dye, 1, blue_orchid),
	colorant_magenta(magenta_dye, 2, purple_dye, pink_dye),
	colorant_magenta2(magenta_dye, 3, pink_dye, rose_red, EItem.lapis_lazuli),
	colorant_magenta3(magenta_dye, 4, EItem.lapis_lazuli, bone_meal, rose_red, rose_red),
	colorant_magenta4(magenta_dye, 1, allium),
	colorant_magenta5(magenta_dye, 2, lilac),
	colorant_orange(orange_dye, 2, rose_red, dandelion_yellow),
	colorant_orange2(orange_dye, 1, orange_tulipe),
	engrais(bone_meal, 3, bone),

	/*
	 * ALCHIMIE
	 */

	fiole(glass_bottle, 3, new EItem[][] { { air, air, air }, { glass, air, glass }, { air, glass, air } }),

	oeil_araignee_fermente(fermented_spider_eye, 1, spider_eye, sugar, brown_mushroom),
	poudre_blaze(blaze_powder, 2, blaze_rod),
	creme_magma(magma_cream, 1, slime_ball, blaze_powder),
	oeil_ender(eye_of_ender, 1, blaze_powder, ender_pearl),
	pasteque_scintillante(speckled_melon, 1, new EItem[][] { { gold_nugget, gold_nugget, gold_nugget },
			{ gold_nugget, melon, gold_nugget }, { gold_nugget, gold_nugget, gold_nugget } }),

	/*
	 * POTIONS
	 */

	potion_malsaine(p_awkward, nether_wart, p_waterB),
	potion_epaisse(p_thick, glowstone_dust, p_waterB),
	potion_banale(p_mundane, sugar, p_waterB),
	potion_banale2(p_mundane, ghast_tear, p_waterB),
	potion_banale3(p_mundane, spider_eye, p_waterB),
	potion_banale4(p_mundane, blaze_powder, p_waterB),
	potion_banale5(p_mundane, magma_cream, p_waterB),
	potion_banale6(p_mundane, speckled_melon, p_waterB),
	potion_banale_ext(p_mundane_ext, EItem.redstone, p_waterB),

	potion_regeneration(p_regeneration, ghast_tear, p_awkward),
	potion_regeneration_ext(p_regeneration_ext, EItem.redstone, p_regeneration),
	potion_regeneration_ext2(p_regeneration_ext, EItem.redstone, p_regeneration_II),
	potion_regeneration_II(p_regeneration_II, glowstone_dust, p_regeneration),
	potion_regeneration_II2(p_regeneration_II, glowstone_dust, p_regeneration_ext),

	potion_vitesse(p_swiftness, sugar, p_awkward),
	potion_vitesse_ext(p_swiftness_ext, EItem.redstone, p_swiftness),
	potion_vitesse_ext2(p_swiftness_ext, EItem.redstone, p_swiftness_II),
	potion_vitesse_II(p_swiftness_II, glowstone_dust, p_swiftness),
	potion_vitesse_II2(p_swiftness_II, glowstone_dust, p_swiftness_ext),

	potion_resistance_feu(p_fire_resistance, magma_cream, p_awkward),
	potion_resistance_feu_ext(p_fire_resistance_ext, EItem.redstone, p_fire_resistance),

	potion_poison(p_poison, spider_eye, p_awkward),
	potion_poison_ext(p_poison_ext, EItem.redstone, p_poison),
	potion_poison_ext2(p_poison_ext, EItem.redstone, p_poison_II),
	potion_poison_II(p_poison_II, glowstone_dust, p_poison),
	potion_poison_II2(p_poison_II, glowstone_dust, p_poison_ext),

	potion_soin(p_healing, speckled_melon, p_awkward),
	potion_soin_II(p_healing_II, EItem.redstone, p_healing),

	potion_vision_nocturne(p_night_vision, golden_carrot, p_awkward),
	potion_vision_nocturne_ext(p_night_vision_ext, EItem.redstone, p_night_vision),

	potion_faiblesse(p_weakness, fermented_spider_eye, p_mundane),
	potion_faiblesse2(p_weakness, fermented_spider_eye, p_waterB),
	potion_faiblesse3(p_weakness, fermented_spider_eye, p_thick),
	potion_faiblesse4(p_weakness, glowstone_dust, p_weakness_ext),
	potion_faiblesse5(p_weakness, fermented_spider_eye, p_healing_II),
	potion_faiblesse6(p_weakness, fermented_spider_eye, p_strength),
	potion_faiblesse7(p_weakness, fermented_spider_eye, p_strength_II),
	potion_faiblesse8(p_weakness, fermented_spider_eye, p_regeneration),
	potion_faiblesse9(p_weakness, fermented_spider_eye, p_regeneration_II),
	potion_faiblesse_ext(p_weakness_ext, fermented_spider_eye, p_mundane_ext),
	potion_faiblesse_ext2(p_weakness_ext, EItem.redstone, p_weakness),
	potion_faiblesse_ext3(p_weakness_ext, fermented_spider_eye, p_healing),
	potion_faiblesse_ext4(p_weakness_ext, fermented_spider_eye, p_strength_ext),
	potion_faiblesse_ext5(p_weakness_ext, fermented_spider_eye, p_regeneration_ext),

	potion_force(p_strength, blaze_powder, p_awkward),
	potion_force_ext(p_strength_ext, EItem.redstone, p_strength),
	potion_force_ext2(p_strength_ext, EItem.redstone, p_strength_II),
	potion_force_II(p_strength_II, glowstone_dust, p_strength),
	potion_force_II2(p_strength_II, glowstone_dust, p_strength_ext),

	potion_lenteur(p_slowness, fermented_spider_eye, p_fire_resistance),
	potion_lenteur2(p_slowness, fermented_spider_eye, p_swiftness),
	potion_lenteur3(p_slowness, fermented_spider_eye, p_swiftness_II),
	potion_lenteur_ext(p_slowness_ext, EItem.redstone, p_slowness),
	potion_lenteur_ext2(p_slowness_ext, fermented_spider_eye, p_swiftness_ext),
	potion_lenteur_ext3(p_slowness_ext, fermented_spider_eye, p_fire_resistance_ext),

	potion_degat(p_harming, fermented_spider_eye, p_poison),
	potion_degat2(p_harming, EItem.redstone, p_harming_II),
	potion_degat3(p_harming, fermented_spider_eye, p_poison_ext),
	potion_degat_II(p_harming_II, glowstone, p_harming),
	potion_degat_II2(p_harming_II, fermented_spider_eye, p_poison_II),

	potion_respiration(p_water_breathing, pufferfish, p_awkward),
	potion_respiration_ext(p_water_breathing_ext, EItem.redstone, p_water_breathing),

	potion_invisibilite(p_invisibility, fermented_spider_eye, p_night_vision),
	potion_invisibilite_ext(p_invisibility_ext, EItem.redstone, p_invisibility),

	potion_splash_banale(s_p_mundane, gunpowder, p_mundane),

	potion_splash_regeneration(s_p_regeneration, gunpowder, p_regeneration),
	potion_splash_regeneration_ext(s_p_regeneration_ext, gunpowder, p_regeneration_ext),
	potion_splash_regeneration_ext2(s_p_regeneration_ext, EItem.redstone, s_p_regeneration),
	potion_splash_regeneration_ext3(s_p_regeneration_ext, EItem.redstone, s_p_regeneration_II),
	potion_splash_regeneration_II(s_p_regeneration_II, gunpowder, p_regeneration_II),
	potion_splash_regeneration_II2(s_p_regeneration_II, glowstone_dust, s_p_regeneration),
	potion_splash_regeneration_II3(s_p_regeneration_II, glowstone_dust, s_p_regeneration_ext),

	potion_splash_vitesse(s_p_swiftness, gunpowder, p_swiftness),
	potion_splash_vitesse_ext(s_p_swiftness_ext, gunpowder, p_swiftness_ext),
	potion_splash_vitesse_ext2(s_p_swiftness_ext, EItem.redstone, s_p_swiftness),
	potion_splash_vitesse_ext3(s_p_swiftness_ext, EItem.redstone, s_p_swiftness_II),
	potion_splash_vitesse_II(s_p_swiftness_II, gunpowder, p_swiftness_II),
	potion_splash_vitesse_II2(s_p_swiftness_II, glowstone_dust, s_p_swiftness),
	potion_splash_vitesse_II3(s_p_swiftness_II, glowstone_dust, s_p_swiftness_ext),

	potion_splash_resistance_feu(s_p_fire_resistance, gunpowder, p_fire_resistance),
	potion_splash_resistance_feu_ext(s_p_fire_resistance_ext, gunpowder, p_fire_resistance_ext),
	potion_splash_resistance_feu_ext2(s_p_fire_resistance_ext, EItem.redstone, s_p_fire_resistance),

	potion_splash_poison(s_p_poison, gunpowder, p_poison),
	potion_splash_poison_ext(s_p_poison_ext, gunpowder, p_poison_ext),
	potion_splash_poison_ext2(s_p_poison_ext, EItem.redstone, s_p_poison),
	potion_splash_poison_ext3(s_p_poison_ext, EItem.redstone, s_p_poison_II),
	potion_splash_poison_II(s_p_poison_II, gunpowder, p_poison_II),
	potion_splash_poison_II2(s_p_poison_II, glowstone_dust, s_p_poison),
	potion_splash_poison_II3(s_p_poison_II, glowstone_dust, s_p_poison_ext),

	potion_splash_soin(s_p_healing, gunpowder, p_healing),
	potion_splash_soin_II(s_p_healing_II, gunpowder, p_healing_II),
	potion_splash_soin_II2(s_p_healing_II, EItem.redstone, s_p_healing),

	potion_splash_vision_nocturne(s_p_night_vision, gunpowder, p_night_vision),
	potion_splash_vision_nocturne_ext(s_p_night_vision_ext, gunpowder, p_night_vision_ext),
	potion_splash_vision_nocturne_ext2(s_p_night_vision_ext, EItem.redstone, s_p_night_vision),

	potion_splash_faiblesse(s_p_weakness, gunpowder, p_weakness),
	potion_splash_faiblesse2(s_p_weakness, fermented_spider_eye, s_p_mundane),
	potion_splash_faiblesse3(s_p_weakness, glowstone_dust, s_p_weakness_ext),
	potion_splash_faiblesse4(s_p_weakness, fermented_spider_eye, s_p_healing_II),
	potion_splash_faiblesse5(s_p_weakness, fermented_spider_eye, s_p_strength),
	potion_splash_faiblesse6(s_p_weakness, fermented_spider_eye, s_p_strength_II),
	potion_splash_faiblesse7(s_p_weakness, fermented_spider_eye, s_p_regeneration),
	potion_splash_faiblesse8(s_p_weakness, fermented_spider_eye, s_p_regeneration_II),
	potion_splash_faiblesse_ext(s_p_weakness_ext, gunpowder, p_weakness_ext),
	potion_splash_faiblesse_ext2(s_p_weakness_ext, EItem.redstone, s_p_weakness),
	potion_splash_faiblesse_ext3(s_p_weakness_ext, fermented_spider_eye, s_p_healing),
	potion_splash_faiblesse_ext4(s_p_weakness_ext, fermented_spider_eye, s_p_strength_ext),
	potion_splash_faiblesse_ext5(s_p_weakness_ext, fermented_spider_eye, s_p_regeneration_ext),

	potion_splash_force(s_p_strength, gunpowder, p_strength),
	potion_splash_force_ext(s_p_strength_ext, gunpowder, p_strength_ext),
	potion_splash_force_ext2(s_p_strength_ext, EItem.redstone, p_strength),
	potion_splash_force_ext3(s_p_strength_ext, EItem.redstone, p_strength_II),
	potion_splash_force_II(s_p_strength_II, gunpowder, p_strength_II),
	potion_splash_force_II2(s_p_strength_II, glowstone_dust, p_strength),
	potion_splash_force_II3(s_p_strength_II, glowstone_dust, p_strength_ext),

	potion_splash_lenteur(s_p_slowness, gunpowder, p_slowness),
	potion_splash_lenteur2(s_p_slowness, fermented_spider_eye, s_p_fire_resistance),
	potion_splash_lenteur3(s_p_slowness, fermented_spider_eye, s_p_swiftness),
	potion_splash_lenteur4(s_p_slowness, fermented_spider_eye, s_p_swiftness_II),
	potion_splash_lenteur_ext(s_p_slowness_ext, gunpowder, p_slowness_ext),
	potion_splash_lenteur_ext2(s_p_slowness_ext, EItem.redstone, s_p_slowness),
	potion_splash_lenteur_ext3(s_p_slowness_ext, fermented_spider_eye, s_p_swiftness_ext),
	potion_splash_lenteur_ext4(s_p_slowness_ext, fermented_spider_eye, s_p_fire_resistance_ext),

	potion_splash_degat(s_p_harming, gunpowder, p_harming),
	potion_splash_degat2(s_p_harming, fermented_spider_eye, p_poison),
	potion_splash_degat3(s_p_harming, EItem.redstone, p_harming),
	potion_splash_degat4(s_p_harming, fermented_spider_eye, p_poison_ext),
	potion_splash_degat_II(s_p_harming_II, gunpowder, p_harming_II),
	potion_splash_degat_II2(s_p_harming_II, glowstone_dust, s_p_harming),
	potion_splash_degat_II3(s_p_harming_II, fermented_spider_eye, s_p_poison_II),

	potion_splash_respiration(s_p_water_breathing, gunpowder, p_water_breathing),
	potion_splash_respiration_ext(s_p_water_breathing_ext, gunpowder, p_water_breathing_ext),
	potion_splash_respiration_ext2(s_p_water_breathing_ext, EItem.redstone, s_p_water_breathing),

	potion_splash_invisibilite(s_p_invisibility, gunpowder, p_invisibility),
	potion_splash_invisibilite2(s_p_invisibility, fermented_spider_eye, s_p_night_vision),
	potion_splash_invisibilite_ext(s_p_invisibility_ext, gunpowder, p_invisibility_ext),
	potion_splash_invisibilite_ext2(s_p_invisibility_ext, EItem.redstone, s_p_invisibility),

	;

	private static ArrayList<Recette> recettesUseless = new ArrayList<>();
	static {
		recettesUseless.add(laine_blanche2);
		recettesUseless.add(carte);
		recettesUseless.add(carte2);
	}

	private EItem item;
	private ERecetteForme forme = ERecetteForme.sansforme;
	private ERecetteType type;
	private EItem[][] recette = new EItem[3][3];
	private ArrayList<EItem> ingredients = new ArrayList<EItem>();
	private int quantite;
	private boolean combinable = false;

	/**
	 * Constructeur à ne pas appeler, permet de construire rapidement et sans
	 * répétition un enum
	 *
	 * @param id
	 *            Identifiant numérique dans le jeu
	 * @param metadata
	 *            Aussi appelé Damage Value, permet d'identifier les blocs
	 *            partageant le même ID
	 * @param mid
	 *            Nouveau "Minecraft ID", le nom dans le jeu pour y accéder via
	 *            un /give
	 * @param type
	 *            Type de recette pour l'obtention ({@link ERecetteType})
	 * @param quantite
	 *            Quantité obtenue
	 */
	Recette(EItem item, ERecetteType type, int quantite) {
		this.item = item;
		this.type = type;
		this.quantite = quantite;
	}

	/**
	 * Constructeur pour une recette en craft, de type "avec forme"
	 *
	 * @param recette
	 *            Tableau d'ingrédients, 3x3, tout doit être rempli (même par de
	 *            l'{@linkplain EItem#air air})
	 * @see Recette#Recette(int, int, String, ERecetteType, int)
	 */
	Recette(EItem item, int quantite, EItem[][] recette) {
		this(item, craft, quantite);
		this.forme = ERecetteForme.forme;
		if (recette.length == 3) {
			if (recette[0].length == 3 && recette[1].length == 3 && recette[2].length == 3) {
				this.recette = recette;
			}
			else
				throw new IllegalArgumentException("Le tableau d'ingrédients n'est pas de dimension 3x3");
		}
		else
			throw new IllegalArgumentException("Le tableau d'ingrédients n'est pas de dimension 3x3");
	}

	/**
	 * Constructeur pour une recette en craft de type "avec forme" et à
	 * combinabilité variable
	 *
	 * @param item
	 * @param quantite
	 * @param recette
	 * @param combinable
	 */
	Recette(EItem item, int quantite, EItem[][] recette, boolean combinable) {
		this(item, quantite, recette);
		this.combinable = combinable;
	}

	/**
	 * Constructeur pour une recette, de type "sans forme"
	 *
	 * @param ingredients
	 *            Liste des ingrédients
	 * @see Recette#Recette(int, int, String, ERecetteType, int
	 */
	Recette(EItem item, int quantite, EItem... ingredients) {
		this(item, craft, quantite);
		for (int i = 0; i < ingredients.length; i++) {
			this.ingredients.add(ingredients[i]);
		}
		this.forme = ERecetteForme.sansforme;
	}

	/**
	 * Constructeur pour une recette de craft sans forme à combinabilité
	 * variable
	 *
	 * @param item
	 * @param quantite
	 * @param combinable
	 * @param ingredients
	 */
	Recette(EItem item, int quantite, boolean combinable, EItem... ingredients) {
		this(item, quantite, ingredients);
		this.combinable = combinable;
	}

	/**
	 * Constructeur pour une recette de four
	 *
	 * @param acuire
	 *            l'ingrédient à cuire
	 */
	Recette(EItem item, EItem acuire) {
		this(item, four, 1);
		this.ingredients.add(acuire);
	}

	/**
	 * Constructeur pour une recette de four à combinabilité variable
	 *
	 * @param acuire
	 *            l'ingrédient à cuire
	 * @param combinable
	 */
	Recette(EItem item, EItem acuire, boolean combinable) {
		this(item, four, 1);
		this.ingredients.add(acuire);
		this.combinable = combinable;
	}

	/**
	 * Constructeur pour une recette de potion
	 *
	 * @param ingredient
	 *            L'ingrédient nécessaire à l'obtention de la potion
	 * @param potion_base
	 *            La potion utilisée pour devenir la nouvelle potion
	 */
	Recette(EItem item, EItem ingredient, EItem potion_base) {
		this(item, ERecetteType.alambic, 3);
		this.ingredients.add(ingredient);
		this.ingredients.add(potion_base);
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
		return new Item(item, quantite);
	}

	public boolean isCombinable() {
		return combinable;
	}

	public String toString() {
		String sRecette = "";
		switch (type) {
		case craft:
			switch (forme) {
			case forme:
				sRecette = "";
				for (int i = 0; i < 3; i++) {
					sRecette += "\n\t";
					for (int j = 0; j < 3; j++) {
						sRecette += recette[i][j].getGuiName() + " | ";
					}
				}
				break;
			case sansforme:
				for (int i = 0; i < ingredients.size(); i++) {
					sRecette += ingredients.get(i).getGuiName() + " ";
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
			sRecette += ingredients.get(1).getGuiName() + " + " + ingredients.get(0).getGuiName();
			break;
		default:
			break;
		}
		return item.getRealName() + (item.getMeta() != 0 ? "." + item.getMeta() : "") + " : " + type.name() + " " + sRecette;
	}

	public static ArrayList<Recette> getRecettes(EItem item) {
		// Pour éviter les doublons
		LinkedHashSet<Recette> lhsRecettes = new LinkedHashSet<>();
		Recette[] values = values();
		for (int i = 0; i < values.length; i++) {
			Recette r = values[i];
			if (item == r.item) {
				lhsRecettes.add(r);
			}
		}
		for (int i = 0; i < values.length; i++) {
			Recette r = values[i];
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					switch (r.forme) {
					case forme:
						if (item == r.recette[j][k])
							lhsRecettes.add(r);
						break;
					case sansforme:
						int result = j * 3 + k;
						if (result < r.ingredients.size()) {
							if (item == r.ingredients.get(result))
								lhsRecettes.add(r);
						}
						break;
					default:
						break;
					}
				}
			}
		}

		ArrayList<Recette> recettes = new ArrayList<>(lhsRecettes);

		return recettes;
	}

	public static int getFirst(ERecetteType type, ArrayList<Recette> recettes) {
		int i = 0;
		while (i < recettes.size() && recettes.get(i).getType() != type) {
			i++;
		}
		if (i < recettes.size())
			return i;
		else
			return -1;
	}

	public static int getPrevious(int index, ArrayList<Recette> recettes) {
		if (index == -1)
			return -1;

		ERecetteType type = recettes.get(index).type;
		ArrayList<Recette> recettesType = getByType(type, recettes);

		Recette currentRecette = recettes.get(index);
		int indexInRT = recettesType.indexOf(currentRecette);
		if (indexInRT == 0) {
			indexInRT = recettesType.size();
		}
		Recette previous = recettesType.get(--indexInRT);

		return recettes.indexOf(previous);

	}

	public static int getNext(int index, ArrayList<Recette> recettes) {
		if (index == -1)
			return -1;

		ERecetteType type = recettes.get(index).type;
		ArrayList<Recette> recettesType = getByType(type, recettes);

		Recette currentRecette = recettes.get(index);
		int indexInRT = recettesType.indexOf(currentRecette);
		if (indexInRT == recettesType.size() - 1) {
			indexInRT = -1;
		}
		Recette next = recettesType.get(++indexInRT);

		return recettes.indexOf(next);

	}

	private static ArrayList<Recette> getByType(ERecetteType type, ArrayList<Recette> recettes) {
		ArrayList<Recette> typeList = new ArrayList<>();

		for (Recette recette : recettes) {
			if (recette.type == type) {
				typeList.add(recette);
			}
		}

		return typeList;
	}

	/**
	 * Calcule pour une recette avec un nombre voulu la quantité d'ingrédients
	 * requise
	 *
	 * @param recette
	 * @param nb
	 * @return
	 */
	private static Ingredients calcule(Recette recette, int nb) {
		Ingredients items = new Ingredients();

		switch (recette.forme) {
		case forme:

			for (EItem[] tab_eitem : recette.recette) {
				for (EItem item : tab_eitem) {
					evalueRecette(items, item);
				}
			}

			break;
		case sansforme:

			for (EItem item : recette.ingredients) {
				evalueRecette(items, item);
			}

			break;
		default:
			break;
		}

		int nbCrafts = (int) Math.ceil(nb / (recette.quantite + 0d));

		for (Item item : items) {
			if (recette.type == ERecetteType.alambic) {
				if (!item.getItem().getRealName().equals("potion")) {
					item.setQuantite((int) Math.ceil((item.getQuantite() * nb) / (recette.quantite + 0d)));
				}
				else {
					item.setQuantite(item.getQuantite() * nb);
				}
			}
			else {
				item.setQuantite(item.getQuantite() * nbCrafts);
			}
		}

		return items;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<Ingredients> calcule(Recette recette, int nb, boolean primaire) {
		ArrayList<Ingredients> result = new ArrayList<>(calcule(recette, new Ingredients(), nb, primaire, 0).keySet());

		for (Ingredients ingredients : (ArrayList<Ingredients>) result.clone()) {
			ingredients.nettoyage();
			if (ingredients.isEmpty()) {
				result.remove(ingredients);
			}
		}

		return result;
	}

	static class MapIngredientsRestant extends LinkedHashMap<Ingredients, Ingredients> {

		private static final long serialVersionUID = -1139151548490289231L;

		public MapIngredientsRestant() {
			super();
		}

		@Override
		public Ingredients put(Ingredients key, Ingredients value) {

			if (this.containsKey(key)) {
				Ingredients val = this.get(key);
				val.sum(value);
				ArrayList<Ingredients> keys = new ArrayList<>(this.keySet());
				Ingredients trueKey = keys.get(keys.indexOf(key));

				trueKey.sum(key);

				return super.put(trueKey, val);
			}
			else {
				return super.put(key, value);
			}

		}

		private void addToAll(Ingredients communs, Ingredients restCommuns) {

			if (this.isEmpty()) {
				this.put(communs, restCommuns);
				return;
			}

			for (Ingredients key : this.keySet()) {
				Ingredients value = this.get(key);
				key.sum(communs);
				value.sum(restCommuns);
				this.put(key, value);
			}

		}

		public void addToAll(MapIngredientsRestant mapIngs) {
			if (mapIngs != null) {
				for (Ingredients key : mapIngs.keySet()) {
					this.addToAll(key, mapIngs.get(key));
				}
			}
		}

	}

	private static MapIngredientsRestant calcule(Recette recette, Ingredients restant, int nb, boolean primaire, int step) {

		if (step == 8) {
			return null;
		}

		Ingredients ingBase = calcule(recette, nb);
		Ingredients ingClone = ingBase.substract(restant);

		MapIngredientsRestant result = new MapIngredientsRestant();

		Ingredients ingCommuns = new Ingredients();
		Ingredients restCommuns = new Ingredients();

		for (Item item : ingClone) {

			if (primaire) {
				EItemInfo info = EItemInfo.getBy(item.getItem());
				if (info.isPrimaire()) {
					alimentationListesCommunes(recette, nb, ingCommuns, restCommuns, item);
				}
				else {

					ArrayList<Recette> recettes = getDirectRecettes(item.getItem());

					if (result.isEmpty()) {
						for (Recette recette2 : recettes) {
							if (!recettesUseless.contains(recette2)) {
								result.putAll(calcule(recette2, restant, item.getQuantite(), primaire, step + 1));
							}
							else {
								Ingredients r = new Ingredients();
								r.add(evalueRestant(item, recette2, nb));
								r.nettoyage();
								result.put(calcule(recette2, item.getQuantite()), r);
							}
						}
					}
					else {

						MapIngredientsRestant listCalcs = new MapIngredientsRestant();

						for (Recette recette2 : recettes) {

							if (!recettesUseless.contains(recette)) {

								for (Iterator<Ingredients> it = result.keySet().iterator(); it.hasNext();) {
									Ingredients ing = it.next();

									// Calcul des ingrédients à utiliser et du
									// restant
									MapIngredientsRestant calc = calcule(recette2, result.get(ing), item.getQuantite(), primaire,
											step + 1);

									listCalcs.putAll(calc);

								}

							}
							else {
								alimentationListesCommunes(recette2, nb, ingCommuns, restCommuns, item);
							}

						}

						MapIngredientsRestant resultClone = (MapIngredientsRestant) result.clone();
						for (Ingredients key : resultClone.keySet()) {
							key = key.clone();
							Ingredients value = resultClone.get(key);

							result.remove(key);

							for (Ingredients lcKey : listCalcs.keySet()) {
								// Composer chaque résultat de calcul avec le
								// résultat existant
								lcKey = lcKey.clone();
								Ingredients lcValue = listCalcs.get(lcKey);
								lcKey.sum(key);
								lcValue.sum(value);
								result.put(lcKey, lcValue);
							}

						}

					}

				}

			}
			else {
				alimentationListesCommunes(recette, nb, ingCommuns, restCommuns, item);
			}

		}

		result.addToAll(ingCommuns, restCommuns);

		return result;
	}

	private static void alimentationListesCommunes(final Recette recette, final int nb, Ingredients ingCommuns,
			Ingredients restCommuns, final Item item) {
		ingCommuns.add(item, true);
		restCommuns.add(evalueRestant(item, recette, nb), true);
	}

	/**
	 * Renvoie le résultat du calcul d'une recette pour nb éléments, avec les
	 * différentes possibilités et pour chacune le nombre d'ingrédients restants
	 *
	 * @param recette
	 *            la recette à calculer
	 * @param nb
	 *            le nombre d'éléments à récupérer
	 * @param primaire
	 *            recherche par éléments primaires ?
	 * @param step
	 *            la profondeur de la récursion
	 * @return une map contenant pour chaque liste d'ingrédients, une liste
	 *         d'éléments restants
	 */
	private static MapIngredientsRestant calcule2(Recette recette, final Ingredients restant, int nb, boolean primaire, int step) {

		// Que faire ?
		// Il faut qu'à partir de la recette, et du nb, on puisse savoir les
		// différentes recettes (à partir d'éléments primaire) possibles
		// et bien sûr de manière unique

		if (recette == laine_blanche2 || recette == carte2 || recette == gres_poli3) {
			primaire = false;
		}

		final Ingredients ingredients = calcule(recette, nb);
		ingredients.substract(restant);
		MapIngredientsRestant result = new MapIngredientsRestant();

		MapIngredientsRestant communs = new MapIngredientsRestant();
		Ingredients ingCommuns = new Ingredients();
		Ingredients restCommuns = new Ingredients();
		communs.put(ingCommuns, restCommuns);

		if (step == 8)
			return null;

		if (primaire) {
			// recursion

			for (Item item : ingredients) {

				EItemInfo info = EItemInfo.getBy(item.getItem());

				MapIngredientsRestant mapIngs = new MapIngredientsRestant();
				Ingredients ing2;
				Ingredients restant2;

				if (item.getQuantite() != 0 && !info.isPrimaire()) {

					ArrayList<Recette> recettes = getDirectRecettes(item.getItem());

					for (Recette recette2 : recettes) {

						ing2 = new Ingredients();
						restant2 = new Ingredients();

						MapIngredientsRestant calc = calcule2(recette2, restant, item.getQuantite(), true, step + 1);

						if (calc != null) {
							ArrayList<Ingredients> keys = new ArrayList<>(calc.keySet());
							ArrayList<Ingredients> values = new ArrayList<>(calc.values());

							for (int i = 0; i < keys.size(); i++) {
								ing2.addAll(keys.get(i));
								restant.sum(values.get(i));
								restant2.addAll(values.get(i));
							}

							mapIngs.put(ing2, restant2);

						}

					}

					// System.out.println(mapIngs);
					result.putAll(mapIngs);

				}
				else {
					restCommuns.add(evalueRestant(item, recette, nb), true);
					ingCommuns.add(item, true);
				}

			}

		}
		else {
			result.put(ingredients, new Ingredients());
		}

		result.addToAll(communs);

		return result;
	}

	private static Item evalueRestant(final Item itemInRecette, final Recette recetteAProduire, int nbItemsProduits) {

		Item yield = recetteAProduire.getItem();
		Item ing = calcule(recetteAProduire, 1).get(itemInRecette.getItem());

		int restant = (int) (Math.abs((nbItemsProduits / (double) yield.getQuantite() - (itemInRecette.getQuantite() / ing
				.getQuantite()))) * yield.getQuantite());

		return new Item(yield.getItem(), restant);
	}

	private static void evalueRecette(Ingredients items, EItem item) {
		if (item != air) {
			items.add(new Item(item, 1), true);
		}
	}

	public static ArrayList<Recette> getDirectRecettes(EItem item) {
		ArrayList<Recette> recettes = getRecettes(item);

		@SuppressWarnings("unchecked")
		ArrayList<Recette> recettes2 = (ArrayList<Recette>) recettes.clone();

		for (Recette recette : recettes) {
			if (recette.item != item) {
				recettes2.remove(recette);
			}
		}

		return recettes2;
	}

}
