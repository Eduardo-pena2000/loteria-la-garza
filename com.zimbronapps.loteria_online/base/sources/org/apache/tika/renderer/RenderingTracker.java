package org.apache.tika.renderer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class RenderingTracker {
    private int id = 0;

    public synchronized int getNextId() {
        int i;
        i = this.id + 1;
        this.id = i;
        return i;
    }
}
