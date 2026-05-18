package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.d2;
import com.applovin.impl.e6;
import com.applovin.impl.f2;
import com.applovin.impl.n2;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u;
import com.applovin.impl.w1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a implements ServiceConnection {
    private final k a;
    private final o b;
    private final WeakReference c;
    private final AtomicBoolean d = new AtomicBoolean();
    private Messenger e;

    public class a implements AppLovinAdLoadListener {
        public a() {
        }

        public void adReceived(AppLovinAd appLovinAd) {
            AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.a(a.this).get();
            if (appLovinFullscreenActivity != null) {
                a.b(a.this);
                if (o.a()) {
                    a.b(a.this).a("AppLovinFullscreenActivity", "Presenting ad...");
                }
                b bVar = new b(a.this, null);
                w1.a((com.applovin.impl.sdk.ad.b) appLovinAd, bVar, bVar, bVar, null, a.c(a.this), appLovinFullscreenActivity, new a(appLovinFullscreenActivity, appLovinAd, bVar));
                return;
            }
            a.b(a.this);
            if (o.a()) {
                a.b(a.this).b("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
            }
        }

        public void failedToReceiveAd(int i) {
            a.a(a.this, "failed_to_receive_ad");
        }

        public class a implements w1.g {
            final /* synthetic */ AppLovinFullscreenActivity a;
            final /* synthetic */ AppLovinAd b;
            final /* synthetic */ b c;

            public a(AppLovinFullscreenActivity appLovinFullscreenActivity, AppLovinAd appLovinAd, b bVar) {
                this.a = appLovinFullscreenActivity;
                this.b = appLovinAd;
                this.c = bVar;
            }

            public void a(w1 w1Var) {
                this.a.setPresenter(w1Var);
                w1Var.w();
            }

            public void a(String str, Throwable th) {
                n2.a((com.applovin.impl.sdk.ad.b) this.b, this.c, str, th, this.a);
                Map a = f2.a((AppLovinAdImpl) this.b);
                CollectionUtils.putStringIfValid("source", "processAdResponse", a);
                CollectionUtils.putStringIfValid("error_message", str, a);
                CollectionUtils.putStringIfValid("top_main_method", th.toString(), a);
                a.c(a.this).g().d(d2.F, a);
            }
        }
    }

    public class b implements AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private b() {
        }

        private void a(FullscreenAdService.c cVar) {
            a(null, cVar);
        }

        public void adClicked(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_CLICKED);
        }

        public void adDisplayed(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_DISPLAYED);
        }

        public void adHidden(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_HIDDEN);
        }

        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_VIDEO_STARTED);
        }

        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d);
            bundle.putBoolean("fully_watched", z);
            a(bundle, FullscreenAdService.c.AD_VIDEO_ENDED);
        }

        public /* synthetic */ b(a aVar, a aVar2) {
            this();
        }

        private void a(Bundle bundle, FullscreenAdService.c cVar) {
            Message obtain = Message.obtain((Handler) null, cVar.b());
            if (bundle != null) {
                obtain.setData(bundle);
            }
            try {
                a.d(a.this).send(obtain);
            } catch (RemoteException e) {
                a.b(a.this);
                if (o.a()) {
                    a.b(a.this).a("AppLovinFullscreenActivity", "Failed to forward callback (" + cVar.b() + ")", e);
                }
            }
        }
    }

    public static class c extends Handler {
        private final WeakReference a;

        public /* synthetic */ c(a aVar, a aVar2) {
            this(aVar);
        }

        public void handleMessage(Message message) {
            a aVar;
            if (message.what != FullscreenAdService.c.AD.b() || (aVar = (a) this.a.get()) == null) {
                super.handleMessage(message);
            } else {
                a.b(aVar, message.getData().getString("raw_full_ad_response"));
            }
        }

        private c(a aVar) {
            this.a = new WeakReference(aVar);
        }
    }

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, k kVar) {
        this.a = kVar;
        this.b = kVar.O();
        this.c = new WeakReference(appLovinFullscreenActivity);
    }

    public static /* synthetic */ WeakReference a(a aVar) {
        return aVar.c;
    }

    public static /* synthetic */ o b(a aVar) {
        return aVar.b;
    }

    public static /* synthetic */ k c(a aVar) {
        return aVar.a;
    }

    public static /* synthetic */ Messenger d(a aVar) {
        return aVar.e;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.d.compareAndSet(false, true)) {
            if (o.a()) {
                this.b.a("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.e = new Messenger(iBinder);
            Message obtain = Message.obtain((Handler) null, FullscreenAdService.c.AD.b());
            obtain.replyTo = new Messenger(new c(this, null));
            try {
                if (o.a()) {
                    this.b.a("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.e.send(obtain);
            } catch (RemoteException e) {
                if (o.a()) {
                    this.b.a("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e);
                }
                a("failed_to_send_ad_request");
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (this.d.compareAndSet(true, false) && o.a()) {
            this.b.a("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }

    public static /* synthetic */ void a(a aVar, String str) {
        aVar.a(str);
    }

    public static /* synthetic */ void b(a aVar, String str) {
        aVar.b(str);
    }

    private void a(String str) {
        AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) this.c.get();
        if (appLovinFullscreenActivity != null) {
            if (o.a()) {
                this.b.a("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss(str);
        } else if (o.a()) {
            this.b.b("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    private void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = JsonUtils.getString(jSONObject, "zone_id", "");
            if (!TextUtils.isEmpty(string)) {
                this.a.q0().a(new e6(jSONObject, u.a(string), true, new a(), this.a));
                return;
            }
            throw new IllegalStateException("No zone identifier found in ad response: " + jSONObject);
        } catch (JSONException e) {
            if (o.a()) {
                this.b.a("AppLovinFullscreenActivity", "Unable to process ad: " + str, e);
            }
            a("failed_to_process_ad");
        }
    }
}
