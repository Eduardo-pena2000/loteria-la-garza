package com.google.android.gms.games.internal.v2.resolution;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.games_v2.zzfg;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class GamesResolutionActivity extends Activity {
    public ResultReceiver a;
    public boolean b;

    public final void a(int i, Intent intent) {
        Bundle bundle;
        if (this.b) {
            return;
        }
        this.b = true;
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            if (intent == null) {
                bundle = new Bundle();
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("resultData", intent);
                bundle = bundle2;
            }
            resultReceiver.send(i, bundle);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            a(i2, intent);
            finish();
            return;
        }
        zzfg.zzc("ResultActivity", "Unexpected request code: " + i);
        a(0, intent);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = (ResultReceiver) t.l(bundle.getParcelable("resultReceiver"));
            return;
        }
        this.a = (ResultReceiver) t.l(getIntent().getParcelableExtra("resultReceiver"));
        try {
            startIntentSenderForResult(((PendingIntent) t.l(getIntent().getParcelableExtra("pendingIntent"))).getIntentSender(), 0, (Intent) null, 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            zzfg.zzd("ResultActivity", "Failed to launch", e);
            a(0, null);
            finish();
        }
    }

    public final void onDestroy() {
        if (!isChangingConfigurations()) {
            a(0, null);
        }
        super.onDestroy();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("resultReceiver", this.a);
    }
}
