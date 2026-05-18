package T6;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.PlayerEntity;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class r extends K implements n {
    public final X6.e d;
    public final q e;
    public final X6.d f;
    public final T g;
    public final y h;

    public r(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i);
        X6.e eVar = new X6.e(null);
        this.d = eVar;
        this.f = new X6.d(dataHolder, i, eVar);
        this.g = new T(dataHolder, i, eVar);
        this.h = new y(dataHolder, i, eVar);
        if (p(eVar.k) || j(eVar.k) == -1) {
            this.e = null;
            return;
        }
        int i2 = i(eVar.l);
        int i3 = i(eVar.o);
        p pVar = new p(i2, j(eVar.m), j(eVar.n));
        this.e = new q(j(eVar.k), j(eVar.q), pVar, i2 != i3 ? new p(i3, j(eVar.n), j(eVar.p)) : pVar);
    }

    public final Uri A0() {
        return q(this.d.C);
    }

    public final String H1() {
        return l(this.d.a);
    }

    public final long J() {
        if (!n(this.d.j) || p(this.d.j)) {
            return -1L;
        }
        return j(this.d.j);
    }

    public final q N() {
        return this.e;
    }

    public final d R0() {
        if (this.h.F()) {
            return this.h;
        }
        return null;
    }

    public final Uri a() {
        return q(this.d.d);
    }

    public final s d0() {
        T t = this.g;
        if (t.s() == -1 && t.zzb() == null && t.zza() == null) {
            return null;
        }
        return this.g;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return PlayerEntity.V1(this, obj);
    }

    public final /* synthetic */ Object freeze() {
        return new PlayerEntity(this);
    }

    public final Uri g() {
        return q(this.d.f);
    }

    public String getBannerImageLandscapeUrl() {
        return l(this.d.D);
    }

    public String getBannerImagePortraitUrl() {
        return l(this.d.F);
    }

    public final String getDisplayName() {
        return l(this.d.c);
    }

    public String getHiResImageUrl() {
        return l(this.d.g);
    }

    public String getIconImageUrl() {
        return l(this.d.e);
    }

    public final String getTitle() {
        return l(this.d.r);
    }

    public final int hashCode() {
        return PlayerEntity.Q1(this);
    }

    public final String toString() {
        return PlayerEntity.S1(this);
    }

    public final long u() {
        return j(this.d.h);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        new PlayerEntity(this).writeToParcel(parcel, i);
    }

    public final Uri x() {
        return q(this.d.E);
    }

    public final int zza() {
        return i(this.d.i);
    }

    public final long zzb() {
        String str = this.d.G;
        if (!n(str) || p(str)) {
            return -1L;
        }
        return j(str);
    }

    public final X6.b zzc() {
        if (p(this.d.t)) {
            return null;
        }
        return this.f;
    }

    public final String zzd() {
        return z(this.d.b, null);
    }

    public final String zze() {
        return l(this.d.A);
    }

    public final String zzf() {
        return l(this.d.B);
    }

    public final boolean zzg() {
        return b(this.d.z);
    }

    public final boolean zzh() {
        return n(this.d.M) && b(this.d.M);
    }

    public final boolean zzi() {
        return b(this.d.s);
    }
}
