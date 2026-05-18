package k7;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzib;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class e7 {
    public final long a;
    public final zzib b;
    public final String c;
    public final Map d;
    public final k5 e;
    public final long f;
    public final long g;
    public final long h;
    public final int i;

    public /* synthetic */ e7(long j, zzib zzibVar, String str, Map map, k5 k5Var, long j2, long j3, long j4, int i, byte[] bArr) {
        this.a = j;
        this.b = zzibVar;
        this.c = str;
        this.d = map;
        this.e = k5Var;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = i;
    }

    public final N6 a() {
        return new N6(this.c, this.d, this.e, null);
    }

    public final G6 b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j = this.a;
        zzib zzibVar = this.b;
        String str = this.c;
        k5 k5Var = this.e;
        return new G6(j, zzibVar.zzcc(), str, bundle, k5Var.zza(), this.g, "");
    }

    public final long c() {
        return this.a;
    }

    public final zzib d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final k5 f() {
        return this.e;
    }

    public final long g() {
        return this.f;
    }

    public final long h() {
        return this.h;
    }

    public final int i() {
        return this.i;
    }
}
