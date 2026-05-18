package com.unity3d.ads.core.extensions;

import Ca.I;
import Ca.t;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import cb.Z;
import cb.i;
import eb.v;
import eb.y;
import fb.e;
import fb.g;
import kotlin.jvm.internal.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FlowExtensionsKt {

    @f(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", l = {15, 17}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ boolean $active;
        final /* synthetic */ p $block;
        final /* synthetic */ e $this_timeoutAfter;
        final /* synthetic */ long $timeoutMillis;
        private /* synthetic */ Object L$0;
        int label;

        @f(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", l = {10}, m = "invokeSuspend")
        public static final class 1 extends l implements p {
            final /* synthetic */ v $$this$channelFlow;
            final /* synthetic */ e $this_timeoutAfter;
            int label;

            public static final class 1 implements fb.f {
                final /* synthetic */ v $$this$channelFlow;

                public 1(v vVar) {
                    this.$$this$channelFlow = vVar;
                }

                public final Object emit(Object obj, Ga.e eVar) {
                    Object e = this.$$this$channelFlow.e(obj, eVar);
                    return e == c.f() ? e : I.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(e eVar, v vVar, Ga.e eVar2) {
                super(2, eVar2);
                this.$this_timeoutAfter = eVar;
                this.$$this$channelFlow = vVar;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new 1(this.$this_timeoutAfter, this.$$this$channelFlow, eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return ((1) create(o, eVar)).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = c.f();
                int i = this.label;
                if (i == 0) {
                    t.b(obj);
                    e eVar = this.$this_timeoutAfter;
                    1 r1 = new 1(this.$$this$channelFlow);
                    this.label = 1;
                    if (eVar.collect(r1, this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                y.a.a(this.$$this$channelFlow, null, 1, null);
                return I.a;
            }
        }

        public /* synthetic */ class 2 extends a implements Qa.a {
            public 2(Object obj) {
                super(0, obj, v.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
            }

            public static final /* synthetic */ Object access$getReceiver$p(2 r0) {
                return r0.receiver;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                y.a.a((v) access$getReceiver$p(this), null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(long j, boolean z, p pVar, e eVar, Ga.e eVar2) {
            super(2, eVar2);
            this.$timeoutMillis = j;
            this.$active = z;
            this.$block = pVar;
            this.$this_timeoutAfter = eVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            1 r7 = new 1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, eVar);
            r7.L$0 = obj;
            return r7;
        }

        public final Object invoke(v vVar, Ga.e eVar) {
            return ((1) create(vVar, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            v vVar;
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                vVar = (v) this.L$0;
                i.d(vVar, null, null, new 1(this.$this_timeoutAfter, vVar, null), 3, null);
                long j = this.$timeoutMillis;
                this.L$0 = vVar;
                this.label = 1;
                if (Z.a(j, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return I.a;
                }
                vVar = (v) this.L$0;
                t.b(obj);
            }
            if (this.$active) {
                p pVar = this.$block;
                2 r4 = new 2(vVar);
                this.L$0 = null;
                this.label = 2;
                if (pVar.invoke(r4, this) == f) {
                    return f;
                }
            }
            return I.a;
        }
    }

    public static final e timeoutAfter(e eVar, long j, boolean z, p block) {
        kotlin.jvm.internal.t.g(eVar, "<this>");
        kotlin.jvm.internal.t.g(block, "block");
        return g.h(new 1(j, z, block, eVar, null));
    }

    public static /* synthetic */ e timeoutAfter$default(e eVar, long j, boolean z, p pVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return timeoutAfter(eVar, j, z, pVar);
    }
}
