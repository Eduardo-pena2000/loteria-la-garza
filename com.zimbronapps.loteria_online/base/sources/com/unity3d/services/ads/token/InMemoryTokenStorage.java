package com.unity3d.services.ads.token;

import Ca.I;
import Ca.l;
import Ca.m;
import Ca.n;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.GameSessionIdReader;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import fb.P;
import fb.z;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InMemoryTokenStorage implements TokenStorage, IServiceComponent {
    private final ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
    private final z accessCounter = P.a(-1);
    private final z initToken = P.a(null);
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private final l asyncTokenStorage$delegate = m.a(n.c, new InMemoryTokenStorage$special$$inlined$inject$default$1(this, ""));

    private static final void _get_nativeGeneratedToken_$lambda$2(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_NATIVE_DATA, str);
    }

    public static /* synthetic */ void a(String str) {
        _get_nativeGeneratedToken_$lambda$2(str);
    }

    private final AsyncTokenStorage getAsyncTokenStorage() {
        return (AsyncTokenStorage) this.asyncTokenStorage$delegate.getValue();
    }

    private final void triggerTokenAvailable(boolean z) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(z);
    }

    public void appendTokens(JSONArray tokens) throws JSONException {
        t.g(tokens, "tokens");
        this.accessCounter.e(-1, 0);
        int length = tokens.length();
        for (int i = 0; i < length; i++) {
            this.queue.add(tokens.getString(i));
        }
        if (length > 0) {
            triggerTokenAvailable(false);
            getAsyncTokenStorage().onTokenAvailable();
        }
    }

    public void createTokens(JSONArray tokens) throws JSONException {
        t.g(tokens, "tokens");
        deleteTokens();
        appendTokens(tokens);
    }

    public void deleteTokens() {
        Object value;
        this.queue.clear();
        z zVar = this.accessCounter;
        do {
            value = zVar.getValue();
            ((Number) value).intValue();
        } while (!zVar.e(value, -1));
    }

    public I getNativeGeneratedToken() {
        new NativeTokenGenerator(this.executorService, new DeviceInfoReaderBuilder(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance()), null).generateToken(new a());
        return I.a;
    }

    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public String getToken() {
        Object value;
        Number number;
        if (((Number) this.accessCounter.getValue()).intValue() == -1) {
            return (String) this.initToken.getValue();
        }
        if (this.queue.isEmpty()) {
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.QUEUE_EMPTY, new Object[0]);
            return null;
        }
        z zVar = this.accessCounter;
        do {
            value = zVar.getValue();
            number = (Number) value;
        } while (!zVar.e(value, Integer.valueOf(number.intValue() + 1)));
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_ACCESS, Integer.valueOf(number.intValue()));
        return (String) this.queue.poll();
    }

    public void setInitToken(String str) {
        Object value;
        if (str == null) {
            return;
        }
        z zVar = this.initToken;
        do {
            value = zVar.getValue();
        } while (!zVar.e(value, str));
        triggerTokenAvailable(true);
        getAsyncTokenStorage().onTokenAvailable();
    }
}
