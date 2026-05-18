package za;

import Y9.a;
import android.content.res.AssetManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class f0 {
    public final AssetManager a;

    public static class a extends f0 {
        public final a.a b;

        public a(AssetManager assetManager, a.a aVar) {
            super(assetManager);
            this.b = aVar;
        }

        public String a(String str) {
            return this.b.a(str);
        }
    }

    public f0(AssetManager assetManager) {
        this.a = assetManager;
    }

    public abstract String a(String str);

    public String[] b(String str) {
        return this.a.list(str);
    }
}
