// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.realtime.request.param;

import java.util.Map;

// Referenced classes of package com.ubercab.android.partner.funnel.realtime.request.param:
//            Shape_DeviceData

public abstract class DeviceData
{

    public DeviceData()
    {
    }

    public static DeviceData create()
    {
        return new Shape_DeviceData();
    }

    abstract String getAndroidId();

    abstract double getBatteryLevel();

    abstract String getBatteryStatus();

    abstract String getCarrier();

    abstract String getCarrierMcc();

    abstract String getCarrierMnc();

    abstract float getCourse();

    abstract String getCpuAbi();

    abstract double getDeviceAltitude();

    abstract Map getDeviceIds();

    abstract double getDeviceLatitude();

    abstract double getDeviceLongitude();

    abstract String getDeviceModel();

    abstract String getDeviceOs();

    abstract float getHorizontalAccuracy();

    abstract String getImsi();

    abstract String getIpAddress();

    abstract String getPhoneNumber();

    abstract String getSimSerial();

    abstract float getSpeed();

    abstract String getVersion();

    abstract boolean isEmulator();

    abstract boolean isMockGpsOn();

    abstract boolean isRooted();

    abstract boolean isUnknownSources();

    abstract boolean isWifiConnected();

    public abstract DeviceData setAndroidId(String s);

    public abstract DeviceData setBatteryLevel(double d);

    public abstract DeviceData setBatteryStatus(String s);

    public abstract DeviceData setCarrier(String s);

    public abstract DeviceData setCarrierMcc(String s);

    public abstract DeviceData setCarrierMnc(String s);

    public abstract DeviceData setCourse(float f);

    public abstract DeviceData setCpuAbi(String s);

    public abstract DeviceData setDeviceAltitude(double d);

    public abstract DeviceData setDeviceIds(Map map);

    public abstract DeviceData setDeviceLatitude(double d);

    public abstract DeviceData setDeviceLongitude(double d);

    public abstract DeviceData setDeviceModel(String s);

    public abstract DeviceData setDeviceOs(String s);

    public abstract DeviceData setEmulator(boolean flag);

    public abstract DeviceData setHorizontalAccuracy(float f);

    public abstract DeviceData setImsi(String s);

    public abstract DeviceData setIpAddress(String s);

    public abstract DeviceData setMockGpsOn(boolean flag);

    public abstract DeviceData setPhoneNumber(String s);

    public abstract DeviceData setRooted(boolean flag);

    public abstract DeviceData setSimSerial(String s);

    public abstract DeviceData setSpeed(float f);

    public abstract DeviceData setUnknownSources(boolean flag);

    public abstract DeviceData setVersion(String s);

    public abstract DeviceData setWifiConnected(boolean flag);
}
