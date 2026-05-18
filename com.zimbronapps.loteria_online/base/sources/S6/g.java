package s6;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.auth_blockstore.zzab;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import s6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class g extends i {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, Looper looper, com.google.android.gms.common.internal.f fVar, com.google.android.gms.common.api.internal.f fVar2, o oVar) {
        super(context, looper, 381, fVar, fVar2, oVar);
        t.g(context, "context");
        t.g(looper, "looper");
        t.g(fVar, "clientSettings");
        t.g(fVar2, "connectionCallbacks");
        t.g(oVar, "connectionFailedListener");
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public c createServiceInterface(IBinder iBinder) {
        t.g(iBinder, "binder");
        c q1 = c.a.q1(iBinder);
        t.f(q1, "asInterface(...)");
        return q1;
    }

    public v6.d[] getApiFeatures() {
        v6.d[] dVarArr = zzab.zzl;
        t.f(dVarArr, "ALL_FEATURES");
        return dVarArr;
    }

    public int getMinApkVersion() {
        return 17895000;
    }

    public String getServiceDescriptor() {
        return "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService";
    }

    public String getStartServiceAction() {
        return "com.google.android.gms.auth.blockstore.restorecredential.service.START_RESTORE_CRED";
    }

    public boolean getUseDynamicLookup() {
        return true;
    }

    public boolean usesClientTelemetry() {
        return true;
    }
}
