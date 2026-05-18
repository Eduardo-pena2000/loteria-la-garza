package a7;

import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.games_v2.zzz;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class j implements i {
    public final int a;
    public final int b;
    public final boolean c;
    public final long d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final long i;
    public final String j;
    public final String k;
    public final String l;

    public j(i iVar) {
        this.a = iVar.z1();
        this.b = iVar.t0();
        this.c = iVar.o();
        this.d = iVar.j0();
        this.e = iVar.c();
        this.f = iVar.s1();
        this.g = iVar.k0();
        this.h = iVar.y0();
        this.i = iVar.h1();
        this.j = iVar.zza();
        this.k = iVar.zzc();
        this.l = iVar.zzb();
    }

    public static int b(i iVar) {
        return r.c(Integer.valueOf(iVar.z1()), Integer.valueOf(iVar.t0()), Boolean.valueOf(iVar.o()), Long.valueOf(iVar.j0()), iVar.c(), Long.valueOf(iVar.s1()), iVar.k0(), Long.valueOf(iVar.h1()), iVar.zza(), iVar.zzb(), iVar.zzc());
    }

    public static String d(i iVar) {
        String str;
        r.a a = r.d(iVar).a("TimeSpan", zzz.zza(iVar.z1()));
        int t0 = iVar.t0();
        if (t0 == -1) {
            str = "UNKNOWN";
        } else if (t0 == 0) {
            str = "PUBLIC";
        } else if (t0 != 1) {
            str = "SOCIAL_1P";
            if (t0 != 2) {
                if (t0 == 3) {
                    str = "FRIENDS";
                } else if (t0 != 4) {
                    throw new IllegalArgumentException("Unknown leaderboard collection: " + t0);
                }
            }
        } else {
            str = "SOCIAL";
        }
        return a.a("Collection", str).a("RawPlayerScore", iVar.o() ? Long.valueOf(iVar.j0()) : "none").a("DisplayPlayerScore", iVar.o() ? iVar.c() : "none").a("PlayerRank", iVar.o() ? Long.valueOf(iVar.s1()) : "none").a("DisplayPlayerRank", iVar.o() ? iVar.k0() : "none").a("NumScores", Long.valueOf(iVar.h1())).a("TopPageNextToken", iVar.zza()).a("WindowPageNextToken", iVar.zzb()).a("WindowPagePrevToken", iVar.zzc()).toString();
    }

    public static boolean f(i iVar, Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (iVar == obj) {
            return true;
        }
        i iVar2 = (i) obj;
        return r.b(Integer.valueOf(iVar2.z1()), Integer.valueOf(iVar.z1())) && r.b(Integer.valueOf(iVar2.t0()), Integer.valueOf(iVar.t0())) && r.b(Boolean.valueOf(iVar2.o()), Boolean.valueOf(iVar.o())) && r.b(Long.valueOf(iVar2.j0()), Long.valueOf(iVar.j0())) && r.b(iVar2.c(), iVar.c()) && r.b(Long.valueOf(iVar2.s1()), Long.valueOf(iVar.s1())) && r.b(iVar2.k0(), iVar.k0()) && r.b(Long.valueOf(iVar2.h1()), Long.valueOf(iVar.h1())) && r.b(iVar2.zza(), iVar.zza()) && r.b(iVar2.zzb(), iVar.zzb()) && r.b(iVar2.zzc(), iVar.zzc());
    }

    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        return f(this, obj);
    }

    public final long h1() {
        return this.i;
    }

    public final int hashCode() {
        return b(this);
    }

    public final long j0() {
        return this.d;
    }

    public final String k0() {
        return this.g;
    }

    public final boolean o() {
        return this.c;
    }

    public final long s1() {
        return this.f;
    }

    public final int t0() {
        return this.b;
    }

    public final String toString() {
        return d(this);
    }

    public final String y0() {
        return this.h;
    }

    public final int z1() {
        return this.a;
    }

    public final String zza() {
        return this.j;
    }

    public final String zzb() {
        return this.l;
    }

    public final String zzc() {
        return this.k;
    }

    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }
}
