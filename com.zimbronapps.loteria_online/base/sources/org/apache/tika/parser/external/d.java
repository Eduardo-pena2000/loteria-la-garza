package org.apache.tika.parser.external;

import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ Process a;
    public final /* synthetic */ InputStream b;

    public /* synthetic */ d(Process process, InputStream inputStream) {
        this.a = process;
        this.b = inputStream;
    }

    public final void run() {
        ExternalParser.b(this.a, this.b);
    }
}
