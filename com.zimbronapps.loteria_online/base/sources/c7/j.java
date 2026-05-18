package c7;

import T6.r;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class j extends w6.d implements e {
    public final T6.f d;
    public final T6.n e;

    public j(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.d = new T6.g(dataHolder, i);
        this.e = new r(dataHolder, i, null);
    }

    public final float F1() {
        float d = d("cover_icon_image_height");
        float d2 = d("cover_icon_image_width");
        if (d == 0.0f) {
            return 0.0f;
        }
        return d2 / d;
    }

    public final String J1() {
        return l("external_snapshot_id");
    }

    public final long K0() {
        return j("duration");
    }

    public final T6.f L1() {
        return this.d;
    }

    public final long O() {
        return j("progress_value");
    }

    public final Uri b0() {
        return q("cover_icon_image_uri");
    }

    public final T6.n c0() {
        return this.e;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return i.O1(this, obj);
    }

    public String getCoverImageUrl() {
        return l("cover_icon_image_url");
    }

    public final String getDescription() {
        return l("description");
    }

    public final String getDeviceName() {
        return l("device_name");
    }

    public final int hashCode() {
        return i.M1(this);
    }

    public final String toString() {
        return i.N1(this);
    }

    public final String w0() {
        return l("unique_name");
    }

    public final boolean w1() {
        return i("pending_change_count") > 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        new i(this).writeToParcel(parcel, i);
    }

    public final long y() {
        return j("last_modified_timestamp");
    }

    public final String zza() {
        return l("title");
    }
}
