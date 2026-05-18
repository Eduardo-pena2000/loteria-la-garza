package org.apache.tika.parser;

import java.util.concurrent.Executor;
import org.apache.tika.metadata.Metadata;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class d implements Executor {
    public final /* synthetic */ Metadata a;

    public /* synthetic */ d(Metadata metadata) {
        this.a = metadata;
    }

    public final void execute(Runnable runnable) {
        ParsingReader.a(this.a, runnable);
    }
}
