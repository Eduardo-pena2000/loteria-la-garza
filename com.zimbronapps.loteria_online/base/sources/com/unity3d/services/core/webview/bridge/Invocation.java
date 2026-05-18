package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.log.DeviceLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class Invocation {
    private static AtomicInteger _idCount = new AtomicInteger(0);
    private static Map _invocationSets;
    private IInvocationCallbackInvoker _invocationCallbackInvoker;
    private int _invocationId;
    private ArrayList _invocations;
    private ArrayList _responses;
    private final IWebViewBridge _webViewBridge;

    /* JADX WARN: Illegal instructions before constructor call */
    public Invocation() {
        SharedInstances sharedInstances = SharedInstances.INSTANCE;
        this(sharedInstances.getWebViewAppInvocationCallbackInvoker(), sharedInstances.getWebViewBridge());
    }

    public static synchronized Invocation getInvocationById(int i) {
        synchronized (Invocation.class) {
            Map map = _invocationSets;
            if (map == null || !map.containsKey(Integer.valueOf(i))) {
                return null;
            }
            return (Invocation) _invocationSets.get(Integer.valueOf(i));
        }
    }

    public void addInvocation(String str, String str2, Object[] objArr, WebViewCallback webViewCallback) {
        if (this._invocations == null) {
            this._invocations = new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(objArr);
        arrayList.add(webViewCallback);
        this._invocations.add(arrayList);
    }

    public int getId() {
        return this._invocationId;
    }

    public ArrayList getResponses() {
        return this._responses;
    }

    public boolean nextInvocation() {
        ArrayList arrayList = this._invocations;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        ArrayList arrayList2 = (ArrayList) this._invocations.remove(0);
        String str = (String) arrayList2.get(0);
        String str2 = (String) arrayList2.get(1);
        Object[] objArr = (Object[]) arrayList2.get(2);
        try {
            this._webViewBridge.handleInvocation(str, str2, objArr, (WebViewCallback) arrayList2.get(3));
        } catch (Exception e) {
            DeviceLog.exception(String.format("Error handling invocation %s.%s(%s)", new Object[]{str, str2, Arrays.toString(objArr)}), e);
        }
        return true;
    }

    public void sendInvocationCallback() {
        _invocationSets.remove(Integer.valueOf(getId()));
        this._invocationCallbackInvoker.invokeCallback(this);
    }

    public void setInvocationResponse(CallbackStatus callbackStatus, Enum r3, Object... objArr) {
        if (this._responses == null) {
            this._responses = new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(callbackStatus);
        arrayList.add(r3);
        arrayList.add(objArr);
        this._responses.add(arrayList);
    }

    public Invocation(IWebViewBridge iWebViewBridge) {
        this(SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker(), iWebViewBridge);
    }

    public Invocation(IInvocationCallbackInvoker iInvocationCallbackInvoker, IWebViewBridge iWebViewBridge) {
        this._invocationCallbackInvoker = iInvocationCallbackInvoker;
        this._webViewBridge = iWebViewBridge;
        this._invocationId = _idCount.getAndIncrement();
        if (_invocationSets == null) {
            _invocationSets = new HashMap();
        }
        _invocationSets.put(Integer.valueOf(this._invocationId), this);
    }
}
