package a7;

import android.net.Uri;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class c implements a {
    public final String a;
    public final String b;
    public final Uri c;
    public final int d;
    public final ArrayList e;
    public final String f;

    public c(a aVar) {
        this.a = aVar.y1();
        this.b = aVar.getDisplayName();
        this.c = aVar.a();
        this.f = aVar.getIconImageUrl();
        this.d = aVar.M();
        T6.f zza = aVar.zza();
        if (zza != null) {
            new GameEntity(zza);
        }
        ArrayList O0 = aVar.O0();
        int size = O0.size();
        this.e = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.e.add((j) ((i) O0.get(i)).freeze());
        }
    }

    public static int b(a aVar) {
        return r.c(aVar.y1(), aVar.getDisplayName(), aVar.a(), Integer.valueOf(aVar.M()), aVar.O0());
    }

    public static String d(a aVar) {
        return r.d(aVar).a("LeaderboardId", aVar.y1()).a("DisplayName", aVar.getDisplayName()).a("IconImageUri", aVar.a()).a("IconImageUrl", aVar.getIconImageUrl()).a("ScoreOrder", Integer.valueOf(aVar.M())).a("Variants", aVar.O0()).toString();
    }

    public static boolean f(a aVar, Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (aVar == obj) {
            return true;
        }
        a aVar2 = (a) obj;
        return r.b(aVar2.y1(), aVar.y1()) && r.b(aVar2.getDisplayName(), aVar.getDisplayName()) && r.b(aVar2.a(), aVar.a()) && r.b(Integer.valueOf(aVar2.M()), Integer.valueOf(aVar.M())) && r.b(aVar2.O0(), aVar.O0());
    }

    public final int M() {
        return this.d;
    }

    public final ArrayList O0() {
        return new ArrayList(this.e);
    }

    public final Uri a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        return f(this, obj);
    }

    public final String getDisplayName() {
        return this.b;
    }

    public String getIconImageUrl() {
        return this.f;
    }

    public final int hashCode() {
        return b(this);
    }

    public final String toString() {
        return d(this);
    }

    public final String y1() {
        return this.a;
    }

    public final T6.f zza() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }
}
