package T6;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GameEntity;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class g extends K implements f {
    public g(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public final String E() {
        return l("developer_name");
    }

    public final String G0() {
        return l("external_game_id");
    }

    public final String R() {
        return l("theme_color");
    }

    public final int S0() {
        return i("leaderboard_count");
    }

    public final boolean T() {
        return i("snapshots_enabled") > 0;
    }

    public final int Z() {
        return i("achievement_total_count");
    }

    public final Uri a() {
        return q("game_icon_image_uri");
    }

    public final String a0() {
        return l("secondary_category");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return GameEntity.V1(this, obj);
    }

    public final Uri g() {
        return q("game_hi_res_image_uri");
    }

    public final String getDescription() {
        return l("game_description");
    }

    public final String getDisplayName() {
        return l("display_name");
    }

    public String getFeaturedImageUrl() {
        return l("featured_image_url");
    }

    public String getHiResImageUrl() {
        return l("game_hi_res_image_url");
    }

    public String getIconImageUrl() {
        return l("game_icon_image_url");
    }

    public final int hashCode() {
        return GameEntity.Q1(this);
    }

    public final boolean p0() {
        return i("gamepad_support") > 0;
    }

    public final String t() {
        return l("primary_category");
    }

    public final String toString() {
        return GameEntity.S1(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        new GameEntity(this).writeToParcel(parcel, i);
    }

    public final Uri x0() {
        return q("featured_image_uri");
    }

    public final String zza() {
        return l("package_name");
    }

    public final boolean zzb() {
        return b("identity_sharing_confirmed");
    }

    public final boolean zzc() {
        return i("installed") > 0;
    }

    public final boolean zzd() {
        return b("muted");
    }

    public final boolean zze() {
        return b("play_enabled_game");
    }

    public final boolean zzf() {
        if (!n("profileless_recall_enabled_v3") || p("profileless_recall_enabled_v3")) {
            return false;
        }
        return b("profileless_recall_enabled_v3");
    }

    public final boolean zzg() {
        return i("real_time_support") > 0;
    }

    public final boolean zzh() {
        return i("turn_based_support") > 0;
    }
}
