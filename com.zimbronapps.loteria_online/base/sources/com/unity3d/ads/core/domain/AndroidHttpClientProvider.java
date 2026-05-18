package com.unity3d.ads.core.domain;

import Ga.e;
import Ha.b;
import Ha.c;
import Ia.d;
import Ia.f;
import Ia.h;
import Na.n;
import android.content.Context;
import cb.p;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;
import lb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidHttpClientProvider implements HttpClientProvider {
    private final AlternativeFlowReader alternativeFlowReader;
    private final Map cacheHttpClientMap;
    private final CleanupDirectory cleanupDirectory;
    private final ConfigFileFromLocalStorage configFileFromLocalStorage;
    private final Context context;
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;
    private final ISDKDispatchers dispatchers;
    private final lb.a httpClientMutex;
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    @f(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", l = {177, 78}, m = "invoke")
    public static final class 1 extends d {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHttpClientProvider.this.invoke(false, this);
        }
    }

    public AndroidHttpClientProvider(ConfigFileFromLocalStorage configFileFromLocalStorage, AlternativeFlowReader alternativeFlowReader, ISDKDispatchers dispatchers, SendDiagnosticEvent sendDiagnosticEvent, Context context, CronetEngineBuilderFactory cronetEngineBuilderFactory, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        t.g(configFileFromLocalStorage, "configFileFromLocalStorage");
        t.g(alternativeFlowReader, "alternativeFlowReader");
        t.g(dispatchers, "dispatchers");
        t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        t.g(context, "context");
        t.g(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
        t.g(sessionRepository, "sessionRepository");
        t.g(cleanupDirectory, "cleanupDirectory");
        t.g(mediationTraitsMetadataReader, "mediationTraitsMetadataReader");
        this.configFileFromLocalStorage = configFileFromLocalStorage;
        this.alternativeFlowReader = alternativeFlowReader;
        this.dispatchers = dispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
        this.httpClientMutex = g.b(false, 1, null);
        this.cacheHttpClientMap = new LinkedHashMap();
    }

    public static final /* synthetic */ String access$buildCronetCachePath(AndroidHttpClientProvider androidHttpClientProvider, Context context) {
        return androidHttpClientProvider.buildCronetCachePath(context);
    }

    public static final /* synthetic */ Object access$buildNetworkClient(AndroidHttpClientProvider androidHttpClientProvider, Context context, ISDKDispatchers iSDKDispatchers, e eVar) {
        return androidHttpClientProvider.buildNetworkClient(context, iSDKDispatchers, eVar);
    }

    public static final /* synthetic */ AlternativeFlowReader access$getAlternativeFlowReader$p(AndroidHttpClientProvider androidHttpClientProvider) {
        return androidHttpClientProvider.alternativeFlowReader;
    }

    public static final /* synthetic */ CleanupDirectory access$getCleanupDirectory$p(AndroidHttpClientProvider androidHttpClientProvider) {
        return androidHttpClientProvider.cleanupDirectory;
    }

    public static final /* synthetic */ ConfigFileFromLocalStorage access$getConfigFileFromLocalStorage$p(AndroidHttpClientProvider androidHttpClientProvider) {
        return androidHttpClientProvider.configFileFromLocalStorage;
    }

    public static final /* synthetic */ Context access$getContext$p(AndroidHttpClientProvider androidHttpClientProvider) {
        return androidHttpClientProvider.context;
    }

    public static final /* synthetic */ CronetEngineBuilderFactory access$getCronetEngineBuilderFactory$p(AndroidHttpClientProvider androidHttpClientProvider) {
        return androidHttpClientProvider.cronetEngineBuilderFactory;
    }

    public static final /* synthetic */ ISDKDispatchers access$getDispatchers$p(AndroidHttpClientProvider androidHttpClientProvider) {
        return androidHttpClientProvider.dispatchers;
    }

    public static final /* synthetic */ SendDiagnosticEvent access$getSendDiagnosticEvent$p(AndroidHttpClientProvider androidHttpClientProvider) {
        return androidHttpClientProvider.sendDiagnosticEvent;
    }

    public static final /* synthetic */ SessionRepository access$getSessionRepository$p(AndroidHttpClientProvider androidHttpClientProvider) {
        return androidHttpClientProvider.sessionRepository;
    }

    private final String buildCronetCachePath(Context context) {
        File filesDir = context.getFilesDir();
        t.f(filesDir, "context.filesDir");
        File w = n.w(filesDir, "UnityAdsHttpCache");
        if (!w.exists()) {
            w.mkdirs();
        }
        String absolutePath = w.getAbsolutePath();
        t.f(absolutePath, "cacheDir.absolutePath");
        return absolutePath;
    }

    private final Object buildNetworkClient(Context context, ISDKDispatchers iSDKDispatchers, e eVar) {
        p pVar = new p(b.c(eVar), 1);
        pVar.E();
        l7.a.a(context).addOnCompleteListener(new AndroidHttpClientProvider$buildNetworkClient$2$1(this, context, pVar, iSDKDispatchers));
        Object w = pVar.w();
        if (w == c.f()) {
            h.c(eVar);
        }
        return w;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e8 A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:12:0x003c, B:13:0x00e4, B:15:0x00e8, B:19:0x00f3, B:22:0x0110, B:24:0x016f), top: B:11:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0110 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #1 {all -> 0x0041, blocks: (B:12:0x003c, B:13:0x00e4, B:15:0x00e8, B:19:0x00f3, B:22:0x0110, B:24:0x016f), top: B:11:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0017  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(boolean r26, Ga.e r27) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke(boolean, Ga.e):java.lang.Object");
    }
}
