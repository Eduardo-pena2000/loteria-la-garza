package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Qa.p;
import ab.b;
import ab.l;
import android.app.Activity;
import cb.K;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import fb.g;
import fb.z;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidHandleFocusCounters {
    private final K defaultDispatcher;
    private final FocusRepository focusRepository;
    private final ConcurrentHashMap focusTimesPerActivity;
    private final AndroidGetIsAdActivity isAdActivity;
    private volatile String latestKnownActivityResumed;
    private final z previousFocusState;
    private final SessionRepository sessionRepository;
    private final l timeSource;

    @f(c = "com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1", f = "AndroidHandleFocusCounters.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        /* synthetic */ Object L$0;
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            1 r0 = AndroidHandleFocusCounters.this.new 1(eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(FocusState focusState, e eVar) {
            return ((1) create(focusState, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            FocusState focusState = (FocusState) this.L$0;
            AndroidHandleFocusCounters.access$onFocusStateChange(AndroidHandleFocusCounters.this, focusState);
            Activity activity = (Activity) focusState.getActivity().get();
            if (activity == null || (str = P.b(activity.getClass()).c()) == null) {
                str = "unknown_activity_name";
            }
            if (!AndroidHandleFocusCounters.access$isAdActivity$p(AndroidHandleFocusCounters.this).invoke(str)) {
                return I.a;
            }
            AndroidHandleFocusCounters.access$getSessionRepository$p(AndroidHandleFocusCounters.this).incrementGlobalAdsFocusChangeCount();
            if (focusState instanceof FocusState.Focused) {
                AndroidHandleFocusCounters.access$onResume(AndroidHandleFocusCounters.this, str);
            } else if (focusState instanceof FocusState.Unfocused) {
                AndroidHandleFocusCounters.access$onPause(AndroidHandleFocusCounters.this, str);
            }
            return I.a;
        }
    }

    public AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity isAdActivity, K defaultDispatcher, l timeSource) {
        kotlin.jvm.internal.t.g(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.t.g(focusRepository, "focusRepository");
        kotlin.jvm.internal.t.g(isAdActivity, "isAdActivity");
        kotlin.jvm.internal.t.g(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.t.g(timeSource, "timeSource");
        this.sessionRepository = sessionRepository;
        this.focusRepository = focusRepository;
        this.isAdActivity = isAdActivity;
        this.defaultDispatcher = defaultDispatcher;
        this.timeSource = timeSource;
        this.focusTimesPerActivity = new ConcurrentHashMap();
        this.previousFocusState = fb.P.a(null);
    }

    public static final /* synthetic */ SessionRepository access$getSessionRepository$p(AndroidHandleFocusCounters androidHandleFocusCounters) {
        return androidHandleFocusCounters.sessionRepository;
    }

    public static final /* synthetic */ AndroidGetIsAdActivity access$isAdActivity$p(AndroidHandleFocusCounters androidHandleFocusCounters) {
        return androidHandleFocusCounters.isAdActivity;
    }

    public static final /* synthetic */ void access$onFocusStateChange(AndroidHandleFocusCounters androidHandleFocusCounters, FocusState focusState) {
        androidHandleFocusCounters.onFocusStateChange(focusState);
    }

    public static final /* synthetic */ void access$onPause(AndroidHandleFocusCounters androidHandleFocusCounters, String str) {
        androidHandleFocusCounters.onPause(str);
    }

    public static final /* synthetic */ void access$onResume(AndroidHandleFocusCounters androidHandleFocusCounters, String str) {
        androidHandleFocusCounters.onResume(str);
    }

    public static /* synthetic */ void getLatestKnownActivityResumed$annotations() {
    }

    private final void onFocusStateChange(FocusState focusState) {
        Object value;
        FocusState focusState2;
        z zVar = this.previousFocusState;
        do {
            value = zVar.getValue();
            focusState2 = (FocusState) value;
        } while (!zVar.e(value, focusState));
        if (focusState2 == null || focusState.getClass() == focusState2.getClass()) {
            return;
        }
        this.sessionRepository.incrementFocusChangeCount();
    }

    private final void onPause(String str) {
        String str2 = this.latestKnownActivityResumed;
        if (str2 == null || kotlin.jvm.internal.t.c(str2, str)) {
            ab.a aVar = (ab.a) this.focusTimesPerActivity.remove(str);
            if (aVar == null) {
                aVar = this.timeSource.a();
            }
            kotlin.jvm.internal.t.f(aVar, "focusTimesPerActivity.re…) ?: timeSource.markNow()");
            this.sessionRepository.addTimeToGlobalAdsFocusTime((int) b.q(aVar.a()));
        }
    }

    private final void onResume(String str) {
        this.latestKnownActivityResumed = str;
        this.focusTimesPerActivity.put(str, this.timeSource.a());
    }

    public final String getLatestKnownActivityResumed() {
        return this.latestKnownActivityResumed;
    }

    public final void invoke() {
        g.z(g.C(this.focusRepository.getFocusState(), new 1(null)), cb.P.a(this.defaultDispatcher));
    }

    public final void setLatestKnownActivityResumed(String str) {
        this.latestKnownActivityResumed = str;
    }

    public /* synthetic */ AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity androidGetIsAdActivity, K k, l lVar, int i, k kVar) {
        this(sessionRepository, focusRepository, androidGetIsAdActivity, k, (i & 16) != 0 ? ab.k.a : lVar);
    }
}
