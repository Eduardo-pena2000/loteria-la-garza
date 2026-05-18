package a7;

import T6.n;
import T6.r;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h extends w6.d implements e {
    public final r d;

    public h(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.d = new r(dataHolder, i, null);
    }

    public final Uri A1() {
        return p("external_player_id") ? q("default_display_image_uri") : this.d.a();
    }

    public final Uri C1() {
        if (p("external_player_id")) {
            return null;
        }
        return this.d.g();
    }

    public final long U0() {
        return j("achieved_timestamp");
    }

    public final long V0() {
        return j("raw_score");
    }

    public final long Y0() {
        return j("rank");
    }

    public final boolean equals(Object obj) {
        return g.f(this, obj);
    }

    public final String g0() {
        return l("display_score");
    }

    public String getScoreHolderHiResImageUrl() {
        if (p("external_player_id")) {
            return null;
        }
        return this.d.getHiResImageUrl();
    }

    public String getScoreHolderIconImageUrl() {
        return p("external_player_id") ? l("default_display_image_url") : this.d.getIconImageUrl();
    }

    public final int hashCode() {
        return g.b(this);
    }

    public final n m() {
        if (p("external_player_id")) {
            return null;
        }
        return this.d;
    }

    public final String r0() {
        return l("display_rank");
    }

    public final String toString() {
        return g.d(this);
    }

    public final String u1() {
        return p("external_player_id") ? l("default_display_name") : this.d.getDisplayName();
    }

    public final String v() {
        return l("score_tag");
    }
}
