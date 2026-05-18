package K6;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class s extends J6.g {
    public s(String str, int i) {
        super(str, Collections.singleton(str), Collections.emptySet(), 4300000);
    }

    public final /* synthetic */ void zza(Bundle bundle, Object obj) {
        bundle.putStringArrayList(getName(), new ArrayList((Collection) obj));
    }

    public final /* synthetic */ Object zzb(Bundle bundle) {
        return bundle.getStringArrayList(getName());
    }

    public final /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
        return zzd(dataHolder, i, i2);
    }

    public final Collection zzd(DataHolder dataHolder, int i, int i2) {
        try {
            String R1 = dataHolder.R1(getName(), i, i2);
            if (R1 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(R1);
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                arrayList.add(jSONArray.getString(i3));
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (JSONException e) {
            throw new IllegalStateException("DataHolder supplied invalid JSON", e);
        }
    }
}
