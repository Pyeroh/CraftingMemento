package model.enums;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;

import model.EnumName;

/**
 * Les items Minecraft, sans les objets techniques et certains autres...
 *
 * @author Pyeroh
 * @see EItemCat
 */
public enum EItem {

	air(0, 0, "", null),

	// Blocks
	stone(1, 0, "stone", EItemCat.block),
	/*
	 * TODO 1.8 granite(1,1,"stone",EItemCat.block),
	 * granite_polished(1,2,"stone",EItemCat.block),
	 * diorite(1,3,"stone",EItemCat.block),
	 * diorite_polished(1,4,"stone",EItemCat.block),
	 * andesite(1,5,"stone",EItemCat.block),
	 * andesite_polished(1,6,"stone",EItemCat.block),
	 */
	grass(2, 0, "grass", EItemCat.block),
	dirt(3, 0, "dirt", EItemCat.block),
	grassless_dirt(3, 1, "dirt", EItemCat.block),
	podzol(3, 2, "dirt",EItemCat.block),
	cobblestone(4, 0, "cobblestone",EItemCat.block),
	oak_wood(5, 0, "planks", EItemCat.block),
	spruce_wood(5, 1, "planks", EItemCat.block),
	birch_wood(5, 2, "planks",EItemCat.block),
	jungle_wood(5, 3, "planks", EItemCat.block),
	acacia_wood(5, 4, "planks", EItemCat.block),
	darkoak_wood(5, 5, "planks",EItemCat.block),
	oak_sapling(6, 0, "sapling",EItemCat.decoration),
	spruce_sapling(6, 1, "sapling",EItemCat.decoration),
	birch_sapling(6, 2, "sapling",EItemCat.decoration),
	jungle_sapling(6, 3, "sapling",EItemCat.decoration),
	acacia_sapling(6, 4, "sapling",EItemCat.decoration),
	darkoak_sapling(6, 5, "sapling",EItemCat.decoration),
	sand(12, 0, "sand", EItemCat.block),
	redsand(12, 1, "sand", EItemCat.block),
	gravel(13, 0, "gravel",EItemCat.block),
	gold_ore(14, 0, "gold_ore", EItemCat.block),
	iron_ore(15, 0, "iron_ore", EItemCat.block),
	coal_ore(16, 0, "coal_ore",EItemCat.block),
	oak_log(17, 0, "log", EItemCat.block),
	spruce_log(17, 1, "log", EItemCat.block),
	birch_log(17, 2, "log",EItemCat.block),
	jungle_log(17, 3, "log", EItemCat.block),
	acacia_log(162, 0, "log2", EItemCat.block),
	darkoak_log(162, 1, "log2",EItemCat.block),
	oak_leaves(18, 0, "leaves",EItemCat.decoration),
	spruce_leaves(18, 1, "leaves",EItemCat.decoration),
	birch_leaves(18, 2, "leaves",EItemCat.decoration),
	jungle_leaves(18, 3, "leaves",EItemCat.decoration),
	acacia_leaves(161, 0, "leaves2",EItemCat.decoration),
	darkoak_leaves(161, 1, "leaves2",EItemCat.decoration),
	glass(20, 0, "glass", EItemCat.block),
	lapis_ore(21, 0, "lapis_ore", EItemCat.block),
	lapis_block(22, 0,"lapis_block", EItemCat.block),
	dispenser(23, 0, "dispenser",EItemCat.redstone),
	sandstone(24, 0, "sandstone",EItemCat.block),
	chiseled_sandstone(24, 1, "sandstone",EItemCat.block),
	smooth_sandstone(24, 2, "sandstone",EItemCat.block),
	note_block(25, 0, "noteblock",EItemCat.redstone),
	powered_rail(27, 0, "golden_rail",EItemCat.transport),
	detector_rail(28, 0, "detector_rail",EItemCat.transport),
	sticky_piston(29, 0, "sticky_piston",EItemCat.redstone),
	cobweb(30, 0, "web", EItemCat.decoration),
	long_grass(31, 1, "long_grass", EItemCat.decoration),
	fern(31, 2,"long_grass", EItemCat.decoration),
	dead_bush(32, 0,"dead_bush", EItemCat.decoration),
	piston(33, 0, "piston",EItemCat.redstone),
	white_wool(35, 0, "wool", EItemCat.block),
	orange_wool(35, 1, "wool", EItemCat.block),
	magenta_wool(35, 2, "wool",EItemCat.block),
	l_blue_wool(35, 3, "wool", EItemCat.block),
	yellow_wool(35, 4, "wool", EItemCat.block),
	l_green_wool(35, 5, "wool",EItemCat.block),
	pink_wool(35, 6, "wool", EItemCat.block),
	gray_wool(35, 7, "wool", EItemCat.block),
	l_gray_wool(35, 8, "wool",EItemCat.block),
	cyan_wool(35, 9, "wool", EItemCat.block),
	purple_wool(35, 10, "wool", EItemCat.block),
	blue_wool(35, 11, "wool",EItemCat.block),
	brown_wool(35, 12, "wool", EItemCat.block),
	green_wool(35, 13, "wool", EItemCat.block),
	red_wool(35, 14, "wool",EItemCat.block),
	black_wool(35, 15, "wool", EItemCat.block),
	yellow_flower(37, 0, "yellow_flower", EItemCat.decoration),
	poppy(38, 0,"red_rose", EItemCat.decoration),
	blue_orchid(38, 1,"red_rose", EItemCat.decoration),
	allium(38, 2, "red_rose",EItemCat.decoration),
	azure_bluet(38, 3, "red_rose",EItemCat.decoration),
	red_tulip(38, 4, "red_rose",EItemCat.decoration),
	orange_tulipe(38, 5, "red_rose",EItemCat.decoration),
	white_tulip(38, 6, "red_rose",EItemCat.decoration),
	pink_tulip(38, 7, "red_rose",EItemCat.decoration),
	oxeye_daisy(38, 8, "red_rose",EItemCat.decoration),
	brown_mushroom(39, 0, "brown_mushroom",EItemCat.decoration),
	red_mushroom(40, 0, "red_mushroom",EItemCat.decoration),
	gold_block(41, 0, "gold_block",EItemCat.block),
	iron_block(42, 0, "iron_block", EItemCat.block),
	stone_slab(44, 0, "stone_slab", EItemCat.block),
	sandstone_slab(44, 1, "stone_slab",EItemCat.block),
	cobble_slab(44, 3, "stone_slab", EItemCat.block),
	brick_slab(44, 4, "stone_slab", EItemCat.block),
	stonebrick_slab(44, 5, "stone_slab",EItemCat.block),
	netherbrick_slab(44, 6, "stone_slab", EItemCat.block),
	quartz_slab(44, 7, "stone_slab", EItemCat.block),
	brick(45, 0, "bricks",EItemCat.block),
	tnt(46, 0, "tnt", EItemCat.redstone),
	bookshelf(47, 0, "bookshelf", EItemCat.block),
	mossy_cobblestone(48, 0,"mossy_cobblestone", EItemCat.block),
	obsidian(49, 0,"obsidian", EItemCat.block),
	torch(50, 0, "torch",EItemCat.decoration),
	fire(51, 0, "fire", null),
	wood_stairs(53, 0, "oak_stairs", EItemCat.block),
	chest(54, 0, "chest",EItemCat.decoration),
	diamond_ore(56, 0, "diamond_ore",EItemCat.block),
	diamond_block(57, 0, "diamond_block",EItemCat.block),
	workbench(58, 0, "crafting_table", EItemCat.block),
	furnace(61, 0, "furnace", EItemCat.decoration),
	ladder(65, 0, "ladder",EItemCat.decoration),
	rails(66, 0, "rail", EItemCat.transport),
	cobblestone_stairs(67, 0, "stone_stairs", EItemCat.block),
	lever(69, 0,"lever", EItemCat.redstone),
	stone_plate(70, 0, "stone_pressure_plate",EItemCat.redstone),
	wood_plate(72, 0, "wooden_pressure_plate",EItemCat.redstone),
	redstone_ore(73, 0, "redstone_ore",EItemCat.block),
	redstone_torch_on(76, 0, "redstone_torch",EItemCat.redstone),
	stone_button(77, 0, "stone_button",EItemCat.redstone),
	snow(78, 0, "snow_layer", EItemCat.decoration),
	ice(79, 0, "ice", EItemCat.block),
	snow_block(80, 0, "snow",EItemCat.block),
	cactus(81, 0, "cactus", EItemCat.decoration),
	clay(82, 0, "clay", EItemCat.block),
	jukebox(84, 0, "jukebox",EItemCat.decoration),
	fence(85, 0, "fence", EItemCat.decoration),
	pumpkin(86, 0, "pumpkin", EItemCat.block),
	netherrack(87, 0,"netherrack", EItemCat.block),
	soul_sand(88, 0, "soul_sand",EItemCat.block),
	glowstone(89, 0, "glowstone", EItemCat.block),
	jack_o_lantern(91, 0, "lit_pumpkin", EItemCat.block),
	white_glass(95, 0,"stained_glass", EItemCat.block),
	orange_glass(95, 1,"stained_glass", EItemCat.block),
	magenta_glass(95, 2,"stained_glass", EItemCat.block),
	l_blue_glass(95, 3,"stained_glass", EItemCat.block),
	yellow_glass(95, 4,"stained_glass", EItemCat.block),
	l_green_glass(95, 5,"stained_glass", EItemCat.block),
	pink_glass(95, 6,"stained_glass", EItemCat.block),
	gray_glass(95, 7,"stained_glass", EItemCat.block),
	l_gray_glass(95, 8,"stained_glass", EItemCat.block),
	cyan_glass(95, 9,"stained_glass", EItemCat.block),
	purple_glass(95, 10,"stained_glass", EItemCat.block),
	blue_glass(95, 11,"stained_glass", EItemCat.block),
	brown_glass(95, 12,"stained_glass", EItemCat.block),
	green_glass(95, 13,"stained_glass", EItemCat.block),
	red_glass(95, 14,"stained_glass", EItemCat.block),
	black_glass(95, 15,"stained_glass", EItemCat.block),
	trap_door(96, 0, "trapdoor",EItemCat.redstone),
	smooth_brick(98, 0, "stonebrick",EItemCat.block),
	mossy_smooth_brick(98, 1, "stonebrick",EItemCat.block),
	cracked_smooth_brick(98, 2, "stonebrick",EItemCat.block),
	chiseled_smooth_brick(98, 3, "stonebrick",EItemCat.block),
	huge_mushroom_1(99, 0, "huge_mushroom_1",EItemCat.block),
	huge_mushroom_2(100, 0, "huge_mushroom_1",EItemCat.block),
	iron_bars(101, 0, "iron_bars",EItemCat.decoration),
	glass_pane(102, 0, "glass_pane",EItemCat.decoration),
	melon_block(103, 0, "melon_block",EItemCat.block),
	vine(106, 0, "vine", EItemCat.decoration),
	fence_gate(107, 0, "fence_gate", EItemCat.redstone),
	brick_stairs(108, 0,"brick_stairs", EItemCat.block),
	smooth_stairs(109, 0,"stone_brick_stairs", EItemCat.block),
	mycelium(110, 0, "mycelium",EItemCat.block),
	lilypad(111, 0, "water_lily",EItemCat.decoration),
	nether_brick_block(112, 0,"nether_brick", EItemCat.block),
	nether_fence(113, 0,"nether_brick_fence", EItemCat.decoration),
	nether_brick_stairs(114,0, "nether_brick_stairs", EItemCat.block),
	enchantment_table(116, 0, "enchanting_table", EItemCat.decoration),
	ender_stone(121, 0, "ender_stone", EItemCat.block),
	dragon_egg(122, 0,"dragon_egg", EItemCat.decoration),
	redstone_lamp_off(123, 0,"redstone_lamp", EItemCat.redstone),
	oakwood_slab(126, 0,"wooden_slab", EItemCat.block),
	sprucewood_slab(126, 1,"wooden_slab", EItemCat.block),
	birchwood_slab(126, 2,"wooden_slab", EItemCat.block),
	junglewood_slab(126, 3,"wooden_slab", EItemCat.block),
	acacia_slab(126, 4, "wooden_slab",EItemCat.block),
	darkoak_slab(126, 5, "wooden_slab",EItemCat.block),
	sandstone_stairs(128, 0, "sandstone_stairs",EItemCat.block),
	emerald_ore(129, 0, "emerald_ore",EItemCat.block),
	ender_chest(130, 0, "ender_chest",EItemCat.decoration),
	tripwire_hook(131, 0, "tripwire_hook",EItemCat.redstone),
	emerald_block(133, 0, "emerald_block",EItemCat.block),
	spruce_wood_stairs(134, 0,"spruce_stairs", EItemCat.block),
	birch_wood_stairs(135,0, "birch_stairs", EItemCat.block),
	jungle_wood_stairs(136, 0, "jungle_stairs", EItemCat.block),
	beacon(138, 0,"beacon", EItemCat.misc),
	cobble_wall(139, 0, "cobblestone_wall",EItemCat.block),
	mossy_cobble_wall(139, 1, "cobblestone_wall",EItemCat.block),
	wood_button(143, 0, "wooden_button",EItemCat.redstone),
	anvil(145, 0, "anvil", EItemCat.decoration),
	trapped_chest(146, 0,"trapped_chest", EItemCat.decoration),
	gold_plate(147, 0,"light_weighted_pressure_plate", EItemCat.redstone),
	iron_plate(148, 0,"heavy_weighted_pressure_plate", EItemCat.redstone),
	daylight_detector(151, 0,"daylight_detector", EItemCat.redstone),
	redstone_block(152, 0,"redstone_block", EItemCat.redstone),
	quartz_ore(153, 0,"quartz_ore", EItemCat.block),
	hopper(154, 0, "hopper",EItemCat.redstone),
	quartz_block(155, 0, "quartz_block",EItemCat.block),
	chiseled_quartz_block(155, 1, "quartz_block",EItemCat.block),
	pillar_quartz_block(155, 2, "quartz_block",EItemCat.block),
	quartz_stairs(156, 0, "quartz_stairs",EItemCat.block),
	activator_rail(157, 0, "activator_rail",EItemCat.transport),
	dropper(158, 0, "dropper",EItemCat.redstone),
	white_stained_clay(159, 0, "stained_hardened_clay",EItemCat.block),
	orange_stained_clay(159, 1, "stained_hardened_clay",EItemCat.block),
	magenta_stained_clay(159, 2, "stained_hardened_clay",EItemCat.block),
	l_blue_stained_clay(159, 3, "stained_hardened_clay",EItemCat.block),
	yellow_stained_clay(159, 4, "stained_hardened_clay",EItemCat.block),
	l_green_stained_clay(159, 5, "stained_hardened_clay",EItemCat.block),
	pink_stained_clay(159, 6, "stained_hardened_clay",EItemCat.block),
	gray_stained_clay(159, 7, "stained_hardened_clay",EItemCat.block),
	l_gray_stained_clay(159, 8, "stained_hardened_clay",EItemCat.block),
	cyan_stained_clay(159, 9, "stained_hardened_clay",EItemCat.block),
	purple_stained_clay(159, 10, "stained_hardened_clay",EItemCat.block),
	blue_stained_clay(159, 11, "stained_hardened_clay",EItemCat.block),
	brown_stained_clay(159, 12, "stained_hardened_clay",EItemCat.block),
	green_stained_clay(159, 13, "stained_hardened_clay",EItemCat.block),
	red_stained_clay(159, 14, "stained_hardened_clay",EItemCat.block),
	black_stained_clay(159, 15, "stained_hardened_clay",EItemCat.block),
	white_glass_pane(160, 0, "stained_glass_pane",EItemCat.block),
	orange_glass_pane(160, 1,"stained_glass_pane", EItemCat.block),
	magenta_glass_pane(160,2, "stained_glass_pane", EItemCat.block),
	l_blue_glass_pane(160, 3, "stained_glass_pane", EItemCat.block),
	yellow_glass_pane(160, 4, "stained_glass_pane", EItemCat.block),
	l_green_glass_pane(160, 5, "stained_glass_pane", EItemCat.block),
	pink_glass_pane(160, 6, "stained_glass_pane", EItemCat.block),
	gray_glass_pane(160, 7, "stained_glass_pane", EItemCat.block),
	l_gray_glass_pane(160, 8, "stained_glass_pane", EItemCat.block),
	cyan_glass_pane(160, 9, "stained_glass_pane", EItemCat.block),
	purple_glass_pane(160, 10, "stained_glass_pane", EItemCat.block),
	blue_glass_pane(160, 11, "stained_glass_pane", EItemCat.block),
	brown_glass_pane(160, 12, "stained_glass_pane", EItemCat.block),
	green_glass_pane(160, 13, "stained_glass_pane", EItemCat.block),
	red_glass_pane(160, 14, "stained_glass_pane", EItemCat.block),
	black_glass_pane(160, 15, "stained_glass_pane", EItemCat.block),
	acacia_stairs(163, 0, "acacia_stairs", EItemCat.block),
	darkoak_stairs(164,0, "dark_oak_stairs", EItemCat.block),
	hay_block(170, 0,"hay_block", EItemCat.block),
	white_carpet(171, 0, "carpet",EItemCat.decoration),
	orange_carpet(171, 1, "carpet",EItemCat.decoration),
	magenta_carpet(171, 2, "carpet",EItemCat.decoration),
	l_blue_carpet(171, 3, "carpet",EItemCat.decoration),
	yellow_carpet(171, 4, "carpet",EItemCat.decoration),
	l_green_carpet(171, 5, "carpet",EItemCat.decoration),
	pink_carpet(171, 6, "carpet",EItemCat.decoration),
	gray_carpet(171, 7, "carpet",EItemCat.decoration),
	l_gray_carpet(171, 8, "carpet",EItemCat.decoration),
	cyan_carpet(171, 9, "carpet",EItemCat.decoration),
	purple_carpet(171, 10, "carpet",EItemCat.decoration),
	blue_carpet(171, 11, "carpet",EItemCat.decoration),
	brown_carpet(171, 12, "carpet",EItemCat.decoration),
	green_carpet(171, 13, "carpet",EItemCat.decoration),
	red_carpet(171, 14, "carpet",EItemCat.decoration),
	black_carpet(171, 15, "carpet",EItemCat.decoration),
	hardened_clay(172, 0, "hardened_clay",EItemCat.block),
	coal_block(173, 0, "coal_block",EItemCat.block),
	packed_ice(174, 0, "packed_ice",EItemCat.block),
	sunflower(175, 0, "double_plant",EItemCat.decoration),
	lilac(175, 1, "double_plant",EItemCat.decoration),
	rose_bush(175, 4, "double_plant",EItemCat.decoration),
	peony(175, 5, "double_plant",EItemCat.decoration),

	// Items
	iron_spade(256, 0, "iron_shovel", EItemCat.tool),
	iron_pickaxe(257, 0,"iron_pickaxe", EItemCat.tool),
	iron_axe(258, 0, "iron_axe",EItemCat.tool),
	flint_and_steel(259, 0, "flint_and_steel",EItemCat.tool),
	apple(260, 0, "apple", EItemCat.food),
	bow(261,0, "bow", EItemCat.weapon),
	arrow(262, 0, "arrow",EItemCat.weapon),
	coal(263, 0, "coal", EItemCat.materials),
	charcoal(263, 1, "coal", EItemCat.materials),
	diamond(264, 0, "diamond",EItemCat.materials),
	iron_ingot(265, 0, "iron_ingot",EItemCat.materials),
	gold_ingot(266, 0, "gold_ingot",EItemCat.materials),
	iron_sword(267, 0, "iron_sword",EItemCat.weapon),
	wood_sword(268, 0, "wooden_sword",EItemCat.weapon),
	wood_spade(269, 0, "wooden_shovel",EItemCat.tool),
	wood_pickaxe(270, 0, "wooden_pickaxe",EItemCat.tool),
	wood_axe(271, 0, "wooden_axe", EItemCat.tool),
	stone_sword(272, 0, "stone_sword", EItemCat.weapon),
	stone_spade(273, 0,"stone_shovel", EItemCat.tool),
	stone_pickaxe(274, 0,"stone_pickaxe", EItemCat.tool),
	stone_axe(275, 0, "stone_axe",EItemCat.tool),
	diamond_sword(276, 0, "diamond_sword",EItemCat.weapon),
	diamond_spade(277, 0, "diamond_shovel",EItemCat.tool),
	diamond_pickaxe(278, 0, "diamond_pickaxe",EItemCat.tool),
	diamond_axe(279, 0, "diamond_axe",EItemCat.tool),
	stick(280, 0, "stick", EItemCat.materials),
	bowl(281, 0, "bowl", EItemCat.materials),
	mushroom_soup(282, 0,"mushroom_stew", EItemCat.food),
	gold_sword(283, 0,"golden_sword", EItemCat.weapon),
	gold_spade(284, 0,"gold_shovel", EItemCat.tool),
	gold_pickaxe(285, 0,"gold_pickaxe", EItemCat.tool),
	gold_axe(286, 0, "gold_axe",EItemCat.tool),
	string(287, 0, "string", EItemCat.materials),
	feather(288, 0, "feather", EItemCat.materials),
	gunpowder(289, 0,"sulphur", EItemCat.materials),
	wood_hoe(290, 0, "wooden_hoe",EItemCat.tool),
	stone_hoe(291, 0, "stone_hoe", EItemCat.tool),
	iron_hoe(292, 0, "iron_hoe", EItemCat.tool),
	diamond_hoe(293, 0,"diamond_hoe", EItemCat.tool),
	gold_hoe(294, 0, "gold_hoe",EItemCat.tool),
	seeds(295, 0, "seeds", EItemCat.materials),
	wheat(296, 0, "wheat", EItemCat.materials),
	bread(297, 0, "bread",EItemCat.food),
	leather_helmet(298, 0, "leather_helmet",EItemCat.weapon),
	leather_chestplate(299, 0,"leather_chestplate", EItemCat.weapon),
	leather_leggings(300,0, "leather_leggings", EItemCat.weapon),
	leather_boots(301, 0,"leather_boots", EItemCat.weapon),
	chainmail_helmet(302, 0,"chainmail_helmet", EItemCat.weapon),
	chainmail_chestplate(303,0, "chainmail_chestplate", EItemCat.weapon),
	chainmail_leggings(304, 0, "chainmail_leggings", EItemCat.weapon),
	chainmail_boots(305, 0, "chainmail_boots", EItemCat.weapon),
	iron_helmet(306,0, "iron_helmet", EItemCat.weapon),
	iron_chestplate(307, 0,"iron_chestplate", EItemCat.weapon),
	iron_leggings(308, 0,"iron_leggings", EItemCat.weapon),
	iron_boots(309, 0,"iron_boots", EItemCat.weapon),
	diamond_helmet(310, 0,"diamond_helmet", EItemCat.weapon),
	diamond_chestplate(311, 0,"diamond_chestplate", EItemCat.weapon),
	diamond_leggings(312,0, "diamond_leggings", EItemCat.weapon),
	diamond_boots(313, 0,"diamond_boots", EItemCat.weapon),
	gold_helmet(314, 0,"golden_helmet", EItemCat.weapon),
	gold_chestplate(315, 0,"golden_chestplate", EItemCat.weapon),
	gold_leggings(316, 0,"golden_leggings", EItemCat.weapon),
	gold_boots(317, 0,"golden_boots", EItemCat.weapon),
	flint(318, 0, "flint",EItemCat.materials),
	raw_pork(319, 0, "pork", EItemCat.food),
	cooked_pork(320, 0, "cooked_porkchop", EItemCat.food),
	painting(321, 0,"painting", EItemCat.decoration),
	golden_apple_1(322, 0,"golden_apple", EItemCat.food),
	golden_apple_2(322, 1,"golden_apple", EItemCat.food),
	sign(323, 0, "sign",EItemCat.decoration),
	wood_door(324, 0, "wooden_door",EItemCat.redstone),
	bucket(325, 0, "bucket", EItemCat.misc),
	water_bucket(326, 0, "water_bucket", EItemCat.misc),
	lava_bucket(327, 0,"lava_bucket", EItemCat.misc),
	minecart(328, 0, "minecart",EItemCat.transport),
	saddle(329, 0, "saddle",EItemCat.transport),
	iron_door(330, 0, "iron_door",EItemCat.redstone),
	redstone(331, 0, "redstone",EItemCat.redstone),
	snow_ball(332, 0, "snow_ball",EItemCat.misc),
	boat(333, 0, "boat", EItemCat.transport),
	leather(334, 0, "leather", EItemCat.materials),
	milk_bucket(335, 0,"milk_bucket", EItemCat.misc),
	clay_brick(336, 0, "brick",EItemCat.materials),
	clay_ball(337, 0, "clay_ball",EItemCat.materials),
	sugar_cane(338, 0, "sugar_cane",EItemCat.materials),
	paper(339, 0, "paper", EItemCat.misc),
	book(340, 0, "book", EItemCat.misc),
	slime_ball(341, 0,"slime_ball", EItemCat.misc),
	minecart_with_chest(342, 0,"chest_minecart", EItemCat.transport),
	minecart_with_furnace(343, 0, "furnace_minecart", EItemCat.transport),
	egg(344, 0,"egg", EItemCat.materials),
	compass(345, 0, "compass",EItemCat.tool),
	fishing_rod(346, 0, "fishing_rod",EItemCat.tool),
	watch(347, 0, "clock", EItemCat.tool),
	glowstone_dust(348, 0, "glowstone_dust", EItemCat.materials),
	raw_fish(349, 0,"raw_fish", EItemCat.food),
	cooked_fish(350, 0, "cooked_fished",EItemCat.food),
	raw_salmon(349, 1, "raw_fish", EItemCat.food),
	cooked_salmon(350, 1, "cooked_fished", EItemCat.food),
	clownfish(349, 2,"raw_fish", EItemCat.food),
	pufferfish(349, 3, "raw_fish",EItemCat.food),
	ink_sack(351, 0, "dye", EItemCat.materials),
	rose_red(351, 1, "dye", EItemCat.materials),
	cactus_green(351, 2,"dye", EItemCat.materials),
	cocoa_beans(351, 3,"dye", EItemCat.materials),
	lapis_lazuli(351, 4,"dye", EItemCat.materials),
	purple_dye(351, 5, "dye",EItemCat.materials),
	cyan_dye(351, 6, "dye",EItemCat.materials),
	l_gray_dye(351, 7, "dye",EItemCat.materials),
	gray_dye(351, 8, "dye",EItemCat.materials),
	pink_dye(351, 9, "dye",EItemCat.materials),
	l_green_dye(351, 10, "dye",EItemCat.materials),
	dandelion_yellow(351, 11, "dye",EItemCat.materials),
	l_blue_dye(351, 12, "dye",EItemCat.materials),
	magenta_dye(351, 13, "dye",EItemCat.materials),
	orange_dye(351, 14, "dye",EItemCat.materials),
	bone_meal(351, 15, "dye",EItemCat.materials),
	bone(352, 0, "bone", EItemCat.misc),
	sugar(353, 0, "sugar", EItemCat.materials),
	cake(354, 0, "cake",EItemCat.food),
	bed(355, 0, "bed", EItemCat.decoration),
	repeater(356, 0, "repeater", EItemCat.redstone),
	cookie(357, 0, "cookie",EItemCat.food),
	map(358, 0, "filled_map", null),
	shears(359, 0,"shears", EItemCat.tool),
	melon(360, 0, "melon", EItemCat.food),
	pumpkin_seeds(361, 0, "pumpkin_seeds", EItemCat.materials),
	melon_seeds(362,0, "melon_seeds", EItemCat.materials),
	raw_beef(363, 0,"raw_beef", EItemCat.food),
	cooked_beef(364, 0, "cooked_beef",EItemCat.food),
	raw_chicken(365, 0, "raw_chicken",EItemCat.food),
	cooked_chicken(366, 0, "cooked_chicken",EItemCat.food),
	rotten_flesh(367, 0, "rotten_flesh",EItemCat.food),
	ender_pearl(368, 0, "ender_pearl",EItemCat.misc),
	blaze_rod(369, 0, "blaze_rod",EItemCat.materials),
	ghast_tear(370, 0, "ghast_tear",EItemCat.potion),
	gold_nugget(371, 0, "gold_nugget",EItemCat.materials),
	nether_wart(372, 0, "nether_stalk",EItemCat.materials),
	glass_bottle(374, 0, "glass_bottle",EItemCat.potion),
	spider_eye(375, 0, "spider_eye",EItemCat.food),
	fermented_spider_eye(376, 0,"fermented_spider_eye", EItemCat.potion),
	blaze_powder(377, 0,"blaze_powder", EItemCat.potion),
	magma_cream(378, 0,"magma_cream", EItemCat.potion),
	brewing_stand(379, 0,"brewing_stand", EItemCat.potion),
	cauldron(380, 0,"cauldron", EItemCat.potion),
	eye_of_ender(381, 0,"ender_eye", EItemCat.misc),
	speckled_melon(382, 0,"speckled_melon", EItemCat.potion),
	creeper_egg(383, 50,"monster_egg", EItemCat.misc),
	skeleton_egg(383, 51,"monster_egg", EItemCat.misc),
	spider_egg(383, 52,"monster_egg", EItemCat.misc),
	zombie_egg(383, 54,"monster_egg", EItemCat.misc),
	slime_egg(383, 55,"monster_egg", EItemCat.misc),
	ghast_egg(383, 56,"monster_egg", EItemCat.misc),
	zombie_pigman_egg(383, 57,"monster_egg", EItemCat.misc),
	enderman_egg(383, 58,"monster_egg", EItemCat.misc),
	cavespider_egg(383, 59,"monster_egg", EItemCat.misc),
	silverfish_egg(383, 60,"monster_egg", EItemCat.misc),
	blaze_egg(383, 61,"monster_egg", EItemCat.misc),
	magmacube_egg(383, 62,"monster_egg", EItemCat.misc),
	bat_egg(383, 65, "monster_egg",EItemCat.misc),
	witch_egg(383, 66, "monster_egg", EItemCat.misc),
	pig_egg(383, 90, "monster_egg", EItemCat.misc),
	sheep_egg(383, 91,"monster_egg", EItemCat.misc),
	cow_egg(383, 92, "monster_egg",EItemCat.misc),
	chicken_egg(383, 93, "monster_egg",EItemCat.misc),
	squid_egg(383, 94, "monster_egg", EItemCat.misc),
	wolf_egg(383, 95, "monster_egg", EItemCat.misc),
	mooshroom_egg(383, 96,"monster_egg", EItemCat.misc),
	ocelot_egg(383, 98,"monster_egg", EItemCat.misc),
	horse_egg(383, 100,"monster_egg", EItemCat.misc),
	villager_egg(383, 120,"monster_egg", EItemCat.misc),
	bottle_o_enchanting(384, 0,"exp_bottle", EItemCat.misc),
	fireball(385, 0, "fire_charge",EItemCat.misc),
	book_and_quill(386, 0, "writable_book",EItemCat.misc),
	written_book(387, 0, "written_book", null),
	emerald(388, 0, "emerald", EItemCat.materials),
	item_frame(389, 0,"item_frame", EItemCat.decoration),
	flower_pot(390, 0,"flower_pot", EItemCat.decoration),
	carrot(391, 0,"carrot_item", EItemCat.food),
	potato(392, 0, "potato_item",EItemCat.food),
	baked_potato(393, 0, "baked_potato",EItemCat.food),
	poisonous_potato(394, 0, "poisonous_potato",EItemCat.food),
	empty_map(395, 0, "map", EItemCat.misc),
	golden_carrot(396, 0, "golden_carrot", EItemCat.food),
	skeleton_skull(397, 0,"skull_item", EItemCat.decoration),
	wither_skeleton_skull(397,1, "skull_item", EItemCat.decoration),
	zombie_skull(397, 2,"skull_item", EItemCat.decoration),
	human_skull(397, 3,"skull_item", EItemCat.decoration),
	creeper_skull(397, 4,"skull_item", EItemCat.decoration),
	carrot_on_a_stick(398, 0,"carrot_on_a_stick", EItemCat.transport),
	nether_star(399, 0,"nether_star", EItemCat.materials),
	pumpkin_pie(400, 0,"pumpkin_pie", EItemCat.food),
	firework(401, 0, "fireworks",null),
	firework_star(402, 0, "firework_charge", EItemCat.misc),
	enchanted_book(403, 0, "enchanted_book", EItemCat.misc),
	redstone_comparator(404, 0, "comparator", EItemCat.redstone),
	nether_brick(405, 0, "netherbrick", EItemCat.materials),
	quartz(406,0, "quartz", EItemCat.materials),
	minecart_with_tnt(407, 0,"tnt_minecart", EItemCat.transport),
	minecart_with_hopper(408, 0, "hopper_minecart", EItemCat.transport),
	iron_barding(417, 0, "iron_barding", EItemCat.misc),
	gold_barding(418, 0,"gold_barding", EItemCat.misc),
	diamond_barding(419, 0,"diamond_barding", EItemCat.misc),
	leash(420, 0, "lead",EItemCat.tool),
	name_tag(421, 0, "name_tag", EItemCat.tool),
	minecart_with_command_block(422, 0, "command_block_minecart", null),
	_13_disc(2256, 0,"gold_record", EItemCat.misc),
	cat_disc(2257, 0,"green_record", EItemCat.misc),
	blocks_disc(2258, 0,"record_3", EItemCat.misc),
	chirp_disc(2259, 0, "record_4",EItemCat.misc),
	far_disc(2260, 0, "record_5", EItemCat.misc),
	mall_disc(2261, 0, "record_6", EItemCat.misc),
	mellohi_disc(2262, 0,"record_7", EItemCat.misc),
	stal_disc(2263, 0, "record_8",EItemCat.misc),
	strad_disc(2264, 0, "record_9", EItemCat.misc),
	ward_disc(2265, 0, "record_10", EItemCat.misc),
	_11_disc(2266, 0,"record_11", EItemCat.misc),
	wait_disc(2267, 0, "record_12",EItemCat.misc),

	// Potions
	p_waterB(373, 0, "potion", EItemCat.potion),
	p_mundane(373, 8192,"POTION", EItemCat.potion),
	p_mundane_ext(373, 64, "POTION",EItemCat.potion),
	p_awkward(373, 16, "POTION", EItemCat.potion),
	p_thick(373, 32, "POTION", EItemCat.potion),

	p_regeneration(373, 8193, "potion", EItemCat.potion),
	p_regeneration_ext(373, 8257, "potion", EItemCat.potion),
	p_regeneration_II(373,8225, "potion", EItemCat.potion),
	p_swiftness(373, 8194,"potion", EItemCat.potion),
	p_swiftness_ext(373, 8258,"potion", EItemCat.potion),
	p_swiftness_II(373, 8226, "potion",EItemCat.potion),
	p_fire_resistance(373, 8195, "potion",EItemCat.potion),
	p_fire_resistance_ext(373, 8259, "potion",EItemCat.potion),
	p_healing(373, 8197, "potion",EItemCat.potion),
	p_healing_II(373, 8229, "potion",EItemCat.potion),
	p_night_vision(373, 8198, "potion",EItemCat.potion),
	p_night_vision_ext(373, 8262, "potion",EItemCat.potion),
	p_strength(373, 8201, "potion",EItemCat.potion),
	p_strength_ext(373, 8265, "potion",EItemCat.potion),
	p_strength_II(373, 8233, "potion",EItemCat.potion),
	p_invisibility(373, 8206, "potion",EItemCat.potion),
	p_invisibility_ext(373, 8270, "potion",EItemCat.potion),
	p_water_breathing(373, 8237, "potion",EItemCat.potion),
	p_water_breathing_ext(373, 8269, "potion",EItemCat.potion),
	p_poison(373, 8196, "potion", EItemCat.potion),
	p_poison_ext(373, 8260, "potion", EItemCat.potion),
	p_poison_II(373, 8228,"potion", EItemCat.potion),
	p_weakness(373, 8200, "potion",EItemCat.potion),
	p_weakness_ext(373, 8264, "potion",EItemCat.potion),
	p_slowness(373, 8202, "potion",EItemCat.potion),
	p_slowness_ext(373, 8266, "potion",EItemCat.potion),
	p_harming(373, 8204, "potion",EItemCat.potion),
	p_harming_II(373, 8236, "potion",EItemCat.potion),

	// Splash potions
	s_p_mundane(373, 16384, "potion", EItemCat.potion),

	s_p_regeneration(373, 16385, "potion", EItemCat.potion),

	s_p_regeneration_ext(373, 16449, "potion", EItemCat.potion),

	s_p_regeneration_II(373, 16417, "potion", EItemCat.potion),
	s_p_swiftness(373,16386, "potion", EItemCat.potion),
	s_p_swiftness_ext(373,16450, "potion", EItemCat.potion),
	s_p_swiftness_II(373, 16418,"potion", EItemCat.potion),
	s_p_fire_resistance(373, 16387,"potion", EItemCat.potion),
	s_p_fire_resistance_ext(373, 16451,"potion", EItemCat.potion),
	s_p_healing(373, 16389, "potion",EItemCat.potion),
	s_p_healing_II(373, 16421, "potion",EItemCat.potion),
	s_p_night_vision(373, 16390, "potion",EItemCat.potion),
	s_p_night_vision_ext(373, 16454, "potion",EItemCat.potion),
	s_p_strength(373, 16393, "potion",EItemCat.potion),
	s_p_strength_ext(373, 16457, "potion",EItemCat.potion),
	s_p_strength_II(373, 16425, "potion",EItemCat.potion),
	s_p_invisibility(373, 16398, "potion",EItemCat.potion),
	s_p_invisibility_ext(373, 16462, "potion",EItemCat.potion),
	s_p_water_breathing(373, 16429, "potion",EItemCat.potion),
	s_p_water_breathing_ext(373, 16461, "potion",EItemCat.potion),
	s_p_poison(373, 16388, "potion",EItemCat.potion),
	s_p_poison_ext(373, 16452, "potion",EItemCat.potion),
	s_p_poison_II(373, 16420, "potion",EItemCat.potion),
	s_p_weakness(373, 16392, "potion",EItemCat.potion),
	s_p_weakness_ext(373, 16456, "potion",EItemCat.potion),
	s_p_slowness(373, 16394, "potion",EItemCat.potion),
	s_p_slowness_ext(373, 16458, "potion",EItemCat.potion),
	s_p_harming(373, 16396, "potion",EItemCat.potion),
	s_p_harming_II(373, 16428, "potion",EItemCat.potion),
	;

	private int id;
	private int meta;
	private String realname;
	private EItemCat category;
	private Image image = null;

	private EItem(int id, int meta, String realname, EItemCat category) {
		this.id = id;
		this.meta = meta;
		this.realname = realname;
		this.category = category;

		String dossier;
		if (id < 256) {
			dossier = "blocks";
		} else if (id == 373) {
			dossier = "potions";
		} else {
			dossier = "items";
		}
		StringBuffer imagepath = new StringBuffer("gui/eitems/" + dossier
				+ "/" + id + "_");
		if (name().startsWith("s_p_")) {
			imagepath.append("s_" + name().substring(4).split("[_]")[0]);
		} else if (name().startsWith("p_")) {
			imagepath.append(name().substring(2).split("[_]")[0]);
		} else {
			imagepath.append(meta);
		}
		imagepath.append(".png");
		if (this.id != 0)
			this.image = new ImageIcon(getClass().getClassLoader()
					.getResource(imagepath.toString())).getImage();
	}

	public int getId() {
		return id;
	}

	public int getMeta() {
		return meta;
	}

	/**
	 * Renvoie le nom minecraft
	 *
	 * @return
	 */
	public String getRealName() {
		return realname.toLowerCase();
	}

	public EItemCat getCategory() {
		return category;
	}

	public Image getImage() {
		return image;
	}

	/**
	 * Renvoie le nom correctement formaté pour l'affichage
	 *
	 * @return le nom correctement formaté pour l'affichage
	 * @deprecated ne faisait le formatage que pour un nom anglais, inutile
	 *             depuis la localisation du logiciel, mais conservé pour la
	 *             technique
	 */
	@Deprecated
	public String getName() {
		String name = name();
		if (name.endsWith("glass") || name.endsWith("stained_hardened_clay")
				|| name.endsWith("carpet") || name.endsWith("dye")) {
			name = name.replaceFirst("^l_", "light_");
		}
		if (name.startsWith("p_")) {
			name = name.replaceFirst("^p", "potion_of");
		}
		if (name.startsWith("s_p_")) {
			name = name.replaceFirst("^s_p", "splash_potion_of");
		}

		// Pour les potions
		name = name.replaceFirst("_ext", "_extended");

		name = name.replace('_', ' ').trim();
		String first = "" + name.charAt(0);
		name = name.replaceFirst("^[a-z]", first.toUpperCase());

		return name;
	}

	/**
	 * Renvoie le nom correctement formaté pour l'affichage
	 *
	 * @return le nom correctement formaté pour l'affichage
	 */
	public String getGuiName() {
		return EnumName.getString("EItem." + id + "." + meta);
	}

	public String toString() {
		return name() + "(" + id + "," + meta + "," + getRealName() + ","
				+ category + ")";
	}

	/**
	 * Permet de faire une recherche des items par une des catégories
	 * définies dans {@link EItemCat}
	 *
	 * @param category
	 * @return une liste des items recherchés
	 */
	public static ArrayList<EItem> getByCategory(EItemCat category) {
		EItem[] values = values();
		ArrayList<EItem> items = new ArrayList<EItem>();

		for (int i = 0; i < values.length; i++) {
			EItem item = values[i];
			if (item.getCategory() == category) {
				items.add(item);
			}

		}

		return items;
	}

	private static EItem getByNameFirst(String name) {

		if (name != null) {
			EItem[] values = values();
			int i = 0;
			while (i < values.length
					&& !values[i].getRealName().equalsIgnoreCase(name)) {
				i++;
			}
			if (i < values.length) {
				return values[i];
			} else {
				return null;
			}
		} else {
			return null;
		}

	}

	private static EItem getByIdFirst(int id) {

		if (id != 0) {
			EItem[] values = values();
			int i = 0;
			while (i < values.length && values[i].getId() != id) {
				i++;
			}
			if (i < values.length) {
				return values[i];
			} else {
				return null;
			}
		} else {
			return null;
		}

	}

	/**
	 * Cherche un objet par son nom Minecraft et sa méta-donnée
	 *
	 * @param name
	 * @param meta
	 * @return l'EItem s'il existe, {@code null} sinon
	 */
	public static EItem searchBy(String name, int meta) {
		ArrayList<EItem> values = new ArrayList<EItem>(
				Arrays.asList(values()));

		EItem item = EItem.getByNameFirst(name);
		if (item != null) {
			int i = 0;
			while (item.getMeta() != meta && item.getRealName().equals(name) && i != values.size()) {
				i = values.indexOf(item) + 1;
				if (i != values.size())
					item = values.get(i);
			}
			if (item.getMeta() == meta)
				return item;
			else
				return null;
		} else {
			return null;
		}

	}

	/**
	 * Cherche un objet par son id et sa méta-donnée
	 *
	 * @param id
	 * @param meta
	 * @return l'EItem s'il existe, {@code null} sinon
	 */
	public static EItem searchBy(int id, int meta) {
		ArrayList<EItem> values = new ArrayList<EItem>(
				Arrays.asList(values()));

		EItem item = EItem.getByIdFirst(id);
		if (item != null) {
			while (item.getMeta() != meta) {
				item = values.get(values.indexOf(item) + 1);
			}
			return item;
		} else {
			return null;
		}

	}

	/**
	 * Renvoie la liste de tous les items dont le nom "ressemble" à celui
	 * passé en paramètre
	 *
	 * @param name
	 *            la chaine de comparaison, peut être renvoyée par
	 *            {@link EItem#getGuiName()}
	 * @return la liste des EItem correspondant au nom Minecraft passé en
	 *         paramètre
	 */
	public static ArrayList<EItem> searchBy(String name) {
		ArrayList<EItem> ret = new ArrayList<>();
		EItem[] values = values();

		if (name != null) {
			for (int i = 1; i < values.length; i++) {
				if (values[i].getGuiName().toLowerCase()
						.contains(name.toLowerCase())) {
					ret.add(values[i]);
				}
			}
		}
		return ret;
	}

	public static EItem strictSearchBy(String name, boolean strict) {

		ArrayList<EItem> searches = searchBy(name);
		int i = 0;
		if (searches.size() != 0) {
			while (i < searches.size()) {
				if (strict) {
					if (searches.get(i).getGuiName().equals(name))
						break;
				} else if (searches.get(i).getGuiName()
						.equalsIgnoreCase(name))
					break;
				i++;
			}
			if (i < searches.size())
				return searches.get(i);
			else
				return null;
		} else
			return null;
	}
}
