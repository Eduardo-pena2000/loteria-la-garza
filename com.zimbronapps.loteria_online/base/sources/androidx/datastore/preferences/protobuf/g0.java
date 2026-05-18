package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class g0 extends RuntimeException {
    public final List a;

    public g0(K k) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.a = null;
    }

    public v a() {
        return new v(getMessage());
    }
}
