/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  neo.deobf.Event
 *  net.minecraft.block.state.BlockState
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 */
package com.botclient;

import com.botclient.Event;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class BlockRenderEvent
implements Event {
    public final BlockState state;
    public final BufferBuilder bufferBuilder;
    public final BlockPos pos;
    public final IBlockAccess access;

    public BlockPos getPos() {
        return (this.pos);
    }

    private static IBlockAccess getAccess(BlockRenderEvent instance) {
        return instance.access;
    }

    private static BufferBuilder getBufferBuilder(BlockRenderEvent instance) {
        return instance.bufferBuilder;
    }

    private static BlockPos getPos(BlockRenderEvent instance) {
        return instance.pos;
    }

    public BlockState getState() {
        return (this.state);
    }

    public BufferBuilder getBufferBuilder() {
        return (this.bufferBuilder);
    }

    public BlockRenderEvent(BlockState state, BlockPos pos, IBlockAccess access, BufferBuilder bufferBuilder) {
        this.state = state;
        this.pos = pos;
        this.access = access;
        this.bufferBuilder = bufferBuilder;
    }

    private static BlockState getState(BlockRenderEvent instance) {
        return instance.state;
    }

    public IBlockAccess getAccess() {
        return (this.access);
    }
}

