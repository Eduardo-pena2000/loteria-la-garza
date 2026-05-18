package org.apache.tika.parser.external;

import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ InputStream a;

    public /* synthetic */ b(InputStream inputStream) {
        this.a = inputStream;
    }

    public final void run() {
        ExternalParser.a(this.a);
    }
}
