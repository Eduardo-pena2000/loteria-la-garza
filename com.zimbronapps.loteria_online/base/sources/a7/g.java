package a7;

import T6.n;
import android.net.Uri;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.games.PlayerEntity;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class g implements e {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final Uri g;
    public final Uri h;
    public final PlayerEntity i;
    public final String j;
    public final String k;
    public final String l;

    public g(e eVar) {
        this.a = eVar.Y0();
        this.b = (String) t.l(eVar.r0());
        this.c = (String) t.l(eVar.g0());
        this.d = eVar.V0();
        this.e = eVar.U0();
        this.f = eVar.u1();
        this.g = eVar.A1();
        this.h = eVar.C1();
        n m = eVar.m();
        this.i = m == null ? null : new PlayerEntity(m);
        this.j = eVar.v();
        this.k = eVar.getScoreHolderIconImageUrl();
        this.l = eVar.getScoreHolderHiResImageUrl();
    }

    public static int b(e eVar) {
        return r.c(Long.valueOf(eVar.Y0()), eVar.r0(), Long.valueOf(eVar.V0()), eVar.g0(), Long.valueOf(eVar.U0()), eVar.u1(), eVar.A1(), eVar.C1(), eVar.m());
    }

    public static String d(e eVar) {
        return r.d(eVar).a("Rank", Long.valueOf(eVar.Y0())).a("DisplayRank", eVar.r0()).a("Score", Long.valueOf(eVar.V0())).a("DisplayScore", eVar.g0()).a("Timestamp", Long.valueOf(eVar.U0())).a("DisplayName", eVar.u1()).a("IconImageUri", eVar.A1()).a("IconImageUrl", eVar.getScoreHolderIconImageUrl()).a("HiResImageUri", eVar.C1()).a("HiResImageUrl", eVar.getScoreHolderHiResImageUrl()).a("Player", eVar.m() == null ? null : eVar.m()).a("ScoreTag", eVar.v()).toString();
    }

    public static boolean f(e eVar, Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (eVar == obj) {
            return true;
        }
        e eVar2 = (e) obj;
        return r.b(Long.valueOf(eVar2.Y0()), Long.valueOf(eVar.Y0())) && r.b(eVar2.r0(), eVar.r0()) && r.b(Long.valueOf(eVar2.V0()), Long.valueOf(eVar.V0())) && r.b(eVar2.g0(), eVar.g0()) && r.b(Long.valueOf(eVar2.U0()), Long.valueOf(eVar.U0())) && r.b(eVar2.u1(), eVar.u1()) && r.b(eVar2.A1(), eVar.A1()) && r.b(eVar2.C1(), eVar.C1()) && r.b(eVar2.m(), eVar.m()) && r.b(eVar2.v(), eVar.v());
    }

    public final Uri A1() {
        PlayerEntity playerEntity = this.i;
        return playerEntity == null ? this.g : playerEntity.a();
    }

    public final Uri C1() {
        PlayerEntity playerEntity = this.i;
        return playerEntity == null ? this.h : playerEntity.g();
    }

    public final long U0() {
        return this.e;
    }

    public final long V0() {
        return this.d;
    }

    public final long Y0() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return f(this, obj);
    }

    public final String g0() {
        return this.c;
    }

    public String getScoreHolderHiResImageUrl() {
        PlayerEntity playerEntity = this.i;
        return playerEntity == null ? this.l : playerEntity.getHiResImageUrl();
    }

    public String getScoreHolderIconImageUrl() {
        PlayerEntity playerEntity = this.i;
        return playerEntity == null ? this.k : playerEntity.getIconImageUrl();
    }

    public final int hashCode() {
        return b(this);
    }

    public final n m() {
        return this.i;
    }

    public final String r0() {
        return this.b;
    }

    public final String toString() {
        return d(this);
    }

    public final String u1() {
        PlayerEntity playerEntity = this.i;
        return playerEntity == null ? this.f : playerEntity.getDisplayName();
    }

    public final String v() {
        return this.j;
    }
}
