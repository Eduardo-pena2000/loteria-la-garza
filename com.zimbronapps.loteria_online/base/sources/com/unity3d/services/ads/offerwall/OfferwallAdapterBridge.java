package com.unity3d.services.ads.offerwall;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import cb.i;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.core.log.DeviceLog;
import fb.D;
import fb.F;
import fb.g;
import fb.y;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OfferwallAdapterBridge {
    private final y _offerwallEventFlow;
    private final D offerwallEventFlow;
    private final HashMap placementsMap;
    private final O scope;

    @f(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$showAd$1", f = "OfferwallAdapterBridge.kt", l = {56}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, e eVar) {
            super(2, eVar);
            this.$placementName = str;
        }

        public final e create(Object obj, e eVar) {
            return OfferwallAdapterBridge.this.new 1(this.$placementName, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                y access$get_offerwallEventFlow$p = OfferwallAdapterBridge.access$get_offerwallEventFlow$p(OfferwallAdapterBridge.this);
                OfferwallEventData offerwallEventData = new OfferwallEventData(OfferwallEvent.SHOW_FAILED, this.$placementName, null, null, 12, null);
                this.label = 1;
                if (access$get_offerwallEventFlow$p.emit(offerwallEventData, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    public OfferwallAdapterBridge(O scope) {
        kotlin.jvm.internal.t.g(scope, "scope");
        this.scope = scope;
        y b = F.b(0, 0, null, 7, null);
        this._offerwallEventFlow = b;
        this.offerwallEventFlow = g.a(b);
        this.placementsMap = new HashMap();
    }

    public static /* synthetic */ Object a(OfferwallAdapterBridge offerwallAdapterBridge, Object obj, Method method, Object[] objArr) {
        return tapjoyPlacementListener$lambda$0(offerwallAdapterBridge, obj, method, objArr);
    }

    public static final /* synthetic */ HashMap access$getPlacementsMap$p(OfferwallAdapterBridge offerwallAdapterBridge) {
        return offerwallAdapterBridge.placementsMap;
    }

    public static final /* synthetic */ y access$get_offerwallEventFlow$p(OfferwallAdapterBridge offerwallAdapterBridge) {
        return offerwallAdapterBridge._offerwallEventFlow;
    }

    private final Object getPlacement(String str) {
        return Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("getPlacement", new Class[]{String.class, Class.forName("com.tapjoy.TJPlacementListener")}).invoke((Object) null, new Object[]{str, Proxy.newProxyInstance(Class.forName("com.tapjoy.TJPlacementListener").getClassLoader(), new Class[]{Class.forName("com.tapjoy.TJPlacementListener")}, tapjoyPlacementListener())});
    }

    private final String getPlacementName(Object obj) {
        return (String) obj.getClass().getDeclaredMethod("getName", (Class[]) null).invoke(obj, (Object[]) null);
    }

    private final InvocationHandler tapjoyPlacementListener() {
        return new a(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:140)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:35)
     */
    private static final Object tapjoyPlacementListener$lambda$0(OfferwallAdapterBridge this$0, Object obj, Method method, Object[] objArr) {
        kotlin.jvm.internal.t.g(this$0, "this$0");
        String name = method.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1508301783:
                    if (name.equals("onContentReady")) {
                        Object obj2 = objArr[0];
                        kotlin.jvm.internal.t.f(obj2, "args[0]");
                        String placementName = this$0.getPlacementName(obj2);
                        DeviceLog.debug("Placement content ready: " + placementName);
                        i.d(this$0.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$3(this$0, placementName, null), 3, null);
                        break;
                    }
                    break;
                case -1482787952:
                    if (name.equals("onContentDismiss")) {
                        Object obj3 = objArr[0];
                        kotlin.jvm.internal.t.f(obj3, "args[0]");
                        String placementName2 = this$0.getPlacementName(obj3);
                        DeviceLog.debug("Placement content dismissed: " + placementName2);
                        i.d(this$0.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$5(this$0, placementName2, null), 3, null);
                        break;
                    }
                    break;
                case 89925559:
                    if (name.equals("onContentShow")) {
                        Object obj4 = objArr[0];
                        kotlin.jvm.internal.t.f(obj4, "args[0]");
                        String placementName3 = this$0.getPlacementName(obj4);
                        DeviceLog.debug("Placement content shown: " + placementName3);
                        i.d(this$0.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$4(this$0, placementName3, null), 3, null);
                        break;
                    }
                    break;
                case 1356881459:
                    if (name.equals("onRequestSuccess")) {
                        Object placementObj = objArr[0];
                        kotlin.jvm.internal.t.f(placementObj, "placementObj");
                        String placementName4 = this$0.getPlacementName(placementObj);
                        Boolean bool = (Boolean) placementObj.getClass().getDeclaredMethod("isContentAvailable", (Class[]) null).invoke(placementObj, (Object[]) null);
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        DeviceLog.debug("Placement request succeeded: " + placementName4 + " - isContentAvailable: " + booleanValue);
                        i.d(this$0.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(booleanValue, this$0, placementName4, null), 3, null);
                        break;
                    }
                    break;
                case 2137477050:
                    if (name.equals("onRequestFailure")) {
                        Object obj5 = objArr[0];
                        kotlin.jvm.internal.t.f(obj5, "args[0]");
                        String placementName5 = this$0.getPlacementName(obj5);
                        this$0.placementsMap.remove(placementName5 == null ? "" : placementName5);
                        Object obj6 = objArr[1];
                        DeviceLog.error("Placement request failed: " + placementName5 + " - errorCode: " + ((Integer) obj6.getClass().getField("code").get(obj6)) + ", errorMessage: " + ((String) obj6.getClass().getField("message").get(obj6)));
                        i.d(this$0.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$2(this$0, placementName5, null), 3, null);
                        break;
                    }
                    break;
            }
        }
        return null;
    }

    public final D getOfferwallEventFlow() {
        return this.offerwallEventFlow;
    }

    public final String getVersion() {
        try {
            String str = (String) Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("getVersion", (Class[]) null).invoke((Object) null, (Object[]) null);
            return str == null ? "0.0.0" : str;
        } catch (Exception unused) {
            return "0.0.0";
        }
    }

    public final boolean isAdReady(String placementName) {
        kotlin.jvm.internal.t.g(placementName, "placementName");
        Object placement = getPlacement(placementName);
        Method declaredMethod = placement != null ? placement.getClass().getDeclaredMethod("isContentReady", (Class[]) null) : null;
        Boolean bool = (Boolean) (declaredMethod != null ? declaredMethod.invoke(placement, (Object[]) null) : null);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean isConnected() {
        try {
            Boolean bool = (Boolean) Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("isConnected", (Class[]) null).invoke((Object) null, (Object[]) null);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void loadAd(String placementName) {
        kotlin.jvm.internal.t.g(placementName, "placementName");
        Object placement = getPlacement(placementName);
        this.placementsMap.put(placementName, placement);
        Method declaredMethod = placement != null ? placement.getClass().getDeclaredMethod("requestContent", (Class[]) null) : null;
        if (declaredMethod != null) {
            declaredMethod.invoke(placement, (Object[]) null);
        }
    }

    public final void showAd(String placementName) {
        kotlin.jvm.internal.t.g(placementName, "placementName");
        Object obj = this.placementsMap.get(placementName);
        Method declaredMethod = obj != null ? obj.getClass().getDeclaredMethod("isContentAvailable", (Class[]) null) : null;
        Boolean bool = (Boolean) (declaredMethod != null ? declaredMethod.invoke(obj, (Object[]) null) : null);
        if (bool != null ? bool.booleanValue() : false) {
            Method declaredMethod2 = obj != null ? obj.getClass().getDeclaredMethod("showContent", (Class[]) null) : null;
            if (declaredMethod2 != null) {
                declaredMethod2.invoke(obj, (Object[]) null);
            }
        } else {
            i.d(this.scope, null, null, new 1(placementName, null), 3, null);
        }
        this.placementsMap.remove(placementName);
    }
}
