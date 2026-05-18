package K6;

import android.os.Bundle;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class m extends J6.f {
    public m(String str, Collection collection, Collection collection2, int i) {
        super(str, collection, collection2, i);
    }

    public final /* synthetic */ void zza(Bundle bundle, Object obj) {
        bundle.putParcelable(getName(), (ReflectedParcelable) obj);
    }

    public final /* synthetic */ Object zzb(Bundle bundle) {
        return (ReflectedParcelable) bundle.getParcelable(getName());
    }
}
