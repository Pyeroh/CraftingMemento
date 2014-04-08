package model.enums;

public enum EItemInfo {

	// Blocks
	stone(StackSize.S64, Version.Classic009a, false, false, true, true),

	// TODO attendre 1.8 pour nouveaux blocs

	grass(StackSize.S64, Version.Classic009a, false, false, false, false),
	dirt(StackSize.S64, Version.Classic009a, false, false, false, false),
	grassless_dirt(StackSize.S64, Version.Classic009a, false, false, false, false),
	podzol(StackSize.S64, Version.Classic009a, false, false, false, false),
	cobblestone(StackSize.S64, Version.Classic009a, false, false, true, true),
	oak_wood(StackSize.S64, Version.Classic009a, false, true, true, false),
	spruce_wood(StackSize.S64, Version.Release125, false, true, true, false),
	birch_wood(StackSize.S64, Version.Release125, false, true, true, false),
	jungle_wood(StackSize.S64, Version.Release125, false, true, true, false),
	acacia_wood(StackSize.S64, Version.Release17, false, true, true, false),
	darkoak_wood(StackSize.S64, Version.Release17, false, true, true, false),
	oak_sapling(StackSize.S64, Version.Classic009a, true, true, true, false),
	spruce_sapling(StackSize.S64, Version.Beta15, true, true, true, false),
	birch_sapling(StackSize.S64, Version.Beta15, true, true, true, false),
	jungle_sapling(StackSize.S64, Version.Release125, true, true, true, false),
	acacia_sapling(StackSize.S64, Version.Release17, true, true, true, false),
	darkoak_sapling(StackSize.S64, Version.Release17, true, true, true, false),
	sand(StackSize.S64, Version.Classic0014a, false, false, false, true),
	redsand(StackSize.S64, Version.Release17, false, false, false, true),
	gravel(StackSize.S64, Version.Classic0014a, false, false, false, false),
	gold_ore(StackSize.S64, Version.Classic0014a, false, false, false, true),
	iron_ore(StackSize.S64, Version.Classic0014a, false, false, false, true),
	coal_ore(StackSize.S64, Version.Classic0014a, false, false, false, true),
	oak_log(StackSize.S64, Version.Classic0014a, false, true, true, true),
	spruce_log(StackSize.S64, Version.Beta12, false, true, true, true),
	birch_log(StackSize.S64, Version.Beta12, false, true, true, true),
	jungle_log(StackSize.S64, Version.Release125, false, true, true, true),
	acacia_log(StackSize.S64, Version.Release17, false, true, true, true),
	darkoak_log(StackSize.S64, Version.Release17, false, true, true, true),
	oak_leaves(StackSize.S64, Version.Classic0014a, true, false, true, false),
	spruce_leaves(StackSize.S64, Version.Release125, true, false, true, false),
	birch_leaves(StackSize.S64, Version.Release125, true, false, true, false),
	jungle_leaves(StackSize.S64, Version.Release125, true, false, true, false),
	acacia_leaves(StackSize.S64, Version.Release17, true, false, true, false),
	darkoak_leaves(StackSize.S64, Version.Release17, true, false, true, false),
	glass(StackSize.S64, Version.Classic0018a, true, false, true, false),
	lapis_ore(StackSize.S64, Version.Beta12, false, false, false, true),
	lapis_block(StackSize.S64, Version.Beta12, false, false, false, false),
	dispenser(StackSize.S64, Version.Beta12, false, false, true, false),
	sandstone(StackSize.S64, Version.Beta12, false, false, false, false),
	chiseled_sandstone(StackSize.S64, Version.Release125, false, false, false, false),
	smooth_sandstone(StackSize.S64, Version.Release125, false, false, false, false),
	note_block(StackSize.S64, Version.Beta12, false, true, true, false),
	powered_rail(StackSize.S64, Version.Beta15, true, false, true, false),
	detector_rail(StackSize.S64, Version.Beta15, true, false, true, false),
	sticky_piston(StackSize.S64, Version.Beta17, true, false, true, false),
	cobweb(StackSize.S64, Version.Beta15, true, false, false, false),
	long_grass(StackSize.S64, Version.Beta16, true, false, true, false),
	fern(StackSize.S64, Version.Beta16, true, false, true, false),
	dead_bush(StackSize.S64, Version.Beta16, true, false, false, false),
	piston(StackSize.S64, Version.Beta17, true, false, true, false),
	white_wool(StackSize.S64, Version.Classic020, false, false, true, false),
	orange_wool(StackSize.S64, Version.Classic020, false, false, true, false),
	magenta_wool(StackSize.S64, Version.Classic020, false, false, true, false),
	l_blue_wool(StackSize.S64, Version.Classic020, false, false, true, false),
	yellow_wool(StackSize.S64, Version.Classic020, false, false, true, false),
	l_green_wool(StackSize.S64, Version.Classic020, false, false, true, false),
	pink_wool(StackSize.S64, Version.Classic020, false, false, true, false),
	gray_wool(StackSize.S64, Version.Classic020, false, false, true, false),
	l_gray_wool(StackSize.S64, Version.Classic020, false, false, true, false),
	cyan_wool(StackSize.S64, Version.Classic020, false, false, true, false),
	purple_wool(StackSize.S64, Version.Classic020, false, false, true, false),
	blue_wool(StackSize.S64, Version.Classic020, false, false, true, false),
	brown_wool(StackSize.S64, Version.Classic020, false, false, true, false),
	green_wool(StackSize.S64, Version.Classic020, false, false, true, false),
	red_wool(StackSize.S64, Version.Classic020, false, false, true, false),
	black_wool(StackSize.S64, Version.Classic020, false, false, true, false),
	yellow_flower(StackSize.S64, Version.Classic020, true, false, true, true),
	poppy(StackSize.S64, Version.Classic020, true, false, true, true),
	blue_orchid(StackSize.S64, Version.Release17, true, false, true, true),
	allium(StackSize.S64, Version.Release17, true, false, true, true),
	azure_bluet(StackSize.S64, Version.Release17, true, false, true, true),
	red_tulip(StackSize.S64, Version.Release17, true, false, true, true),
	orange_tulipe(StackSize.S64, Version.Release17, true, false, true, true),
	white_tulip(StackSize.S64, Version.Release17, true, false, true, true),
	pink_tulip(StackSize.S64, Version.Release17, true, false, true, true),
	oxeye_daisy(StackSize.S64, Version.Release17, true, false, true, true),
	brown_mushroom(StackSize.S64, Version.Classic020, true, false, true, true),
	red_mushroom(StackSize.S64, Version.Classic020, true, false, true, true),
	gold_block(StackSize.S64, Version.Classic020, false, false, false, false),
	iron_block(StackSize.S64, Version.Classic026, false, false, false, false),
	stone_slab(StackSize.S64, Version.Classic026, true, false, true, false),
	sandstone_slab(StackSize.S64, Version.Beta13, true, false, false, false),
	cobble_slab(StackSize.S64, Version.Beta13, true, false, true, false),
	brick_slab(StackSize.S64, Version.Beta18, true, false, false, false),
	stonebrick_slab(StackSize.S64, Version.Beta18, true, false, true, false),
	netherbrick_slab(StackSize.S64, Version.Release146, true, false, false, false),
	quartz_slab(StackSize.S64, Version.Release15, true, false, false, false),
	brick(StackSize.S64, Version.Classic026, false, false, false, false),
	tnt(StackSize.S64, Version.Classic026, false, false, false, false),
	bookshelf(StackSize.S64, Version.Classic026, false, true, true, false),
	// TODO pour 1.8 : mossy_cobblestone(StackSize.S64, Version.Classic026, false, false, true, false),
	mossy_cobblestone(StackSize.S64, Version.Classic026, false, false, false, false),
	obsidian(StackSize.S64, Version.Classic026, false, false, true, true),
	torch(StackSize.S64, Version.Indev031, true, false, true, false),
	fire(StackSize.S64, Version.Indev031, true, false, true, true),
	wood_stairs(StackSize.S64, Version.Alpha100, true, true, true, false),
	chest(StackSize.S64, Version.Indev031, true, true, true, false),
	diamond_ore(StackSize.S64, Version.Indev031, false, false, false, true),
	diamond_block(StackSize.S64, Version.Indev031, false, false, false, false),
	workbench(StackSize.S64, Version.Indev031, false, true, true, false),
	furnace(StackSize.S64, Version.Indev, false, false, true, false),
	ladder(StackSize.S64, Version.Infdev, true, true, true, false),
	rails(StackSize.S64, Version.Infdev, true, false, true, false),
	cobblestone_stairs(StackSize.S64, Version.Alpha100, true, false, true, false),
	lever(StackSize.S64, Version.Alpha101, true, false, true, false),
	stone_plate(StackSize.S64, Version.Alpha101, true, false, true, false),
	wood_plate(StackSize.S64, Version.Alpha101, true, true, true, false),
	redstone_ore(StackSize.S64, Version.Alpha101, false, false, false, true),
	redstone_torch_on(StackSize.S64, Version.Alpha101, true, false, true, false),
	stone_button(StackSize.S64, Version.Alpha101, true, false, true, false),
	snow(StackSize.S64, Version.Alpha104, true, false, true, false),
	ice(StackSize.S64, Version.Alpha104, true, false, true, false),
	snow_block(StackSize.S64, Version.Alpha105, false, false, true, false),
	cactus(StackSize.S64, Version.Alpha106, true, false, true, true),
	clay(StackSize.S64, Version.Alpha1011, false, false, false, false),
	jukebox(StackSize.S64, Version.Alpha1014, false, true, false, false),
	fence(StackSize.S64, Version.Alpha1017, true, true, true, false),
	pumpkin(StackSize.S64, Version.Alpha120, true, false, true, true),
	netherrack(StackSize.S64, Version.Alpha120, false, false, false, true),
	soul_sand(StackSize.S64, Version.Alpha120, false, false, false, false),
	glowstone(StackSize.S64, Version.Alpha120, true, false, true, false),
	jack_o_lantern(StackSize.S64, Version.Alpha120, true, false, true, false),
	white_glass(StackSize.S64, Version.Release17, true, false, true, false),
	orange_glass(StackSize.S64, Version.Release17, true, false, true, false),
	magenta_glass(StackSize.S64, Version.Release17, true, false, true, false),
	l_blue_glass(StackSize.S64, Version.Release17, true, false, true, false),
	yellow_glass(StackSize.S64, Version.Release17, true, false, true, false),
	l_green_glass(StackSize.S64, Version.Release17, true, false, true, false),
	pink_glass(StackSize.S64, Version.Release17, true, false, true, false),
	gray_glass(StackSize.S64, Version.Release17, true, false, true, false),
	l_gray_glass(StackSize.S64, Version.Release17, true, false, true, false),
	cyan_glass(StackSize.S64, Version.Release17, true, false, true, false),
	purple_glass(StackSize.S64, Version.Release17, true, false, true, false),
	blue_glass(StackSize.S64, Version.Release17, true, false, true, false),
	brown_glass(StackSize.S64, Version.Release17, true, false, true, false),
	green_glass(StackSize.S64, Version.Release17, true, false, true, false),
	red_glass(StackSize.S64, Version.Release17, true, false, true, false),
	black_glass(StackSize.S64, Version.Release17, true, false, true, false),
	trap_door(StackSize.S64, Version.Beta16, true, true, true, false),
	smooth_brick(StackSize.S64, Version.Beta18, false, false, true, false),
	// TODO pour 1.8 : mossy_smooth_brick(StackSize.S64, Version.Beta18, false, false, true, false),
	mossy_smooth_brick(StackSize.S64, Version.Beta18, false, false, false, false),
	cracked_smooth_brick(StackSize.S64, Version.Beta18, false, false, false, false),
	// TODO pour 1.8 : chiseled_smooth_brick(StackSize.S64, Version.Release125, false, false, true, false),
	chiseled_smooth_brick(StackSize.S64, Version.Release125, false, false, false, false),
	brown_mushroom_block(StackSize.S64, Version.Beta18, false, true, true, false),
	red_mushroom_block(StackSize.S64, Version.Beta18, false, true, true, false),
	iron_bars(StackSize.S64, Version.Beta18, true, false, true, false),
	glass_pane(StackSize.S64, Version.Beta18, true, false, true, false),
	melon_block(StackSize.S64, Version.Beta18, true, false, true, false),
	vine(StackSize.S64, Version.Beta18, true, false, true, true),
	fence_gate(StackSize.S64, Version.Beta18, true, true, true, false),
	brick_stairs(StackSize.S64, Version.Beta18, true, false, false, false),
	smooth_stairs(StackSize.S64, Version.Beta18, true, false, false, false),
	mycelium(StackSize.S64, Version.Beta19PR1, false, false, false, false),
	lilypad(StackSize.S64, Version.Beta19PR1, true, false, true, false),
	nether_brick_block(StackSize.S64, Version.Beta19PR1, false, false, false, false),
	nether_fence(StackSize.S64, Version.Beta19PR1, true, false, false, false),
	nether_brick_stairs(StackSize.S64, Version.Beta19PR1, true, false, false, false),
	enchantment_table(StackSize.S64, Version.Beta19PR3, true, false, false, false),
	ender_stone(StackSize.S64, Version.Beta19PR3, false, false, false, false),
	dragon_egg(StackSize.S64, Version.Beta19PR6, true, false, false, false),
	redstone_lamp_off(StackSize.S64, Version.Release125, true, false, true, false),
	oakwood_slab(StackSize.S64, Version.Beta13, true, true, true, false),
	sprucewood_slab(StackSize.S64, Version.Release13, true, true, true, false),
	birchwood_slab(StackSize.S64, Version.Release13, true, true, true, false),
	junglewood_slab(StackSize.S64, Version.Release13, true, true, true, false),
	acacia_slab(StackSize.S64, Version.Release17, true, true, true, false),
	darkoak_slab(StackSize.S64, Version.Release17, true, true, true, false),
	sandstone_stairs(StackSize.S64, Version.Beta13, true, false, false, false),
	emerald_ore(StackSize.S64, Version.Release13, false, false, false, true),
	ender_chest(StackSize.S64, Version.Release13, true, false, true, false),
	tripwire_hook(StackSize.S64, Version.Release13, true, false, true, false),
	emerald_block(StackSize.S64, Version.Release13, false, false, false, false),
	spruce_wood_stairs(StackSize.S64, Version.Release13, true, true, true, false),
	birch_wood_stairs(StackSize.S64, Version.Release13, true, true, true, false),
	jungle_wood_stairs(StackSize.S64, Version.Release13, true, true, true, false),
	beacon(StackSize.S64, Version.Release14, true, false, false, false),
	cobble_wall(StackSize.S64, Version.Release14, true, false, true, false),
	// TODO pour 1.8 : mossy_cobble_wall(StackSize.S64, Version.Release14, true, false, true, false),
	mossy_cobble_wall(StackSize.S64, Version.Release14, true, false, false, false),
	wood_button(StackSize.S64, Version.Release14, true, false, true, false),
	anvil(StackSize.S64, Version.Release14, true, false, true, false),
	trapped_chest(StackSize.S64, Version.Release15, true, true, true, false),
	gold_plate(StackSize.S64, Version.Release15, true, false, true, false),
	iron_plate(StackSize.S64, Version.Release15, true, false, true, false),
	daylight_detector(StackSize.S64, Version.Release15, true, true, false, false),
	redstone_block(StackSize.S64, Version.Release15, false, false, false, false),
	quartz_ore(StackSize.S64, Version.Release15, false, false, false, true),
	hopper(StackSize.S64, Version.Release15, true, false, true, false),
	quartz_block(StackSize.S64, Version.Release15, false, false, false, false),
	chiseled_quartz_block(StackSize.S64, Version.Release15, false, false, false, false),
	pillar_quartz_block(StackSize.S64, Version.Release15, false, false, false, false),
	quartz_stairs(StackSize.S64, Version.Release15, true, false, false, false),
	activator_rail(StackSize.S64, Version.Release15, true, false, true, false),
	dropper(StackSize.S64, Version.Release15, false, false, true, false),
	white_stained_clay(StackSize.S64, Version.Release16, false, false, false, false),
	orange_stained_clay(StackSize.S64, Version.Release16, false, false, false, false),
	magenta_stained_clay(StackSize.S64, Version.Release16, false, false, false, false),
	l_blue_stained_clay(StackSize.S64, Version.Release16, false, false, false, false),
	yellow_stained_clay(StackSize.S64, Version.Release16, false, false, false, false),
	l_green_stained_clay(StackSize.S64, Version.Release16, false, false, false, false),
	pink_stained_clay(StackSize.S64, Version.Release16, false, false, false, false),
	gray_stained_clay(StackSize.S64, Version.Release16, false, false, false, false),
	l_gray_stained_clay(StackSize.S64, Version.Release16, false, false, false, false),
	cyan_stained_clay(StackSize.S64, Version.Release16, false, false, false, false),
	purple_stained_clay(StackSize.S64, Version.Release16, false, false, false, false),
	blue_stained_clay(StackSize.S64, Version.Release16, false, false, false, false),
	brown_stained_clay(StackSize.S64, Version.Release16, false, false, false, false),
	green_stained_clay(StackSize.S64, Version.Release16, false, false, false, false),
	red_stained_clay(StackSize.S64, Version.Release16, false, false, false, false),
	black_stained_clay(StackSize.S64, Version.Release16, false, false, false, false),
	white_glass_pane(StackSize.S64, Version.Release17, true, false, true, false),
	orange_glass_pane(StackSize.S64, Version.Release17, true, false, true, false),
	magenta_glass_pane(StackSize.S64, Version.Release17, true, false, true, false),
	l_blue_glass_pane(StackSize.S64, Version.Release17, true, false, true, false),
	yellow_glass_pane(StackSize.S64, Version.Release17, true, false, true, false),
	l_green_glass_pane(StackSize.S64, Version.Release17, true, false, true, false),
	pink_glass_pane(StackSize.S64, Version.Release17, true, false, true, false),
	gray_glass_pane(StackSize.S64, Version.Release17, true, false, true, false),
	l_gray_glass_pane(StackSize.S64, Version.Release17, true, false, true, false),
	cyan_glass_pane(StackSize.S64, Version.Release17, true, false, true, false),
	purple_glass_pane(StackSize.S64, Version.Release17, true, false, true, false),
	blue_glass_pane(StackSize.S64, Version.Release17, true, false, true, false),
	brown_glass_pane(StackSize.S64, Version.Release17, true, false, true, false),
	green_glass_pane(StackSize.S64, Version.Release17, true, false, true, false),
	red_glass_pane(StackSize.S64, Version.Release17, true, false, true, false),
	black_glass_pane(StackSize.S64, Version.Release17, true, false, true, false),
	acacia_stairs(StackSize.S64, Version.Release17, true, true, true, false),
	darkoak_stairs(StackSize.S64, Version.Release17, true, true, true, false),
	hay_block(StackSize.S64, Version.Release16, false, false, true, false),
	white_carpet(StackSize.S64, Version.Release16, true, false, true, false),
	orange_carpet(StackSize.S64, Version.Release16, true, false, true, false),
	magenta_carpet(StackSize.S64, Version.Release16, true, false, true, false),
	l_blue_carpet(StackSize.S64, Version.Release16, true, false, true, false),
	yellow_carpet(StackSize.S64, Version.Release16, true, false, true, false),
	l_green_carpet(StackSize.S64, Version.Release16, true, false, true, false),
	pink_carpet(StackSize.S64, Version.Release16, true, false, true, false),
	gray_carpet(StackSize.S64, Version.Release16, true, false, true, false),
	l_gray_carpet(StackSize.S64, Version.Release16, true, false, true, false),
	cyan_carpet(StackSize.S64, Version.Release16, true, false, true, false),
	purple_carpet(StackSize.S64, Version.Release16, true, false, true, false),
	blue_carpet(StackSize.S64, Version.Release16, true, false, true, false),
	brown_carpet(StackSize.S64, Version.Release16, true, false, true, false),
	green_carpet(StackSize.S64, Version.Release16, true, false, true, false),
	red_carpet(StackSize.S64, Version.Release16, true, false, true, false),
	black_carpet(StackSize.S64, Version.Release16, true, false, true, false),
	hardened_clay(StackSize.S64, Version.Release16, false, false, false, false),
	coal_block(StackSize.S64, Version.Release16, false, true, true, false),
	packed_ice(StackSize.S64, Version.Release17, false, false, false, false),
	sunflower(StackSize.S64, Version.Release17, true, false, true, true),
	lilac(StackSize.S64, Version.Release17, true, false, true, true),
	rose_bush(StackSize.S64, Version.Release17, true, false, true, true),
	peony(StackSize.S64, Version.Release17, true, false, true, true),

	// Items
	iron_spade(StackSize.S1, Version.Indev031, false, true, false),
	iron_pickaxe(StackSize.S1, Version.Indev031, false, true, false),
	iron_axe(StackSize.S1, Version.Indev031, false, true, false),
	flint_and_steel(StackSize.S1, Version.Indev, false, false, false),
	apple(StackSize.S64, Version.Indev031, false, true, true),
	bow(StackSize.S1, Version.Indev031, false, true, false),
	arrow(StackSize.S64, Version.Classic024, false, true, false),
	coal(StackSize.S64, Version.Indev031, true, true, true),
	charcoal(StackSize.S64, Version.Indev031, true, true, true),
	diamond(StackSize.S64, Version.Indev031, false, false, true),
	iron_ingot(StackSize.S64, Version.Indev031, false, true, true),
	gold_ingot(StackSize.S64, Version.Classic0014a, false, true, true),
	iron_sword(StackSize.S1, Version.Indev, false, true, false),
	wood_sword(StackSize.S1, Version.Indev, true, true, false),
	wood_spade(StackSize.S1, Version.Indev031, true, true, false),
	wood_pickaxe(StackSize.S1, Version.Indev031, true, true, false),
	wood_axe(StackSize.S1, Version.Indev031, true, true, false),
	stone_sword(StackSize.S1, Version.Indev, false, true, false),
	stone_spade(StackSize.S1, Version.Indev031, false, true, false),
	stone_pickaxe(StackSize.S1, Version.Indev031, false, true, false),
	stone_axe(StackSize.S1, Version.Indev031, false, true, false),
	diamond_sword(StackSize.S1, Version.Indev, false, false, false),
	diamond_spade(StackSize.S1, Version.Indev031,false, false, false ),
	diamond_pickaxe(StackSize.S1, Version.Indev031, false, false, false),
	diamond_axe(StackSize.S1, Version.Indev031, false, false, false),
	stick(StackSize.S64, Version.Indev031, true, true, false),
	bowl(StackSize.S64, Version.Indev031, false, true, false),
	mushroom_soup(StackSize.S1, Version.Indev031, false, true, false),
	gold_sword(StackSize.S1, Version.Indev, false, true, false),
	gold_spade(StackSize.S1, Version.Indev031, false, true, false),
	gold_pickaxe(StackSize.S1, Version.Indev031, false, true, false),
	gold_axe(StackSize.S1, Version.Indev031, false, true, false),
	string(StackSize.S64, Version.Indev, false, true, true),
	feather(StackSize.S64, Version.Indev, false, true, true),
	gunpowder(StackSize.S64, Version.Indev, false, true, true),
	wood_hoe(StackSize.S1, Version.Indev031, true, true, false),
	stone_hoe(StackSize.S1, Version.Indev031, false, true, false),
	iron_hoe(StackSize.S1, Version.Indev031, false, true, false),
	diamond_hoe(StackSize.S1, Version.Indev031, false, false, false),
	gold_hoe(StackSize.S1, Version.Indev031, false, true, false),
	seeds(StackSize.S64, Version.Indev, false, true, false),
	wheat(StackSize.S64, Version.Indev, false, true, true),
	bread(StackSize.S64, Version.Indev, false, true, false),
	leather_helmet(StackSize.S1, Version.Alpha108, false, true, false),
	leather_chestplate(StackSize.S1, Version.Alpha108, false, true, false),
	leather_leggings(StackSize.S1, Version.Alpha108, false, true, false),
	leather_boots(StackSize.S1, Version.Alpha108, false, true, false),
	chainmail_helmet(StackSize.S1, Version.Alpha108, false, false, false),
	chainmail_chestplate(StackSize.S1, Version.Alpha108, false, false, false),
	chainmail_leggings(StackSize.S1, Version.Alpha108, false, false, false),
	chainmail_boots(StackSize.S1, Version.Alpha108, false, false, false),
	iron_helmet(StackSize.S1, Version.Alpha108, false, true, false),
	iron_chestplate(StackSize.S1, Version.Alpha108, false, true, false),
	iron_leggings(StackSize.S1, Version.Alpha108, false, true, false),
	iron_boots(StackSize.S1, Version.Alpha108, false, true, false),
	diamond_helmet(StackSize.S1, Version.Alpha108, false, false, false),
	diamond_chestplate(StackSize.S1, Version.Alpha108, false, false, false),
	diamond_leggings(StackSize.S1, Version.Alpha108, false, false, false),
	diamond_boots(StackSize.S1, Version.Alpha108, false, false, false),
	gold_helmet(StackSize.S1, Version.Alpha108, false, true, false),
	gold_chestplate(StackSize.S1, Version.Alpha108, false, true, false),
	gold_leggings(StackSize.S1, Version.Alpha108, false, true, false),
	gold_boots(StackSize.S1, Version.Alpha108, false, true, false),

	// TODO StackSize, Version, carburant, renouvelable, primaire

	flint(StackSize.S64, Version.Indev, false, false, true),
	raw_pork(StackSize.S64, Version.Indev, false, true, false),
	cooked_pork(StackSize.S64, Version.Indev, false, true, true),
	painting(StackSize.S64, Version.Indev, false, true, false),
	golden_apple_1(StackSize.S64, Version.Infdev, false, true, false),
	golden_apple_2(StackSize.S64, Version.Release13, false, true, false),
	sign(StackSize.S16, Version.Classic024, false, true, false),
	// TODO pour 1.8 : wood_door(StackSize.S64, Version.Infdev, false, true, false),
	wood_door(StackSize.S1, Version.Infdev, false, true, false),
	bucket(StackSize.S64, Version.Indev, false, true, false),
	water_bucket(StackSize.S1, Version.Infdev, false, true, false),
	lava_bucket(StackSize.S1, Version.Infdev, true, false, false),
	minecart(StackSize.S1, Version.Infdev, false, true, false),
	saddle(StackSize.S1, Version.Infdev, false, true, false),
	// TODO pour 1.8 : iron_door(StackSize.S64, Version.Alpha101, false, true, false),
	iron_door(StackSize.S1, Version.Alpha101, false, true, false),
	redstone(StackSize.S64, Version.Alpha101, false, true, false),
	snow_ball(StackSize.S16, Version.Alpha105, false, true, true),
	boat(StackSize.S1, Version.Alpha106, false, true, false),
	leather(StackSize.S64, Version.Alpha108, false, true, true),
	milk_bucket(StackSize.S1, Version.Alpha1011, false, true, true),
	clay_brick(StackSize.S64, Version.Alpha1011, false, false, false),
	clay_ball(StackSize.S64, Version.Alpha1011, false, false, true),
	sugar_cane(StackSize.S64, Version.Alpha1011, false, true, true),
	paper(StackSize.S64, Version.Alpha1011, false, true, false),
	book(StackSize.S64, Version.Alpha1011, false, true, false),
	slime_ball(StackSize.S64, Version.Alpha1011, false, true, true),
	minecart_with_chest(StackSize.S1, Version.Alpha1014, false, true, false),
	minecart_with_furnace(StackSize.S1, Version.Alpha1014, false, true, false),
	egg(StackSize.S16, Version.Alpha1014, false, true, true),
	compass(StackSize.S64, Version.Alpha110, false, true, false),
	fishing_rod(StackSize.S1, Version.Alpha111, false, true, false),
	watch(StackSize.S64, Version.Alpha120, false, true, false),
	glowstone_dust(StackSize.S64, Version.Alpha120, false, true, true),
	raw_fish(StackSize.S64, Version.Alpha120, false, true, true),
	cooked_fish(StackSize.S64, Version.Alpha120, false, true, false),
	raw_salmon(StackSize.S64, Version.Release17, false, true, true),
	cooked_salmon(StackSize.S64, Version.Release17, false, true, false),
	clownfish(StackSize.S64, Version.Release17, false, true, false),
	pufferfish(StackSize.S64, Version.Release17, false, true, false),
	ink_sack(StackSize.S64, Version.Beta12, false, true, true),
	rose_red(StackSize.S64, Version.Beta12, false, true, false),
	cactus_green(StackSize.S64, Version.Beta12, false, true, false),
	cocoa_beans(StackSize.S64, Version.Beta12, false, true, true),
	// TODO pour 1.8 : lapis_lazuli(StackSize.S64, Version.Beta12, false, true, false),
	lapis_lazuli(StackSize.S64, Version.Beta12, false, false, false),
	purple_dye(StackSize.S64, Version.Beta12, false, true, false),
	cyan_dye(StackSize.S64, Version.Beta12, false, true, false),
	l_gray_dye(StackSize.S64, Version.Beta12, false, true, false),
	gray_dye(StackSize.S64, Version.Beta12, false, true, false),
	pink_dye(StackSize.S64, Version.Beta12, false, true, false),
	l_green_dye(StackSize.S64, Version.Beta12, false, true, false),
	dandelion_yellow(StackSize.S64, Version.Beta12, false, true, false),
	// TODO pour 1.8 : l_blue_dye(StackSize.S64, Version.Beta12, false, true, false),
	l_blue_dye(StackSize.S64, Version.Beta12, false, false, false),
	magenta_dye(StackSize.S64, Version.Beta12, false, true, false),
	orange_dye(StackSize.S64, Version.Beta12, false, true, false),
	bone_meal(StackSize.S64, Version.Beta12, false, true, false),
	bone(StackSize.S64, Version.Beta12, false, true, true),
	sugar(StackSize.S64, Version.Beta12, false, true, false),
	cake(StackSize.S1, Version.Beta12, false, true, false),
	bed(StackSize.S1, Version.Beta13, false, true, false),
	repeater(StackSize.S64, Version.Beta13, false, true, false),
	cookie(StackSize.S64, Version.Beta14, false, true, false),
	map(StackSize.S64, Version.Beta16, false, true, false),
	shears(StackSize.S1, Version.Beta17, false, true, false),
	melon(StackSize.S64, Version.Beta18, false, true, true),
	pumpkin_seeds(StackSize.S64, Version.Beta18, false, true, false),
	melon_seeds(StackSize.S64, Version.Beta18, false, true, false),
	raw_beef(StackSize.S64, Version.Beta18, false, true, true),
	cooked_beef(StackSize.S64, Version.Beta18, false, true, false),
	raw_chicken(StackSize.S64, Version.Beta18, false, true, true),
	cooked_chicken(StackSize.S64, Version.Beta18, false, true, false),
	rotten_flesh(StackSize.S64, Version.Beta18, false, true, false),
	ender_pearl(StackSize.S16, Version.Beta18, false, true, true),
	blaze_rod(StackSize.S64, Version.Beta19PR1, true, true, true),
	ghast_tear(StackSize.S64, Version.Beta19PR1, false, true, true),
	gold_nugget(StackSize.S64, Version.Beta19PR1, false, true, false),
	nether_wart(StackSize.S64, Version.Beta19PR1, false, true, true),
	glass_bottle(StackSize.S64, Version.Beta19PR2, false, true, false),
	spider_eye(StackSize.S64, Version.Beta19PR2, false, true, true),
	fermented_spider_eye(StackSize.S64, Version.Beta19PR2, false, true, false),
	blaze_powder(StackSize.S64, Version.Beta19PR2, false, true, false),
	magma_cream(StackSize.S64, Version.Beta19PR2, false, true, false),
	brewing_stand(StackSize.S64, Version.Beta19PR3, false, true, false),
	cauldron(StackSize.S64, Version.Beta19PR3, false, true, false),
	eye_of_ender(StackSize.S64, Version.Beta19PR3, false, true, false),
	speckled_melon(StackSize.S64, Version.Beta19PR4, false, true, false),
	creeper_egg(StackSize.S64, Version.Release11, false, false, false),
	skeleton_egg(StackSize.S64, Version.Release11, false, false, false),
	spider_egg(StackSize.S64, Version.Release11, false, false, false),
	zombie_egg(StackSize.S64, Version.Release11, false, false, false),
	slime_egg(StackSize.S64, Version.Release11, false, false, false),
	ghast_egg(StackSize.S64, Version.Release11, false, false, false),
	zombie_pigman_egg(StackSize.S64, Version.Release11, false, false, false),
	enderman_egg(StackSize.S64, Version.Release11, false, false, false),
	cavespider_egg(StackSize.S64, Version.Release11, false, false, false),
	silverfish_egg(StackSize.S64, Version.Release11, false, false, false),
	blaze_egg(StackSize.S64, Version.Release11, false, false, false),
	magmacube_egg(StackSize.S64, Version.Release11, false, false, false),
	bat_egg(StackSize.S64, Version.Release11, false, false, false),
	witch_egg(StackSize.S64, Version.Release11, false, false, false),
	pig_egg(StackSize.S64, Version.Release11, false, false, false),
	sheep_egg(StackSize.S64, Version.Release11, false, false, false),
	cow_egg(StackSize.S64, Version.Release11, false, false, false),
	chicken_egg(StackSize.S64, Version.Release11, false, false, false),
	squid_egg(StackSize.S64, Version.Release11, false, false, false),
	wolf_egg(StackSize.S64, Version.Release11, false, false, false),
	mooshroom_egg(StackSize.S64, Version.Release11, false, false, false),
	ocelot_egg(StackSize.S64, Version.Release11, false, false, false),
	horse_egg(StackSize.S64, Version.Release11, false, false, false),
	villager_egg(StackSize.S64, Version.Release11, false, false, false),
	// TODO pour 1.8 : bottle_o_enchanting(StackSize.S64, Version.Release125, false, false, false),
	bottle_o_enchanting(StackSize.S64, Version.Release125, false, true, false),
	fireball(StackSize.S64, Version.Release125, false, true, false),
	book_and_quill(StackSize.S1, Version.Release13, false, true, false),
	written_book(StackSize.S1, Version.Release13, false, true, false),
	emerald(StackSize.S64, Version.Release13, false, true, true),
	item_frame(StackSize.S64, Version.Release14, false, true, false),
	flower_pot(StackSize.S64, Version.Release14, false, true, false),
	carrot(StackSize.S64, Version.Release14, false, true, true),
	potato(StackSize.S64, Version.Release14, false, true, true),
	baked_potato(StackSize.S64, Version.Release14, false, true, false),
	poisonous_potato(StackSize.S64, Version.Release14, false, true, false),
	empty_map(StackSize.S64, Version.Beta16, false, true, false),
	golden_carrot(StackSize.S64, Version.Release14, false, true, false),
	skeleton_skull(StackSize.S64, Version.Release14, false, true, true),
	wither_skeleton_skull(StackSize.S64, Version.Release14, false, true, true),
	zombie_skull(StackSize.S64, Version.Release14, false, true, true),
	human_skull(StackSize.S64, Version.Release14, false, true, true),
	creeper_skull(StackSize.S64, Version.Release14, false, true, true),
	carrot_on_a_stick(StackSize.S1, Version.Release14, false, true, false),
	nether_star(StackSize.S64, Version.Release14, false, true, true),
	pumpkin_pie(StackSize.S64, Version.Release14, false, true, false),
	firework(StackSize.S64, Version.Release146, false, true, false),
	firework_star(StackSize.S64, Version.Release146, false, true, false),
	enchanted_book(StackSize.S1, Version.Release146, false, true, false),
	redstone_comparator(StackSize.S64, Version.Release15, false, true, false),
	nether_brick(StackSize.S64, Version.Release15, false, true, false),
	quartz(StackSize.S64, Version.Release15, false, true, true),
	minecart_with_tnt(StackSize.S1, Version.Release15, false, true, false),
	minecart_with_hopper(StackSize.S1, Version.Release15, false, true, false),
	iron_barding(StackSize.S1, Version.Release16, false, true, false),
	gold_barding(StackSize.S1, Version.Release16, false, true, false),
	diamond_barding(StackSize.S1, Version.Release16, false, true, false),
	leash(StackSize.S64, Version.Release16, false, true, false),
	name_tag(StackSize.S64, Version.Release16, false, true, false),
	minecart_with_command_block(StackSize.S1, Version.Release17, false, true, false),
	_13_disc(StackSize.S1, Version.Alpha1014, false, true, false),
	cat_disc(StackSize.S1, Version.Alpha1014, false, true, false),
	blocks_disc(StackSize.S1, Version.Beta19PR2, false, true, false),
	chirp_disc(StackSize.S1, Version.Beta19PR2, false, true, false),
	far_disc(StackSize.S1, Version.Beta19PR2, false, true, false),
	mall_disc(StackSize.S1, Version.Beta19PR2, false, true, false),
	mellohi_disc(StackSize.S1, Version.Beta19PR2, false, true, false),
	stal_disc(StackSize.S1, Version.Beta19PR2, false, true, false),
	strad_disc(StackSize.S1, Version.Beta19PR2, false, true, false),
	ward_disc(StackSize.S1, Version.Beta19PR2, false, true, false),
	_11_disc(StackSize.S1, Version.Beta19PR2, false, true, false),
	wait_disc(StackSize.S1, Version.Release146, false, true, false),

	// Potions
	p_waterB(StackSize.S1, Version.Beta19PR3, false, true, true),
	p_mundane,
	p_mundane_ext,
	p_awkward,
	p_thick,

	p_regeneration,
	p_regeneration_ext,
	p_regeneration_II,
	p_swiftness,
	p_swiftness_ext,
	p_swiftness_II,
	p_fire_resistance,
	p_fire_resistance_ext,
	p_healing,
	p_healing_II,
	p_night_vision(Version.Release14),
	p_night_vision_ext(Version.Release14),
	p_strength,
	p_strength_ext,
	p_strength_II,
	p_invisibility(Version.Release14),
	p_invisibility_ext(Version.Release14),
	p_water_breathing(Version.Release17),
	p_water_breathing_ext(Version.Release17),
	p_poison,
	p_poison_ext,
	p_poison_II,
	p_weakness,
	p_weakness_ext,
	p_slowness,
	p_slowness_ext,
	p_harming,
	p_harming_II,

	// Splash potions
	s_p_mundane,

	s_p_regeneration,

	s_p_regeneration_ext,

	s_p_regeneration_II,
	s_p_swiftness,
	s_p_swiftness_ext,
	s_p_swiftness_II,
	s_p_fire_resistance,
	s_p_fire_resistance_ext,
	s_p_healing,
	s_p_healing_II,
	s_p_night_vision(Version.Release14),
	s_p_night_vision_ext(Version.Release14),
	s_p_strength,
	s_p_strength_ext,
	s_p_strength_II,
	s_p_invisibility(Version.Release14),
	s_p_invisibility_ext(Version.Release14),
	s_p_water_breathing(Version.Release17),
	s_p_water_breathing_ext(Version.Release17),
	s_p_poison,
	s_p_poison_ext,
	s_p_poison_II,
	s_p_weakness,
	s_p_weakness_ext,
	s_p_slowness,
	s_p_slowness_ext,
	s_p_harming,
	s_p_harming_II,

	;

	private EItem item;

	private StackSize size;

	private Version version;

	private enum StackSize {
		S1(1),
		S16(16),
		S64(64);

		private int size;

		private StackSize(int size) {
			this.size = size;
		}

		public int getSize() {
			return size;
		}

	}

	private enum Version {

		Classic009a("Classic 0.0.9a"),
		Classic0011a("Classic 0.0.11a"),
		Classic0012a("Classic 0.0.12a"),
		Classic0014a("Classic 0.0.14a"),
		Classic0018a("Classic 0.0.18a"),
		Classic020("Classic 0.20"),
		Classic024("Classic 0.24"),
		Classic026("Classic 0.26"),
		Indev("Indev"),
		Indev031("Indev 0.31"),
		Infdev("Infdev"),
		Alpha100("Alpha 1.0.0"),
		Alpha101("Alpha 1.0.1"),
		Alpha104("Alpha 1.0.4"),
		Alpha105("Alpha 1.0.5"),
		Alpha106("Alpha 1.0.6"),
		Alpha108("Alpha 1.0.8"),
		Alpha1011("Alpha 1.0.11"),
		Alpha1014("Alpha 1.0.14"),
		Alpha1017("Alpha 1.0.17"),
		Alpha110("Alpha 1.1.0"),
		Alpha111("Alpha 1.1.1"),
		Alpha120("Alpha 1.2.0"),
		Beta12("B�ta 1.2"),
		Beta13("B�ta 1.3"),
		Beta14("B�ta 1.4"),
		Beta15("B�ta 1.5"),
		Beta16("B�ta 1.6"),
		Beta17("B�ta 1.7"),
		Beta18("B�ta 1.8"),
		Beta19PR1("B�ta 1.9 Pre-Release 1"),
		Beta19PR2("B�ta 1.9 Pre-Release 2"),
		Beta19PR3("B�ta 1.9 Pre-Release 3"),
		Beta19PR4("B�ta 1.9 Pre-Release 4"),
		Beta19PR6("B�ta 1.9 Pre-Release 6"),
		Release11("Release 1.1"),
		Release125("Release 1.2.5"),
		Release13("Release 1.3"),
		Release14("Release 1.4"),
		Release146("Release 1.4.6"),
		Release15("Release 1.5"),
		Release16("Release 1.6"),
		Release17("Release 1.7"),
		Release18("Release 1.8"),
		;

		private String numVersion;

		private Version(String numVersion) {
			this.numVersion = numVersion;
		}

		public String getNumVersion() {
			return numVersion;
		}

	}

	private boolean transparent;

	private boolean carburant;

	private boolean renouvelable;

	private boolean primaire;

	private EItemInfo(StackSize size, Version version, boolean transparent, boolean carburant, boolean renouvelable, boolean primaire) {
		this.item = EItem.valueOf(name());
		this.size = size;
		this.version = version;
		this.transparent = transparent;
		this.carburant = carburant;
		this.renouvelable = renouvelable;
		this.primaire = primaire;
	}

	private EItemInfo(StackSize size, Version version, boolean carburant, boolean renouvelable, boolean primaire) {
		this(size, version, true, carburant, renouvelable, primaire);
	}

	private EItemInfo(Version version) {
		this(StackSize.S1, version, false, true, false);
	}

	private EItemInfo() {
		this(StackSize.S1, Version.Beta19PR3, false, true, false);
	}

	public EItem getItem() {
		return item;
	}

	public int getSize() {
		return size.getSize();
	}

	public String getVersion() {
		return version.getNumVersion();
	}

	public boolean isTransparent() {
		return transparent;
	}

	public boolean isCarburant() {
		return carburant;
	}

	public boolean isRenouvelable() {
		return renouvelable;
	}

	public boolean isPrimaire() {
		return primaire;
	}

	public static EItemInfo getBy(EItem item) {
		if (item == null) return null;

		return EItemInfo.valueOf(item.name());
	}

}


