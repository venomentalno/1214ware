/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector3i
 */
package com.botclient;

import javax.vecmath.Vector3i;

public class PathNode {
    public PathNode prev;
    public int dist;
    public final Vector3i pos;

    public PathNode(Vector3i pos) {
        this.pos = pos;
        this.prev = null;
        this.dist = 0;
    }
}





