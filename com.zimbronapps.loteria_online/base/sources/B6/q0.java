package b6;

import com.google.android.gms.internal.ads.zzdxt;
import java.util.ArrayDeque;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ r0 a;
    public final /* synthetic */ zzdxt b;
    public final /* synthetic */ ArrayDeque c;
    public final /* synthetic */ ArrayDeque d;

    public /* synthetic */ q0(r0 r0Var, zzdxt zzdxtVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        this.a = r0Var;
        this.b = zzdxtVar;
        this.c = arrayDeque;
        this.d = arrayDeque2;
    }

    public final /* synthetic */ void run() {
        this.a.f(this.b, this.c, this.d);
    }
}
