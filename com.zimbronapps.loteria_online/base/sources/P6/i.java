package p6;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.h;
import com.google.android.gms.internal.auth-api.zbaw;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class i extends com.google.android.gms.common.internal.i {
    public final GoogleSignInOptions a;

    public i(Context context, Looper looper, com.google.android.gms.common.internal.f fVar, GoogleSignInOptions googleSignInOptions, h.b bVar, h.c cVar) {
        super(context, looper, 91, fVar, bVar, cVar);
        GoogleSignInOptions.a aVar = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar.e(zbaw.zba());
        if (!fVar.e().isEmpty()) {
            Iterator it = fVar.e().iterator();
            while (it.hasNext()) {
                aVar.d((Scope) it.next(), new Scope[0]);
            }
        }
        this.a = aVar.a();
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof u ? (u) queryLocalInterface : new u(iBinder);
    }

    public final GoogleSignInOptions e() {
        return this.a;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final Intent getSignInIntent() {
        return o.a(getContext(), this.a);
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final boolean providesSignIn() {
        return true;
    }
}
