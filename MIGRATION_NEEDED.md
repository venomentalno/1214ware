# Migration Required: 1.12.x Forge → 1.21.4 Fabric

## Problem Summary
The codebase contains decompiled code from a Minecraft 1.12.x Forge mod that is incompatible with Minecraft 1.21.4 Fabric.

## Major Issues

### 1. Text Formatting (CaptchaManager.java, ProxyManager.java)
- **Old:** `net.minecraft.text.Formatting` (doesn't exist)
- **New:** `net.minecraft.util.Formatting` 
- **Also:** `TextFormat` class doesn't exist - should use `Formatting` enum directly

### 2. Packet Classes (PBot.java, PBotNetHandlerPlayClient.java)
All `SPacket*` and `CPacket*` classes need replacement:
- `CustomPayloadC2SPacket` → exists but different API
- `SelectedSlotChangeC2SPacket` → exists
- `CPacketClientStatus` → `ClientStatusC2SPacket`
- `CPacketConfirmTeleport` → `TeleportConfirmC2SPacket`
- `CPacketConfirmTransaction` → removed in newer versions
- `CPacketKeepAlive` → `KeepAliveC2SPacket`
- All `SPacket*` S2C packets have different names

### 3. Entity Classes (PBotNetHandlerPlayClient.java)
All entity classes from 1.12.x packages need updating:
- `net.minecraft.entity.*` → `net.minecraft.entity.Entity`, `net.minecraft.entity.LivingEntity`
- `EntityAreaEffectCloud` → `AreaEffectCloudEntity`
- `EntityLeashKnot` → `LeashKnotEntity`
- `EntityLiving` → `LivingEntity`
- `EntityLightningBolt` → `LightningEntity`
- `AbstractHorse` → `HorseEntity`
- All projectile entities renamed (e.g., `EntityArrow` → `ArrowEntity`)
- All item entities renamed (e.g., `EntityItemFrame` → `ItemFrameEntity`)

### 4. Client-Specific Classes
- `EntityOtherPlayerMP` → `OtherClientPlayerEntity`
- `NetworkPlayerInfo` → `PlayerListEntry`
- `ContainerLocalMenu` → doesn't exist, use `ScreenHandler`
- `LocalBlockIntercommunication` → doesn't exist

### 5. Attributes Package
- `AbstractAttributeMap` → `EntityAttributes`
- `AttributeModifier` → exists but different package
- `IAttribute`, `IAttributeInstance` → replaced with `EntityAttribute` system
- `RangedAttribute` → replaced

### 6. Inventory Classes
- `ContainerHorseChest` → doesn't exist, use `SimpleInventory`
- `InventoryBasic` → `SimpleInventory`
- `PacketThreadUtil` → `ThreadedAnvilScreenHandler` or removed

### 7. Network Handler
- `INetHandlerPlayClient` → `ClientPlayPacketListener`

### 8. Direction
- `net.minecraft.util.Direction` → exists but may have different API

## Recommended Approach

1. **Create a TextFormat utility class** to replace the missing TextFormat with Formatting enum
2. **Remove all obsolete imports** from affected files
3. **Replace packet classes** with their 1.21.4 equivalents
4. **Update entity references** to use new naming conventions
5. **Rewrite networking code** to use Fabric's networking API
6. **Consider using ViaVersion** for protocol support if multi-version is needed

## Files Requiring Changes
- CaptchaManager.java
- ProxyManager.java  
- PBot.java
- ServerStatusPinger.java
- PBotNetHandlerPlayClient.java (94+ errors - most critical)
- FreeCamModule.java
- PBotPlayer.java
- PlaceholderFormatter.java

