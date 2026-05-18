package G1;

import G1.m;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class o {
    public static final Object a = new Object();
    public static final Object b = new Object();

    public static Bundle a(m.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d = aVar.d();
        bundle.putInt("icon", d != null ? d.g() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    public static Bundle b(u uVar) {
        new Bundle();
        throw null;
    }

    public static Bundle[] c(u[] uVarArr) {
        if (uVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[uVarArr.length];
        for (int i = 0; i < uVarArr.length; i++) {
            u uVar = uVarArr[i];
            bundleArr[i] = b(null);
        }
        return bundleArr;
    }
}
