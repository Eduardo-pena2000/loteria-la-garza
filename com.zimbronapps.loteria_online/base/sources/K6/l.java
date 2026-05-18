package K6;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class l extends J6.g {
    public l(String str, Collection collection, Collection collection2, int i) {
        super(str, collection, collection2, i);
    }

    public final /* synthetic */ void zza(Bundle bundle, Object obj) {
        ArrayList arrayList = (Collection) obj;
        bundle.putParcelableArrayList(getName(), arrayList instanceof ArrayList ? arrayList : new ArrayList(arrayList));
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public Collection zzb(Bundle bundle) {
        return bundle.getParcelableArrayList(getName());
    }
}
