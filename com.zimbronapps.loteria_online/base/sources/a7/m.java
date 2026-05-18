package a7;

import com.google.android.gms.common.data.DataHolder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m extends w6.d implements i {
    public m(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public final String c() {
        return l("player_display_score");
    }

    public final boolean equals(Object obj) {
        return j.f(this, obj);
    }

    public final /* synthetic */ Object freeze() {
        return new j(this);
    }

    public final long h1() {
        if (p("total_scores")) {
            return -1L;
        }
        return j("total_scores");
    }

    public final int hashCode() {
        return j.b(this);
    }

    public final long j0() {
        if (p("player_raw_score")) {
            return -1L;
        }
        return j("player_raw_score");
    }

    public final String k0() {
        return l("player_display_rank");
    }

    public final boolean o() {
        return !p("player_raw_score");
    }

    public final long s1() {
        if (p("player_rank")) {
            return -1L;
        }
        return j("player_rank");
    }

    public final int t0() {
        return i("collection");
    }

    public final String toString() {
        return j.d(this);
    }

    public final String y0() {
        return l("player_score_tag");
    }

    public final int z1() {
        return i("timespan");
    }

    public final String zza() {
        return l("top_page_token_next");
    }

    public final String zzb() {
        return l("window_page_token_next");
    }

    public final String zzc() {
        return l("window_page_token_prev");
    }
}
