package c4;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.view.InputEvent;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class j {
    public static /* bridge */ /* synthetic */ void a(MeasurementManager measurementManager, Uri uri, InputEvent inputEvent, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerSource(uri, inputEvent, executor, outcomeReceiver);
    }
}
