package j6;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e extends a.a {
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, com.google.android.gms.common.internal.f fVar, Object obj, h.b bVar, h.c cVar) {
        return new p6.i(context, looper, fVar, (GoogleSignInOptions) obj, bVar, cVar);
    }

    public final /* bridge */ /* synthetic */ List getImpliedScopes(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.P1();
    }
}
