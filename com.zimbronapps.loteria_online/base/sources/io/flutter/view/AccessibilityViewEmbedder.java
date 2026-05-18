package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final b reflectionAccessors = new b(null);
    private final SparseArray flutterIdToOrigin = new SparseArray();
    private final Map originToFlutterId = new HashMap();
    private final Map embeddedViewToDisplayBounds = new HashMap();

    public static class b {
        public final Method a;
        public final Method b;
        public final Method c;
        public final Method d;
        public final Field e;
        public final Method f;

        public /* synthetic */ b(a aVar) {
            this();
        }

        public static /* synthetic */ Long a(b bVar, AccessibilityNodeInfo accessibilityNodeInfo) {
            return bVar.i(accessibilityNodeInfo);
        }

        public static /* synthetic */ int b(long j) {
            return j(j);
        }

        public static /* synthetic */ Long c(b bVar, AccessibilityNodeInfo accessibilityNodeInfo) {
            return bVar.g(accessibilityNodeInfo);
        }

        public static /* synthetic */ Long d(b bVar, AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            return bVar.f(accessibilityNodeInfo, i);
        }

        public static /* synthetic */ Long e(b bVar, AccessibilityRecord accessibilityRecord) {
            return bVar.h(accessibilityRecord);
        }

        public static int j(long j) {
            return (int) (j >> 32);
        }

        public static boolean k(long j, int i) {
            return (j & (1 << i)) != 0;
        }

        public static Long l(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (Build.VERSION.SDK_INT < 26) {
                Q9.b.g("AccessibilityBridge", "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (k(readLong, 0)) {
                obtain2.readInt();
            }
            if (k(readLong, 1)) {
                obtain2.readLong();
            }
            if (k(readLong, 2)) {
                obtain2.readInt();
            }
            Long valueOf = k(readLong, 3) ? Long.valueOf(obtain2.readLong()) : null;
            obtain2.recycle();
            return valueOf;
        }

        public final Long f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            Method method = this.d;
            if (method == null && (this.e == null || this.f == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, new Object[]{Integer.valueOf(i)});
                } catch (IllegalAccessException e) {
                    Q9.b.h("AccessibilityBridge", "Failed to access getChildId method.", e);
                } catch (InvocationTargetException e2) {
                    Q9.b.h("AccessibilityBridge", "The getChildId method threw an exception when invoked.", e2);
                }
            } else {
                try {
                    Long l = (Long) this.f.invoke(this.e.get(accessibilityNodeInfo), new Object[]{Integer.valueOf(i)});
                    l.longValue();
                    return l;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    e = e3;
                    Q9.b.h("AccessibilityBridge", "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                } catch (IllegalAccessException e4) {
                    Q9.b.h("AccessibilityBridge", "Failed to access longArrayGetIndex method or the childNodeId field.", e4);
                } catch (InvocationTargetException e5) {
                    e = e5;
                    Q9.b.h("AccessibilityBridge", "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                }
            }
            return null;
        }

        public final Long g(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.b;
            if (method != null) {
                try {
                    Long l = (Long) method.invoke(accessibilityNodeInfo, (Object[]) null);
                    l.longValue();
                    return l;
                } catch (IllegalAccessException e) {
                    Q9.b.h("AccessibilityBridge", "Failed to access getParentNodeId method.", e);
                } catch (InvocationTargetException e2) {
                    Q9.b.h("AccessibilityBridge", "The getParentNodeId method threw an exception when invoked.", e2);
                }
            }
            return l(accessibilityNodeInfo);
        }

        public final Long h(AccessibilityRecord accessibilityRecord) {
            Method method = this.c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, (Object[]) null);
            } catch (InvocationTargetException e) {
                Q9.b.h("AccessibilityBridge", "The getRecordSourceNodeId method threw an exception when invoked.", e);
                return null;
            } catch (IllegalAccessException e2) {
                Q9.b.h("AccessibilityBridge", "Failed to access the getRecordSourceNodeId method.", e2);
                return null;
            }
        }

        public final Long i(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.a;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, (Object[]) null);
            } catch (InvocationTargetException e) {
                Q9.b.h("AccessibilityBridge", "The getSourceNodeId method threw an exception when invoked.", e);
                return null;
            } catch (IllegalAccessException e2) {
                Q9.b.h("AccessibilityBridge", "Failed to access getSourceNodeId method.", e2);
                return null;
            }
        }

        public b() {
            Method method;
            Method method2;
            Method method3;
            Field field;
            Field method4;
            Method method5;
            Method method6 = null;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", (Class[]) null);
            } catch (NoSuchMethodException unused) {
                Q9.b.g("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", (Class[]) null);
            } catch (NoSuchMethodException unused2) {
                Q9.b.g("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            if (Build.VERSION.SDK_INT > 26) {
                try {
                    Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method4 = Class.forName("android.util.LongArray").getMethod("get", new Class[]{Integer.TYPE});
                    field = declaredField;
                    method3 = null;
                } catch (NoSuchFieldException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused3) {
                    Q9.b.g("AccessibilityBridge", "can't access childNodeIdsField with reflection");
                    method3 = null;
                    field = null;
                }
                this.a = method;
                this.b = method6;
                this.c = method2;
                this.d = method3;
                this.e = field;
                this.f = method4;
            }
            try {
                method5 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", (Class[]) null);
            } catch (NoSuchMethodException unused4) {
                Q9.b.g("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
                method5 = null;
            }
            try {
                method3 = AccessibilityNodeInfo.class.getMethod("getChildId", new Class[]{Integer.TYPE});
                field = null;
            } catch (NoSuchMethodException unused5) {
                Q9.b.g("AccessibilityBridge", "can't invoke getChildId with reflection");
                method3 = null;
                field = null;
            }
            method6 = method5;
            method4 = field;
            this.a = method;
            this.b = method6;
            this.c = method2;
            this.d = method3;
            this.e = field;
            this.f = method4;
        }
    }

    public static class c {
        public final View a;
        public final int b;

        public /* synthetic */ c(View view, int i, a aVar) {
            this(view, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.a.equals(cVar.a);
        }

        public int hashCode() {
            return ((this.a.hashCode() + 31) * 31) + this.b;
        }

        public c(View view, int i) {
            this.a = view;
            this.b = i;
        }
    }

    public AccessibilityViewEmbedder(View view, int i) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i;
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i;
        for (int i2 = 0; i2 < accessibilityNodeInfo.getChildCount(); i2++) {
            Long d = b.d(this.reflectionAccessors, accessibilityNodeInfo, i2);
            if (d != null) {
                int b2 = b.b(d.longValue());
                c cVar = new c(view, b2, null);
                if (this.originToFlutterId.containsKey(cVar)) {
                    i = ((Integer) this.originToFlutterId.get(cVar)).intValue();
                } else {
                    int i3 = this.nextFlutterId;
                    this.nextFlutterId = i3 + 1;
                    cacheVirtualIdMappings(view, b2, i3);
                    i = i3;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i, int i2) {
        c cVar = new c(view, i, null);
        this.originToFlutterId.put(cVar, Integer.valueOf(i2));
        this.flutterIdToOrigin.put(i2, cVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = (Rect) this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        if (Build.VERSION.SDK_INT >= 26) {
            U1.h.a(accessibilityNodeInfo2, l.a(accessibilityNodeInfo));
            io.flutter.view.a.a(accessibilityNodeInfo2, m.a(accessibilityNodeInfo));
            o.a(accessibilityNodeInfo2, n.a(accessibilityNodeInfo));
        }
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long c2 = b.c(this.reflectionAccessors, accessibilityNodeInfo);
        if (c2 == null) {
            return;
        }
        Integer num = (Integer) this.originToFlutterId.get(new c(view, b.b(c2.longValue()), null));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        c cVar = (c) this.flutterIdToOrigin.get(i);
        if (cVar == null || !this.embeddedViewToDisplayBounds.containsKey(cVar.a) || cVar.a.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = cVar.a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(cVar.b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i, cVar.a);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long e = b.e(this.reflectionAccessors, accessibilityRecord);
        if (e == null) {
            return null;
        }
        return (Integer) this.originToFlutterId.get(new c(view, b.b(e.longValue()), null));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i, Rect rect) {
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long a2 = b.a(this.reflectionAccessors, createAccessibilityNodeInfo);
        if (a2 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, b.b(a2.longValue()), i);
        return convertToFlutterNode(createAccessibilityNodeInfo, i, view);
    }

    public boolean onAccessibilityHoverEvent(int i, MotionEvent motionEvent) {
        c cVar = (c) this.flutterIdToOrigin.get(i);
        if (cVar == null) {
            return false;
        }
        Rect rect = (Rect) this.embeddedViewToDisplayBounds.get(cVar.a);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i2] = pointerProperties;
            motionEvent.getPointerProperties(i2, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i2, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i2] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return cVar.a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        c cVar = (c) this.flutterIdToOrigin.get(i);
        if (cVar == null || (accessibilityNodeProvider = cVar.a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(cVar.b, i2, bundle);
    }

    public View platformViewOfNode(int i) {
        c cVar = (c) this.flutterIdToOrigin.get(i);
        if (cVar == null) {
            return null;
        }
        return cVar.a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long e = b.e(this.reflectionAccessors, accessibilityEvent);
        if (e == null) {
            return false;
        }
        int b2 = b.b(e.longValue());
        Integer num = (Integer) this.originToFlutterId.get(new c(view, b2, null));
        if (num == null) {
            int i = this.nextFlutterId;
            this.nextFlutterId = i + 1;
            Integer valueOf = Integer.valueOf(i);
            cacheVirtualIdMappings(view, b2, i);
            num = valueOf;
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i2 = 0; i2 < obtain.getRecordCount(); i2++) {
            AccessibilityRecord record = obtain.getRecord(i2);
            Long e2 = b.e(this.reflectionAccessors, record);
            if (e2 == null) {
                return false;
            }
            c cVar = new c(view, b.b(e2.longValue()), null);
            if (!this.originToFlutterId.containsKey(cVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, ((Integer) this.originToFlutterId.get(cVar)).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
