package com.unity3d.ads.core.domain;

import Ca.I;
import Qa.l;
import cb.B0;
import cb.E0;
import cb.K;
import cb.L;
import cb.O;
import cb.P;
import cb.W0;
import cb.i;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CleanUpWhenOpportunityExpires {
    private final L coroutineExceptionHandler;
    private final O coroutineScope;

    public static final class 2 extends u implements l {
        final /* synthetic */ B0 $job;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(B0 b0) {
            super(1);
            this.$job = b0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.a;
        }

        public final void invoke(Throwable th) {
            B0.a.b(this.$job, null, 1, null);
        }
    }

    public CleanUpWhenOpportunityExpires(K defaultDispatcher) {
        t.g(defaultDispatcher, "defaultDispatcher");
        CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 = new CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(L.O8);
        this.coroutineExceptionHandler = cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1;
        this.coroutineScope = P.a(W0.b(null, 1, null).plus(defaultDispatcher).plus(cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1));
    }

    public final void invoke(AdObject adObject) {
        t.g(adObject, "adObject");
        if (adObject.getAdPlayer() == null) {
            throw new IllegalArgumentException("AdObject does not have an adPlayer.");
        }
        E0.m(adObject.getAdPlayer().getScope().getCoroutineContext()).invokeOnCompletion(new 2(i.d(this.coroutineScope, null, null, new CleanUpWhenOpportunityExpires$invoke$job$1(adObject, null), 3, null)));
    }
}
