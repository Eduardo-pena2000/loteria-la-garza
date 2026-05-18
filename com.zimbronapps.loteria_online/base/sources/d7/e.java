package d7;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e extends w6.d implements a {
    public Bundle d;

    public e(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public final float D1() {
        if (n("high_spender_probability")) {
            return d("high_spender_probability");
        }
        return -1.0f;
    }

    public final int I0() {
        return i("num_sessions");
    }

    public final float K1() {
        return d("ave_session_length_minutes");
    }

    public final float P0() {
        if (n("total_spend_next_28_days")) {
            return d("total_spend_next_28_days");
        }
        return -1.0f;
    }

    public final float W() {
        return d("num_sessions_percentile");
    }

    public final float X() {
        if (n("spend_probability")) {
            return d("spend_probability");
        }
        return -1.0f;
    }

    public final int Y() {
        return i("num_purchases");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return c.O1(this, obj);
    }

    public final float h() {
        return d("churn_probability");
    }

    public final int hashCode() {
        return c.M1(this);
    }

    public final int q0() {
        return i("days_since_last_played");
    }

    public final float r() {
        return d("spend_percentile");
    }

    public final String toString() {
        return c.N1(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        d.a(new c(this), parcel, i);
    }

    public final Bundle zza() {
        Bundle bundle = this.d;
        if (bundle != null) {
            return bundle;
        }
        this.d = new Bundle();
        String l = l("unknown_raw_keys");
        String l2 = l("unknown_raw_values");
        if (l != null && l2 != null) {
            String[] split = l.split(",");
            String[] split2 = l2.split(",");
            com.google.android.gms.common.internal.c.e(split.length <= split2.length, "Invalid raw arguments!");
            for (int i = 0; i < split.length; i++) {
                this.d.putString(split[i], split2[i]);
            }
        }
        return this.d;
    }
}
