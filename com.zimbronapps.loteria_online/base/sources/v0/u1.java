package v0;

import android.graphics.RenderEffect;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class u1 {
    public RenderEffect a;

    public /* synthetic */ u1(kotlin.jvm.internal.k kVar) {
        this();
    }

    public final RenderEffect a() {
        RenderEffect renderEffect = this.a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect b = b();
        this.a = b;
        return b;
    }

    public abstract RenderEffect b();

    public u1() {
    }
}
