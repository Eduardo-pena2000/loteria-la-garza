package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.n2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.o;
import com.applovin.impl.t2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class FullscreenAdService extends Service {
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    public static class b extends Handler {
        private b() {
        }

        public void handleMessage(Message message) {
            try {
                n2 n2Var = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (n2Var == null) {
                    if (!n7.a(1.0d)) {
                        super.handleMessage(message);
                        return;
                    }
                    throw new RuntimeException("parentWrapper is null for " + message.what);
                }
                com.applovin.impl.sdk.ad.b f = n2Var.f();
                int i = message.what;
                c cVar = c.AD;
                if (i == cVar.b()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("raw_full_ad_response", f.getRawFullResponse());
                    Message obtain = Message.obtain((Handler) null, cVar.b());
                    obtain.setData(bundle);
                    try {
                        message.replyTo.send(obtain);
                        return;
                    } catch (RemoteException e) {
                        o.c("FullscreenAdService", "Failed to respond to Fullscreen Activity in another process with ad", e);
                        return;
                    }
                }
                if (message.what == c.AD_DISPLAYED.b()) {
                    t2.a(n2Var.c(), f);
                    return;
                }
                if (message.what == c.AD_CLICKED.b()) {
                    t2.a(n2Var.b(), f);
                    return;
                }
                if (message.what == c.AD_VIDEO_STARTED.b()) {
                    t2.a(n2Var.d(), f);
                    return;
                }
                if (message.what == c.AD_VIDEO_ENDED.b()) {
                    Bundle data = message.getData();
                    t2.a(n2Var.d(), f, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                    return;
                }
                if (message.what == c.AD_HIDDEN.b()) {
                    t2.b(n2Var.c(), f);
                } else {
                    super.handleMessage(message);
                }
            } catch (Throwable unused) {
            }
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public enum c {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);

        private final int a;

        c(int i) {
            this.a = i;
        }

        public int b() {
            return this.a;
        }
    }

    public IBinder onBind(Intent intent) {
        return new Messenger(new b(null)).getBinder();
    }
}
