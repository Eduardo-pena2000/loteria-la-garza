package K6;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class t extends J6.f {
    public t(String str, int i) {
        super(str, i);
    }

    public final /* synthetic */ void zza(Bundle bundle, Object obj) {
        bundle.putString(getName(), (String) obj);
    }

    public final /* synthetic */ Object zzb(Bundle bundle) {
        return bundle.getString(getName());
    }

    public final /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
        return dataHolder.R1(getName(), i, i2);
    }
}
