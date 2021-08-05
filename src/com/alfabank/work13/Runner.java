package com.alfabank.work13;

public class Runner {
    public void run(){
/*      Device device = new Device("AP-000N2021","LG",1000.00);
        Monitor monitor = new Monitor("PPP2222","LG",1000.00,1024,1280);
        Adapter adapter = new Adapter("QQ_123","LG",3445.0,140,"AC:BC");
        System.out.println(device);
        System.out.println(monitor);
        System.out.println(adapter);*/
        Device[] devices = {
                new Device("AP-000N2021","LG",1000.00),
                new Monitor("PPP2222","LG",1000.00,1024,1280),
                new Adapter("QQ_123","LG",3445.0,140,"AC:BC"),
                new Adapter("QQ_122","SONY",6432.0,123,"AC:BC^23"),
                new Monitor("SDA2323","SAMSUNG",5332.00,1366,968),
                new Device("AP-000N2021","LG",1000.00),
                new Monitor("PPP2222","LG",1000.00,1234,1280)
        };

        for (Device d: devices) {
            System.out.println(d + "; " + d.hashCode());
        }
    }
}
