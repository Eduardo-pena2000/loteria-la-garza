package com.unity3d.ads.core.domain.attribution;

import Ca.I;
import Ca.l;
import Ca.m;
import Ca.s;
import Ga.e;
import Ga.k;
import Ha.c;
import Ia.b;
import Ia.h;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import c4.f;
import c4.i;
import c4.j;
import cb.t0;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import fb.N;
import kotlin.jvm.internal.t;

@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidAttribution {
    private final ISDKDispatchers dispatchers;
    private final l measurementManager$delegate;
    private final SessionRepository sessionRepository;

    public AndroidAttribution(Context context, ISDKDispatchers dispatchers, SessionRepository sessionRepository) {
        t.g(context, "context");
        t.g(dispatchers, "dispatchers");
        t.g(sessionRepository, "sessionRepository");
        this.dispatchers = dispatchers;
        this.sessionRepository = sessionRepository;
        this.measurementManager$delegate = m.b(new AndroidAttribution$measurementManager$2(this, context));
    }

    public static final /* synthetic */ MeasurementManager access$getMeasurementManager(AndroidAttribution androidAttribution, Context context) {
        return androidAttribution.getMeasurementManager(context);
    }

    private final MeasurementManager getMeasurementManager() {
        return f.a(this.measurementManager$delegate.getValue());
    }

    private final Uri getUri(String str, AdObject adObject) {
        Uri parse = Uri.parse(str);
        t.f(parse, "parse(this)");
        Uri build = parse.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter("trackingToken", ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        t.f(build, "baseUrl.toUri()\n        …4())\n            .build()");
        return build;
    }

    public final Object isAvailable(e eVar) {
        I i;
        if (Device.getApiLevel() < 33) {
            return b.a(false);
        }
        if (h.e.a(1000000) < 4) {
            return b.a(false);
        }
        if (getMeasurementManager() == null) {
            return b.a(false);
        }
        if (!a.a()) {
            return b.a(false);
        }
        k kVar = new k(Ha.b.c(eVar));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            i.a(measurementManager, t0.a(this.dispatchers.getDefault()), P1.m.a(new AndroidAttribution$isAvailable$2$1(kVar)));
            i = I.a;
        } else {
            i = null;
        }
        if (i == null) {
            s.a aVar = s.b;
            kVar.resumeWith(s.b(b.a(false)));
        }
        Object a = kVar.a();
        if (a == c.f()) {
            h.c(eVar);
        }
        return a;
    }

    public final Object registerClick(String str, AdObject adObject, e eVar) {
        WebViewContainer webViewContainer;
        N lastInputEvent;
        InputEvent inputEvent;
        I i;
        if (getMeasurementManager() == null) {
            return b.a(false);
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (webViewContainer = adPlayer.getWebViewContainer()) == null || (lastInputEvent = webViewContainer.getLastInputEvent()) == null || (inputEvent = (InputEvent) lastInputEvent.getValue()) == null) {
            return b.a(false);
        }
        k kVar = new k(Ha.b.c(eVar));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            j.a(measurementManager, getUri(str, adObject), inputEvent, t0.a(this.dispatchers.getDefault()), P1.m.a(new AndroidAttribution$registerClick$2$1(kVar)));
            i = I.a;
        } else {
            i = null;
        }
        if (i == null) {
            s.a aVar = s.b;
            kVar.resumeWith(s.b(b.a(false)));
        }
        Object a = kVar.a();
        if (a == c.f()) {
            h.c(eVar);
        }
        return a;
    }

    public final Object registerView(String str, AdObject adObject, e eVar) {
        if (getMeasurementManager() == null) {
            return b.a(false);
        }
        k kVar = new k(Ha.b.c(eVar));
        MeasurementManager measurementManager = getMeasurementManager();
        I i = null;
        if (measurementManager != null) {
            j.a(measurementManager, getUri(str, adObject), (InputEvent) null, t0.a(this.dispatchers.getDefault()), P1.m.a(new AndroidAttribution$registerView$2$1(kVar)));
            i = I.a;
        }
        if (i == null) {
            s.a aVar = s.b;
            kVar.resumeWith(s.b(b.a(false)));
        }
        Object a = kVar.a();
        if (a == c.f()) {
            h.c(eVar);
        }
        return a;
    }

    private final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && h.e.a(1000000) >= 4) {
            return f.a(context.getSystemService(c4.e.a()));
        }
        return null;
    }
}
