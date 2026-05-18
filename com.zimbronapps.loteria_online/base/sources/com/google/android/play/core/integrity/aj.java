package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import r7.G;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class aj {
    final r7.f a;
    private final G b;
    private final String c;
    private final at d;
    private final k e;

    public aj(Context context, G g, at atVar, k kVar) {
        this.c = context.getPackageName();
        this.b = g;
        this.d = atVar;
        this.e = kVar;
        if (r7.j.b(context)) {
            this.a = new r7.f(context, g, "IntegrityService", ak.a, ae.a, null);
        } else {
            g.b("Phonesky is not installed.", new Object[0]);
            this.a = null;
        }
    }

    public static /* bridge */ /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList arrayList = new ArrayList();
        r7.r.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(r7.r.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ k d(aj ajVar) {
        return ajVar.e;
    }

    public static /* bridge */ /* synthetic */ at e(aj ajVar) {
        return ajVar.d;
    }

    public static /* bridge */ /* synthetic */ G f(aj ajVar) {
        return ajVar.b;
    }

    public static /* bridge */ /* synthetic */ String g(aj ajVar) {
        return ajVar.c;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i = bundle.getInt("dialog.intent.type");
        this.b.d("requestAndShowDialog(%s, %s)", this.c, Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.t(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.b.d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.a.t(new af(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new IntegrityServiceException(-13, e));
        }
    }
}
