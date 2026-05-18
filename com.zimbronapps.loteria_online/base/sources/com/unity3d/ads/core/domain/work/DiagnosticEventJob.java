package com.unity3d.ads.core.domain.work;

import Ca.l;
import Ca.m;
import Ca.n;
import Ga.e;
import Ia.d;
import Ia.f;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DiagnosticEventJob extends UniversalRequestJob implements IServiceComponent {
    private final l diagnosticEventRequestWorkModifier$delegate;
    private final l getDiagnosticRequestPolicy$delegate;

    @f(c = "com.unity3d.ads.core.domain.work.DiagnosticEventJob", f = "DiagnosticEventJob.kt", l = {22, 25, 27}, m = "doWork")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DiagnosticEventJob.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventJob(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        t.g(context, "context");
        t.g(workerParams, "workerParams");
        n nVar = n.c;
        this.getDiagnosticRequestPolicy$delegate = m.a(nVar, new DiagnosticEventJob$special$$inlined$inject$default$1(this, "other_req"));
        this.diagnosticEventRequestWorkModifier$delegate = m.a(nVar, new DiagnosticEventJob$special$$inlined$inject$default$2(this, ""));
    }

    private final DiagnosticEventRequestWorkModifier getDiagnosticEventRequestWorkModifier() {
        return (DiagnosticEventRequestWorkModifier) this.diagnosticEventRequestWorkModifier$delegate.getValue();
    }

    private final GetRequestPolicy getGetDiagnosticRequestPolicy() {
        return (GetRequestPolicy) this.getDiagnosticRequestPolicy$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c4 A[PHI: r10
      0x00c4: PHI (r10v17 java.lang.Object) = (r10v16 java.lang.Object), (r10v1 java.lang.Object) binds: [B:18:0x00c1, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(Ga.e r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.work.DiagnosticEventJob.doWork.1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1 r0 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob.doWork.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1 r0 = new com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4d
            if (r2 == r6) goto L41
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            Ca.t.b(r10)
            goto Lc4
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.work.DiagnosticEventJob r2 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob) r2
            Ca.t.b(r10)
            goto Lae
        L41:
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r0.L$0
            com.unity3d.ads.core.domain.work.DiagnosticEventJob r6 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob) r6
            Ca.t.b(r10)
            goto L7c
        L4d:
            Ca.t.b(r10)
            androidx.work.WorkerParameters r10 = r9.getWorkerParams()
            androidx.work.b r10 = r10.d()
            java.lang.String r2 = "universalRequestId"
            java.lang.String r2 = r10.i(r2)
            if (r2 != 0) goto L6a
            androidx.work.ListenableWorker$a r10 = androidx.work.ListenableWorker.a.c()
            java.lang.String r0 = "success()"
            kotlin.jvm.internal.t.f(r10, r0)
            return r10
        L6a:
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r10 = r9.getUniversalRequestDataSource()
            r0.L$0 = r9
            r0.L$1 = r2
            r0.label = r6
            java.lang.Object r10 = r10.get(r0)
            if (r10 != r1) goto L7b
            return r1
        L7b:
            r6 = r9
        L7c:
            com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore r10 = (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) r10
            com.google.protobuf.ByteString r10 = r10.getUniversalRequestMapOrThrow(r2)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r10 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.parseFrom(r10)
            com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier r7 = r6.getDiagnosticEventRequestWorkModifier()
            java.lang.String r8 = "universalRequest"
            kotlin.jvm.internal.t.f(r10, r8)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r10 = r7.invoke(r10)
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r7 = r6.getUniversalRequestDataSource()
            com.google.protobuf.ByteString r10 = r10.toByteString()
            java.lang.String r8 = "modifiedUniversalRequest.toByteString()"
            kotlin.jvm.internal.t.f(r10, r8)
            r0.L$0 = r6
            r0.L$1 = r3
            r0.label = r5
            java.lang.Object r10 = r7.set(r2, r10, r0)
            if (r10 != r1) goto Lad
            return r1
        Lad:
            r2 = r6
        Lae:
            com.unity3d.ads.core.domain.GetRequestPolicy r10 = r2.getGetDiagnosticRequestPolicy()
            com.unity3d.ads.gatewayclient.RequestPolicy r10 = r10.invoke()
            r2.setRequestPolicy(r10)
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r10 = super.doWork(r0)
            if (r10 != r1) goto Lc4
            return r1
        Lc4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.DiagnosticEventJob.doWork(Ga.e):java.lang.Object");
    }
}
