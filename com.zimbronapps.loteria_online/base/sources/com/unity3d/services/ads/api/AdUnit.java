package com.unity3d.services.ads.api;

import android.content.Intent;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.WindowInsets;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.ads.adunit.AdUnitError;
import com.unity3d.services.ads.adunit.AdUnitMotionEvent;
import com.unity3d.services.ads.adunit.AdUnitSoftwareActivity;
import com.unity3d.services.ads.adunit.AdUnitTransparentActivity;
import com.unity3d.services.ads.adunit.AdUnitTransparentSoftwareActivity;
import com.unity3d.services.ads.adunit.IAdUnitActivity;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class AdUnit {
    private static IAdUnitActivity _adUnitActivity = null;
    private static int _currentActivityId = -1;

    public class 1 implements Runnable {
        final /* synthetic */ JSONArray val$views;

        public 1(JSONArray jSONArray) {
            this.val$views = jSONArray;
        }

        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                try {
                    AdUnit.getAdUnitActivity().setViews(AdUnit.access$000(this.val$views));
                } catch (Exception e) {
                    DeviceLog.exception("Corrupted viewlist", e);
                }
            }
        }
    }

    public class 2 implements Runnable {
        final /* synthetic */ Integer val$orientation;

        public 2(Integer num) {
            this.val$orientation = num;
        }

        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().setOrientation(this.val$orientation.intValue());
            }
        }
    }

    public class 3 implements Runnable {
        final /* synthetic */ Boolean val$screenOn;

        public 3(Boolean bool) {
            this.val$screenOn = bool;
        }

        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().setKeepScreenOn(this.val$screenOn.booleanValue());
            }
        }
    }

    public class 4 implements Runnable {
        final /* synthetic */ Integer val$systemUiVisibility;

        public 4(Integer num) {
            this.val$systemUiVisibility = num;
        }

        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().setSystemUiVisibility(this.val$systemUiVisibility.intValue());
            }
        }
    }

    public class 5 implements Runnable {
        final /* synthetic */ Integer val$height;
        final /* synthetic */ String val$view;
        final /* synthetic */ Integer val$width;
        final /* synthetic */ Integer val$x;
        final /* synthetic */ Integer val$y;

        public 5(String str, Integer num, Integer num2, Integer num3, Integer num4) {
            this.val$view = str;
            this.val$x = num;
            this.val$y = num2;
            this.val$width = num3;
            this.val$height = num4;
        }

        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().setViewFrame(this.val$view, this.val$x.intValue(), this.val$y.intValue(), this.val$width.intValue(), this.val$height.intValue());
            }
        }
    }

    public class 6 implements Runnable {
        final /* synthetic */ Integer val$displayCutoutMode;

        public 6(Integer num) {
            this.val$displayCutoutMode = num;
        }

        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().setLayoutInDisplayCutoutMode(this.val$displayCutoutMode.intValue());
            }
        }
    }

    private AdUnit() {
    }

    public static /* synthetic */ String[] access$000(JSONArray jSONArray) throws JSONException {
        return getViewList(jSONArray);
    }

    @WebViewExposed
    public static void clearMotionEventCapture(WebViewCallback webViewCallback) {
        if (getAdUnitActivity() == null) {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().getLayout() == null) {
            webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
        } else {
            getAdUnitActivity().getLayout().clearCapture();
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void close(WebViewCallback webViewCallback) {
        if (getAdUnitActivity() == null) {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        } else {
            getAdUnitActivity().finish();
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void endMotionEventCapture(WebViewCallback webViewCallback) {
        if (getAdUnitActivity() == null) {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().getLayout() == null) {
            webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
        } else {
            getAdUnitActivity().getLayout().endCapture();
            webViewCallback.invoke(new Object[0]);
        }
    }

    public static IAdUnitActivity getAdUnitActivity() {
        return _adUnitActivity;
    }

    public static int getCurrentAdUnitActivityId() {
        return _currentActivityId;
    }

    @WebViewExposed
    public static void getCurrentMotionEventCount(WebViewCallback webViewCallback) {
        if (getAdUnitActivity() == null) {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().getLayout() != null) {
            webViewCallback.invoke(Integer.valueOf(getAdUnitActivity().getLayout().getCurrentEventCount()));
        } else {
            webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
        }
    }

    private static ArrayList getKeyEventList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            Integer valueOf = Integer.valueOf(i);
            if (valueOf.intValue() >= jSONArray.length()) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(jSONArray.getInt(valueOf.intValue())));
            i = valueOf.intValue() + 1;
        }
    }

    @WebViewExposed
    public static void getMotionEventCount(JSONArray jSONArray, WebViewCallback webViewCallback) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
            } catch (Exception e) {
                DeviceLog.exception("Error retrieving int from eventTypes", e);
            }
        }
        if (getAdUnitActivity() == null) {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
            return;
        }
        if (getAdUnitActivity().getLayout() == null) {
            webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
            return;
        }
        if (getAdUnitActivity().getLayout().getCurrentEventCount() >= getAdUnitActivity().getLayout().getMaxEventCount()) {
            webViewCallback.error(AdUnitError.MAX_MOTION_EVENT_COUNT_REACHED, new Object[0]);
            return;
        }
        SparseIntArray eventCount = getAdUnitActivity().getLayout().getEventCount(arrayList);
        JSONObject jSONObject = new JSONObject();
        for (int i2 = 0; i2 < eventCount.size(); i2++) {
            int keyAt = eventCount.keyAt(i2);
            try {
                jSONObject.put(Integer.toString(keyAt), eventCount.get(keyAt));
            } catch (Exception e2) {
                DeviceLog.exception("Error building response JSON", e2);
            }
        }
        webViewCallback.invoke(jSONObject);
    }

    @WebViewExposed
    public static void getMotionEventData(JSONObject jSONObject, WebViewCallback webViewCallback) {
        JSONArray jSONArray;
        Iterator keys = jSONObject.keys();
        SparseArray sparseArray = new SparseArray();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            String str = (String) keys.next();
            int parseInt = Integer.parseInt(str);
            if (sparseArray.get(parseInt) == null) {
                sparseArray.put(parseInt, new ArrayList());
            }
            try {
                jSONArray = jSONObject.getJSONArray(str);
            } catch (Exception e) {
                DeviceLog.exception("Couldn't fetch keyIndices", e);
                jSONArray = null;
            }
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        ((ArrayList) sparseArray.get(parseInt)).add(Integer.valueOf(jSONArray.getInt(i)));
                    } catch (Exception e2) {
                        DeviceLog.exception("Couldn't add value to requested infos", e2);
                    }
                }
            }
        }
        if (getAdUnitActivity() == null) {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
            return;
        }
        if (getAdUnitActivity().getLayout() == null) {
            webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
            return;
        }
        if (getAdUnitActivity().getLayout().getCurrentEventCount() >= getAdUnitActivity().getLayout().getMaxEventCount()) {
            webViewCallback.error(AdUnitError.MAX_MOTION_EVENT_COUNT_REACHED, new Object[0]);
            return;
        }
        SparseArray events = getAdUnitActivity().getLayout().getEvents(sparseArray);
        JSONObject jSONObject2 = new JSONObject();
        for (int i2 = 0; i2 < events.size(); i2++) {
            int keyAt = events.keyAt(i2);
            SparseArray sparseArray2 = (SparseArray) events.get(keyAt);
            JSONObject jSONObject3 = new JSONObject();
            for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
                JSONObject jSONObject4 = new JSONObject();
                int keyAt2 = sparseArray2.keyAt(i3);
                AdUnitMotionEvent adUnitMotionEvent = (AdUnitMotionEvent) sparseArray2.get(keyAt2);
                try {
                    jSONObject4.put("action", adUnitMotionEvent.getAction());
                    jSONObject4.put("isObscured", adUnitMotionEvent.isObscured());
                    jSONObject4.put("toolType", adUnitMotionEvent.getToolType());
                    jSONObject4.put("source", adUnitMotionEvent.getSource());
                    jSONObject4.put("deviceId", adUnitMotionEvent.getDeviceId());
                    jSONObject4.put("x", adUnitMotionEvent.getX());
                    jSONObject4.put("y", adUnitMotionEvent.getY());
                    jSONObject4.put("eventTime", adUnitMotionEvent.getEventTime());
                    jSONObject4.put("pressure", adUnitMotionEvent.getPressure());
                    jSONObject4.put("size", adUnitMotionEvent.getSize());
                    jSONObject3.put(Integer.toString(keyAt2), jSONObject4);
                } catch (Exception e3) {
                    DeviceLog.debug("Couldn't construct event info", e3);
                }
            }
            try {
                jSONObject2.put(Integer.toString(keyAt), jSONObject3);
            } catch (Exception e4) {
                DeviceLog.debug("Couldn't construct info object", e4);
            }
        }
        webViewCallback.invoke(jSONObject2);
    }

    @WebViewExposed
    public static void getOrientation(WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(Integer.valueOf(getAdUnitActivity().getRequestedOrientation()));
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getSafeAreaInsets(WebViewCallback webViewCallback) {
        if (getAdUnitActivity() == null || getAdUnitActivity().getLayout() == null) {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            webViewCallback.error(AdUnitError.API_LEVEL_ERROR, new Object[0]);
            return;
        }
        WindowInsets rootWindowInsets = getAdUnitActivity().getLayout().getRootWindowInsets();
        if (rootWindowInsets == null) {
            webViewCallback.error(AdUnitError.NO_DISPLAY_CUTOUT_AVAILABLE, new Object[0]);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Object invoke = rootWindowInsets.getClass().getMethod("getDisplayCutout", (Class[]) null).invoke(rootWindowInsets, (Object[]) null);
            if (invoke != null) {
                Object invoke2 = invoke.getClass().getMethod("getSafeInsetTop", (Class[]) null).invoke(invoke, (Object[]) null);
                Object invoke3 = invoke.getClass().getMethod("getSafeInsetRight", (Class[]) null).invoke(invoke, (Object[]) null);
                Object invoke4 = invoke.getClass().getMethod("getSafeInsetBottom", (Class[]) null).invoke(invoke, (Object[]) null);
                Object invoke5 = invoke.getClass().getMethod("getSafeInsetLeft", (Class[]) null).invoke(invoke, (Object[]) null);
                jSONObject.put("top", invoke2);
                jSONObject.put("right", invoke3);
                jSONObject.put("bottom", invoke4);
                jSONObject.put("left", invoke5);
                webViewCallback.invoke(jSONObject);
            } else {
                webViewCallback.error(AdUnitError.NO_DISPLAY_CUTOUT_AVAILABLE, new Object[0]);
            }
        } catch (IllegalAccessException e) {
            e = e;
            webViewCallback.error(AdUnitError.DISPLAY_CUTOUT_INVOKE_FAILED, new Object[0]);
            DeviceLog.debug("Error while calling displayCutout getter", e);
        } catch (InvocationTargetException e2) {
            e = e2;
            webViewCallback.error(AdUnitError.DISPLAY_CUTOUT_INVOKE_FAILED, new Object[0]);
            DeviceLog.debug("Error while calling displayCutout getter", e);
        } catch (NoSuchMethodException e3) {
            webViewCallback.error(AdUnitError.DISPLAY_CUTOUT_METHOD_NOT_AVAILABLE, new Object[0]);
            DeviceLog.debug("Method getDisplayCutout not found", e3);
        } catch (JSONException e4) {
            webViewCallback.error(AdUnitError.DISPLAY_CUTOUT_JSON_ERROR, new Object[0]);
            DeviceLog.debug("JSON error while constructing display cutout object", e4);
        }
    }

    @WebViewExposed
    public static void getViewFrame(String str, WebViewCallback webViewCallback) {
        if (getAdUnitActivity() == null) {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().getViewFrame(str) == null) {
            webViewCallback.error(AdUnitError.UNKNOWN_VIEW, new Object[0]);
        } else {
            Map viewFrame = getAdUnitActivity().getViewFrame(str);
            webViewCallback.invoke(viewFrame.get("x"), viewFrame.get("y"), viewFrame.get("width"), viewFrame.get("height"));
        }
    }

    private static String[] getViewList(JSONArray jSONArray) throws JSONException {
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return strArr;
    }

    @WebViewExposed
    public static void getViews(WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(new JSONArray(Arrays.asList(getAdUnitActivity().getViews())));
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, WebViewCallback webViewCallback) {
        open(num, jSONArray, num2, null, webViewCallback);
    }

    public static void setAdUnitActivity(IAdUnitActivity iAdUnitActivity) {
        _adUnitActivity = iAdUnitActivity;
    }

    public static void setCurrentAdUnitActivityId(int i) {
        _currentActivityId = i;
    }

    @WebViewExposed
    public static void setKeepScreenOn(Boolean bool, WebViewCallback webViewCallback) {
        Utilities.runOnUiThread(new 3(bool));
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(new Object[0]);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setKeyEventList(JSONArray jSONArray, WebViewCallback webViewCallback) {
        if (getAdUnitActivity() == null) {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
            return;
        }
        try {
            getAdUnitActivity().setKeyEventList(getKeyEventList(jSONArray));
            webViewCallback.invoke(jSONArray);
        } catch (Exception e) {
            DeviceLog.exception("Error parsing views from viewList", e);
            webViewCallback.error(AdUnitError.CORRUPTED_KEYEVENTLIST, jSONArray, e.getMessage());
        }
    }

    @WebViewExposed
    public static void setLayoutInDisplayCutoutMode(Integer num, WebViewCallback webViewCallback) {
        Utilities.runOnUiThread(new 6(num));
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(num);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setOrientation(Integer num, WebViewCallback webViewCallback) {
        Utilities.runOnUiThread(new 2(num));
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(num);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setSystemUiVisibility(Integer num, WebViewCallback webViewCallback) {
        Utilities.runOnUiThread(new 4(num));
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(num);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setViewFrame(String str, Integer num, Integer num2, Integer num3, Integer num4, WebViewCallback webViewCallback) {
        Utilities.runOnUiThread(new 5(str, num, num2, num3, num4));
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(new Object[0]);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setViews(JSONArray jSONArray, WebViewCallback webViewCallback) {
        try {
            getViewList(jSONArray);
            Utilities.runOnUiThread(new 1(jSONArray));
        } catch (JSONException unused) {
            webViewCallback.error(AdUnitError.CORRUPTED_VIEWLIST, jSONArray);
        }
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(jSONArray);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void startMotionEventCapture(Integer num, WebViewCallback webViewCallback) {
        if (getAdUnitActivity() == null) {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().getLayout() == null) {
            webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
        } else {
            getAdUnitActivity().getLayout().startCapture(num.intValue());
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, WebViewCallback webViewCallback) {
        open(num, jSONArray, num2, jSONArray2, 0, Boolean.TRUE, webViewCallback);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, WebViewCallback webViewCallback) {
        open(num, jSONArray, num2, jSONArray2, num3, bool, Boolean.FALSE, webViewCallback);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, Boolean bool2, WebViewCallback webViewCallback) {
        open(num, jSONArray, num2, jSONArray2, num3, bool, bool2, 0, webViewCallback);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, Boolean bool2, Integer num4, WebViewCallback webViewCallback) {
        Intent intent;
        if (!bool.booleanValue() && bool2.booleanValue()) {
            DeviceLog.debug("Unity Ads opening new transparent ad unit activity, hardware acceleration disabled");
            intent = new Intent(ClientProperties.getActivity(), AdUnitTransparentSoftwareActivity.class);
        } else if (bool.booleanValue() && !bool2.booleanValue()) {
            DeviceLog.debug("Unity Ads opening new hardware accelerated ad unit activity");
            intent = new Intent(ClientProperties.getActivity(), AdUnitActivity.class);
        } else if (bool.booleanValue() && bool2.booleanValue()) {
            DeviceLog.debug("Unity Ads opening new hardware accelerated transparent ad unit activity");
            intent = new Intent(ClientProperties.getActivity(), AdUnitTransparentActivity.class);
        } else {
            DeviceLog.debug("Unity Ads opening new ad unit activity, hardware acceleration disabled");
            intent = new Intent(ClientProperties.getActivity(), AdUnitSoftwareActivity.class);
        }
        intent.addFlags(268500992);
        if (num != null) {
            try {
                intent.putExtra("activityId", num.intValue());
                setCurrentAdUnitActivityId(num.intValue());
                try {
                    intent.putExtra("views", getViewList(jSONArray));
                    if (jSONArray2 != null) {
                        try {
                            intent.putExtra("keyEvents", getKeyEventList(jSONArray2));
                        } catch (Exception e) {
                            DeviceLog.exception("Error parsing views from viewList", e);
                            webViewCallback.error(AdUnitError.CORRUPTED_KEYEVENTLIST, jSONArray2, e.getMessage());
                            return;
                        }
                    }
                    intent.putExtra("systemUiVisibility", num3);
                    intent.putExtra("orientation", num2);
                    intent.putExtra("displayCutoutMode", num4);
                    ClientProperties.getActivity().startActivity(intent);
                    DeviceLog.debug("Opened AdUnitActivity with: " + jSONArray.toString());
                    webViewCallback.invoke(new Object[0]);
                    return;
                } catch (Exception e2) {
                    DeviceLog.exception("Error parsing views from viewList", e2);
                    webViewCallback.error(AdUnitError.CORRUPTED_VIEWLIST, jSONArray, e2.getMessage());
                    return;
                }
            } catch (Exception e3) {
                DeviceLog.exception("Could not set activityId for intent", e3);
                webViewCallback.error(AdUnitError.ACTIVITY_ID, num, e3.getMessage());
                return;
            }
        }
        DeviceLog.error("Activity ID is NULL");
        webViewCallback.error(AdUnitError.ACTIVITY_ID, "Activity ID NULL");
    }
}
