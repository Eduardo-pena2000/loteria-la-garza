package G1;

import android.content.res.Configuration;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j {
    public final boolean a;
    public Configuration b;

    public j(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(boolean z, Configuration configuration) {
        this(z);
        kotlin.jvm.internal.t.g(configuration, "newConfig");
        this.b = configuration;
    }
}
