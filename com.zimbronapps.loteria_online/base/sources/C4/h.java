package c4;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class h {
    public static /* bridge */ /* synthetic */ void a(MeasurementManager measurementManager, Uri uri, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerTrigger(uri, executor, outcomeReceiver);
    }
}
