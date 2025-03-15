package net.minecraft.network.protocol.game;

import net.minecraft.network.protocol.EnumProtocolDirection;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.PacketType;
import net.minecraft.resources.MinecraftKey;

public class GamePacketTypes {

    public static final PacketType<ClientboundBundlePacket> CLIENTBOUND_BUNDLE = createClientbound("bundle");
    public static final PacketType<ClientboundBundleDelimiterPacket> CLIENTBOUND_BUNDLE_DELIMITER = createClientbound("bundle_delimiter");
    public static final PacketType<PacketPlayOutSpawnEntity> CLIENTBOUND_ADD_ENTITY = createClientbound("add_entity");
    public static final PacketType<PacketPlayOutSpawnEntityExperienceOrb> CLIENTBOUND_ADD_EXPERIENCE_ORB = createClientbound("add_experience_orb");
    public static final PacketType<PacketPlayOutAnimation> CLIENTBOUND_ANIMATE = createClientbound("animate");
    public static final PacketType<PacketPlayOutStatistic> CLIENTBOUND_AWARD_STATS = createClientbound("award_stats");
    public static final PacketType<ClientboundBlockChangedAckPacket> CLIENTBOUND_BLOCK_CHANGED_ACK = createClientbound("block_changed_ack");
    public static final PacketType<PacketPlayOutBlockBreakAnimation> CLIENTBOUND_BLOCK_DESTRUCTION = createClientbound("block_destruction");
    public static final PacketType<PacketPlayOutTileEntityData> CLIENTBOUND_BLOCK_ENTITY_DATA = createClientbound("block_entity_data");
    public static final PacketType<PacketPlayOutBlockAction> CLIENTBOUND_BLOCK_EVENT = createClientbound("block_event");
    public static final PacketType<PacketPlayOutBlockChange> CLIENTBOUND_BLOCK_UPDATE = createClientbound("block_update");
    public static final PacketType<PacketPlayOutBoss> CLIENTBOUND_BOSS_EVENT = createClientbound("boss_event");
    public static final PacketType<PacketPlayOutServerDifficulty> CLIENTBOUND_CHANGE_DIFFICULTY = createClientbound("change_difficulty");
    public static final PacketType<ClientboundChunkBatchFinishedPacket> CLIENTBOUND_CHUNK_BATCH_FINISHED = createClientbound("chunk_batch_finished");
    public static final PacketType<ClientboundChunkBatchStartPacket> CLIENTBOUND_CHUNK_BATCH_START = createClientbound("chunk_batch_start");
    public static final PacketType<ClientboundChunksBiomesPacket> CLIENTBOUND_CHUNKS_BIOMES = createClientbound("chunks_biomes");
    public static final PacketType<ClientboundClearTitlesPacket> CLIENTBOUND_CLEAR_TITLES = createClientbound("clear_titles");
    public static final PacketType<PacketPlayOutTabComplete> CLIENTBOUND_COMMAND_SUGGESTIONS = createClientbound("command_suggestions");
    public static final PacketType<PacketPlayOutCommands> CLIENTBOUND_COMMANDS = createClientbound("commands");
    public static final PacketType<PacketPlayOutCloseWindow> CLIENTBOUND_CONTAINER_CLOSE = createClientbound("container_close");
    public static final PacketType<PacketPlayOutWindowItems> CLIENTBOUND_CONTAINER_SET_CONTENT = createClientbound("container_set_content");
    public static final PacketType<PacketPlayOutWindowData> CLIENTBOUND_CONTAINER_SET_DATA = createClientbound("container_set_data");
    public static final PacketType<PacketPlayOutSetSlot> CLIENTBOUND_CONTAINER_SET_SLOT = createClientbound("container_set_slot");
    public static final PacketType<PacketPlayOutSetCooldown> CLIENTBOUND_COOLDOWN = createClientbound("cooldown");
    public static final PacketType<ClientboundCustomChatCompletionsPacket> CLIENTBOUND_CUSTOM_CHAT_COMPLETIONS = createClientbound("custom_chat_completions");
    public static final PacketType<ClientboundDamageEventPacket> CLIENTBOUND_DAMAGE_EVENT = createClientbound("damage_event");
    public static final PacketType<ClientboundDebugSamplePacket> CLIENTBOUND_DEBUG_SAMPLE = createClientbound("debug_sample");
    public static final PacketType<ClientboundDeleteChatPacket> CLIENTBOUND_DELETE_CHAT = createClientbound("delete_chat");
    public static final PacketType<ClientboundDisguisedChatPacket> CLIENTBOUND_DISGUISED_CHAT = createClientbound("disguised_chat");
    public static final PacketType<PacketPlayOutEntityStatus> CLIENTBOUND_ENTITY_EVENT = createClientbound("entity_event");
    public static final PacketType<PacketPlayOutExplosion> CLIENTBOUND_EXPLODE = createClientbound("explode");
    public static final PacketType<PacketPlayOutUnloadChunk> CLIENTBOUND_FORGET_LEVEL_CHUNK = createClientbound("forget_level_chunk");
    public static final PacketType<PacketPlayOutGameStateChange> CLIENTBOUND_GAME_EVENT = createClientbound("game_event");
    public static final PacketType<PacketPlayOutOpenWindowHorse> CLIENTBOUND_HORSE_SCREEN_OPEN = createClientbound("horse_screen_open");
    public static final PacketType<ClientboundHurtAnimationPacket> CLIENTBOUND_HURT_ANIMATION = createClientbound("hurt_animation");
    public static final PacketType<ClientboundInitializeBorderPacket> CLIENTBOUND_INITIALIZE_BORDER = createClientbound("initialize_border");
    public static final PacketType<ClientboundLevelChunkWithLightPacket> CLIENTBOUND_LEVEL_CHUNK_WITH_LIGHT = createClientbound("level_chunk_with_light");
    public static final PacketType<PacketPlayOutWorldEvent> CLIENTBOUND_LEVEL_EVENT = createClientbound("level_event");
    public static final PacketType<PacketPlayOutWorldParticles> CLIENTBOUND_LEVEL_PARTICLES = createClientbound("level_particles");
    public static final PacketType<PacketPlayOutLightUpdate> CLIENTBOUND_LIGHT_UPDATE = createClientbound("light_update");
    public static final PacketType<PacketPlayOutLogin> CLIENTBOUND_LOGIN = createClientbound("login");
    public static final PacketType<PacketPlayOutMap> CLIENTBOUND_MAP_ITEM_DATA = createClientbound("map_item_data");
    public static final PacketType<PacketPlayOutOpenWindowMerchant> CLIENTBOUND_MERCHANT_OFFERS = createClientbound("merchant_offers");
    public static final PacketType<PacketPlayOutEntity.PacketPlayOutRelEntityMove> CLIENTBOUND_MOVE_ENTITY_POS = createClientbound("move_entity_pos");
    public static final PacketType<PacketPlayOutEntity.PacketPlayOutRelEntityMoveLook> CLIENTBOUND_MOVE_ENTITY_POS_ROT = createClientbound("move_entity_pos_rot");
    public static final PacketType<ClientboundMoveMinecartPacket> CLIENTBOUND_MOVE_MINECART_ALONG_TRACK = createClientbound("move_minecart_along_track");
    public static final PacketType<PacketPlayOutEntity.PacketPlayOutEntityLook> CLIENTBOUND_MOVE_ENTITY_ROT = createClientbound("move_entity_rot");
    public static final PacketType<PacketPlayOutVehicleMove> CLIENTBOUND_MOVE_VEHICLE = createClientbound("move_vehicle");
    public static final PacketType<PacketPlayOutOpenBook> CLIENTBOUND_OPEN_BOOK = createClientbound("open_book");
    public static final PacketType<PacketPlayOutOpenWindow> CLIENTBOUND_OPEN_SCREEN = createClientbound("open_screen");
    public static final PacketType<PacketPlayOutOpenSignEditor> CLIENTBOUND_OPEN_SIGN_EDITOR = createClientbound("open_sign_editor");
    public static final PacketType<PacketPlayOutAutoRecipe> CLIENTBOUND_PLACE_GHOST_RECIPE = createClientbound("place_ghost_recipe");
    public static final PacketType<PacketPlayOutAbilities> CLIENTBOUND_PLAYER_ABILITIES = createClientbound("player_abilities");
    public static final PacketType<ClientboundPlayerChatPacket> CLIENTBOUND_PLAYER_CHAT = createClientbound("player_chat");
    public static final PacketType<ClientboundPlayerCombatEndPacket> CLIENTBOUND_PLAYER_COMBAT_END = createClientbound("player_combat_end");
    public static final PacketType<ClientboundPlayerCombatEnterPacket> CLIENTBOUND_PLAYER_COMBAT_ENTER = createClientbound("player_combat_enter");
    public static final PacketType<ClientboundPlayerCombatKillPacket> CLIENTBOUND_PLAYER_COMBAT_KILL = createClientbound("player_combat_kill");
    public static final PacketType<ClientboundPlayerInfoRemovePacket> CLIENTBOUND_PLAYER_INFO_REMOVE = createClientbound("player_info_remove");
    public static final PacketType<ClientboundPlayerInfoUpdatePacket> CLIENTBOUND_PLAYER_INFO_UPDATE = createClientbound("player_info_update");
    public static final PacketType<PacketPlayOutLookAt> CLIENTBOUND_PLAYER_LOOK_AT = createClientbound("player_look_at");
    public static final PacketType<PacketPlayOutPosition> CLIENTBOUND_PLAYER_POSITION = createClientbound("player_position");
    public static final PacketType<ClientboundPlayerRotationPacket> CLIENTBOUND_PLAYER_ROTATION = createClientbound("player_rotation");
    public static final PacketType<ClientboundRecipeBookAddPacket> CLIENTBOUND_RECIPE_BOOK_ADD = createClientbound("recipe_book_add");
    public static final PacketType<ClientboundRecipeBookRemovePacket> CLIENTBOUND_RECIPE_BOOK_REMOVE = createClientbound("recipe_book_remove");
    public static final PacketType<ClientboundRecipeBookSettingsPacket> CLIENTBOUND_RECIPE_BOOK_SETTINGS = createClientbound("recipe_book_settings");
    public static final PacketType<PacketPlayOutEntityDestroy> CLIENTBOUND_REMOVE_ENTITIES = createClientbound("remove_entities");
    public static final PacketType<PacketPlayOutRemoveEntityEffect> CLIENTBOUND_REMOVE_MOB_EFFECT = createClientbound("remove_mob_effect");
    public static final PacketType<PacketPlayOutRespawn> CLIENTBOUND_RESPAWN = createClientbound("respawn");
    public static final PacketType<PacketPlayOutEntityHeadRotation> CLIENTBOUND_ROTATE_HEAD = createClientbound("rotate_head");
    public static final PacketType<PacketPlayOutMultiBlockChange> CLIENTBOUND_SECTION_BLOCKS_UPDATE = createClientbound("section_blocks_update");
    public static final PacketType<PacketPlayOutSelectAdvancementTab> CLIENTBOUND_SELECT_ADVANCEMENTS_TAB = createClientbound("select_advancements_tab");
    public static final PacketType<ClientboundServerDataPacket> CLIENTBOUND_SERVER_DATA = createClientbound("server_data");
    public static final PacketType<ClientboundSetActionBarTextPacket> CLIENTBOUND_SET_ACTION_BAR_TEXT = createClientbound("set_action_bar_text");
    public static final PacketType<ClientboundSetBorderCenterPacket> CLIENTBOUND_SET_BORDER_CENTER = createClientbound("set_border_center");
    public static final PacketType<ClientboundSetBorderLerpSizePacket> CLIENTBOUND_SET_BORDER_LERP_SIZE = createClientbound("set_border_lerp_size");
    public static final PacketType<ClientboundSetBorderSizePacket> CLIENTBOUND_SET_BORDER_SIZE = createClientbound("set_border_size");
    public static final PacketType<ClientboundSetBorderWarningDelayPacket> CLIENTBOUND_SET_BORDER_WARNING_DELAY = createClientbound("set_border_warning_delay");
    public static final PacketType<ClientboundSetBorderWarningDistancePacket> CLIENTBOUND_SET_BORDER_WARNING_DISTANCE = createClientbound("set_border_warning_distance");
    public static final PacketType<PacketPlayOutCamera> CLIENTBOUND_SET_CAMERA = createClientbound("set_camera");
    public static final PacketType<PacketPlayOutViewCentre> CLIENTBOUND_SET_CHUNK_CACHE_CENTER = createClientbound("set_chunk_cache_center");
    public static final PacketType<PacketPlayOutViewDistance> CLIENTBOUND_SET_CHUNK_CACHE_RADIUS = createClientbound("set_chunk_cache_radius");
    public static final PacketType<PacketPlayOutSpawnPosition> CLIENTBOUND_SET_DEFAULT_SPAWN_POSITION = createClientbound("set_default_spawn_position");
    public static final PacketType<PacketPlayOutScoreboardDisplayObjective> CLIENTBOUND_SET_DISPLAY_OBJECTIVE = createClientbound("set_display_objective");
    public static final PacketType<PacketPlayOutEntityMetadata> CLIENTBOUND_SET_ENTITY_DATA = createClientbound("set_entity_data");
    public static final PacketType<PacketPlayOutAttachEntity> CLIENTBOUND_SET_ENTITY_LINK = createClientbound("set_entity_link");
    public static final PacketType<PacketPlayOutEntityVelocity> CLIENTBOUND_SET_ENTITY_MOTION = createClientbound("set_entity_motion");
    public static final PacketType<PacketPlayOutEntityEquipment> CLIENTBOUND_SET_EQUIPMENT = createClientbound("set_equipment");
    public static final PacketType<PacketPlayOutExperience> CLIENTBOUND_SET_EXPERIENCE = createClientbound("set_experience");
    public static final PacketType<PacketPlayOutUpdateHealth> CLIENTBOUND_SET_HEALTH = createClientbound("set_health");
    public static final PacketType<PacketPlayOutHeldItemSlot> CLIENTBOUND_SET_HELD_SLOT = createClientbound("set_held_slot");
    public static final PacketType<PacketPlayOutScoreboardObjective> CLIENTBOUND_SET_OBJECTIVE = createClientbound("set_objective");
    public static final PacketType<PacketPlayOutMount> CLIENTBOUND_SET_PASSENGERS = createClientbound("set_passengers");
    public static final PacketType<PacketPlayOutScoreboardTeam> CLIENTBOUND_SET_PLAYER_TEAM = createClientbound("set_player_team");
    public static final PacketType<PacketPlayOutScoreboardScore> CLIENTBOUND_SET_SCORE = createClientbound("set_score");
    public static final PacketType<ClientboundSetSimulationDistancePacket> CLIENTBOUND_SET_SIMULATION_DISTANCE = createClientbound("set_simulation_distance");
    public static final PacketType<ClientboundSetSubtitleTextPacket> CLIENTBOUND_SET_SUBTITLE_TEXT = createClientbound("set_subtitle_text");
    public static final PacketType<PacketPlayOutUpdateTime> CLIENTBOUND_SET_TIME = createClientbound("set_time");
    public static final PacketType<ClientboundSetTitleTextPacket> CLIENTBOUND_SET_TITLE_TEXT = createClientbound("set_title_text");
    public static final PacketType<ClientboundSetTitlesAnimationPacket> CLIENTBOUND_SET_TITLES_ANIMATION = createClientbound("set_titles_animation");
    public static final PacketType<PacketPlayOutEntitySound> CLIENTBOUND_SOUND_ENTITY = createClientbound("sound_entity");
    public static final PacketType<PacketPlayOutNamedSoundEffect> CLIENTBOUND_SOUND = createClientbound("sound");
    public static final PacketType<ClientboundStartConfigurationPacket> CLIENTBOUND_START_CONFIGURATION = createClientbound("start_configuration");
    public static final PacketType<PacketPlayOutStopSound> CLIENTBOUND_STOP_SOUND = createClientbound("stop_sound");
    public static final PacketType<ClientboundSystemChatPacket> CLIENTBOUND_SYSTEM_CHAT = createClientbound("system_chat");
    public static final PacketType<PacketPlayOutPlayerListHeaderFooter> CLIENTBOUND_TAB_LIST = createClientbound("tab_list");
    public static final PacketType<PacketPlayOutNBTQuery> CLIENTBOUND_TAG_QUERY = createClientbound("tag_query");
    public static final PacketType<PacketPlayOutCollect> CLIENTBOUND_TAKE_ITEM_ENTITY = createClientbound("take_item_entity");
    public static final PacketType<PacketPlayOutEntityTeleport> CLIENTBOUND_TELEPORT_ENTITY = createClientbound("teleport_entity");
    public static final PacketType<ClientboundEntityPositionSyncPacket> CLIENTBOUND_ENTITY_POSITION_SYNC = createClientbound("entity_position_sync");
    public static final PacketType<PacketPlayOutAdvancements> CLIENTBOUND_UPDATE_ADVANCEMENTS = createClientbound("update_advancements");
    public static final PacketType<PacketPlayOutUpdateAttributes> CLIENTBOUND_UPDATE_ATTRIBUTES = createClientbound("update_attributes");
    public static final PacketType<PacketPlayOutEntityEffect> CLIENTBOUND_UPDATE_MOB_EFFECT = createClientbound("update_mob_effect");
    public static final PacketType<PacketPlayOutRecipeUpdate> CLIENTBOUND_UPDATE_RECIPES = createClientbound("update_recipes");
    public static final PacketType<ClientboundProjectilePowerPacket> CLIENTBOUND_PROJECTILE_POWER = createClientbound("projectile_power");
    public static final PacketType<PacketPlayInTeleportAccept> SERVERBOUND_ACCEPT_TELEPORTATION = createServerbound("accept_teleportation");
    public static final PacketType<PacketPlayInTileNBTQuery> SERVERBOUND_BLOCK_ENTITY_TAG_QUERY = createServerbound("block_entity_tag_query");
    public static final PacketType<ServerboundSelectBundleItemPacket> SERVERBOUND_BUNDLE_ITEM_SELECTED = createServerbound("bundle_item_selected");
    public static final PacketType<PacketPlayInDifficultyChange> SERVERBOUND_CHANGE_DIFFICULTY = createServerbound("change_difficulty");
    public static final PacketType<ServerboundChatAckPacket> SERVERBOUND_CHAT_ACK = createServerbound("chat_ack");
    public static final PacketType<ServerboundChatCommandPacket> SERVERBOUND_CHAT_COMMAND = createServerbound("chat_command");
    public static final PacketType<ServerboundChatCommandSignedPacket> SERVERBOUND_CHAT_COMMAND_SIGNED = createServerbound("chat_command_signed");
    public static final PacketType<PacketPlayInChat> SERVERBOUND_CHAT = createServerbound("chat");
    public static final PacketType<ServerboundChatSessionUpdatePacket> SERVERBOUND_CHAT_SESSION_UPDATE = createServerbound("chat_session_update");
    public static final PacketType<ServerboundChunkBatchReceivedPacket> SERVERBOUND_CHUNK_BATCH_RECEIVED = createServerbound("chunk_batch_received");
    public static final PacketType<PacketPlayInClientCommand> SERVERBOUND_CLIENT_COMMAND = createServerbound("client_command");
    public static final PacketType<ServerboundClientTickEndPacket> SERVERBOUND_CLIENT_TICK_END = createServerbound("client_tick_end");
    public static final PacketType<PacketPlayInTabComplete> SERVERBOUND_COMMAND_SUGGESTION = createServerbound("command_suggestion");
    public static final PacketType<ServerboundConfigurationAcknowledgedPacket> SERVERBOUND_CONFIGURATION_ACKNOWLEDGED = createServerbound("configuration_acknowledged");
    public static final PacketType<PacketPlayInEnchantItem> SERVERBOUND_CONTAINER_BUTTON_CLICK = createServerbound("container_button_click");
    public static final PacketType<PacketPlayInWindowClick> SERVERBOUND_CONTAINER_CLICK = createServerbound("container_click");
    public static final PacketType<PacketPlayInCloseWindow> SERVERBOUND_CONTAINER_CLOSE = createServerbound("container_close");
    public static final PacketType<ServerboundContainerSlotStateChangedPacket> SERVERBOUND_CONTAINER_SLOT_STATE_CHANGED = createServerbound("container_slot_state_changed");
    public static final PacketType<ServerboundDebugSampleSubscriptionPacket> SERVERBOUND_DEBUG_SAMPLE_SUBSCRIPTION = createServerbound("debug_sample_subscription");
    public static final PacketType<PacketPlayInBEdit> SERVERBOUND_EDIT_BOOK = createServerbound("edit_book");
    public static final PacketType<PacketPlayInEntityNBTQuery> SERVERBOUND_ENTITY_TAG_QUERY = createServerbound("entity_tag_query");
    public static final PacketType<PacketPlayInUseEntity> SERVERBOUND_INTERACT = createServerbound("interact");
    public static final PacketType<PacketPlayInJigsawGenerate> SERVERBOUND_JIGSAW_GENERATE = createServerbound("jigsaw_generate");
    public static final PacketType<PacketPlayInDifficultyLock> SERVERBOUND_LOCK_DIFFICULTY = createServerbound("lock_difficulty");
    public static final PacketType<PacketPlayInFlying.PacketPlayInPosition> SERVERBOUND_MOVE_PLAYER_POS = createServerbound("move_player_pos");
    public static final PacketType<PacketPlayInFlying.PacketPlayInPositionLook> SERVERBOUND_MOVE_PLAYER_POS_ROT = createServerbound("move_player_pos_rot");
    public static final PacketType<PacketPlayInFlying.PacketPlayInLook> SERVERBOUND_MOVE_PLAYER_ROT = createServerbound("move_player_rot");
    public static final PacketType<PacketPlayInFlying.d> SERVERBOUND_MOVE_PLAYER_STATUS_ONLY = createServerbound("move_player_status_only");
    public static final PacketType<PacketPlayInVehicleMove> SERVERBOUND_MOVE_VEHICLE = createServerbound("move_vehicle");
    public static final PacketType<PacketPlayInBoatMove> SERVERBOUND_PADDLE_BOAT = createServerbound("paddle_boat");
    public static final PacketType<ServerboundPickItemFromBlockPacket> SERVERBOUND_PICK_ITEM_FROM_BLOCK = createServerbound("pick_item_from_block");
    public static final PacketType<ServerboundPickItemFromEntityPacket> SERVERBOUND_PICK_ITEM_FROM_ENTITY = createServerbound("pick_item_from_entity");
    public static final PacketType<PacketPlayInAutoRecipe> SERVERBOUND_PLACE_RECIPE = createServerbound("place_recipe");
    public static final PacketType<PacketPlayInAbilities> SERVERBOUND_PLAYER_ABILITIES = createServerbound("player_abilities");
    public static final PacketType<PacketPlayInBlockDig> SERVERBOUND_PLAYER_ACTION = createServerbound("player_action");
    public static final PacketType<PacketPlayInEntityAction> SERVERBOUND_PLAYER_COMMAND = createServerbound("player_command");
    public static final PacketType<PacketPlayInSteerVehicle> SERVERBOUND_PLAYER_INPUT = createServerbound("player_input");
    public static final PacketType<ServerboundPlayerLoadedPacket> SERVERBOUND_PLAYER_LOADED = createServerbound("player_loaded");
    public static final PacketType<PacketPlayInRecipeSettings> SERVERBOUND_RECIPE_BOOK_CHANGE_SETTINGS = createServerbound("recipe_book_change_settings");
    public static final PacketType<PacketPlayInRecipeDisplayed> SERVERBOUND_RECIPE_BOOK_SEEN_RECIPE = createServerbound("recipe_book_seen_recipe");
    public static final PacketType<PacketPlayInItemName> SERVERBOUND_RENAME_ITEM = createServerbound("rename_item");
    public static final PacketType<PacketPlayInAdvancements> SERVERBOUND_SEEN_ADVANCEMENTS = createServerbound("seen_advancements");
    public static final PacketType<PacketPlayInTrSel> SERVERBOUND_SELECT_TRADE = createServerbound("select_trade");
    public static final PacketType<PacketPlayInBeacon> SERVERBOUND_SET_BEACON = createServerbound("set_beacon");
    public static final PacketType<PacketPlayInHeldItemSlot> SERVERBOUND_SET_CARRIED_ITEM = createServerbound("set_carried_item");
    public static final PacketType<PacketPlayInSetCommandBlock> SERVERBOUND_SET_COMMAND_BLOCK = createServerbound("set_command_block");
    public static final PacketType<PacketPlayInSetCommandMinecart> SERVERBOUND_SET_COMMAND_MINECART = createServerbound("set_command_minecart");
    public static final PacketType<PacketPlayInSetCreativeSlot> SERVERBOUND_SET_CREATIVE_MODE_SLOT = createServerbound("set_creative_mode_slot");
    public static final PacketType<PacketPlayInSetJigsaw> SERVERBOUND_SET_JIGSAW_BLOCK = createServerbound("set_jigsaw_block");
    public static final PacketType<PacketPlayInStruct> SERVERBOUND_SET_STRUCTURE_BLOCK = createServerbound("set_structure_block");
    public static final PacketType<PacketPlayInUpdateSign> SERVERBOUND_SIGN_UPDATE = createServerbound("sign_update");
    public static final PacketType<PacketPlayInArmAnimation> SERVERBOUND_SWING = createServerbound("swing");
    public static final PacketType<PacketPlayInSpectate> SERVERBOUND_TELEPORT_TO_ENTITY = createServerbound("teleport_to_entity");
    public static final PacketType<PacketPlayInUseItem> SERVERBOUND_USE_ITEM_ON = createServerbound("use_item_on");
    public static final PacketType<PacketPlayInBlockPlace> SERVERBOUND_USE_ITEM = createServerbound("use_item");
    public static final PacketType<ClientboundResetScorePacket> CLIENTBOUND_RESET_SCORE = createClientbound("reset_score");
    public static final PacketType<ClientboundTickingStatePacket> CLIENTBOUND_TICKING_STATE = createClientbound("ticking_state");
    public static final PacketType<ClientboundTickingStepPacket> CLIENTBOUND_TICKING_STEP = createClientbound("ticking_step");
    public static final PacketType<ClientboundSetCursorItemPacket> CLIENTBOUND_SET_CURSOR_ITEM = createClientbound("set_cursor_item");
    public static final PacketType<ClientboundSetPlayerInventoryPacket> CLIENTBOUND_SET_PLAYER_INVENTORY = createClientbound("set_player_inventory");

    public GamePacketTypes() {}

    private static <T extends Packet<PacketListenerPlayOut>> PacketType<T> createClientbound(String s) {
        return new PacketType<>(EnumProtocolDirection.CLIENTBOUND, MinecraftKey.withDefaultNamespace(s));
    }

    private static <T extends Packet<PacketListenerPlayIn>> PacketType<T> createServerbound(String s) {
        return new PacketType<>(EnumProtocolDirection.SERVERBOUND, MinecraftKey.withDefaultNamespace(s));
    }
}
