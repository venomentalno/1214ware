/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.RayTraceResult$Type
 */
package com.botclient;

import net.minecraft.util.hit.HitResult;

/*
 * Exception performing whole class analysis ignored.
 */
class RayTraceTypeSwitchMap {
    public static final int[] $SwitchMap$net$minecraft$util$math$RayTraceResult$Type;

    static {
        $SwitchMap$net$minecraft$util$math$RayTraceResult$Type = new int[HitResult.Type.values().length];
        try {
            RayTraceTypeSwitchMap.$SwitchMap$net$minecraft$util$math$RayTraceResult$Type[HitResult.Type.ENTITY.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            RayTraceTypeSwitchMap.$SwitchMap$net$minecraft$util$math$RayTraceResult$Type[HitResult.Type.BLOCK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            RayTraceTypeSwitchMap.$SwitchMap$net$minecraft$util$math$RayTraceResult$Type[HitResult.Type.MISS.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}





