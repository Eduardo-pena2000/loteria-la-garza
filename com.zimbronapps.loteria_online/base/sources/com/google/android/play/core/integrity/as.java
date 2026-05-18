package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import r7.E;
import r7.G;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class as extends E {
    final TaskCompletionSource a;
    final r7.f b;
    private final G c = new G("RequestDialogCallbackImpl");
    private final String d;
    private final k e;
    private final Activity f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, r7.f fVar) {
        this.d = context.getPackageName();
        this.e = kVar;
        this.a = taskCompletionSource;
        this.f = activity;
        this.b = fVar;
    }

    public final void b(Bundle bundle) {
        this.b.v(this.a);
        this.c.d("onRequestDialog(%s)", this.d);
        Exception a = this.e.a(bundle);
        if (a != null) {
            this.a.trySetException(a);
            return;
        }
        PendingIntent parcelable = bundle.getParcelable("dialog.intent");
        if (parcelable == null) {
            this.c.b("onRequestDialog(%s): got null dialog intent", this.d);
            this.a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", parcelable);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.b.c()));
        this.c.a("Starting dialog intent...", new Object[0]);
        this.f.startActivityForResult(intent, 0);
    }
}
