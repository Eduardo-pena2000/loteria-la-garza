package org.apache.tika.io;

import java.io.Closeable;
import java.nio.file.Path;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class d implements Closeable {
    public final /* synthetic */ Path a;

    public /* synthetic */ d(Path path) {
        this.a = path;
    }

    public final void close() {
        TemporaryResources.a(this.a);
    }
}
