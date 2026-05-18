package a7;

import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d extends w6.d implements a {
    public final int d;
    public final T6.f e;

    public d(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
        this.e = new T6.g(dataHolder, i);
    }

    public final int M() {
        return i("score_order");
    }

    public final ArrayList O0() {
        ArrayList arrayList = new ArrayList(this.d);
        for (int i = 0; i < this.d; i++) {
            arrayList.add(new m(this.a, this.b + i));
        }
        return arrayList;
    }

    public final Uri a() {
        return q("board_icon_image_uri");
    }

    public final boolean equals(Object obj) {
        return c.f(this, obj);
    }

    public final /* synthetic */ Object freeze() {
        return new c(this);
    }

    public final String getDisplayName() {
        return l("name");
    }

    public String getIconImageUrl() {
        return l("board_icon_image_url");
    }

    public final int hashCode() {
        return c.b(this);
    }

    public final String toString() {
        return c.d(this);
    }

    public final String y1() {
        return l("external_leaderboard_id");
    }

    public final T6.f zza() {
        return this.e;
    }
}
