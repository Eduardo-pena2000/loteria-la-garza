package com.unity3d.ads.core.data.repository;

import Ca.I;
import Ca.t;
import Ca.x;
import Da.S;
import Da.Y;
import Da.Z;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Q8.a;
import Q8.b;
import Q8.d;
import Q8.h;
import Q8.j;
import Q8.k;
import Qa.p;
import android.content.Context;
import android.webkit.WebView;
import cb.K;
import cb.O;
import cb.i;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import fb.P;
import fb.z;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidOpenMeasurementRepository implements OpenMeasurementRepository {
    private final z _isOMActive;
    private final z activeSessions;
    private final z finishedSessions;
    private final K mainDispatcher;
    private final OmidManager omidManager;
    private final k partner;

    @f(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Context context, e eVar) {
            super(2, eVar);
            this.$context = context;
        }

        public final e create(Object obj, e eVar) {
            return AndroidOpenMeasurementRepository.this.new 2(this.$context, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            if (AndroidOpenMeasurementRepository.this.isOMActive()) {
                return new OMResult.Failure("om_already_active", null, 2, null);
            }
            try {
                AndroidOpenMeasurementRepository.access$getOmidManager$p(AndroidOpenMeasurementRepository.this).activate(this.$context);
                AndroidOpenMeasurementRepository androidOpenMeasurementRepository = AndroidOpenMeasurementRepository.this;
                androidOpenMeasurementRepository.setOMActive(AndroidOpenMeasurementRepository.access$getOmidManager$p(androidOpenMeasurementRepository).isActive());
                return AndroidOpenMeasurementRepository.this.isOMActive() ? OMResult.Success.INSTANCE : new OMResult.Failure("om_activate_failure_time", null, 2, null);
            } catch (Throwable th) {
                return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
            }
        }
    }

    @f(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ ByteString $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(ByteString byteString, e eVar) {
            super(2, eVar);
            this.$opportunityId = byteString;
        }

        public final e create(Object obj, e eVar) {
            return AndroidOpenMeasurementRepository.this.new 2(this.$opportunityId, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            if (!AndroidOpenMeasurementRepository.this.isOMActive()) {
                return new OMResult.Failure("om_not_active", null, 2, null);
            }
            b access$getSession = AndroidOpenMeasurementRepository.access$getSession(AndroidOpenMeasurementRepository.this, this.$opportunityId);
            if (access$getSession == null) {
                return new OMResult.Failure("om_session_not_found", null, 2, null);
            }
            access$getSession.b();
            AndroidOpenMeasurementRepository.access$sessionFinished(AndroidOpenMeasurementRepository.this, this.$opportunityId);
            return OMResult.Success.INSTANCE;
        }
    }

    @f(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ boolean $signalLoaded;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(ByteString byteString, boolean z, e eVar) {
            super(2, eVar);
            this.$opportunityId = byteString;
            this.$signalLoaded = z;
        }

        public final e create(Object obj, e eVar) {
            return AndroidOpenMeasurementRepository.this.new 2(this.$opportunityId, this.$signalLoaded, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            b access$getSession = AndroidOpenMeasurementRepository.access$getSession(AndroidOpenMeasurementRepository.this, this.$opportunityId);
            if (access$getSession == null) {
                return new OMResult.Failure("om_session_not_found", null, 2, null);
            }
            a createAdEvents = AndroidOpenMeasurementRepository.access$getOmidManager$p(AndroidOpenMeasurementRepository.this).createAdEvents(access$getSession);
            if (this.$signalLoaded) {
                createAdEvents.c();
            }
            createAdEvents.b();
            return OMResult.Success.INSTANCE;
        }
    }

    @f(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ OmidOptions $options;
        final /* synthetic */ WebView $webView;
        int label;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Q8.f.values().length];
                try {
                    iArr[Q8.f.c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Q8.f.e.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(ByteString byteString, OmidOptions omidOptions, WebView webView, e eVar) {
            super(2, eVar);
            this.$opportunityId = byteString;
            this.$options = omidOptions;
            this.$webView = webView;
        }

        public final e create(Object obj, e eVar) {
            return AndroidOpenMeasurementRepository.this.new 2(this.$opportunityId, this.$options, this.$webView, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            d createHtmlAdSessionContext;
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                if (!AndroidOpenMeasurementRepository.this.isOMActive()) {
                    return new OMResult.Failure("om_not_active", null, 2, null);
                }
                if (((Map) AndroidOpenMeasurementRepository.access$getActiveSessions$p(AndroidOpenMeasurementRepository.this).getValue()).containsKey(this.$opportunityId.toStringUtf8())) {
                    return new OMResult.Failure("om_session_already_exists", null, 2, null);
                }
                Q8.f creativeType = this.$options.getCreativeType();
                if (creativeType == null) {
                    return new OMResult.Failure("om_creative_type_null", null, 2, null);
                }
                OmidManager access$getOmidManager$p = AndroidOpenMeasurementRepository.access$getOmidManager$p(AndroidOpenMeasurementRepository.this);
                h impressionType = this.$options.getImpressionType();
                if (impressionType == null) {
                    impressionType = h.b;
                }
                h hVar = impressionType;
                j impressionOwner = this.$options.getImpressionOwner();
                if (impressionOwner == null) {
                    impressionOwner = j.c;
                }
                j jVar = impressionOwner;
                j videoEventsOwner = this.$options.getVideoEventsOwner();
                if (videoEventsOwner == null) {
                    videoEventsOwner = j.c;
                }
                Q8.c createAdSessionConfiguration = access$getOmidManager$p.createAdSessionConfiguration(creativeType, hVar, jVar, videoEventsOwner, this.$options.getIsolateVerificationScripts());
                int i = WhenMappings.$EnumSwitchMapping$0[creativeType.ordinal()];
                if (i == 1) {
                    createHtmlAdSessionContext = AndroidOpenMeasurementRepository.access$getOmidManager$p(AndroidOpenMeasurementRepository.this).createHtmlAdSessionContext(AndroidOpenMeasurementRepository.access$getPartner$p(AndroidOpenMeasurementRepository.this), this.$webView, null, this.$options.getCustomReferenceData());
                } else {
                    if (i != 2) {
                        return new OMResult.Failure("om_creative_type_invalid", null, 2, null);
                    }
                    createHtmlAdSessionContext = AndroidOpenMeasurementRepository.access$getOmidManager$p(AndroidOpenMeasurementRepository.this).createJavaScriptAdSessionContext(AndroidOpenMeasurementRepository.access$getPartner$p(AndroidOpenMeasurementRepository.this), this.$webView, null, this.$options.getCustomReferenceData());
                }
                b createAdSession = AndroidOpenMeasurementRepository.access$getOmidManager$p(AndroidOpenMeasurementRepository.this).createAdSession(createAdSessionConfiguration, createHtmlAdSessionContext);
                createAdSession.c(this.$webView);
                createAdSession.d();
                AndroidOpenMeasurementRepository.access$addSession(AndroidOpenMeasurementRepository.this, this.$opportunityId, createAdSession);
                return OMResult.Success.INSTANCE;
            } catch (Throwable th) {
                return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
            }
        }
    }

    public AndroidOpenMeasurementRepository(K mainDispatcher, OmidManager omidManager) {
        kotlin.jvm.internal.t.g(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.t.g(omidManager, "omidManager");
        this.mainDispatcher = mainDispatcher;
        this.omidManager = omidManager;
        this.partner = k.a("Unity3d", "4.16.3");
        this.activeSessions = P.a(S.h());
        this.finishedSessions = P.a(Y.b());
        this._isOMActive = P.a(Boolean.FALSE);
    }

    public static final /* synthetic */ void access$addSession(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, ByteString byteString, b bVar) {
        androidOpenMeasurementRepository.addSession(byteString, bVar);
    }

    public static final /* synthetic */ z access$getActiveSessions$p(AndroidOpenMeasurementRepository androidOpenMeasurementRepository) {
        return androidOpenMeasurementRepository.activeSessions;
    }

    public static final /* synthetic */ OmidManager access$getOmidManager$p(AndroidOpenMeasurementRepository androidOpenMeasurementRepository) {
        return androidOpenMeasurementRepository.omidManager;
    }

    public static final /* synthetic */ k access$getPartner$p(AndroidOpenMeasurementRepository androidOpenMeasurementRepository) {
        return androidOpenMeasurementRepository.partner;
    }

    public static final /* synthetic */ b access$getSession(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, ByteString byteString) {
        return androidOpenMeasurementRepository.getSession(byteString);
    }

    public static final /* synthetic */ void access$sessionFinished(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, ByteString byteString) {
        androidOpenMeasurementRepository.sessionFinished(byteString);
    }

    private final void addSession(ByteString byteString, b bVar) {
        Object value;
        z zVar = this.activeSessions;
        do {
            value = zVar.getValue();
        } while (!zVar.e(value, S.q((Map) value, x.a(byteString.toStringUtf8(), bVar))));
    }

    private final OMData buildOmData() {
        return new OMData(this.omidManager.getVersion(), "Unity3d", "1");
    }

    private final b getSession(ByteString byteString) {
        return (b) ((Map) this.activeSessions.getValue()).get(byteString.toStringUtf8());
    }

    private final void removeSession(ByteString byteString) {
        Object value;
        String stringUtf8;
        z zVar = this.activeSessions;
        do {
            value = zVar.getValue();
            stringUtf8 = byteString.toStringUtf8();
            kotlin.jvm.internal.t.f(stringUtf8, "opportunityId.toStringUtf8()");
        } while (!zVar.e(value, S.n((Map) value, stringUtf8)));
    }

    private final void sessionFinished(ByteString byteString) {
        Object value;
        String stringUtf8;
        z zVar = this.finishedSessions;
        do {
            value = zVar.getValue();
            stringUtf8 = byteString.toStringUtf8();
            kotlin.jvm.internal.t.f(stringUtf8, "opportunityId.toStringUtf8()");
        } while (!zVar.e(value, Z.j((Set) value, stringUtf8)));
        removeSession(byteString);
    }

    public Object activateOM(Context context, e eVar) {
        return i.g(this.mainDispatcher, new 2(context, null), eVar);
    }

    public Object finishSession(ByteString byteString, e eVar) {
        return i.g(this.mainDispatcher, new 2(byteString, null), eVar);
    }

    public OMData getOmData() {
        return buildOmData();
    }

    public boolean hasSessionFinished(ByteString opportunityId) {
        kotlin.jvm.internal.t.g(opportunityId, "opportunityId");
        return ((Set) this.finishedSessions.getValue()).contains(opportunityId.toStringUtf8());
    }

    public Object impressionOccurred(ByteString byteString, boolean z, e eVar) {
        return i.g(this.mainDispatcher, new 2(byteString, z, null), eVar);
    }

    public boolean isOMActive() {
        return ((Boolean) this._isOMActive.getValue()).booleanValue();
    }

    public void setOMActive(boolean z) {
        Object value;
        z zVar = this._isOMActive;
        do {
            value = zVar.getValue();
            ((Boolean) value).booleanValue();
        } while (!zVar.e(value, Boolean.valueOf(z)));
    }

    public Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, e eVar) {
        return i.g(this.mainDispatcher, new 2(byteString, omidOptions, webView, null), eVar);
    }
}
