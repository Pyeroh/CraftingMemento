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

	// TODO StackSize, Version, transparent, carburant, renouvelable, primaire

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
	dispenser(StackSize.S64, ),
	sandstone(StackSize.S64, ),
	chiseled_sandstone(StackSize.S64, ),
	smooth_sandstone(StackSize.S64, ),
	note_block(StackSize.S64, ),
	powered_rail(StackSize.S64, ),
	detector_rail(StackSize.S64, ),
	sticky_piston(StackSize.S64, ),
	cobweb(StackSize.S64, ),
	long_grass(StackSize.S64, ),
	fern(StackSize.S64, ),
	dead_bush(StackSize.S64, ),
	piston(StackSize.S64, ),
	white_wool(StackSize.S64, ),
	orange_wool(StackSize.S64, ),
	magenta_wool(StackSize.S64, ),
	l_blue_wool(StackSize.S64, ),
	yellow_wool(StackSize.S64, ),
	l_green_wool(StackSize.S64, ),
	pink_wool(StackSize.S64, ),
	gray_wool(StackSize.S64, ),
	l_gray_wool(StackSize.S64, ),
	cyan_wool(StackSize.S64, ),
	purple_wool(StackSize.S64, ),
	blue_wool(StackSize.S64, ),
	brown_wool(StackSize.S64, ),
	green_wool(StackSize.S64, ),
	red_wool(StackSize.S64, ),
	black_wool(StackSize.S64, ),
	yellow_flower(StackSize.S64, ),
	poppy(StackSize.S64, ),
	blue_orchid(StackSize.S64, ),
	allium(StackSize.S64, ),
	azure_bluet(StackSize.S64, ),
	red_tulip(StackSize.S64, ),
	orange_tulipe(StackSize.S64, ),
	white_tulip(StackSize.S64, ),
	pink_tulip(StackSize.S64, ),
	oxeye_daisy(StackSize.S64, ),
	brown_mushroom(StackSize.S64, ),
	red_mushroom(StackSize.S64, ),
	gold_block(StackSize.S64, Version.Classic020, false, false, false, false),
	iron_block(StackSize.S64, Version.Classic026, false, false, false, false),
	stone_slab(StackSize.S64, ),
	sandstone_slab(StackSize.S64, ),
	cobble_slab(StackSize.S64, ),
	brick_slab(StackSize.S64, ),
	stonebrick_slab(StackSize.S64, ),
	netherbrick_slab(StackSize.S64, ),
	quartz_slab(StackSize.S64, ),
	brick(StackSize.S64, ),
	tnt(StackSize.S64, ),
	bookshelf(StackSize.S64, ),
	mossy_cobblestone(StackSize.S64, ),
	obsidian(StackSize.S64, ),
	torch(StackSize.S64, ),
	fire(StackSize.S64, ),
	wood_stairs(StackSize.S64, ),
	chest(StackSize.S64, ),
	diamond_ore(StackSize.S64, Version.Indev031, false, false, false, true),
	diamond_block(StackSize.S64, Version.Indev031, false, false, false, false),
	workbench(StackSize.S64, ),
	furnace(StackSize.S64, ),
	ladder(StackSize.S64, ),
	rails(StackSize.S64, ),
	cobblestone_stairs(StackSize.S64, ),
	lever(StackSize.S64, ),
	stone_plate(StackSize.S64, ),
	wood_plate(StackSize.S64, ),
	redstone_ore(StackSize.S64, Version.Alpha101, false, false, false, true),
	redstone_torch_on(StackSize.S64, ),
	stone_button(StackSize.S64, ),
	snow(StackSize.S64, ),
	ice(StackSize.S64, ),
	snow_block(StackSize.S64, ),
	cactus(StackSize.S64, ),
	clay(StackSize.S64, ),
	jukebox(StackSize.S64, ),
	fence(StackSize.S64, ),
	pumpkin(StackSize.S64, ),
	netherrack(StackSize.S64, ),
	soul_sand(StackSize.S64, ),
	glowstone(StackSize.S64, ),
	jack_o_lantern(StackSize.S64, ),
	white_glass(StackSize.S64, ),
	orange_glass(StackSize.S64, ),
	magenta_glass(StackSize.S64, ),
	l_blue_glass(StackSize.S64, ),
	yellow_glass(StackSize.S64, ),
	l_green_glass(StackSize.S64, ),
	pink_glass(StackSize.S64, ),
	gray_glass(StackSize.S64, ),
	l_gray_glass(StackSize.S64, ),
	cyan_glass(StackSize.S64, ),
	purple_glass(StackSize.S64, ),
	blue_glass(StackSize.S64, ),
	brown_glass(StackSize.S64, ),
	green_glass(StackSize.S64, ),
	red_glass(StackSize.S64, ),
	black_glass(StackSize.S64, ),
	trap_door(StackSize.S64, ),
	smooth_brick(StackSize.S64, ),
	mossy_smooth_brick(StackSize.S64, ),
	cracked_smooth_brick(StackSize.S64, ),
	chiseled_smooth_brick(StackSize.S64, ),
	huge_mushroom_1(StackSize.S64, ),
	huge_mushroom_2(StackSize.S64, ),
	iron_bars(StackSize.S64, ),
	glass_pane(StackSize.S64, ),
	melon_block(StackSize.S64, ),
	vine(StackSize.S64, ),
	fence_gate(StackSize.S64, ),
	brick_stairs(StackSize.S64, ),
	smooth_stairs(StackSize.S64, ),
	mycelium(StackSize.S64, ),
	lilypad(StackSize.S64, ),
	nether_brick_block(StackSize.S64, ),
	nether_fence(StackSize.S64, ),
	nether_brick_stairs(StackSize.S64, ),
	enchantment_table(StackSize.S64, ),
	ender_stone(StackSize.S64, ),
	dragon_egg(StackSize.S64, ),
	redstone_lamp_off(StackSize.S64, ),
	oakwood_slab(StackSize.S64, ),
	sprucewood_slab(StackSize.S64, ),
	birchwood_slab(StackSize.S64, ),
	junglewood_slab(StackSize.S64, ),
	acacia_slab(StackSize.S64, ),
	darkoak_slab(StackSize.S64, ),
	sandstone_stairs(StackSize.S64, ),
	emerald_ore(StackSize.S64, Version.Release13, false, false, false, true),
	ender_chest(StackSize.S64, ),
	tripwire_hook(StackSize.S64, ),
	emerald_block(StackSize.S64, Version.Release13, false, false, false, false),
	spruce_wood_stairs(StackSize.S64, ),
	birch_wood_stairs(StackSize.S64, ),
	jungle_wood_stairs(StackSize.S64, ),
	beacon(StackSize.S64, ),
	cobble_wall(StackSize.S64, ),
	mossy_cobble_wall(StackSize.S64, ),
	wood_button(StackSize.S64, ),
	anvil(StackSize.S64, ),
	trapped_chest(StackSize.S64, ),
	gold_plate(StackSize.S64, ),
	iron_plate(StackSize.S64, ),
	daylight_detector(StackSize.S64, ),
	redstone_block(StackSize.S64, Version.Release15, false, false, false, false),
	quartz_ore(StackSize.S64, Version.Release15, false, false, false, true),
	hopper(StackSize.S64, ),
	quartz_block(StackSize.S64, Version.Release15, false, false, false, false),
	chiseled_quartz_block(StackSize.S64, Version.Release15, false, false, false, false),
	pillar_quartz_block(StackSize.S64, Version.Release15, false, false, false, false),
	quartz_stairs(StackSize.S64, ),
	activator_railStackSize.S64, (StackSize.S1, ),
	dropperStackSize.S64, (StackSize.S1, ),
	white_stained_clay(StackSize.S64, ),
	orange_stained_clay(StackSize.S64, ),
	magenta_stained_clay(StackSize.S64, ),
	l_blue_stained_clay(StackSize.S64, ),
	yellow_stained_clay(StackSize.S64, ),
	l_green_stained_clay(StackSize.S64, ),
	pink_stained_clay(StackSize.S64, ),
	gray_stained_clay(StackSize.S64, ),
	l_gray_stained_clay(StackSize.S64, ),
	cyan_stained_clay(StackSize.S64, ),
	purple_stained_clay(StackSize.S64, ),
	blue_stained_clay(StackSize.S64, ),
	brown_stained_clay(StackSize.S64, ),
	green_stained_clay(StackSize.S64, ),
	red_stained_clay(StackSize.S64, ),
	black_stained_clay(StackSize.S64, ),
	white_glass_pane(StackSize.S64, ),
	orange_glass_pane(StackSize.S64, ),
	magenta_glass_pane(StackSize.S64, ),
	l_blue_glass_pane(StackSize.S64, ),
	yellow_glass_pane(StackSize.S64, ),
	l_green_glass_pane(StackSize.S64, ),
	pink_glass_pane(StackSize.S64, ),
	gray_glass_pane(StackSize.S64, ),
	l_gray_glass_pane(StackSize.S64, ),
	cyan_glass_pane(StackSize.S64, ),
	purple_glass_pane(StackSize.S64, ),
	blue_glass_pane(StackSize.S64, ),
	brown_glass_pane(StackSize.S64, ),
	green_glass_pane(StackSize.S64, ),
	red_glass_pane(StackSize.S64, ),
	black_glass_pane(StackSize.S64, ),
	acacia_stairs(StackSize.S64, ),
	darkoak_stairs(StackSize.S64, ),
	hay_block(StackSize.S64, ),
	white_carpet(StackSize.S64, ),
	orange_carpet(StackSize.S64, ),
	magenta_carpet(StackSize.S64, ),
	l_blue_carpet(StackSize.S64, ),
	yellow_carpet(StackSize.S64, ),
	l_green_carpet(StackSize.S64, ),
	pink_carpet(StackSize.S64, ),
	gray_carpet(StackSize.S64, ),
	l_gray_carpet(StackSize.S64, ),
	cyan_carpet(StackSize.S64, ),
	purple_carpet(StackSize.S64, ),
	blue_carpet(StackSize.S64, ),
	brown_carpet(StackSize.S64, ),
	green_carpet(StackSize.S64, ),
	red_carpet(StackSize.S64, ),
	black_carpet(StackSize.S64, ),
	hardened_clay(StackSize.S64, ),
	coal_block(StackSize.S64, Version.Release16, false, true, true, false),
	packed_ice(StackSize.S64, ),
	sunflower(StackSize.S64, ),
	lilac(StackSize.S64, ),
	rose_bush(StackSize.S64, ),
	peony(StackSize.S64, ),

	// Items
	iron_spade(StackSize.S1, ),
	iron_pickaxe(StackSize.S1, ),
	iron_axe(StackSize.S1, ),
	flint_and_steel(StackSize.S1, ),
	apple(StackSize.S64, ),
	bow(StackSize.S1, ),
	arrow(StackSize.S64, ),
	coal(StackSize.S64, ),
	charcoal(StackSize.S64, ),
	diamond(StackSize.S64, ),
	iron_ingot(StackSize.S64, ),
	gold_ingot(StackSize.S64, ),
	iron_sword(StackSize.S1, ),
	wood_sword(StackSize.S1, ),
	wood_spade(StackSize.S1, ),
	wood_pickaxe(StackSize.S1, ),
	wood_axe(StackSize.S1, ),
	stone_sword(StackSize.S1, ),
	stone_spade(StackSize.S1, ),
	stone_pickaxe(StackSize.S1, ),
	stone_axe(StackSize.S1, ),
	diamond_sword(StackSize.S1, ),
	diamond_spade(StackSize.S1, ),
	diamond_pickaxe(StackSize.S1, ),
	diamond_axe(StackSize.S1, ),
	stick(StackSize.S64, ),
	bowl(StackSize.S64, ),
	mushroom_soup(StackSize.S1, ),
	gold_sword(StackSize.S1, ),
	gold_spade(StackSize.S1, ),
	gold_pickaxe(StackSize.S1, ),
	gold_axe(StackSize.S1, ),
	string(StackSize.S64, ),
	feather(StackSize.S64, ),
	gunpowder(StackSize.S64, ),
	wood_hoe(StackSize.S1, ),
	stone_hoe(StackSize.S1, ),
	iron_hoe(StackSize.S1, ),
	diamond_hoe(StackSize.S1, ),
	gold_hoe(StackSize.S1, ),
	seeds(StackSize.S64, ),
	wheat(StackSize.S64, ),
	bread(StackSize.S64, ),
	leather_helmet(StackSize.S1, ),
	leather_chestplate(StackSize.S1, ),
	leather_leggings(StackSize.S1, ),
	leather_boots(StackSize.S1, ),
	chainmail_helmet(StackSize.S1, ),
	chainmail_chestplate(StackSize.S1, ),
	chainmail_leggings(StackSize.S1, ),
	chainmail_boots(StackSize.S1, ),
	iron_helmet(StackSize.S1, ),
	iron_chestplate(StackSize.S1, ),
	iron_leggings(StackSize.S1, ),
	iron_boots(StackSize.S1, ),
	diamond_helmet(StackSize.S1, ),
	diamond_chestplate(StackSize.S1, ),
	diamond_leggings(StackSize.S1, ),
	diamond_boots(StackSize.S1, ),
	gold_helmet(StackSize.S1, ),
	gold_chestplate(StackSize.S1, ),
	gold_leggings(StackSize.S1, ),
	gold_boots(StackSize.S1, ),
	flint(StackSize.S64, ),
	raw_pork(StackSize.S64, ),
	cooked_pork(StackSize.S64, ),
	painting(StackSize.S64, ),
	golden_apple_1(StackSize.S64, ),
	golden_apple_2(StackSize.S64, ),
	sign(StackSize.S16, ),
	wood_door(StackSize.S1, ),
	bucket(StackSize.S64, ),
	water_bucket(StackSize.S1, ),
	lava_bucket(StackSize.S1, ),
	minecart(StackSize.S1, ),
	saddle(StackSize.S1, ),
	iron_door(StackSize.S1, ),
	redstone(StackSize.S64, ),
	snow_ball(StackSize.S16, ),
	boat(StackSize.S1, ),
	leather(StackSize.S64, ),
	milk_bucket(StackSize.S1, ),
	clay_brick(StackSize.S64, ),
	clay_ball(StackSize.S64, ),
	sugar_cane(StackSize.S64, ),
	paper(StackSize.S64, ),
	book(StackSize.S64, ),
	slime_ball(StackSize.S64, ),
	minecart_with_chest(StackSize.S1, ),
	minecart_with_furnace(StackSize.S1, ),
	egg(StackSize.S16, ),
	compass(StackSize.S64, ),
	fishing_rod(StackSize.S1, ),
	watch(StackSize.S64, ),
	glowstone_dust(StackSize.S64, ),
	raw_fish(StackSize.S64, ),
	cooked_fish(StackSize.S64, ),
	raw_salmon(StackSize.S64, ),
	cooked_salmon(StackSize.S64, ),
	clownfish(StackSize.S64, ),
	pufferfish(StackSize.S64, ),
	ink_sack(StackSize.S64, ),
	rose_red(StackSize.S64, ),
	cactus_green(StackSize.S64, ),
	cocoa_beans(StackSize.S64, ),
	lapis_lazuli(StackSize.S64, ),
	purple_dye(StackSize.S64, ),
	cyan_dye(StackSize.S64, ),
	l_gray_dye(StackSize.S64, ),
	gray_dye(StackSize.S64, ),
	pink_dye(StackSize.S64, ),
	l_green_dye(StackSize.S64, ),
	dandelion_yellow(StackSize.S64, ),
	l_blue_dye(StackSize.S64, ),
	magenta_dye(StackSize.S64, ),
	orange_dye(StackSize.S64, ),
	bone_meal(StackSize.S64, ),
	bone(StackSize.S64, ),
	sugar(StackSize.S64, ),
	cake(StackSize.S1, ),
	bed(StackSize.S1, ),
	repeater(StackSize.S64, ),
	cookie(StackSize.S64, ),
	map(StackSize.S64, ),
	shears(StackSize.S1, ),
	melon(StackSize.S64, ),
	pumpkin_seeds(StackSize.S64, ),
	melon_seeds(StackSize.S64, ),
	raw_beef(StackSize.S64, ),
	cooked_beef(StackSize.S64, ),
	raw_chicken(StackSize.S64, ),
	cooked_chicken(StackSize.S64, ),
	rotten_flesh(StackSize.S64, ),
	ender_pearl(StackSize.S16, ),
	blaze_rod(StackSize.S64, ),
	ghast_tear(StackSize.S64, ),
	gold_nugget(StackSize.S64, ),
	nether_wart(StackSize.S64, ),
	glass_bottle(StackSize.S64, ),
	spider_eye(StackSize.S64, ),
	fermented_spider_eye(StackSize.S64, ),
	blaze_powder(StackSize.S64, ),
	magma_cream(StackSize.S64, ),
	brewing_stand(StackSize.S64, ),
	cauldron(StackSize.S64, ),
	eye_of_ender(StackSize.S64, ),
	speckled_melon(StackSize.S64, ),
	creeper_egg(StackSize.S64, ),
	skeleton_egg(StackSize.S64, ),
	spider_egg(StackSize.S64, ),
	zombie_egg(StackSize.S64, ),
	slime_egg(StackSize.S64, ),
	ghast_egg(StackSize.S64, ),
	zombie_pigman_egg(StackSize.S64, ),
	enderman_egg(StackSize.S64, ),
	cavespider_egg(StackSize.S64, ),
	silverfish_egg(StackSize.S64, ),
	blaze_egg(StackSize.S64, ),
	magmacube_egg(StackSize.S64, ),
	bat_egg(StackSize.S64, ),
	witch_egg(StackSize.S64, ),
	pig_egg(StackSize.S64, ),
	sheep_egg(StackSize.S64, ),
	cow_egg(StackSize.S64, ),
	chicken_egg(StackSize.S64, ),
	squid_egg(StackSize.S64, ),
	wolf_egg(StackSize.S64, ),
	mooshroom_egg(StackSize.S64, ),
	ocelot_egg(StackSize.S64, ),
	horse_egg(StackSize.S64, ),
	villager_egg(StackSize.S64, ),
	bottle_o_enchanting(StackSize.S64, ),
	fireball(StackSize.S64, ),
	book_and_quill(StackSize.S1, ),
	written_book(StackSize.S1, ),
	emerald(StackSize.S64, ),
	item_frame(StackSize.S64, ),
	flower_pot(StackSize.S64, ),
	carrot(StackSize.S64, ),
	potato(StackSize.S64, ),
	baked_potato(StackSize.S64, ),
	poisonous_potato(StackSize.S64, ),
	empty_map(StackSize.S64, ),
	golden_carrot(StackSize.S64, ),
	skeleton_skull(StackSize.S64, ),
	wither_skeleton_skull(StackSize.S64, ),
	zombie_skull(StackSize.S64, ),
	human_skull(StackSize.S64, ),
	creeper_skull(StackSize.S64, ),
	carrot_on_a_stick(StackSize.S1, ),
	nether_star(StackSize.S64, ),
	pumpkin_pie(StackSize.S64, ),
	firework(StackSize.S64, ),
	firework_star(StackSize.S64, ),
	enchanted_book(StackSize.S1, ),
	redstone_comparator(StackSize.S64, ),
	nether_brick(StackSize.S64, ),
	quartz(StackSize.S64, ),
	minecart_with_tnt(StackSize.S1, ),
	minecart_with_hopper(StackSize.S1, ),
	iron_barding(StackSize.S1, ),
	gold_barding(StackSize.S1, ),
	diamond_barding(StackSize.S1, ),
	leash(StackSize.S64, ),
	name_tag(StackSize.S64, ),
	minecart_with_command_block(StackSize.S1, ),
	_13_disc(StackSize.S1, ),
	cat_disc(StackSize.S1, ),
	blocks_disc(StackSize.S1, ),
	chirp_disc(StackSize.S1, ),
	far_disc(StackSize.S1, ),
	mall_disc(StackSize.S1, ),
	mellohi_disc(StackSize.S1, ),
	stal_disc(StackSize.S1, ),
	strad_disc(StackSize.S1, ),
	ward_disc(StackSize.S1, ),
	_11_disc(StackSize.S1, ),
	wait_disc(StackSize.S1, ),

	// Potions
	p_waterB(StackSize.S1, ),
	p_mundane(StackSize.S1, ),
	p_mundane_ext(StackSize.S1, ),
	p_awkward(StackSize.S1, ),
	p_thick(StackSize.S1, ),

	p_regeneration(StackSize.S1, ),
	p_regeneration_ext(StackSize.S1, ),
	p_regeneration_II(StackSize.S1, ),
	p_swiftness(StackSize.S1, ),
	p_swiftness_ext(StackSize.S1, ),
	p_swiftness_II(StackSize.S1, ),
	p_fire_resistance(StackSize.S1, ),
	p_fire_resistance_ext(StackSize.S1, ),
	p_healing(StackSize.S1, ),
	p_healing_II(StackSize.S1, ),
	p_night_vision(StackSize.S1, ),
	p_night_vision_ext(StackSize.S1, ),
	p_strength(StackSize.S1, ),
	p_strength_ext(StackSize.S1, ),
	p_strength_II(StackSize.S1, ),
	p_invisibility(StackSize.S1, ),
	p_invisibility_ext(StackSize.S1, ),
	p_water_breathing(StackSize.S1, ),
	p_water_breathing_ext(StackSize.S1, ),
	p_poison(StackSize.S1, ),
	p_poison_ext(StackSize.S1, ),
	p_poison_II(StackSize.S1, ),
	p_weakness(StackSize.S1, ),
	p_weakness_ext(StackSize.S1, ),
	p_slowness(StackSize.S1, ),
	p_slowness_ext(StackSize.S1, ),
	p_harming(StackSize.S1, ),
	p_harming_II(StackSize.S1, ),

	// Splash potions
	s_p_mundane(StackSize.S1, ),

	s_p_regeneration(StackSize.S1, ),

	s_p_regeneration_ext(StackSize.S1, ),

	s_p_regeneration_II(StackSize.S1, ),
	s_p_swiftness(StackSize.S1, ),
	s_p_swiftness_ext(StackSize.S1, ),
	s_p_swiftness_II(StackSize.S1, ),
	s_p_fire_resistance(StackSize.S1, ),
	s_p_fire_resistance_ext(StackSize.S1, ),
	s_p_healing(StackSize.S1, ),
	s_p_healing_II(StackSize.S1, ),
	s_p_night_vision(StackSize.S1, ),
	s_p_night_vision_ext(StackSize.S1, ),
	s_p_strength(StackSize.S1, ),
	s_p_strength_ext(StackSize.S1, ),
	s_p_strength_II(StackSize.S1, ),
	s_p_invisibility(StackSize.S1, ),
	s_p_invisibility_ext(StackSize.S1, ),
	s_p_water_breathing(StackSize.S1, ),
	s_p_water_breathing_ext(StackSize.S1, ),
	s_p_poison(StackSize.S1, ),
	s_p_poison_ext(StackSize.S1, ),
	s_p_poison_II(StackSize.S1, ),
	s_p_weakness(StackSize.S1, ),
	s_p_weakness_ext(StackSize.S1, ),
	s_p_slowness(StackSize.S1, ),
	s_p_slowness_ext(StackSize.S1, ),
	s_p_harming(StackSize.S1, ),
	s_p_harming_II(StackSize.S1, ),

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
		Alpha1011("Alpha 1.0.11"),
		Alpha1014("Alpha 1.0.14"),
		Alpha1017("Alpha 1.0.17"),
		Alpha120("Alpha 1.2.0"),
		Beta12("B�ta 1.2"),
		Beta13("B�ta 1.3"),
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

}


