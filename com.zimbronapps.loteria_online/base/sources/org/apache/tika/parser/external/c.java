package org.apache.tika.parser.external;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ ExternalParser a;
    public final /* synthetic */ InputStream b;
    public final /* synthetic */ Metadata c;

    public /* synthetic */ c(ExternalParser externalParser, InputStream inputStream, Metadata metadata) {
        this.a = externalParser;
        this.b = inputStream;
        this.c = metadata;
    }

    public final void run() {
        ExternalParser.c(this.a, this.b, this.c);
    }
}
