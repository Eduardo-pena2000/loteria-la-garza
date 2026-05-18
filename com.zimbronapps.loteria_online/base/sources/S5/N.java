package S5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbtt;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class n extends A {
    public final /* synthetic */ Context b;
    public final /* synthetic */ q2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zzbtt e;
    public final /* synthetic */ y f;

    public n(y yVar, Context context, q2 q2Var, String str, zzbtt zzbttVar) {
        this.b = context;
        this.c = q2Var;
        this.d = str;
        this.e = zzbttVar;
        Objects.requireNonNull(yVar);
        this.f = yVar;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        y.l(this.b, "app_open");
        return new O1();
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return this.f.m().a(this.b, this.c, this.d, this.e, 4);
    }

    public final /* bridge */ /* synthetic */ Object c(s0 s0Var) {
        return s0Var.E0(N6.b.s1(this.b), this.c, this.d, this.e, 254715000);
    }
}
