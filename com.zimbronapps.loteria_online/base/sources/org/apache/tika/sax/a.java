package org.apache.tika.sax;

import org.apache.tika.sax.SafeContentHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class a implements SafeContentHandler.Output {
    public final /* synthetic */ SafeContentHandler a;

    public /* synthetic */ a(SafeContentHandler safeContentHandler) {
        this.a = safeContentHandler;
    }

    public final void write(char[] cArr, int i, int i2) {
        SafeContentHandler.a(this.a, cArr, i, i2);
    }
}
