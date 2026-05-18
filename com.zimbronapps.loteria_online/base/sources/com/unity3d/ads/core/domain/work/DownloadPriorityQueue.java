package com.unity3d.ads.core.domain.work;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.b;
import Ia.d;
import Ia.f;
import Ia.l;
import Qa.p;
import fb.P;
import fb.z;
import java.util.PriorityQueue;
import lb.a;
import lb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DownloadPriorityQueue {
    private final a mutex = g.a(false);
    private final z nextTurn = P.a(null);
    private final PriorityQueue queue = new PriorityQueue(50, new DownloadPriorityQueue$special$$inlined$compareBy$1());

    public static final class PriorityItem {
        private final int priority;

        public PriorityItem(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    @f(c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue", f = "DownloadPriorityQueue.kt", l = {47, 28, 31, 57}, m = "invoke")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DownloadPriorityQueue.this.invoke(0, null, this);
        }
    }

    @f(c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3", f = "DownloadPriorityQueue.kt", l = {}, m = "invokeSuspend")
    public static final class 3 extends l implements p {
        final /* synthetic */ PriorityItem $priorityItem;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(PriorityItem priorityItem, e eVar) {
            super(2, eVar);
            this.$priorityItem = priorityItem;
        }

        public final e create(Object obj, e eVar) {
            3 r0 = new 3(this.$priorityItem, eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(PriorityItem priorityItem, e eVar) {
            return ((3) create(priorityItem, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return b.a(((PriorityItem) this.L$0) == this.$priorityItem);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(int r11, Qa.l r12, Ga.e r13) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.DownloadPriorityQueue.invoke(int, Qa.l, Ga.e):java.lang.Object");
    }
}
